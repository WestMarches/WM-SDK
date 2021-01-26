# WestMarchesApi.UserApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiUserGet**](UserApi.md#apiUserGet) | **GET** /api/user | 
[**apiUserPut**](UserApi.md#apiUserPut) | **PUT** /api/user | 



## apiUserGet

> User apiUserGet()



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
apiInstance.apiUserGet((error, data, response) => {
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

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiUserPut

> User apiUserPut(opts)



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
let opts = {
  'user': new WestMarchesApi.User() // User | 
};
apiInstance.apiUserPut(opts, (error, data, response) => {
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
 **user** | [**User**](User.md)|  | [optional] 

### Return type

[**User**](User.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

