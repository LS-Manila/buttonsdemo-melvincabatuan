package com.cabatuan.imagebuttondemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Handle the first image text button
        Button image_btn1 = (Button) findViewById(R.id.imageTextButton1);
        image_btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "imageTextButton1 was clicked!",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Button handling with anonymous class for the rest
        Button image_btn2 = (Button) findViewById(R.id.imageTextButton2);
        image_btn2.setOnClickListener(btnListener);

        Button image_btn3 = (Button) findViewById(R.id.imageTextButton3);
        image_btn3.setOnClickListener(btnListener);

        Button image_btn4 = (Button) findViewById(R.id.imageTextButton4);
        image_btn4.setOnClickListener(btnListener);
    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        public void onClick(View view)
        {
            Toast.makeText(getBaseContext(),
                    ((Button) view).getText() + " was clicked!",
                    Toast.LENGTH_LONG).show();
        }
    };


    // Handle imageButton
    public void onClickImageButton(View view){
        Toast.makeText(getBaseContext(), "imageButton was clicked!",
                Toast.LENGTH_SHORT).show();
    }

    // Handle toggle image button
    public void onToggle(View view) {
        ToggleButton btn = (ToggleButton) view;
        Toast.makeText(this, "Toggle mode: " + btn.isChecked(),
                Toast.LENGTH_SHORT).show();
    }



}
