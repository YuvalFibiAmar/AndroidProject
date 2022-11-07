package com.example.myfirstprogramhit;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView result;
    char op;
    int num1 , num2 , flag ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         result = findViewById(R.id.textViewResult);


    }

    public void buttonFanctionNumber(View view) { //calculator number

        if (flag == 1){
            result.setText("");
            flag = 0;
        }

        else {
            if (view instanceof Button){
                Button b1 = (Button) view;
                String str = b1.getText().toString();
                result.append(str);

            }
        }

    }

    public void arithmetic(View view) {

            if (view instanceof Button) {
                Button b2 = (Button) view;
                op = b2.getText().toString().charAt(0);
                num1 = Integer.parseUnsignedInt(result.getText().toString());
                result.setText("");
            }

    }

    public void Equal(View view) {
        int t;
        flag = 1;
        if (view instanceof Button){
            Button b3 = (Button) view;
            num2 = Integer.parseInt(result.getText().toString());
            if (op == '+')
                t = num1+num2;

            else {
                if (op == '-')
                    t = num1 - num2;
                else {
                    if (op == 'x')
                        t = num1 * num2;

                    else{
                        t = num1/num2;
                    }
                }
            }

            result.setText(String.valueOf(t));

        }
    }

    public void FuncClean(View view) {
        if (view instanceof Button){
            Button b = (Button) view;
            result.setText("");
        }
    }
}