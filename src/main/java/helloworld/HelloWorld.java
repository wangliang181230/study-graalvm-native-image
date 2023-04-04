package helloworld;

public class HelloWorld {

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello, " + name);
    }

    public static void main(String[] args) throws Exception {
        long t0 = System.nanoTime();

        HelloWorld h1 = new HelloWorld("lumin");
        HelloWorld h2 = new HelloWorld(args[0]);
        h1.sayHello();
        h2.sayHello();

        System.out.println("time: " + (System.nanoTime() - t0) + "\r\n\r\n");

        Thread.sleep(3000);
    }
}
