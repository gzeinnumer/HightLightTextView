package com.gzeinnumer.hightlighttextview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.athkalia.emphasis.EmphasisTextView;

public class MainActivity extends AppCompatActivity {

    EmphasisTextView emphasisTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emphasisTextView =  findViewById(R.id.empha);
        emphasisTextView.setTextToHighlight("Hello");
        emphasisTextView.setTextHighlightColor(R.color.colorAccent);
        emphasisTextView.setCaseInsensitive(true);
        emphasisTextView.highlight();
    }
}
