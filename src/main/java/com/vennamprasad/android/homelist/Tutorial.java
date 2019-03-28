package com.vennamprasad.android.homelist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;

import com.vennamprasad.android.R;

public class Tutorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        overridePendingTransition(R.anim.push_left_in, R.anim.push_left_out);
        setContentView(R.layout.activity_tutorial);
        TabHost host = (TabHost) findViewById(R.id.tabHost);
        host.setup();
        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Description");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Description");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Code");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Code");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Output");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Output");
        host.addTab(spec);
    }

    @Override
    public void onBackPressed() {
        super.finish();
        overridePendingTransition(0, 0);
    }
}
