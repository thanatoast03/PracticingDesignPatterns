package Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton() {} // Constructor must be private so only access to Singleton object is through getInstance() func

    public static Singleton getInstance() { // Static method so they can access instance from class
        if (instance == null) {
            synchronized (Singleton.class) { // Makes thread safe
                if (instance == null) { // Check again because multiple threads can reach the first check state
                    System.out.println("Creating a new instance of Singleton");
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public static void doSomething() {
        System.out.println("do something");
    }
}
