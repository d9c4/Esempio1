package com.example.prova.esempio1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView Cambio;
    TextView textView;
    int counter = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Cambio = (ImageView) findViewById(R.id.imageView);
        textView= (TextView) findViewById(R.id.textView);

    }


    public void cambioImg(View view){
        counter++;
        if (counter == 4){
            counter = 0;
        }
        //Cambio.setImageResource(R.drawable.a);
        switch (counter) {
            case 1: Cambio.setImageResource(R.drawable.a);
                textView.setText("io sono Blemma");
                        break;
            case 2: Cambio.setImageResource(R.drawable.b);
                textView.setText("io vorrei essere Blemma");
                        break;
            case 3: Cambio.setImageResource(R.drawable.c);
                textView.setText("io sono Blemma");
                         break;
        }
    }
}
