/**
 * SODA Bootstrap for Android
 * 
 * @author Jason Koceja | jason@koceja.com
 */
package com.jayemko.soda.android.data;

/**
 * @author Jason
 */
public class Coordinate {
  Double latitude;
  Double longitude;

  public Coordinate(Double latitude, Double longitude) {
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public Coordinate(String latitude, String longitude) {
    this.latitude = Double.parseDouble(latitude);
    this.longitude = Double.parseDouble(longitude);
  }

  public Double getLatitude() {
    return latitude;
  }

  public Double getLongitude() {
    return longitude;
  }
}