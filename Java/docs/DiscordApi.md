# DiscordApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addStoreToDiscordServer**](DiscordApi.md#addStoreToDiscordServer) | **GET** /api/discord/store/{id} | 
[**closeDiscordServer**](DiscordApi.md#closeDiscordServer) | **GET** /api/discord/close | 
[**getIncomingForDiscordServer**](DiscordApi.md#getIncomingForDiscordServer) | **GET** /api/discord/stack | 


<a name="addStoreToDiscordServer"></a>
# **addStoreToDiscordServer**
> addStoreToDiscordServer(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:5000");

    DiscordApi apiInstance = new DiscordApi(defaultClient);
    String id = "id_example"; // String | 
    try {
      apiInstance.addStoreToDiscordServer(id);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscordApi#addStoreToDiscordServer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="closeDiscordServer"></a>
# **closeDiscordServer**
> closeDiscordServer()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:5000");

    DiscordApi apiInstance = new DiscordApi(defaultClient);
    try {
      apiInstance.closeDiscordServer();
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscordApi#closeDiscordServer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

<a name="getIncomingForDiscordServer"></a>
# **getIncomingForDiscordServer**
> List&lt;Object&gt; getIncomingForDiscordServer()



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DiscordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:5000");

    DiscordApi apiInstance = new DiscordApi(defaultClient);
    try {
      List<Object> result = apiInstance.getIncomingForDiscordServer();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DiscordApi#getIncomingForDiscordServer");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;Object&gt;**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

