# RegistrationApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**apiRegistrationPost**](RegistrationApi.md#apiRegistrationPost) | **POST** /api/registration | 


<a name="apiRegistrationPost"></a>
# **apiRegistrationPost**
> apiRegistrationPost(registrationRequest)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.RegistrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:5000");
    
    // Configure API key authorization: Bearer
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //Bearer.setApiKeyPrefix("Token");

    RegistrationApi apiInstance = new RegistrationApi(defaultClient);
    RegistrationRequest registrationRequest = new RegistrationRequest(); // RegistrationRequest | 
    try {
      apiInstance.apiRegistrationPost(registrationRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling RegistrationApi#apiRegistrationPost");
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
 **registrationRequest** | [**RegistrationRequest**](RegistrationRequest.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

