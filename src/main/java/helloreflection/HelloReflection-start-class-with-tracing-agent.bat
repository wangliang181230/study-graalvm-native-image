title "HelloReflection.class"

java -version

javac HelloReflection.java -d ..\..\..\..\target\classes

java         -classpath ..\..\..\..\target\classes ^
    -agentlib:native-image-agent=config-output-dir=.\tracing-agent\ ^
    helloreflection.HelloReflection ^
    foo bar

cmd
