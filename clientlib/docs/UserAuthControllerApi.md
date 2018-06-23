# UserAuthControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUsingPOST**](UserAuthControllerApi.md#createUsingPOST) | **POST** /user-auths | create
[**getUsingGET**](UserAuthControllerApi.md#getUsingGET) | **GET** /user-auths/{id} | get
[**listUsingGET**](UserAuthControllerApi.md#listUsingGET) | **GET** /user-auths | list


<a name="createUsingPOST"></a>
# **createUsingPOST**
> UserAuth createUsingPOST(message)

create

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserAuthControllerApi;


UserAuthControllerApi apiInstance = new UserAuthControllerApi();
UserAuth message = new UserAuth(); // UserAuth | message
try {
    UserAuth result = apiInstance.createUsingPOST(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthControllerApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**UserAuth**](UserAuth.md)| message |

### Return type

[**UserAuth**](UserAuth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> UserAuth getUsingGET(id)

get

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserAuthControllerApi;


UserAuthControllerApi apiInstance = new UserAuthControllerApi();
Long id = 789L; // Long | id
try {
    UserAuth result = apiInstance.getUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthControllerApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**UserAuth**](UserAuth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> List&lt;UserAuth&gt; listUsingGET()

list

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserAuthControllerApi;


UserAuthControllerApi apiInstance = new UserAuthControllerApi();
try {
    List<UserAuth> result = apiInstance.listUsingGET();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserAuthControllerApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;UserAuth&gt;**](UserAuth.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

