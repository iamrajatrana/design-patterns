package creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable {
    private static Singleton INSTANCE;

    private Singleton() {}

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            synchronized (Singleton.class) {
                if(INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }
}