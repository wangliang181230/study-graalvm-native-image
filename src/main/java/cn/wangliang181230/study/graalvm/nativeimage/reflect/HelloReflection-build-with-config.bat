title "HelloReflection-Build"

javac HelloReflection.java

native-image HelloReflection --no-fallback -H:ReflectionConfigurationFiles=./reflect-config.json -H:+PrintImageObjectTree -H:+ExhaustiveHeapScan -H:+PrintAnalysisCallTree

cmd
