package com.ywl5320.bottomnavtabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by ywl on 2017/3/24.
 */

public class FragmentPage extends Fragment{

    private TextView tvTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_layout, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        tvTitle = (TextView) getView().findViewById(R.id.tv_title);
    }

    public void setTitle(String title)
    {
        if(tvTitle != null)
        {
            tvTitle.setText(title);
        }
    }
}
