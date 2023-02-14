title "Native Image Build"

javac HelloWorld.java -d ..\..\..\..\target\classes

native-image  -classpath ..\..\..\..\target\classes ^
    helloworld.HelloWorld ^
    -H:Path=..\..\..\..\target\exe\helloworld ^
    --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree ^
    -H:Name=HelloWorld

cmd
