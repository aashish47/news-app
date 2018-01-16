package com.example.hp.techie.classes;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Hp on 10/9/2017.
 */

public class OurViewClient extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView v, String url)
    {
        v.loadUrl(url);
        return true;
    }
}
