package Singleton;

/**
 *
 *
 * 懒汉式
 * 既能保持线程安全 也能保持延迟加载
 *
 * 在内部类加载和初始化时，才能创建instance的实例对象
 * 静态内部类不会随着外部类的加载和初始化而初始化，他是单独去加载和初始化的
 * 因为在内部类加载和初始化时创建 的，因此线程是安全的
 */
public class Singleton6 {


        private Singleton6(){

        }
        private static class  Inner{
            private static  final Singleton6 instance = new Singleton6();

        }
        public static Singleton6 getInstance(){
            return  Inner.instance;
        }


}
