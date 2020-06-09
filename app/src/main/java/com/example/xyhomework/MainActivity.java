package com.example.xyhomework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button bt1;
    private Button bt2;
    private EditText ed1;
    private EditText ed2;
    private TextView tv;
    private TextView tv1;
    private TextView tv2;
    private TextView tv3;
    private TextView tv4;
    private int intAnswer_X_Values = 0;
    private int intAnswer_Y_Values = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        ed1 = findViewById(R.id.ed1);
        ed2 = findViewById(R.id.ed2);
        tv = findViewById(R.id.tv);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);

        
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random objRandomCreateNumber = new Random();
                 intAnswer_X_Values = objRandomCreateNumber.nextInt(20);
                 intAnswer_Y_Values = objRandomCreateNumber.nextInt(20);


                int intConst_A_Values = objRandomCreateNumber.nextInt(20);
                int intConst_B_Values = objRandomCreateNumber.nextInt(20);
                int intConst_C_Values = objRandomCreateNumber.nextInt(20);

                int intConst_D_Values =
                        intConst_A_Values * intAnswer_X_Values + intConst_B_Values * intAnswer_Y_Values + intConst_C_Values;
                int intConst_E_Values=
                        intAnswer_X_Values + intAnswer_Y_Values;
                ed1.setText("");
                ed2.setText("");

                tv.setText("題目 : "+intConst_A_Values+"X+"+intConst_B_Values+"Y+"+intConst_C_Values+"="+intConst_D_Values);
                tv1.setText("題目 : "+"X+Y="+intConst_E_Values);
                tv4.setText("答案結果: ");
                Toast.makeText(MainActivity.this,"開始",Toast.LENGTH_SHORT).show();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            int intAcceptAnwser_X = Integer.parseInt(ed1.getText().toString().trim());
            int intAcceptAnwser_Y = Integer.parseInt(ed2.getText().toString().trim());

            if((intAcceptAnwser_X ==  intAnswer_X_Values)&&(intAcceptAnwser_Y ==  intAnswer_Y_Values) ){
                tv4.setText("答對");
            }
                else {
                tv4.setText("錯了"); }
        }
    });
    }
   
}
