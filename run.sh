export JAVA_HOME=/home/kuaiwei.kw/repo/dw21/build/linux-aarch64-server-slowdebug/images/jdk
$JAVA_HOME/bin/java --add-opens=java.base/java.io=ALL-UNNAMED --enable-preview --enable-native-access=ALL-UNNAMED \
  -Djava.library.path=/home/kuaiwei.kw/repo/dw21/build/linux-aarch64-server-slowdebug/images/test/micro/native \
  -Xbatch -XX:-TieredCompilation -XX:CICompilerCount=1 -XX:+PrintCompilation -XX:+PrintInlining \
  -jar /home/kuaiwei.kw/repo/dw21/build/linux-aarch64-server-slowdebug/images/test/micro/benchmarks.jar \
  -f 0 -wi 5 -i 5 \
  java.lang.foreign.CallOverheadReg.jni_identity_live8
