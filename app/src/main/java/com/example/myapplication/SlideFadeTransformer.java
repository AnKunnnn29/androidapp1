package com.example.myapplication;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class SlideFadeTransformer implements ViewPager2.PageTransformer {

    @Override
    public void transformPage(@NonNull View page, float position) {
        if (position < -1 || position > 1) {
            // Page is not visible, set alpha to 0.
            page.setAlpha(0f);
        } else {
            // Fade the page out as it moves away from the center.
            page.setAlpha(1 - Math.abs(position));

            // Slide the page horizontally.
            page.setTranslationX(-position * page.getWidth());
        }
    }
}
