# Service Management API

## Setup and Installation
### 1. Clone the Repository
```
git clone https://github.com/your-username/your-repository-name.git
cd your-repository-name
```
### 2. Install Prerequisites
Ensure the following are installed on your system:

Java 17 or higher                          
MongoDB                      
Maven                        

### 3. Configure MongoDB
```
spring.data.mongodb.uri=mongodb://localhost:27017/service
```
### 4. Build the Project
```
mvn clean install

```
### 5. Run the Application
```
mvn spring-boot:run
```
The application will be accessible at http://localhost:8080.

# Access the API
## Once the application is running, you can use API testing tools like Postman to interact with the endpoints:

# API END POINTS
### Add a New Service:
```
POST http://localhost:8080/api/services/add
```
### Retrieve All Services:
```
GET http://localhost:8080/api/services/all
```
### Update a Service:
```
PUT http://localhost:8080/api/services/update/{id}
```
### Delete a Service:
```
DELETE http://localhost:8080/api/services/delete/{id}
```





