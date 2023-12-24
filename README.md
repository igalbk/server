# server
This projects demonstrates building OpenApi spec client from simple Spring boot project created with Spring Initializr
The generated client is used by the project test and external [consumer](https://github.com/igalbk/consumer)

To build the sdk:
1. Run: `./gradlew openApiGenerate`
2. Notice the open api spec generated in build/docs/swagger.json
3. Notice the generated client at build/generated-client
4. publish the client to maven local, Run: `pushd build/generated-client && gradle pTML && popd` 