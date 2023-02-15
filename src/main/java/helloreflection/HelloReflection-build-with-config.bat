title "HelloReflection-Build-with-config"

javac HelloAnnotation.java TestAnnotation.java HelloReflection.java -d ..\..\..\..\target\classes

native-image -classpath ..\..\..\..\target\classes ^
    helloreflection.HelloReflection ^
    --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree ^
    -H:Path=..\..\..\..\target\exe\helloreflection ^
    -H:Name=HelloReflection ^
    -H:ReflectionConfigurationFiles=./reflect-config.json

cmd
