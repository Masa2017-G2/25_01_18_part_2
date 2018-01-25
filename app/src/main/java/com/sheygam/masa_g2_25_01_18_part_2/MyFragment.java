package com.sheygam.masa_g2_25_01_18_part_2;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Random;

/**
 * Created by gregorysheygam on 25/01/2018.
 */

public class MyFragment extends Fragment {
    private int color;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Random rnd = new Random();
        color = Color.rgb(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragmment,container,false);
        view.setBackgroundColor(color);
        return view;
    }
}
