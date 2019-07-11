package SingletonTest;

import Singleton.Singleton1;

public class TestSingleton1 {

    public static void main(String[] args) {




        Singleton1 instance = Singleton1.INSTANCE;
        System.out.println(instance);
    }
}
