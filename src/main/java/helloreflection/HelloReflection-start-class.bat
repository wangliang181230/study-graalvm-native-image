title "HelloReflection.class"

java -version

javac HelloReflection.java -d ..\..\..\..\target\classes

java         -classpath ..\..\..\..\target\classes ^
    helloreflection.HelloReflection ^
    bar

cmd
