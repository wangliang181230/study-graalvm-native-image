title "HelloReflection.class"

javac HelloAnnotation.java TestAnnotation.java HelloReflection.java -d ..\..\..\..\target\classes

java         -classpath ..\..\..\..\target\classes ^
    helloreflection.HelloReflection ^
    helloreflection.HelloAnnotation# ^
    helloreflection.TestAnnotation#helloreflection.HelloAnnotation ^
    bar

cmd
