title "HelloWorld.class"

java -version

javac HelloWorld.java -d ..\..\..\..\target\classes

java          -classpath ..\..\..\..\target\classes ^
    helloworld.HelloWorld ^
    123

cmd
