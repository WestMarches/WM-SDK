# WM-SDK
Generated npm and C# packages based on API.

When you want to update this, update swagger.json to newest and then run the following lines of code in shell: 

``` shell
npx @openapitools/openapi-generator-cli generate -i swagger.json -g csharp-netcore -o C#
npx @openapitools/openapi-generator-cli generate -i swagger.json -g javascript -o JS
```
This will update the clients.

Automation of this and packaging is currently disabled and to be revisisted.

More [generators](https://openapi-generator.tech/docs/generators) will be implemented in the future to allow other developers to consume this package.
