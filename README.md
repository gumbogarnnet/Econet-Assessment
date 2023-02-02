

# Econet-Assessment
accessment for job post 


# First Run  
docker run -e MYSQL_ROOT_PASSWORD=1234 -d -p 3306:3306 mysql:5.7.13



# Or docker compose 

# then 
mvn clean install ;mvn spring-boot:run 

# lastly run 
script.sql


# Insert Shop
curl -X POST "http://localhost:8080/api/shop" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"area\": { \"id\": 8, \"name\": \"\", \"shopSet\": [ null ] }, \"id\": 0, \"name\": \"Econet Shop\"}"

# Get All Shops By Area Name
curl -X GET "http://localhost:8080/api/shop?area=Gweru" -H "accept: */*"

# Get All Area 
curl -X GET "http://localhost:8080/api/getallarea" -H "accept: */*"
# Insert Area
curl -X POST "http://localhost:8080/api/area" -H "accept: */*" -H "Content-Type: application/json" -d "{ \"id\": 9, \"name\": \"Harare\", \"shopSet\": [ ]}"
