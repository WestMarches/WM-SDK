# Org.OpenAPITools.Api.DiscordApi

All URIs are relative to *http://localhost:5000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddStoreToDiscordServer**](DiscordApi.md#addstoretodiscordserver) | **GET** /api/discord/store/{id} | 
[**CloseDiscordServer**](DiscordApi.md#closediscordserver) | **GET** /api/discord/close | 
[**GetIncomingForDiscordServer**](DiscordApi.md#getincomingfordiscordserver) | **GET** /api/discord/stack | 


<a name="addstoretodiscordserver"></a>
# **AddStoreToDiscordServer**
> void AddStoreToDiscordServer (string id)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class AddStoreToDiscordServerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:5000";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new DiscordApi(config);
            var id = id_example;  // string | 

            try
            {
                apiInstance.AddStoreToDiscordServer(id);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscordApi.AddStoreToDiscordServer: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  | 

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="closediscordserver"></a>
# **CloseDiscordServer**
> void CloseDiscordServer ()



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class CloseDiscordServerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:5000";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new DiscordApi(config);

            try
            {
                apiInstance.CloseDiscordServer();
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscordApi.CloseDiscordServer: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getincomingfordiscordserver"></a>
# **GetIncomingForDiscordServer**
> List&lt;Object&gt; GetIncomingForDiscordServer ()



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class GetIncomingForDiscordServerExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "http://localhost:5000";
            // Configure API key authorization: Bearer
            config.AddApiKey("Authorization", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // config.AddApiKeyPrefix("Authorization", "Bearer");

            var apiInstance = new DiscordApi(config);

            try
            {
                List<Object> result = apiInstance.GetIncomingForDiscordServer();
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling DiscordApi.GetIncomingForDiscordServer: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List<Object>**

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

