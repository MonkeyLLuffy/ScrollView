package com.monkeylluffy.scrollview;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements View.OnClickListener{

    private Button btn_down;
    private Button btn_up;
    private ScrollView scrollView;
    private TextView text_show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindViews();
    }

    private void bindViews() {
        btn_down = (Button) findViewById(R.id.btn_down);
        btn_up = (Button) findViewById(R.id.btn_up);
        scrollView = (ScrollView) findViewById(R.id.scrollView);
        text_show = (TextView) findViewById(R.id.text_show);

        btn_up.setOnClickListener(this);
        btn_down.setOnClickListener(this);

        StringBuilder sb = new StringBuilder();
        for (int i = 0;i<100;i++){
            sb.append("呵呵 "+i+"\n");
        }
        text_show.setText(sb.toString());
        Log.e("text", (String) text_show.getText());
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_down:scrollView.fullScroll(ScrollView.FOCUS_DOWN);break;
            case R.id.btn_up:scrollView.fullScroll(ScrollView.FOCUS_UP);
        }
    }
}
