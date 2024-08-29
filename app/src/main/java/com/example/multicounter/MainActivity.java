package com.example.multicounter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edtNumber;
    Button btn_count,btn_clear;
    TextView tvDisplay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edtNumber.findViewById(R.id.edtNumber);
        btn_count.findViewById(R.id.btn_count);
        btn_clear.findViewById(R.id.btn_clear);
        tvDisplay.findViewById(R.id.tvDisplay);

       btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String number = edtNumber.getText().toString();
                int result = Integer.valueOf(number);

                for (int m = 1; m <= 10; m++) {
                    tvDisplay.append(result +"x"+m+"=" + result * m + "\n");
                }

            }
        });

        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               tvDisplay.setText("");

            }
        });






    }
}
