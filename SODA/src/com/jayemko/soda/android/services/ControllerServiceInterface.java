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
   * 
   */
  public void getNearbyPlaces();

  /**
   * @return
   */
  public Location getCurrentLocation();

  /**
   * @param activity
   */
  public void setActivity(Activity activity);
}
