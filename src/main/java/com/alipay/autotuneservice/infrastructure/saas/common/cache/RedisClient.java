/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.autotuneservice.infrastructure.saas.common.cache;

import com.alipay.autotuneservice.fake.FakeRedissonClient;
import com.alipay.autotuneservice.message.TuneMessageBroker;
import com.alipay.autotuneservice.message.TuneMessageEventListener;
import com.alipay.autotuneservice.service.chronicmap.ChronicleMapService;
import com.google.common.collect.Lists;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RLock;
import org.redisson.api.RTopic;
import org.redisson.api.RedissonClient;
import org.redisson.client.codec.Codec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/**
 * @author huoyuqi
 * @version RedisClient.java, v 0.1 2022年03月24日 11:17 上午 huoyuqi
 */
@Slf4j
@Component
public class RedisClient {
    private static final Map<String, Object> LRANGE_MAP          = new ConcurrentHashMap<>();
    private final        RedissonClient      redissonClient = new FakeRedissonClient();

    @Autowired
    private ChronicleMapService chronicleMapService;

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }

    /**
     * 执行redis setnx 命令, 命令在指定的 key 不存在时，为 key 设置指定的值。
     *
     * @param key     key
     * @param value   value
     * @param timeout 超时时间
     * @param unit    时间单位
     * @return
     */
    public boolean setNx(String key, Object value, long timeout, TimeUnit unit) {
        //return redissonClient.getBucket(key).trySet(value, timeout, unit);
        return chronicleMapService.setNx(key, value, timeout, unit);
    }

    /**
     * 执行redis setex命令, 命令在指定的 key 不存在时，为 key 设置指定的值。
     *
     * @param key     key
     * @param value   value
     * @param timeout 超时时间
     * @param unit    时间单位
     */
    public void setEx(String key, Object value, long timeout, TimeUnit unit) {
        //redissonClient.getBucket(key).set(value, timeout, unit);
        chronicleMapService.setEx(key, value, timeout, unit);
    }

    /**
     * 获取缓存
     *
     * @param key   缓存key
     * @param clazz 序列化的对象class
     * @param <T>   范型
     * @return T
     */
    public <T> T get(String key, Class<T> clazz) {
        //Object o = redissonClient.getBucket(key).get();
        Object o = chronicleMapService.get(key);
        return clazz.cast(o);
    }

    /**
     * 获取缓存，不序列化
     *
     * @param key 缓存key
     * @return Object
     */
    public Object get(String key) {
        //return redissonClient.getBucket(key).get();
        return chronicleMapService.get(key);
    }

    /**
     * 缓存
     *
     * @param key   key
     * @param value 缓存对象
     */
    public void set(String key, Object value) {
        //redissonClient.getBucket(key).set(value);
        chronicleMapService.set(key, value);
    }

    /**
     * 缓存，带超时时间
     *
     * @param key    key
     * @param value  缓存对象
     * @param expire 超时时间
     */
    public void set(String key, Object value, long expire) {
        //redissonClient.getBucket(key).set(value, expire, TimeUnit.SECONDS);
        chronicleMapService.set(key, value, expire);
    }

    /**
     * 删除缓存
     *
     * @param key 缓存key
     */
    public void remove(String key) {
        //redissonClient.getBucket(key).delete();
        chronicleMapService.del(key);
    }

    /**
     * 累加
     *
     * @param key     key
     * @param counter 累加数量
     */
    public void setIncrValue(String key, int counter) {
        redissonClient.getAtomicLong(key).set(counter);
    }

    /**
     * 获取累加结果
     *
     * @param key key
     * @return 累加结果
     */
    public long getIncrValue(String key) {
        return redissonClient.getAtomicLong(key).get();
    }

    /**
     * 累加（+1）
     *
     * @param key key
     * @return 返回加1的结果
     */
    public long incr(String key) {
        return redissonClient.getAtomicLong(key).incrementAndGet();
    }

    /**
     * 删除缓存
     *
     * @param key
     */
    public void del(String key) {
        //redissonClient.getBucket(key).delete();
        chronicleMapService.del(key);
    }

    /**
     * 范围查询
     *
     * @param key key
     * @return List<Object>
     */
    public List<Object> lrange(String key) {
        return LRANGE_MAP.containsKey(key) ? (List<Object>) LRANGE_MAP.get(key) : null;
        //return redissonClient.getList(key).readAll();
    }

    /**
     * redis rpush
     *
     * @param key key
     * @param obj 缓存对象
     * @return boolean
     */
    public boolean rpush(String key, Object obj) {
        if (!LRANGE_MAP.containsKey(key)) {
            LRANGE_MAP.put(key, Lists.newArrayList(obj));
            return true;
        }
        List<Object> o = (List<Object>) LRANGE_MAP.get(key);
        o.add(obj);
        return true;
        //return redissonClient.getList(key).add(obj);
    }

    /**
     * redis 尝试加锁
     *
     * @param key        key
     * @param lockAction 加锁完成之后的事情
     * @return boolean
     */
    @Deprecated
    public void tryLock(String key, int waitTime, AbsLockAction lockAction)
                                                                           throws InterruptedException {
        RLock lock = redissonClient.getLock(key);
        boolean tryLock = lock.tryLock(waitTime, TimeUnit.SECONDS);
        if (tryLock) {
            try {
                lockAction.onAcquire(key);
                lockAction.doInLock(key);
            } finally {
                lock.unlock();
                lockAction.onExit(key);
            }
        } else {
            lockAction.tryLockFail(key);
        }
    }

    /**
     * redis lock
     *
     * @param lockKey  key
     * @param runnable 加锁完成之后的事情
     * @return boolean
     */
    public void doExec(String lockKey, Runnable runnable) {
        try {
            RLock rLock = redissonClient.getLock(lockKey);
            if (!rLock.tryLock(5L, TimeUnit.SECONDS)) {
                log.info(String.format("%s-->get lock Failed", lockKey));
                return;
            }
            try {
                log.info(String.format("%s-->get lock Success", lockKey));
                runnable.run();
            } catch (Exception e) {
                log.error(String.format("%s-->exec error", lockKey), e);
            } finally {
                rLock.unlock();
            }
        } catch (Exception ex) {
            log.error("lockExec doExec is error", ex);
        }
    }

    /**
     * 获取锁
     *
     * @param lockKey 锁key
     * @return RLock
     */
    public RLock getLock(String lockKey) {
        return redissonClient.getLock(lockKey);
    }

    /**
     * 关闭redis
     */
    public void shutdown() {
        //redissonClient.shutdown();
        chronicleMapService.shutdown();
    }

    /**
     * @see TuneMessageBroker#pub(com.alipay.autotuneservice.message.TuneMessageEvent)
     * @deprecated
     *
     * redis发布
     *
     * @param tuneEvent 事件
     * @param <T>       RedisPubSubEvent
     * @return RedisPubSubEvent
     */
    public <T extends RedisPubSubEvent> long publish(T tuneEvent) {
        RTopic topic = redissonClient.getTopic(tuneEvent.getClass().getName());
        return topic.publish(tuneEvent);
    }

    /**
     * @see TuneMessageEventListener#subscribe(java.util.function.Consumer)
     * @deprecated
     *
     * 订阅
     *
     * @param consumer Consumer
     * @param clazz    对象
     * @param <T>      RedisPubSubEvent
     */
    public <T extends RedisPubSubEvent> void subscribe(Consumer<T> consumer, Class<T> clazz) {
        RTopic topic = redissonClient.getTopic(clazz.getName());
        if (topic == null) {
            return;
        }
        topic.addListener(clazz, (charSequence, oomContext) -> {
            consumer.accept(oomContext);
        });
    }
}