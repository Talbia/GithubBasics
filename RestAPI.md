## Introduction to REST API 

It is short for **Representational State Transfer - Application Programming Interface**. It works as a **Client-Server** manner. For example, you make a call from a client to a server and you get the data back over the HTTP protocol. 

It is basically a convention for building HTTP services. 

> Let's look an example: [http://vidly.com/api/customers]
> - At first, here's an address starting with **http or https** - depends on the application and its requirements. **HTTPS is used to exchange data on a secure channel, HTTP otherwise.** 
> - After that, a lot of web addresses mention **API** to expose their restful services.
> - Next, customers refer to the collection of customers in an application to expose as a resource such as customers or other endpoints. Here, Customers formatted data will display as a response. 

The following standard HTTP methods are used in an API. Let's explore each of these using the **Customers** example: 
- GET: getting data
 > To get the list of all customers, a client should send an **HTTP GET** request to this address. 
 > Here it indicates a list of customers when a client send an HTTP Get request to this endpoint.
 > The service will send the client an array of customers objects (ID, name etc.)
 
- POST: creating data
 > HTTP POST request to create a customer to the endpoint. 
 _Note: As the client is adding a new customer, client doesn't have the ID in the address. Instead client is working with the collection of customers and that's why client should `include customer object in the body of the request`.

- PUT: updating data
 > A client should send an HTTP PUT request to the endpoint i.e. `../customers/1 and { name :  ' ' }` as a request. This will depict the customer object with updated properties. 

- DELETE: deleting data
 > Client should send an HTTP DELETE request to the endpoint to delete the customer's data using the ID. 

This is how Restful convention works. Client should expose the resources using a simple, meaningful address and support various operations around them using standard HTTP methods. 
