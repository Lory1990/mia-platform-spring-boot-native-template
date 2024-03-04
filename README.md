# mia-platform-spring-boot-native
Native Template for Spring Boot

## Advantages of Spring Boot Native

Spring Boot Native is an implementation of Spring Boot that allows compiling Spring Boot applications into native binaries using GraalVM or similar technology. Here are some advantages of using Spring Boot Native:

1. **Fast Startup**: Spring Boot native applications start up faster compared to their JVM (Java Virtual Machine) counterparts. This is because native binaries don't require the JVM startup overhead, thus avoiding typical Java application startup times.

2. **Reduced Resource Consumption**: Native executables are optimized for the target operating system and therefore require fewer resources compared to JVM-based applications. This can lead to better efficiency in memory and CPU usage.

3. **Smaller Executable Size**: Native binaries tend to be smaller in size compared to JAR files generated from compiling traditional Spring Boot applications. This can be advantageous especially in scenarios where distributing the application to resource-constrained environments like embedded devices or serverless environments.

4. **Improved Performance**: Spring Boot native applications may exhibit improved performance in terms of response time and throughput, as native binaries are optimized for direct execution on the target platform.

5. **Simplified Deployment**: With the use of native binaries, the deployment process can be simplified since there's no longer a need to ensure the presence of a JVM on the target server. This can reduce dependencies and streamline the application management process.

6. **Enhanced Security**: Compiling into native binaries can offer enhanced security as it reduces the attack surface and the possibility of vulnerabilities related to the JVM.
