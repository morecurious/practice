package com.lixiang.studyThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lixiang on 11/27/2016.
 */
public class ConditionUseCase {
    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void conditionWait() throws InterruptedException {
        lock.lock();
        try {
            condition.await();
        }finally {
            lock.unlock();
        }
    }

    public void conditionSingal(){
        lock.lock();
        try{
            condition.signal();
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {

    }
}
