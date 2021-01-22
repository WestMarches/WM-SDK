# WestMarchesApi.CampaignApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiCampaignIdGet**](CampaignApi.md#apiCampaignIdGet) | **GET** /api/campaign/{id} | 
[**apiCampaignIdPost**](CampaignApi.md#apiCampaignIdPost) | **POST** /api/campaign/{id} | 
[**apiCampaignIdPut**](CampaignApi.md#apiCampaignIdPut) | **PUT** /api/campaign/{id} | 



## apiCampaignIdGet

> Campaign apiCampaignIdGet(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## apiCampaignIdPost

> apiCampaignIdPost(id, opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.CampaignApi();
let id = null; // String | 
let opts = {
  'campaign': new WestMarchesApi.Campaign() // Campaign | 
};
apiInstance.apiCampaignIdPost(id, opts, (error, data, response) => {
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
 **id** | [**String**](.md)|  | 
 **campaign** | [**Campaign**](Campaign.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


## apiCampaignIdPut

> Campaign apiCampaignIdPut(id, opts)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.CampaignApi();
let id = null; // String | 
let opts = {
  'campaign': new WestMarchesApi.Campaign() // Campaign | 
};
apiInstance.apiCampaignIdPut(id, opts, (error, data, response) => {
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
 **campaign** | [**Campaign**](Campaign.md)|  | [optional] 

### Return type

[**Campaign**](Campaign.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

