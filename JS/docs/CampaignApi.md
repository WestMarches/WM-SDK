# WestMarchesApi.CampaignApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCampaignGet**](CampaignApi.md#apiCampaignGet) | **GET** /api/campaign | 
[**apiCampaignIdGet**](CampaignApi.md#apiCampaignIdGet) | **GET** /api/campaign/{id} | 
[**apiCampaignPost**](CampaignApi.md#apiCampaignPost) | **POST** /api/campaign | 
[**apiCampaignPut**](CampaignApi.md#apiCampaignPut) | **PUT** /api/campaign | 



## apiCampaignGet

> [Campaign] apiCampaignGet()



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CampaignApi();
apiInstance.apiCampaignGet((error, data, response) => {
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

[**[Campaign]**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiCampaignIdGet

> Campaign apiCampaignIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CampaignApi();
let id = null; // String | 
apiInstance.apiCampaignIdGet(id, (error, data, response) => {
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

[**Campaign**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiCampaignPost

> apiCampaignPost(opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CampaignApi();
let opts = {
  'campaign': new WestMarchesApi.Campaign() // Campaign | 
};
apiInstance.apiCampaignPost(opts, (error, data, response) => {
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
 **campaign** | [**Campaign**](Campaign.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## apiCampaignPut

> Campaign apiCampaignPut(opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';
let defaultClient = WestMarchesApi.ApiClient.instance;
// Configure API key authorization: Bearer
let Bearer = defaultClient.authentications['Bearer'];
Bearer.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.apiKeyPrefix = 'Token';

let apiInstance = new WestMarchesApi.CampaignApi();
let opts = {
  'campaign': new WestMarchesApi.Campaign() // Campaign | 
};
apiInstance.apiCampaignPut(opts, (error, data, response) => {
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
 **campaign** | [**Campaign**](Campaign.md)|  | [optional] 

### Return type

[**Campaign**](Campaign.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

