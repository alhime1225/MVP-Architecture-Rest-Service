package com.example.mvparchitecture.data.utilities;

import android.view.View;


public interface ItemClickListener {
    /**
     *
     * @param view
     * @param position
     * @param isLongClick
     */
    void onClick(View view, int position, boolean isLongClick);

}
