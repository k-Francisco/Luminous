package com.example.qwerty.luminous;


import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mbulb;
    private ToggleButton mtog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        mbulb = (ImageView)findViewById(R.id.imageView);
        mtog = (ToggleButton)findViewById(R.id.togBtn);
        mtog.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId())
        {
            case R.id.togBtn:
                if(mtog.isChecked())
                    mbulb.setImageResource(R.drawable.bulboff);
                else
                    mbulb.setImageResource(R.drawable.bulbon);
                break;
        }
        
    }
}
