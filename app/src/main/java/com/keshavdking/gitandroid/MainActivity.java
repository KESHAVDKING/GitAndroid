package com.keshavdking.gitandroid;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView animateTextView,txtView2;
    private ImageView image1,image2;
    private boolean toggleListener,imageToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animateTextView = findViewById(R.id.txthello);
        txtView2 = findViewById(R.id.txtView2);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);

        animateTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                animateTextView.animate().alpha(0.0f).setDuration(2000);
//                txtView2.animate().alpha(1.0f).setDuration(2000);
                if (!toggleListener){
                    animateTextView.animate().alpha(0).setDuration(2000);
                    txtView2.animate().alpha(1).setDuration(2000);
                    toggleListener=true;
                }
              else if (toggleListener){
                    animateTextView.animate().alpha(1).setDuration(2000);
                    txtView2.animate().alpha(0).setDuration(2000);
                    toggleListener=false;
                }
            }
        });

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!imageToggle){
                    image1.animate().alpha(0).setDuration(2000);
                    image2.animate().alpha(1).setDuration(2000);
                    imageToggle=true;
                }
                else if (imageToggle){
                    image1.animate().alpha(1).setDuration(2000);
                   image2.animate().alpha(0).setDuration(2000);
                   imageToggle=false;
                }
            }
        });

    }
}