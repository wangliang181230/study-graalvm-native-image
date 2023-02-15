title "HelloWorld-Build"

javac HelloWorld.java -d ..\..\..\..\target\classes

native-image  -classpath ..\..\..\..\target\classes ^
    helloworld.HelloWorld ^
    --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree ^
    -H:Path=..\..\..\..\target\exe\helloworld ^
    -H:Name=HelloWorld

cmd
