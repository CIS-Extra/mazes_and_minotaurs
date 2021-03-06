package com.example.cis.mazeminotaurs.web_resources;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.cis.mazeminotaurs.R;

/**
 * This fragment opens a pdf containing the M&M Companion manual.
 * @author Devin on 4/4/17.
 */

public class CompanionFragment extends Fragment {
    /*
     * These are widgets found in the layout.
     */
    WebView mCompanionWeb;

    /**
     * This is a web link to the companion manual.
     */
    String mManualUrl = "mazesandminotaurs.free.fr/RMM4.pdf";

    @Override
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b){
        super.onCreateView(li, vg, b);
        View rootView = li.inflate(R.layout.fragment_companion, vg, false);
        mCompanionWeb = (WebView) rootView.findViewById(R.id.companion_web_view);
        mCompanionWeb.loadUrl("https://docs.google.com/viewer?url="+mCompanionWeb);



        return rootView;
    }
}

