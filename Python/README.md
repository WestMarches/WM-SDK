# openapi-client
West Marches API

This Python package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: 1.0.0
- Package version: 1.0.0
- Build package: org.openapitools.codegen.languages.PythonLegacyClientCodegen

## Requirements.

Python 2.7 and 3.4+

## Installation & Usage
### pip install

If the python package is hosted on a repository, you can install directly using:

```sh
pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git
```
(you may need to run `pip` with root permission: `sudo pip install git+https://github.com/GIT_USER_ID/GIT_REPO_ID.git`)

Then import the package:
```python
import openapi_client
```

### Setuptools

Install via [Setuptools](http://pypi.python.org/pypi/setuptools).

```sh
python setup.py install --user
```
(or `sudo python setup.py install` to install the package for all users)

Then import the package:
```python
import openapi_client
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```python
from __future__ import print_function

import time
import openapi_client
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to http://localhost:5000
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "http://localhost:5000"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure API key authorization: Bearer
configuration.api_key['Bearer'] = 'YOUR_API_KEY'

# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['Bearer'] = 'Bearer'


# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.CampaignApi(api_client)
    
    try:
        api_response = api_instance.api_campaign_get()
        pprint(api_response)
    except ApiException as e:
        print("Exception when calling CampaignApi->api_campaign_get: %s\n" % e)
    
```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:5000*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignApi* | [**api_campaign_get**](docs/CampaignApi.md#api_campaign_get) | **GET** /api/campaign | 
*CampaignApi* | [**api_campaign_id_get**](docs/CampaignApi.md#api_campaign_id_get) | **GET** /api/campaign/{id} | 
*CampaignApi* | [**api_campaign_post**](docs/CampaignApi.md#api_campaign_post) | **POST** /api/campaign | 
*CampaignApi* | [**api_campaign_put**](docs/CampaignApi.md#api_campaign_put) | **PUT** /api/campaign | 
*CharacterApi* | [**api_character_dnd_beyond_id_get**](docs/CharacterApi.md#api_character_dnd_beyond_id_get) | **GET** /api/character/dndBeyond/{id} | 
*CharacterApi* | [**api_character_dnd_beyond_post**](docs/CharacterApi.md#api_character_dnd_beyond_post) | **POST** /api/character/dndBeyond | 
*CharacterApi* | [**api_character_my_get**](docs/CharacterApi.md#api_character_my_get) | **GET** /api/character/my | 
*DiscordApi* | [**add_store_to_discord_server**](docs/DiscordApi.md#add_store_to_discord_server) | **GET** /api/discord/store/{id} | 
*DiscordApi* | [**close_discord_server**](docs/DiscordApi.md#close_discord_server) | **GET** /api/discord/close | 
*DiscordApi* | [**get_incoming_for_discord_server**](docs/DiscordApi.md#get_incoming_for_discord_server) | **GET** /api/discord/stack | 
*RegistrationApi* | [**api_registration_post**](docs/RegistrationApi.md#api_registration_post) | **POST** /api/registration | 
*UserApi* | [**api_user_get**](docs/UserApi.md#api_user_get) | **GET** /api/user | 
*UserApi* | [**api_user_put**](docs/UserApi.md#api_user_put) | **PUT** /api/user | 


## Documentation For Models

 - [Campaign](docs/Campaign.md)
 - [CampaignStatus](docs/CampaignStatus.md)
 - [Character](docs/Character.md)
 - [GameSystem](docs/GameSystem.md)
 - [Guild](docs/Guild.md)
 - [Item](docs/Item.md)
 - [Stock](docs/Stock.md)
 - [User](docs/User.md)
 - [UserCredentials](docs/UserCredentials.md)
 - [UserRoles](docs/UserRoles.md)


## Documentation For Authorization


## Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Author




