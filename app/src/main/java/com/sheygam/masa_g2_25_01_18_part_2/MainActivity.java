package com.sheygam.masa_g2_25_01_18_part_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button nextBtn;
    private int count = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nextBtn = findViewById(R.id.next_btn);
        nextBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_btn){
            if(count < 3){
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,new MyFragment())
                        .addToBackStack(null)
                        .commit();
                count++;
            }else if(count == 3){
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new PagerFragment())
                        .addToBackStack(null)
                        .commit();
                count++;
            }
        }
    }

    @Override
    public void onBackPressed() {
        count--;
        super.onBackPressed();
    }
}
