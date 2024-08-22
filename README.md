# junit-tdd-demo

Executed below command to generate the pom and package structure.

`mvn archetype:generate -DgroupId=io.github.sahawick -DartifactId=junittdddemo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false`

Added below properties to pom file to configure to use Java 17.

```
  <properties>
    <maven.compiler.source>17</maven.compiler.source>
    <maven.compiler.target>17</maven.compiler.target>
  </properties>
```

Added below dependencies to pom file to add JUnit and Mockito.

```
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.mockito</groupId>
      <artifactId>mockito-core</artifactId>
      <version>4.0.0</version>
      <scope>test</scope>
    </dependency>
```