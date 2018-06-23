# serviceclient

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>serviceclient</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:serviceclient:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/serviceclient-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import se.plilja.springplayground.client.*;
import se.plilja.springplayground.client.auth.*;
import se.plilja.springplayground.client.model.*;
import se.plilja.springplayground.client.api.HelloControllerApi;

import java.io.File;
import java.util.*;

public class HelloControllerApiExample {

    public static void main(String[] args) {
        
        HelloControllerApi apiInstance = new HelloControllerApi();
        try {
            String result = apiInstance.indexUsingDELETE();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HelloControllerApi#indexUsingDELETE");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*HelloControllerApi* | [**indexUsingDELETE**](docs/HelloControllerApi.md#indexUsingDELETE) | **DELETE** / | index
*HelloControllerApi* | [**indexUsingGET**](docs/HelloControllerApi.md#indexUsingGET) | **GET** / | index
*HelloControllerApi* | [**indexUsingHEAD**](docs/HelloControllerApi.md#indexUsingHEAD) | **HEAD** / | index
*HelloControllerApi* | [**indexUsingOPTIONS**](docs/HelloControllerApi.md#indexUsingOPTIONS) | **OPTIONS** / | index
*HelloControllerApi* | [**indexUsingPATCH**](docs/HelloControllerApi.md#indexUsingPATCH) | **PATCH** / | index
*HelloControllerApi* | [**indexUsingPOST**](docs/HelloControllerApi.md#indexUsingPOST) | **POST** / | index
*HelloControllerApi* | [**indexUsingPUT**](docs/HelloControllerApi.md#indexUsingPUT) | **PUT** / | index
*MessagesControllerApi* | [**create**](docs/MessagesControllerApi.md#create) | **POST** /messages | create
*MessagesControllerApi* | [**delete**](docs/MessagesControllerApi.md#delete) | **DELETE** /messages/{id} | delete
*MessagesControllerApi* | [**get**](docs/MessagesControllerApi.md#get) | **GET** /messages/{id} | get
*MessagesControllerApi* | [**list**](docs/MessagesControllerApi.md#list) | **GET** /messages | list
*UserAuthControllerApi* | [**createUsingPOST**](docs/UserAuthControllerApi.md#createUsingPOST) | **POST** /user-auths | create
*UserAuthControllerApi* | [**getUsingGET**](docs/UserAuthControllerApi.md#getUsingGET) | **GET** /user-auths/{id} | get
*UserAuthControllerApi* | [**listUsingGET**](docs/UserAuthControllerApi.md#listUsingGET) | **GET** /user-auths | list
*UserControllerApi* | [**create1**](docs/UserControllerApi.md#create1) | **POST** /users | create
*UserControllerApi* | [**delete1**](docs/UserControllerApi.md#delete1) | **DELETE** /users/{id} | delete
*UserControllerApi* | [**get1**](docs/UserControllerApi.md#get1) | **GET** /users/{id} | get
*UserControllerApi* | [**list1**](docs/UserControllerApi.md#list1) | **GET** /users | list


## Documentation for Models

 - [Message](docs/Message.md)
 - [User](docs/User.md)
 - [UserAuth](docs/UserAuth.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



