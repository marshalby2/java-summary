package com.my.example.locks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Description TODO
 * @Author marshal
 * @Date 7/11/20 10:56 AM
 */
public class Cache<K, V> {

    final Map<K, V> map = new HashMap<>();

    final ReadWriteLock rwl = new ReentrantReadWriteLock();

    final Lock r = rwl.readLock();
    final Lock w = rwl.writeLock();

    V get(K k) {
        r.lock();
        try {
            return map.get(k);
        } finally {
            r.unlock();
        }
    }

    V put(K k, V v) {
        w.lock();
        try {
            return map.put(k, v);
        } finally {
            w.unlock();
        }
    }
}
