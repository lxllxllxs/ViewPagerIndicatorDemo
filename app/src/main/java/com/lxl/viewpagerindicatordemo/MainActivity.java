package com.lxl.viewpagerindicatordemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;

import com.viewpagerindicator.TabPageIndicator;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		TabPageIndicator mIndicator=(TabPageIndicator)findViewById(R.id.id_indicator);
		ViewPager viewPager=(ViewPager)findViewById(R.id.id_viewPager);

		MyAdapter mAdapter=new MyAdapter(getSupportFragmentManager());

		viewPager.setAdapter(mAdapter);

		mIndicator.setViewPager(viewPager);



	}
}
