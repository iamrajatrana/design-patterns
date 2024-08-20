package creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton INSTANCE;

    private Singleton() throws IllegalAccessException {
        if (INSTANCE != null) {
            throw new IllegalAccessException("Not allowed");
        }
    }

    public static Singleton getInstance() throws IllegalAccessException {
        if(INSTANCE == null) {
            synchronized (Singleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() throws IllegalAccessException {
        return getInstance();
    }
}