## This is an API designing assignment for hotel reservation in MCDA5550
1. API 1
Request method: GET
Request url: http://Hotelreservationapi-env.eba-jifxmizk.ca-central-1.elasticbeanstalk.com/hotelist

Response parameters:
|Key|Type|Describe|
|------|------|------|
|id|int|a unique number of hotel|
|hotel_name|String|name of hotel|
|price|int|price per night|
|availability|boolean|true or false|

2. API 2
Request method: POST
Request url: http://Hotelreservationapi-env.eba-jifxmizk.ca-central-1.elasticbeanstalk.com/reservation
Request body: JSON
```
{ "hotel_name": "The Halifax Hotel",

   "checkin": "20210703",

   "checkout": "20210710",

	"guests_list": [
		
		{ "guest_name" : "Ziwei Liu",
		  "gender": 1
		},

		{ "guest_name" : "Johnny Liu",
	      "gender": 1
		}
	]
}
```

Request parameters:
|Key|Type|Describe|
|------|------|------|
|hotel_name|String|It's the unique number for hotel|
|checkin|String|checkin time, not null|
|checkout|String|checkout time, not null|
|guests_list|Set|a list of information of guests|
|guest_name|String|not null|
|gender|int|1:MALE, 2:FEMALE, 3:NONIDENTIFIED|

Response parameter:
|Key|Type|Describe|
|------|------|------|
|Confirmation_number|int|a unique number of reservation|