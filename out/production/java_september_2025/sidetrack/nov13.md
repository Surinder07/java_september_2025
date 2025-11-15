## Recap 

1. API- Application Programming Interface

send a request and get a response back

API is an interface that allows one application or system to communicate with another 
application/system.

example : Google Map Api , Weather , Spotify api , payment api, chatgpt api



REST API  : developed rest api on top of HTTP


gRPC : HTTP 1.1 , independent of a language 


HTTP 1.0

client server model 

HTTP : 
GET
POST 
PUT
DELETE

Roy fielding thesis : https://ics.uci.edu/~fielding/pubs/dissertation/rest_arch_style.htm


20 years back 

Taxi : 
Taxi 1 : $ 535                          : Air canada
Taxi 2 : $ 550                          : Porter
Taxi 3 : $ 420 : no luggage             : west jet    
Taxi 4 : $ 400 : sponsor the food       : American Airlines

Travel Agent : XYZ      : Kayak
Travel Agent : ABC      : Expedia    
Travel Agent : PQR      : MMT    
Travel Agent : LMN      : Sunwing    


Forward air api 
https://portal.forwardair.com/docs/api/quotingServices.html


## Request 
1. URL    https://www.priceline.com   : Base URL 
2. /m/fly/search/TRC-NYC-20251122/NYC-TRC-20251129/  : END point 
3. ?cabin-class=ECO &  no-date-search=false   &    search-type=0110  &    num-adults=1  : Query Parameters



2. Header  :     token, security 

   3. Body    : 
       from location
        to location , dates 


4. Method 

    GET, POST , PUT , PATCH , DELETE



## API testing tool 
1. Postman 
2. Swagger - api documentation tool 


## update the data
Put    ---   send the whole object 
patch 

{
        name  : Mike
        email : mike@gmail.com
        phone : 234234234
        city  : Brampton
}

city  : Brampton

JSON : java script object notation 

https://openweathermap.org/api












