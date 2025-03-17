package io.confluent.ps.flink.geo;

import org.junit.jupiter.api.Test;

import static java.lang.Math.floor;
import static org.junit.jupiter.api.Assertions.*;

class GeoDistanceUDFTest {

    @Test
    public void testGeoDistance(){
        GeoDistanceUDF udf = new GeoDistanceUDF();
        //New York: (Latitude, Longitude) = (40.7128, -74.0060)
        double lat1 = 40.7128;
        double lon1 = -74.0060;
        //Washington DC: (Latitude, Longitude) = (38.9072, -77.0369)
        double lat2 = 38.9072;
        double lon2 = -77.0369;

        //Distance between these coordinates should be 327582.71362985385 meters

        double distance = udf.eval(lat1,lon1,lat2,lon2);
        System.out.println("==> Distance in meters: "+floor(distance));
        assertEquals(327582, floor(distance));
    }
}