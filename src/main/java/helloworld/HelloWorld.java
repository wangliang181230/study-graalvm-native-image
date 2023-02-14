package helloworld;

public class HelloWorld {

    private static final String CONST = "this-is-a constant var";

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("hello, " + name);
    }

    public static void main(String[] args) throws Exception {
		int i = 5;
		while (i-- > 0) {
			long t0 = System.nanoTime();

			System.out.println(CONST);
			HelloWorld h1 = new HelloWorld("lumin");
			HelloWorld h2 = new HelloWorld(args[0]);
			h1.sayHello();
			h2.sayHello();

			System.out.println("time: " + (System.nanoTime() - t0) + "\r\n\r\n");
		}

		Thread.sleep(3000);
    }
}
