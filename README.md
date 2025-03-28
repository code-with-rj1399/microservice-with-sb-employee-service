# microservice-with-sb-employee-service [Employee Service]

🔗 **For a complete overview of the microservices architecture and setup, please refer to the [Main README](https://github.com/code-with-rj1399/microservice-with-sb-api-gateway/blob/master/README.md).**

The **Employee Service** is a part of the microservices architecture responsible for managing employee-related operations. It registers with the **Eureka Service Registry** and fetches configurations from the **Config Server**.

## How to Start

1. Clone this repository.
2. Open the project in your IDE.
3. Navigate to the `Application` class.
4. Run the application.

## Service Details

- **Port:** `8082`
- **Registers with Eureka:** ✅ Yes
- **Logs & Tracing:** All logs and request traces are collected using **Zipkin** ([View in Zipkin](http://localhost:9411/zipkin/)).
- **Exposed APIs (Accessible via API Gateway):**
    - **Add Employee:** `POST /employee`
    - **Get All Employees:** `GET /employee`
    - **Get Employee by ID:** `GET /employee/{id}`

## API Gateway

All APIs are **exposed and accessible** through the **[API Gateway](http://localhost:8083)**. This ensures centralized routing, security, and monitoring.  
