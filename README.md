# Product-Catalogue-MicroService
Micro-service to maintain product catalogue. 

This project is implemented using Spring Boot. JSON is used for Data interchange. In memory database Derby is used for data persistence. 
The URLs to access the REST API for GET, POST, DELETE are as follows:

POST: http://localhost:8080/products/ 
      
      Body:
      {
    	"productId": "301",
    	"productName" : "Shaving Foam",
    	"price": 150,
    	"productType": "SKIN_CARE"
    }
 
GET: http://localhost:8080/products/SKIN_CARE (http://localhost:8080/products/{productType}) - This will return a list of products whose productType will match the product type mentioned in the URL .

DELETE: http://localhost:8080/products/301 (http://localhost:8080/products/{productId}) - This will delete the product whose productId will match the product id mentioned in the URL.

