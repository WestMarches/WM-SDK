 #!/bin/sh

npx @openapitools/openapi-generator-cli generate -i swagger.json -g csharp-netcore -o C#
npx @openapitools/openapi-generator-cli generate -i swagger.json -g javascript -o JS
npx @openapitools/openapi-generator-cli generate -i swagger.json -g java -o Java