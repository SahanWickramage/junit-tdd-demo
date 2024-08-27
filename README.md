# junit-tdd-demo

Executed below command to generate the pom and package structure.

```
mvn archetype:generate -DgroupId=io.github.sahawick -DartifactId=junittdddemo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

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

Steps involved in TDD
1. Red ❌
    * write tests that verifies the expected behavior
    * tests will get failed and will indicate as red
2. Green ✅
    * write code just to pass tests
    * tests will get passes and will indicate as green
3. Refactor 🔧
    * refactor and make tests better
    * this will lead to failed tests again, then change the code accordingly
    * repeat these three steps until you get a wonderful code