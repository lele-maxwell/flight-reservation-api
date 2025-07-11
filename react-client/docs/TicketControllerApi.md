# OpenApiDefinition.TicketControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callDelete**](TicketControllerApi.md#callDelete) | **DELETE** /api/tickets/{id} | 
[**create**](TicketControllerApi.md#create) | **POST** /api/tickets | 
[**getAll**](TicketControllerApi.md#getAll) | **GET** /api/tickets | Get all tickets
[**getById**](TicketControllerApi.md#getById) | **GET** /api/tickets/{id} | 
[**search**](TicketControllerApi.md#search) | **GET** /api/tickets/search | 



## callDelete

> Object callDelete(id)



### Example

```javascript
import OpenApiDefinition from 'open_api_definition';

let apiInstance = new OpenApiDefinition.TicketControllerApi();
let id = 789; // Number | 
apiInstance.callDelete(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## create

> Ticket create(ticket)



### Example

```javascript
import OpenApiDefinition from 'open_api_definition';

let apiInstance = new OpenApiDefinition.TicketControllerApi();
let ticket = new OpenApiDefinition.Ticket(); // Ticket | 
apiInstance.create(ticket).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticket** | [**Ticket**](Ticket.md)|  | 

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


## getAll

> [Ticket] getAll()

Get all tickets

### Example

```javascript
import OpenApiDefinition from 'open_api_definition';

let apiInstance = new OpenApiDefinition.TicketControllerApi();
apiInstance.getAll().then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters

This endpoint does not need any parameter.

### Return type

[**[Ticket]**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## getById

> Ticket getById(id)



### Example

```javascript
import OpenApiDefinition from 'open_api_definition';

let apiInstance = new OpenApiDefinition.TicketControllerApi();
let id = 789; // Number | 
apiInstance.getById(id).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Number**|  | 

### Return type

[**Ticket**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


## search

> [Ticket] search(opts)



### Example

```javascript
import OpenApiDefinition from 'open_api_definition';

let apiInstance = new OpenApiDefinition.TicketControllerApi();
let opts = {
  'origin': "origin_example", // String | 
  'destination': "destination_example", // String | 
  'company': "company_example" // String | 
};
apiInstance.search(opts).then((data) => {
  console.log('API called successfully. Returned data: ' + data);
}, (error) => {
  console.error(error);
});

```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **origin** | **String**|  | [optional] 
 **destination** | **String**|  | [optional] 
 **company** | **String**|  | [optional] 

### Return type

[**[Ticket]**](Ticket.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*

