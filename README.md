# WM-SDK
Generated npm and C# packages based on API.

When you want to update this, update swagger.json to newest version and then run the following lines of code in shell in the root director:
```
./generate.sh
```

This will update all the clients.

More [generators](https://openapi-generator.tech/docs/generators) will be implemented in the future to allow other developers to consume this package.

WestMarchesAPI is also working on an OpenAPI generator for C# Mono which is compatiable with Unity (Engine for Talespire) so that we can integrate with the api natively in-game.
