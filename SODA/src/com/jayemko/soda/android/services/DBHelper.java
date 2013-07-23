/**
 * SODA Bootstrap for Android
 * 
 * @author Jason Koceja | jason@koceja.com
 */
package com.jayemko.soda.android.services;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author Jason
 */
public class DBHelper extends SQLiteOpenHelper {
  public static final String TABLE_NAME = "saved_place";
  public static final String COLUMN_ID = "_id";
  public static final String PLACE_CL = "place";
  public static final String index_PL = "index_pl";
  private static final String DATABASE_NAME = "places.db";
  private static final int DATABASE_VERSION = 1;
  private static final String DATABASE_CREATE_QUERY = "create table"
      + TABLE_NAME + " (" + COLUMN_ID + " integer primary key autoincrement,"
      + index_PL + " int not null," + PLACE_CL + " blob not null);";
  private static DBHelper helper;

  private DBHelper(Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  public DBHelper(Context context, String name, CursorFactory factory,
      int version) {
    super(context, name, factory, version);
    // TODO Auto-generated constructor stub
  }

  public DBHelper getHelper(Context context) {
    if (helper == null) {
      helper = new DBHelper(context);
    }
    return helper;
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    db.execSQL(DATABASE_CREATE_QUERY);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // TODO Auto-generated method stub
  }
}