/**
 * SODA Bootstrap for Android
 * 
 * @author Jason Koceja | jason@koceja.com
 */
package com.jayemko.soda.android.services;

import android.app.Activity;
import android.location.Location;

public interface ControllerServiceInterface {

  /**
   * @param searchString
   */
  public void searchForPlaces(String searchString);

  /**
   * Async results call
   */
  public void getNearbyPlaces();

  /**
   * Returns the current Location
   * 
   * @return current Location
   */
  public Location getCurrentLocation();

  /**
   * Service instance
   * 
   * @param activity
   */
  public void setActivity(Activity activity);
}
