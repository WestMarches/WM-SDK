# WestMarchesApi.DiscordApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStoreToDiscordServer**](DiscordApi.md#addStoreToDiscordServer) | **GET** /api/discord/store/{id} | 
[**closeDiscordServer**](DiscordApi.md#closeDiscordServer) | **GET** /api/discord/close | 
[**getIncomingForDiscordServer**](DiscordApi.md#getIncomingForDiscordServer) | **GET** /api/discord/stack | 



## addStoreToDiscordServer

> addStoreToDiscordServer(id)



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.DiscordApi();
let id = "id_example"; // String | 
apiInstance.addStoreToDiscordServer(id, (error, data, response) => {
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
 **id** | **String**|  | 

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## closeDiscordServer

> closeDiscordServer()



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.DiscordApi();
apiInstance.closeDiscordServer((error, data, response) => {
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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getIncomingForDiscordServer

> [Object] getIncomingForDiscordServer()



### Example

```javascript
import WestMarchesApi from 'west_marches_api';

let apiInstance = new WestMarchesApi.DiscordApi();
apiInstance.getIncomingForDiscordServer((error, data, response) => {
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

**[Object]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

