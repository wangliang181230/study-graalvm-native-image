title "HelloReflection-Build"

javac HelloReflection.java

native-image HelloReflection --no-fallback -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree

cmd
