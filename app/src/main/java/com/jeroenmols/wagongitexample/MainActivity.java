package com.jeroenmols.wagongitexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.jeroenmols.library.AwesomeConvertor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView awesomeTv = (TextView) findViewById(R.id.tv_awesome);
        awesomeTv.setText(AwesomeConvertor.toAwesome("Hello World"));
    }
}
