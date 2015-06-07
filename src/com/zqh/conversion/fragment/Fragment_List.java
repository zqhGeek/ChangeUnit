package com.zqh.conversion.fragment;

import java.util.ArrayList;
import java.util.List;

import com.zqh.conversion.MainActivity;
import com.zqh.conversion.R;
import com.zqh.conversion.R.id;
import com.zqh.conversion.R.layout;



import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment_List extends ListFragment {
private List<String>data=new ArrayList<String>();
private View view;
final String[] list={"长度","面积","体积","质量","温度","时间","速度","热量"};
//可以不用重写onCreateView
//	@Override
//	public View onCreateView(LayoutInflater inflater, ViewGroup container,
//			Bundle savedInstanceState) {
//		view=inflater.inflate(R.layout.list, null);
//		return view;
//	}

	@Override
	public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState); 
				ArrayAdapter<String>adapter=new ArrayAdapter<String>(getActivity(),  android.R.layout.simple_list_item_1,list);
		setListAdapter(adapter);
	}
	/**
	 * 监听按键响应跳转到哪个fragment
	 */
	@Override
	public void onListItemClick(ListView l, View v, int position, long id) {
				super.onListItemClick(l, v, position, id);
				switch (position) {
				case 0:
					FragmentManager fragmentManager=getActivity().getSupportFragmentManager();
					FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
					Fragment_length fragment_length=new Fragment_length();
					fragmentTransaction.replace(R.id.swtich, fragment_length).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 1:
					FragmentManager fm2=getActivity().getSupportFragmentManager();
					FragmentTransaction ft2=fm2.beginTransaction();
					Fragment_area fragment_area=new Fragment_area();
					ft2.replace(R.id.swtich, fragment_area).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 2:
					FragmentManager fm3=getActivity().getSupportFragmentManager();
					FragmentTransaction ft3=fm3.beginTransaction();
					Fragment_volume fragment_volume=new Fragment_volume();
					ft3.replace(R.id.swtich, fragment_volume).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 3:
					FragmentManager fm4=getActivity().getSupportFragmentManager();
					FragmentTransaction ft4=fm4.beginTransaction();
					Fragment_weight fragment_weight=new Fragment_weight();
					ft4.replace(R.id.swtich, fragment_weight).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 4:
					FragmentManager fm5=getActivity().getSupportFragmentManager();
					FragmentTransaction ft5=fm5.beginTransaction();
					Fragment_temperature fragment_temperature=new Fragment_temperature();
					ft5.replace(R.id.swtich, fragment_temperature).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 5:
					FragmentManager fm6=getActivity().getSupportFragmentManager();
					FragmentTransaction ft6=fm6.beginTransaction();
					Fragment_time fragment_time =new Fragment_time();
					ft6.replace(R.id.swtich, fragment_time).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 6:
					FragmentManager fm7=getActivity().getSupportFragmentManager();
					FragmentTransaction ft7=fm7.beginTransaction();
					Fragment_speed fragment_speed =new Fragment_speed();
					ft7.replace(R.id.swtich, fragment_speed).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				case 7:
					FragmentManager fm8=getActivity().getSupportFragmentManager();
					FragmentTransaction ft8=fm8.beginTransaction();
					Fragment_energy fragment_energy =new Fragment_energy();
					ft8.replace(R.id.swtich, fragment_energy).commit();
					 ((MainActivity)getActivity()).getSlidingMenu().toggle();//点击后关闭Slidemenu
					break;
				default:
					break;
				}
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
	}

}
