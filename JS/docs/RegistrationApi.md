# WestMarchesApi.RegistrationApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiRegistrationPost**](RegistrationApi.md#apiRegistrationPost) | **POST** /api/registration | 



## apiRegistrationPost

> apiRegistrationPost()



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.RegistrationApi();
apiInstance.apiRegistrationPost((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

