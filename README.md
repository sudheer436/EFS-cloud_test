# EFS-cloud_test
Assignment from Santendar bank
                                                  
Below is my understanding and developed the API accordingly. 
 
Let me consider one message feed: and below is the tag mapping I assumed.
 unique id,          instrument name,   bid,           ask           timestamp
 106,                  EUR/USD,            1.1000,     1.2000,     01-06-2020 

we need to make bid value -0.1%  less  of actual bid value from the message feed and
ask(sell price)/commision to +0.1% higher of actual ask value in message feed.

then sending updated bid and ask value in response
                                                         
ultimately the sample response :
  {
        "id": "106",
        "instrument_name": "EUR/USD",
        "bid" : "1.0989",		          // which is -0.1% less then actual bid value 
        "ask" : "1.1011000000000002", //which is +0.1% higher then actual ask value 
        "timestamp": "01-06-2020 12:01:01:001"
    }       

I have done the given assignment and attached the source code files as zip along with ReamMe document where it contains 
•	use cases and details
•	features implemented
•	coding standards used
•	Rest endpoint details
•	swagger details 

Features implemented:
1.       swagger configuration in order to make easy for API testing
2.       covered unit test cases
3.       added Logger in order to trace the issues, in case of production.
4.       devTool : to do auto reload configuration in case of code change, to speedup the development work
5.       Docker file: added docker file in order to generate docker image.    
                 
Coding standard followed:
              •            proper package structure
              •            log implementation
              •            defining interface and implementation class.
              •            appropriate comments
                                              
Rest endpoints developed :
              POST:  http://localhost:8083/priceHandler
             
              samle input:
                             [
    "106, EUR/USD, 1.1000,1.2000,01-06-2020 12:01:01:001",
    "107, EUR/JPY, 119.60,119.90,01-06-2020 12:01:02:002"
]
             
              sample output:
                             [
    {
        "id": "106",
        "instrument_name": "EUR/USD",
        "bid": "1.0989",
        "ask": "1.1011000000000002",
        "timestamp": "01-06-2020 12:01:01:001"
    },
    {
        "id": "107",
        "instrument_name": "EUR/JPY",
        "bid": "119.48039999999999",
        "ask": "119.7196",
        "timestamp": "01-06-2020 12:01:02:002"
    }
]
               
swagger url:  http://localhost:8083/swagger-ui.html#!

Please note: In case if the requirement is different OR your looking for something different response then it's because of gap between the understanding of requirement only, But still I have developed this code with initial shared information with short time and on going if I get more time and clarity I can make it more dynamic and more informative.  

