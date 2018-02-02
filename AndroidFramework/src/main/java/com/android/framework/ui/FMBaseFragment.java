package com.android.framework.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.androidquery.AQuery;

/**
 * Created by clay on 2015/11/9.
 */
public class FMBaseFragment extends Fragment {

    protected AQuery mAQuery;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //My API level 4 onCreate setup here...
        mAQuery = new AQuery(this.getActivity());
        //Enable hardware acceleration if the device has API 11 or above
        mAQuery.hardwareAccelerated11();
    }

}
