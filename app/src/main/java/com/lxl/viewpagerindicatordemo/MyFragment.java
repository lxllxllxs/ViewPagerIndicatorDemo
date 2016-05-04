package com.lxl.viewpagerindicatordemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/4/29.
 */
public class MyFragment extends Fragment {
	int titleType=0;

	public  MyFragment(){}
	public  MyFragment(int titleType){

		this.titleType=titleType;
	}


	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view=inflater.inflate(R.layout.tab_item,null);
		TextView tv=(TextView)view.findViewById(R.id.tab_item_tv);
		tv.setText(MyAdapter.TITLES[titleType]);
		return view;
	}
}
