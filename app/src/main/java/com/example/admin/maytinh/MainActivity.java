package com.example.admin.maytinh;

import android.icu.text.DecimalFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.admin.maytinh.R.styleable.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText edtso1, edtso2;
    private TextView textkq;
    private Button btntong2so, btntong2so2, btntong2so3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout);


        Button btntong2so2 = (Button) findViewById(R.id.btntong2so2);
        btntong2so2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText edtso1 = (EditText) findViewById(R.id.edtsoa);
                int a = Integer.parseInt(edtso1.getText() + "");
                EditText edtso2 = (EditText) findViewById(R.id.edtsob);
                int b = Integer.parseInt(edtso2.getText() + "");

                TextView textkq = (TextView) findViewById(R.id.txtkq);
                textkq.setText((a + b) + "");
            }


        });
        btntong2so3 = (Button) findViewById(R.id.btntong2so3);
        btntong2so3.setOnClickListener(this);

    }

    public void btn_tong2so(View v) {

        EditText edtso1 = (EditText) findViewById(R.id.edtsoa);
        int a = Integer.parseInt(edtso1.getText() + "");
        EditText edtso2 = (EditText) findViewById(R.id.edtsob);
        int b = Integer.parseInt(edtso2.getText() + "");

        TextView textkq = (TextView) findViewById(R.id.txtkq);
        textkq.setText((a + b) + "");
    }

    public void onClick(View v) {
        EditText edtso1 = (EditText) findViewById(R.id.edtsoa);
        int a = Integer.parseInt(edtso1.getText() + "");
        EditText edtso2 = (EditText) findViewById(R.id.edtsob);
        int b = Integer.parseInt(edtso2.getText() + "");

        TextView textkq = (TextView) findViewById(R.id.txtkq);
        textkq.setText((a + b) + "");

    }


    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

}
