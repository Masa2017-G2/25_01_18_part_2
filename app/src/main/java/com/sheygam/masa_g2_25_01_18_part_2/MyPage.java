package com.sheygam.masa_g2_25_01_18_part_2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by gregorysheygam on 25/01/2018.
 */

public class MyPage extends Fragment {
    private String title;
    public static MyPage newInstance(String title){
        MyPage page = new MyPage();
        page.title = title;
        return page;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_page,container,false);
        TextView titleTxt = view.findViewById(R.id.title_txt);
        titleTxt.setText(title);
        return view;
    }
}
