package SingletonTest;

import Singleton.Singleton2;

public class TestSingleton2 {

    public static void main(String[] args) {

        Singleton2 instance = Singleton2.INSTANCE;
        System.out.println(instance);
    }
}
