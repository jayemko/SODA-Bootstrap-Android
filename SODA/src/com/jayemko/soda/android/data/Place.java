/**
 * SODA Bootstrap for Android
 * 
 * @author Jason Koceja | jason@koceja.com
 */
package com.jayemko.soda.android.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import android.graphics.Color;
import android.location.Geocoder;
import android.util.Log;

import com.socrata.data.View;
import com.socrata.data.View.Row;

/**
 * @author Jason
 *
 */
public abstract class Place implements Comparable<Place>, Serializable {
  private static final long serialVersionUID = 0;
  public int id;
  public int type;
  public int bookmark = 0;
  private int bColor = Color.TRANSPARENT;
  private int photo;
  public final static String NAME = "NAME";
  public final static String TYPE = "TYPE";
  public final static String ADDRESS = "ADDRESS";
  public static Geocoder mGeoCoder;
  public static List<View> list_metadata = new ArrayList<View>();
  public static List<View> empty = new ArrayList<View>();
  public ArrayList<LinkedHashMap<String, String>> fieldsHashMap = new ArrayList<LinkedHashMap<String, String>>();
  public static String datasetM[];
  public static List<Place> list = new ArrayList<Place>();
  public static List<Place> list_bookmarks = new ArrayList<Place>();
  public Coordinate coordinate;
  public View metadata;
  public Row row;
  Map<String, Object> data;

  public Place() {
  }

  public void setBookmark(int value) {
    this.bookmark = value;
  }

  public static void setGeocoder(Geocoder geo) {
    Log.i("geocoder", "init"); // logcat
    mGeoCoder = geo;
  }

  public static void initialize() {
    for (int i = 0; i < datasetM.length; i++) {
      list_metadata.add(new View());
    }
    Log.d("Initialize method", "Completed");
  }

  public void addPlace(Place place) {
    list.add(place);
  }

  public static void setPlace(List<Place> p) {
    list = p;
  }

  public Place getPlace(int idx) {
    return list.get(idx);
  }

  @Override
  public int compareTo(Place arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

  public abstract String getName();

  public abstract String getType();
}
