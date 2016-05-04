package com.lxl.viewpagerindicatordemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Administrator on 2016/4/29.
 */
public class MyAdapter  extends FragmentPagerAdapter{

	public  static String[] TITLES={"业界","移动","云计算","咨询","问答","博客"};

	public MyAdapter(FragmentManager fm) {
		super(fm);
	}

	@Override
	public Fragment getItem(int position) {
		MyFragment myFragment=new MyFragment(position);

		return myFragment;
	}

	@Override
	public int getCount() {
		return TITLES.length;
	}


	@Override
	public CharSequence getPageTitle(int position)
	{
		return TITLES[position % TITLES.length];
	}
}
