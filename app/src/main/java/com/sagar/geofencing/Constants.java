package com.sagar.geofencing;

import com.google.android.gms.maps.model.LatLng;
import java.util.HashMap;



public final class Constants {

    public Constants() {
    }


    public static final String PACKAGE_NAME = "com.sagar.geofencing";


    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";


    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";


    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;


    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    //public static final float GEOFENCE_RADIUS_IN_METERS = 1609; // 1 mile, 1.6 km
    public static final float GEOFENCE_RADIUS_IN_METERS = 1; // 1 mile, 1.6 km


    /**
     * Map for storing information about places in the Talegaon bay area.
     */
    public static final HashMap<String, LatLng> BAY_AREA_LANDMARKS = new HashMap<String, LatLng>();
    static {

        BAY_AREA_LANDMARKS.put("MIMER", new LatLng(18.735490, 73674340));

        // Googleplex.
        BAY_AREA_LANDMARKS.put("SYNDICATE", new LatLng(18.7342452,73.6775154));

        // Test
        BAY_AREA_LANDMARKS.put("HP GAS", new LatLng(18.7326348,73.6756754));
    }


    // end
}
