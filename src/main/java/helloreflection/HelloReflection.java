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
        long t0 = System.nanoTime();

        for (String arg : args) {
            if (arg.contains("agentlib")) {
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

        System.out.println("time: " + (System.nanoTime() - t0) + "\r\n\r\n");

        Thread.sleep(30000);
    }
}