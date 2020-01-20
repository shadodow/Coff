package com.example.coffeeorderingaoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView tv1, Qu, tv, tv2, tv3,tv4,tv5,tv6;
    CheckBox cre, cho;
    Button btn1, btn2, btn3;
    int price = 4, lastPrice ;
    int Qun ;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.tv1);
        Qu = (TextView) findViewById(R.id.Qu);
        tv = (TextView) findViewById(R.id.tv);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById((R.id.tv3));
        tv4 = (TextView) findViewById((R.id.tv4));
        tv5 = (TextView) findViewById((R.id.tv5));
        tv6 = (TextView) findViewById((R.id.tv6));
        cre = (CheckBox) findViewById(R.id.cre);
        cho = (CheckBox) findViewById(R.id.cho);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Qun++;
                tv.setText(getText(Qun));
            }

        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Qun --;
                tv.setText(getText(Qun));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cre.isChecked()){
                    price = 4+ 1;
                    s = "added cream";
                }else if (cho.isChecked()){
                    price = 4+ 2;
                    s = "added chocolate";
                }
                lastPrice = price*Qun;
                tv3.setText(s);
                tv4.setText("Quntity =" + getText(Qun));
                tv5.setText("price =" +getText(lastPrice));
                tv6.setText("thank you");
            }
        });
    }
}
