# WestMarchesApi.CharacterApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCharacterDndBeyondIdGet**](CharacterApi.md#apiCharacterDndBeyondIdGet) | **GET** /api/character/dndBeyond/{id} | 
[**apiCharacterDndBeyondPost**](CharacterApi.md#apiCharacterDndBeyondPost) | **POST** /api/character/dndBeyond | 
[**apiCharacterMyGet**](CharacterApi.md#apiCharacterMyGet) | **GET** /api/character/my | 



## apiCharacterDndBeyondIdGet

> String apiCharacterDndBeyondIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CharacterApi();
let id = 789; // Number | 
apiInstance.apiCharacterDndBeyondIdGet(id, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 

### Return type

**String**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiCharacterDndBeyondPost

> apiCharacterDndBeyondPost(opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CharacterApi();
let opts = {
  'id': 789 // Number | 
};
apiInstance.apiCharacterDndBeyondPost(opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | [optional] 

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## apiCharacterMyGet

> [Character] apiCharacterMyGet()



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CharacterApi();
apiInstance.apiCharacterMyGet((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**[Character]**](Character.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

