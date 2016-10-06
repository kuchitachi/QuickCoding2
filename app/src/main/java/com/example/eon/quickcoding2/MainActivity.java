package com.example.eon.quickcoding2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    private TextView tv_result;

    private int res;

    private int right;
    private int left;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button bt_BIG = (Button) findViewById(R.id.bt_BIG);

        Button bt_SMALL = (Button) findViewById(R.id.bt_SMALL);

        Button bt_send = (Button) findViewById(R.id.bt_send);

        Button bt_bingo = (Button) findViewById(R.id.bt_bingo);

        tv_result = (TextView) findViewById(R.id.tv_result);

        bt_BIG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { getBig();}
        });

        bt_SMALL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { getSmall();}
        });

        bt_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { Send(); }
        });

        bt_bingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { bingo(); }
        });
    }


    private void Send() {
        res = (int)(Math.random()*500);
        tv_result.setText("Your Number is " + res);
        left = 1;
        right = 500; // initialize
    }

    private void getBig() {
        left = res+1;
        res = (left+right)/2;
        tv_result.setText("Your Number is " + res);
    }

    private void getSmall() {
        right = res-1;
        res = (left+right)/2;
        tv_result.setText("Your Number is " + res);
    }

    private void bingo() {
        tv_result.setText("Bingo");
    }
}

//QuickCoding2