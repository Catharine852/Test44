package org.example;

public final class Singleton {

//    public static final Singleton INSTANCE = new Singleton();//или вот такая зпись

    private static Singleton instance;
    private Singleton() {

    }
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
            return instance;
    }
}
