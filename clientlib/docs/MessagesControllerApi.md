# MessagesControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](MessagesControllerApi.md#create) | **POST** /messages | create
[**delete**](MessagesControllerApi.md#delete) | **DELETE** /messages/{id} | delete
[**get**](MessagesControllerApi.md#get) | **GET** /messages/{id} | get
[**list**](MessagesControllerApi.md#list) | **GET** /messages | list


<a name="create"></a>
# **create**
> Message create(message)

create

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.MessagesControllerApi;


MessagesControllerApi apiInstance = new MessagesControllerApi();
Message message = new Message(); // Message | message
try {
    Message result = apiInstance.create(message);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesControllerApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **message** | [**Message**](Message.md)| message |

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="delete"></a>
# **delete**
> delete(id)

delete

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.MessagesControllerApi;


MessagesControllerApi apiInstance = new MessagesControllerApi();
Long id = 789L; // Long | id
try {
    apiInstance.delete(id);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesControllerApi#delete");
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

<a name="get"></a>
# **get**
> Message get(id)

get

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.MessagesControllerApi;


MessagesControllerApi apiInstance = new MessagesControllerApi();
Long id = 789L; // Long | id
try {
    Message result = apiInstance.get(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesControllerApi#get");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| id |

### Return type

[**Message**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="list"></a>
# **list**
> List&lt;Message&gt; list()

list

### Example
```java
// Import classes:
//import se.plilja.springplayground.client.ApiException;
//import se.plilja.springplayground.client.api.MessagesControllerApi;


MessagesControllerApi apiInstance = new MessagesControllerApi();
try {
    List<Message> result = apiInstance.list();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesControllerApi#list");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Message&gt;**](Message.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

