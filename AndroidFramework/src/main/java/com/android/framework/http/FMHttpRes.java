package com.android.framework.http;

import android.os.Bundle;
import com.androidquery.AQuery;
import com.androidquery.util.AQUtility;

/**
 * Created by clay on 2015/11/12.
 */
public abstract class FMHttpRes {

    protected static AQuery aquery = new AQuery(AQUtility.getContext());

    protected static String encodeUrl(Bundle parameters) {
        if (parameters == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String key : parameters.keySet()) {
            if (first)
                first = false;
            else
                sb.append("&");
            sb.append(key + "=" + parameters.getString(key));
        }
        return sb.toString();
    }

    protected static Bundle decodeUrl(String s) {
        Bundle params = new Bundle();
        if (s != null) {
            String array[] = s.split("&");
            for (String parameter : array) {
                String v[] = parameter.split("=");
                params.putString(v[0], v[1]);
            }
        }
        return params;
    }
}
