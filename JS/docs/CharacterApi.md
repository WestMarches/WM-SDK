# WestMarchesApi.CharacterApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCharacterIdGet**](CharacterApi.md#apiCharacterIdGet) | **GET** /api/character/{id} | 
[**apiCharacterMyIdGet**](CharacterApi.md#apiCharacterMyIdGet) | **GET** /api/character/my/{id} | 



## apiCharacterIdGet

> String apiCharacterIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.CharacterApi();
let id = 789; // Number | 
apiInstance.apiCharacterIdGet(id, (error, data, response) => {
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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiCharacterMyIdGet

> [Character] apiCharacterMyIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.CharacterApi();
let id = null; // String | 
apiInstance.apiCharacterMyIdGet(id, (error, data, response) => {
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
 **id** | [**String**](.md)|  | 

### Return type

[**[Character]**](Character.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

