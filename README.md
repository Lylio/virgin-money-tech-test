# Internet Banking

### Description
Virgin Money's tech assessment as part of their interview process for Java Developer.

### Tech Stack

| Component    | Tech                                                                                                                                                                                                            |
|--------------|-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| Backend      | ![Java](https://img.shields.io/badge/JAVA%20-JDK%208-green?style=for-the-badge) ![Spring Boot](https://img.shields.io/badge/spring%20boot%202.5-white.svg?style=for-the-badge&logo=springboot&logoColor=6DB33F) |
| Database     | ![H2](https://img.shields.io/badge/H2-4169E1.svg?style=for-the-badge&logo=H2&logoColor=white)                                                                                                                   |
| Server Build | ![Maven](https://img.shields.io/badge/maven-white.svg?style=for-the-badge&logo=apache%20maven&logoColor=C71A36)                                                                                                 |



### Setup & Launch

The Smart Meter can be launched with the terminal command `mvn spring-boot:run` (JDK 17) which will run on 
http://localhost:8089 (NOTE PORT: **8089**)

#### Database

H2 in-memory database can be located at http://localhost:8089/h2-console while app is running. Try
basic SQL statement of `SELECT * FROM USER_TRANSACTIONS;` to see table data:

![banking-app.png](doc%2Fimg%2Fbanking-app.png)
<br >

#### API Interrogation

While the app is running, use cURL commands or Postman to retrieve data:

 - `curl http://localhost:8089/api/allTransactions/MyMonthlyDD | json_pp`

or

 - ![postman.png](doc%2Fimg%2Fpostman.png)

- GET http://localhost:8089/api/allTransactions/Groceries
- GET http://localhost:8089/api/allTransactions/MyMonthlyDD
- GET http://localhost:8089/api/monthlyAverageSpend/Groceries
- GET http://localhost:8089/api/monthlyAverageSpend/MyMonthlyDD

#### Running the Test Suite

The unit test suite can be run when the app is not running. Simply use the command:

- `mvn test`

- Or consult your IDE documentation on how to 'play' the tests.

#### Acknowledgements
The cool repo badges, logos and code stats on this README are courtesy of [Simple Icons](https://simpleicons.org) and [Shields.io](https://shields.io).

