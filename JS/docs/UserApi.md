# WestMarchesApi.UserApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserIdGet**](UserApi.md#apiUserIdGet) | **GET** /api/user/{id} | 
[**apiUserIdPut**](UserApi.md#apiUserIdPut) | **PUT** /api/user/{id} | 



## apiUserIdGet

> User apiUserIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.UserApi();
let id = null; // String | 
apiInstance.apiUserIdGet(id, (error, data, response) => {
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

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiUserIdPut

> User apiUserIdPut(id, opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.UserApi();
let id = null; // String | 
let opts = {
  'user': new WestMarchesApi.User() // User | 
};
apiInstance.apiUserIdPut(id, opts, (error, data, response) => {
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
 **user** | [**User**](User.md)|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

