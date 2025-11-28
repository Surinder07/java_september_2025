## Recap 

API 
REST API 

POSTMAN 
way of communication from one service/system with another system over the 
HTTP
send a request and receive a response 

Methods 
GET, PUT, POST, DELETE, PATCH 

JSON, XML 


# Components 
URI
HTTP Methods
BODY - JSON, XML 

{
 "Name":"Mark",
 "Email":"mark@gmail.com"

}


Postman?

testing API's
                postman 
Frontend    -----> API ---------> Backend ----> Database 

https://api.openweathermap.org  - Base url
/data/2.5/weather               - endpoint 
?lat={lat}&lon={lon}&appid={API key} - Query Params

Kafka ----- streaming --->  lat and lon ----> 

https://tile.openweathermap.org/map/Test/10/5/5.png?appid=a8190e57a98a8c12e286354ecf950c37

HTTP status codes 
Error 404

1. 100 series   - Informational    --- Processing 
2. 200 series   - Success       - 200 OK , 201 created , 204 No content  [delete]
3. 300 series   - Redirection - resource moved , 301, 302
4. 400 series   - Client Error - 400 , 401, 404, 408, 409[conflict]
5. 500 series   - servers error - 500 , 502, 503





