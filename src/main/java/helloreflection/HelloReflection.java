package helloreflection;

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
        for (String arg : args) {
            if (arg.contains("-")) {
                continue;
            }

            System.out.println(arg);
            try {
                HelloReflection.class.getMethod(arg).invoke(null);
            } catch (ReflectiveOperationException ex) {
                System.out.println("Exception running '" + arg + "', error: "
                        + ex.getClass().getSimpleName());
            }
        }

        HelloReflection.class.getMethod("wangwu").invoke(null);

        Thread.sleep(30000);
    }
}