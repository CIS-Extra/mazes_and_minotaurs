package com.example.cis.mazeminotaurs.NewCharacter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cis.mazeminotaurs.AttributeScoreGenerator;
import com.example.cis.mazeminotaurs.R;

/**
 * Created by ckling on 4/10/17.
 */

public class CreateCharacter extends Fragment {

    String mCharaName;
    String mCharacterClass;

    TextView mCharaClass;

    public CreateCharacter() {
    }

    @Override
    public View onCreateView(LayoutInflater li, ViewGroup vg, Bundle b) {
        super.onCreateView(li, vg, b);
        Log.i("Begin OnCreateView", "Start of onCreateView");
        View rootView = li.inflate(R.layout.fragment_create_character, vg, false);

        mCharaClass = (TextView) rootView.findViewById(R.id.character_class_view);
        mCharacterClass = getArguments().getString("newClass");
        mCharaClass.setText(mCharacterClass);


        return rootView;
    }


}