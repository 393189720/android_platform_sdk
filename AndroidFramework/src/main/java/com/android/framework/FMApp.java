package com.android.framework;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.androidquery.callback.AjaxCallback;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.BitmapAjaxCallback;
import com.androidquery.callback.Transformer;
import com.androidquery.util.AQUtility;
import com.google.gson.Gson;

import java.io.File;

/**
 * Created by clay on 2015/11/9.
 */
public class FMApp extends Application {

    private static final String TAG = "FMApp";
    public static Context context;
    protected static String cacheAppDir = "FMApp";

    @Override
    public void onCreate() {
        super.onCreate();

        context = FMApp.this.getApplicationContext();
        AQUtility.setContext(this);
        JsonTransformer t = new JsonTransformer();
        AjaxCallback.setTransformer(t);
        //cache
        File ext = Environment.getExternalStorageDirectory();
        File cacheDir = new File(ext, cacheAppDir);
        AQUtility.setCacheDir(cacheDir);
        Log.d(TAG, "AQuery has prepered!");

    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        // clear all memory cached images when system is in low memory
        // note that you can configure the max image cache count, see
        // CONFIGURATION
        BitmapAjaxCallback.clearCache();
    }

    private static class JsonTransformer implements Transformer {

        public <T> T transform(String url, Class<T> type, String encoding, byte[] data, AjaxStatus status) {
            Gson g = new Gson();
            return g.fromJson(new String(data), type);
        }
    }
}
