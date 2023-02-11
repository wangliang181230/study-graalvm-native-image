package cn.wangliang181230.study.graalvm.nativeimage.reflect;

import java.lang.reflect.Method;

public class HelloReflection {

    public static void foo() {
        System.out.println("Running foo");
    }

    public static void bar() {
        System.out.println("Running bar");
    }

    public static void wangwu() {
        System.out.println("Running wangwu");
    }

    public static void main(String[] args) throws Exception {
        int i = 5;
        while (i-- > 0) {
            long t0 = System.nanoTime();

            for (String arg : args) {
                try {
                    HelloReflection.class.getMethod(arg).invoke(null);
                } catch (Throwable t) {
                    System.out.println("Exception running '" + arg + "', error: " + t.getClass().getSimpleName());
                }
            }

            HelloReflection.class.getMethod("wangwu").invoke(null);

            System.out.println("time: " + (System.nanoTime() - t0) + "\r\n\r\n");
        }

        Thread.sleep(3000);
    }
}