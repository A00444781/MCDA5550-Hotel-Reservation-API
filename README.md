## API designing assignment for hotel reservation in MCDA5550
1. Request method: **GET**

Request url: https://hotelreservationapi.azurewebsites.net/hotelList

Response parameters:
|Key|Type|Description|
|------|------|------|
|id|int|a unique number of hotel|
|hotel_name|String|name of hotel|
|price|int|price per night|
|availability|boolean|true or false|

2. Request method: **POST**

Request url: https://hotelreservationapi.azurewebsites.net/reservation

Request body example: JSON
```
{ "hotel_name": "The Grand Hotel",

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
|Key|Type|Description|
|------|------|------|
|hotel_name|String|name of hotel, not null|
|checkin|String|checkin time, not null|
|checkout|String|checkout time, not null|
|guests_list|Set|a list of information of guests, see below|
|guest_name|String|not null|
|gender|int|1:MALE, 2:FEMALE, 3:NONIDENTIFIED|

Response parameter:
|Key|Type|Describe|
|------|------|------|
|Confirmation_number|int|a unique number of reservation|

3. Database is mysql hosted on dbcourse.cs.smu.ca, username: u43, schema name: u43
