/**
 * SODA Bootstrap for Android
 * 
 * @author Jason Koceja | jason@koceja.com
 */
package com.jayemko.soda.android;

import com.jayemko.soda.android.MainActivity.SectionsPagerAdapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author Jason Koceja
 *
 */
public class ViewPagerMapNoScroll extends ViewPager {
  public ViewPagerMapNoScroll(Context context) {
    super(context);
  }

  public ViewPagerMapNoScroll(Context context, AttributeSet attrs) {
    super(context, attrs);
  }

  @Override
  protected boolean canScroll(View v, boolean checkV, int dx, int x, int y) {
    if (v instanceof ViewPagerMapNoScroll) {
      // the vertCollectionPagerAdapter has logic on getItem that determines if
      // the next fragment should have swipe disabled
      SectionsPagerAdapter a = (SectionsPagerAdapter) ((ViewPagerMapNoScroll) v)
          .getAdapter();
      if (a.disableSwipe)
        return false;
      else
        return true;
    }
    return super.canScroll(v, checkV, dx, x, y);
  }
}
