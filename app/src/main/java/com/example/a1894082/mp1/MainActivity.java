package com.example.a1894082.mp1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_click= findViewById(R.id.btn_click);

        btn_click.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Snackbar snb = Snackbar.make(findViewById(R.id.myview),"Done !",Snackbar.LENGTH_LONG);
                        snb.show();
            }
        }
    }
}
