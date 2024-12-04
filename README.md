# testJava
Here is a simple calculator using a TDD approach to writing Java using JUnit, and AI to help kickstart it.

## Project tools:
* Build the project
mvn clean install

* Run tests
mvn test

* Just compile
mvn compile

* Clean build directory
mvn clean

* After changes to the pom.xml,
mvn clean test

* look at test coverage by opening target/site/jacoco/index.html in your browser

## Common JUnit annotations:
* @Test - Marks a test method
* @BeforeEach - Runs before each test
* @AfterEach - Runs after each test
* @DisplayName - Gives a test a custom name

## Testing in general
* using JaCoCo for test coverage

## Some files to ignore in the repo
* target/
Do that with: echo "target/" >> .gitignore
And remove target/ from tracking with: git rm -r --cached target/


