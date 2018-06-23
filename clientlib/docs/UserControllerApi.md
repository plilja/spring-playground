# UserControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create1**](UserControllerApi.md#create1) | **POST** /users | create
[**delete1**](UserControllerApi.md#delete1) | **DELETE** /users/{id} | delete
[**get1**](UserControllerApi.md#get1) | **GET** /users/{id} | get
[**list1**](UserControllerApi.md#list1) | **GET** /users | list


<a name="create1"></a>
# **create1**
> User create1(message)

create

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
User message = new User(); // User | message
try {
    User result = apiInstance.create1(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#create1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**User**](User.md)| message |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete1"></a>
# **delete1**
> delete1(id)

delete

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
Long id = 789L; // Long | id
try {
    apiInstance.delete1(id);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#delete1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="get1"></a>
# **get1**
> User get1(id)

get

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
Long id = 789L; // Long | id
try {
    User result = apiInstance.get1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#get1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list1"></a>
# **list1**
> List&lt;User&gt; list1()

list

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.UserControllerApi;


UserControllerApi apiInstance = new UserControllerApi();
try {
    List<User> result = apiInstance.list1();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserControllerApi#list1");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

