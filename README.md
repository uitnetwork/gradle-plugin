# Gradle Plugin

This a an attempt to write a demo gradle plugin

### Build plugin:
`1. cd test-plugin`

`2. ./gradlew publishToMavenLocal`

### Configure plugin in consumer project
```
testPlugin {
    someConfig = "some config from build.gradle"
}
```

### Build consumer of plugin
`1. cd test-plugin-client`

`2. ./gradlew helloWorld`

`3. You should see some output from :helloWorld task, and the output should contain value from the configured someConfig above`
