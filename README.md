# native-image-arrow

Currently using `org.apache.arrow.memory.BaseAllocator` with native image compilation is resulting in the following error message:
```
  JUnit Vintage:MyArrowExampleTest:simpleTest
    MethodSource [className = 'com.example.MyArrowExampleTest', methodName = 'simpleTest', methodParameterTypes = '']
    => java.lang.ExceptionInInitializerError
       java.lang.Class.ensureInitialized(DynamicHub.java:510)
       com.example.Connection$ArrowRowReader.<init>(Connection.java:11)
       com.example.Connection.highThroughPutRead(Connection.java:28)
       com.example.MyArrowExampleTest.simpleTest(MyArrowExampleTest.java:16)
       java.lang.reflect.Method.invoke(Method.java:566)
       [...]
     Caused by: java.lang.RuntimeException: No DefaultAllocationManager found on classpath. Can't allocate Arrow buffers. Please consider adding arrow-memory-netty or arrow-memory-unsafe as a dependency.
       org.apache.arrow.memory.CheckAllocator.assertOnlyOne(CheckAllocator.java:81)
       org.apache.arrow.memory.CheckAllocator.check(CheckAllocator.java:42)
       org.apache.arrow.memory.DefaultAllocationManagerOption.getDefaultAllocationManagerFactory(DefaultAllocationManagerOption.java:98)
       org.apache.arrow.memory.BaseAllocator$Config.getAllocationManagerFactory(BaseAllocator.java:733)
       org.apache.arrow.memory.ImmutableConfig.access$801(ImmutableConfig.java:24)
       [...]
```
