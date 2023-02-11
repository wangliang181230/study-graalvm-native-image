title "Native Image Build"

javac HelloWorld.java

native-image HelloWorld --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree

cmd
