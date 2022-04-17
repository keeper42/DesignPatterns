package org.example.singleton;

/**
 * @author lijiafan
 * @version 1.0
 * @date 2022/4/17
 *
 * 双重检锁，Double Check Lock
 * 双锁机制，线程安全且在多线程情况下能保持高性能。
 */
public class DCL {

    private static volatile DCL instance;

    public DCL (){}

    public DCL getInstance() {
        if (instance == null) {
            synchronized(DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

}
