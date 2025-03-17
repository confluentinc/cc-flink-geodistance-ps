# cc-flink-geodistance-ps
# Apache Flink® User Defined Function (UDF) on Confluent Cloud - Geo Distance
This repository calculates the distance between geographic points using the [Haversine](https://www.igismap.com/haversine-formula-calculate-geographic-distance-earth/) formula to determine the distance between two points on a sphere given their longitudes and latitudes.

## Build
The Flink UDF requires a fat jar or uber jar. This Gradle project uses the shadow plugin to generate the fat jar. The GeoDistance class inherits from ScalarFunction, which is part of the Flink Table API.

The command below creates a fat jar under build\libs `GeoDistance-1.0.0-all.jar`
````
gradle build
````
## Usage
The function returns the distance between two geographic locations in meters.
````
GeoDistanceUDF udf = new GeoDistanceUDF();
double distance = udf.eval(lat1,lon1,lat2,lon2);
````