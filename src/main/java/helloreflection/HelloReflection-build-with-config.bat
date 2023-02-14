title "HelloReflection-Build-with-config"

javac HelloAnnotation.java TestAnnotation.java HelloReflection.java -d ..\..\..\..\target\classes

native-image -classpath ..\..\..\..\target\classes ^
    helloreflection.HelloReflection ^
    -H:Path=..\..\..\..\target\exe\helloreflection ^
    --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree ^
    -H:Name=HelloReflection ^
    -H:ReflectionConfigurationFiles=./reflect-config.json

cmd
