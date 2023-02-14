package helloreflection;

import java.lang.annotation.Annotation;

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

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        int i = 5;
        while (i-- > 0) {
            long t0 = System.nanoTime();

            int a = -1;
            for (String arg : args) {
                a++;
                System.out.println("-------------");
                System.out.println("args[" + a + "] = " + arg);

                try {
                    if (arg.contains("#")) {
                        String[] arr = arg.split("#");

                        String className = arr[0];
                        Class<?> clazz = Class.forName(className);
                        if (clazz.isAnnotation()) {
                            System.out.println("annoClass = " + className);
                        } else {
                            System.out.println("class = " + className);
                        }

                        if (arr.length > 1 && !arr[1].isBlank()) {
                            String annoClassName = arr[1];
                            Class<Annotation> annoClass = (Class<Annotation>) Class.forName(annoClassName);

                            Annotation anno = clazz.getAnnotation(annoClass);
                            System.out.println("anno = " + anno);
                        }
                    } else {
                        HelloReflection.class.getMethod(arg).invoke(null);
                    }
                } catch (Throwable t) {
                    System.out.println("Exception running '" + arg + "', error:");
                    t.printStackTrace();
                }
            }

            System.out.println("-------------");
            HelloReflection.class.getMethod("wangwu").invoke(null);

            System.out.println("time: " + (System.nanoTime() - t0) + "\r\n\r\n");
        }

        Thread.sleep(3000);
    }
}