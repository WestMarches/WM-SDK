# WestMarchesApi.RegistrationApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiRegistrationPost**](RegistrationApi.md#apiRegistrationPost) | **POST** /api/registration | 



## apiRegistrationPost

> apiRegistrationPost(opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.RegistrationApi();
let opts = {
  'registrationRequest': new WestMarchesApi.RegistrationRequest() // RegistrationRequest | 
};
apiInstance.apiRegistrationPost(opts, (error, data, response) => {
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
 **registrationRequest** | [**RegistrationRequest**](RegistrationRequest.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined

