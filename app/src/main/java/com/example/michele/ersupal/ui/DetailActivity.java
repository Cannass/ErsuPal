package com.example.michele.ersupal.ui;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.michele.ersupal.R;
import com.example.michele.ersupal.model.DerpData;

import static com.example.michele.ersupal.R.id.news;

public class DetailActivity extends DerpData{

    private static final String BUNDLE_EXTRAS="BUNDLE_EXTRAS";
    private static final String EXTRA_QUOTE="EXTRA_QUOTE";
    private static final String EXTRA_ATTR="EXTRA_ATTR";
    private static final String EXTRA_NEWS="EXTRA_NEWS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Bundle extras = getIntent().getBundleExtra(BUNDLE_EXTRAS);
        ((TextView)findViewById(R.id.lbl_quote_text)).setText(extras.getString(EXTRA_QUOTE));
        ((TextView)findViewById(R.id.lbl_quote_attribution)).setText(extras.getString(EXTRA_ATTR));
    }
}
