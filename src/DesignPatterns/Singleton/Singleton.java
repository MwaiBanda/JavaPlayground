package DesignPatterns.Singleton;

public final class Singleton {
    private static Singleton sharedInstance = null;
    public void process(){
        System.out.println("\n[SINGLETON] Processed");
    }
    private Singleton(){

    }
    public static Singleton getInstance() {
        if (sharedInstance == null)
            sharedInstance = new Singleton();
        return sharedInstance;
    }
}
