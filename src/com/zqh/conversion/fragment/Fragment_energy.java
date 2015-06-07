package com.zqh.conversion.fragment;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.Text;

import com.zqh.conversion.R;
import com.zqh.conversion.server.ChangeUnit;

import android.R.integer;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class Fragment_energy extends Fragment implements OnItemSelectedListener {
	private View view;
	private String result;
	private EditText et;
	private Spinner mySpinner, mySpinner_top;
    private String unit,unit2;
	private numberBroadcasReceiver receiver;
    private TextView tv;
	@Override
	public void onStart() {
		super.onStart();
		receiver = new numberBroadcasReceiver();
		IntentFilter filter = new IntentFilter();//加入广播命令
		filter.addAction("zqh.number.0");
		filter.addAction("zqh.number.1");
		filter.addAction("zqh.number.2");
		filter.addAction("zqh.number.3");
		filter.addAction("zqh.number.4");
		filter.addAction("zqh.number.5");
		filter.addAction("zqh.number.6");
		filter.addAction("zqh.number.7");
		filter.addAction("zqh.number.8");
		filter.addAction("zqh.number.9");
		filter.addAction("zqh.number.00");
		filter.addAction("zqh.number.del");
		filter.addAction("zqh.number.c");
		filter.addAction("zqh.number.pont");
		filter.addAction("zqh.number.send");

		getActivity().registerReceiver(receiver, filter);//注册广播
	}

	@Override
	public void onStop() {
		getActivity().unregisterReceiver(receiver);//结束广播
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater,
			@Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.energy, container, false);
		et = (EditText) view.findViewById(R.id.et_input_energy);
		et.setInputType(InputType.TYPE_NULL);// 不弹出输入法
		mySpinner_top = (Spinner) view.findViewById(R.id.spinner_top_energy);
		mySpinner = (Spinner) view.findViewById(R.id.spinner_energy);
		tv=(TextView) view.findViewById(R.id.tv_result_energy);
		mySpinner.setOnItemSelectedListener(this);//Spinner的点击监控
		mySpinner_top.setOnItemSelectedListener(new myspinner());
		return view;
	}
/**
 * 实现广播
 * @author zqh
 *
 */
	public class numberBroadcasReceiver extends BroadcastReceiver {

		@Override
		public void onReceive(Context context, Intent intent) {

			//result = intent.getStringExtra("result");//当前输入的数字
			result=et.getText().toString();
			if (intent.getAction().equals("zqh.number.0")) {
				et.setText(result + "0");
				et.setSelection(result.length());// 光标拉到最后
			} else if (intent.getAction().equals("zqh.number.1")) {
				et.setText(result + "1");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.2")) {
				et.setText(result + "2");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.3")) {
				et.setText(result + "3");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.4")) {
				et.setText(result + "4");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.5")) {
				et.setText(result + "5");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.6")) {
				et.setText(result + "6");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.7")) {
				et.setText(result + "7");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.8")) {
				et.setText(result + "8");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.9")) {
				et.setText(result + "9");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.00")) {
				et.setText(result + "00");
				et.setSelection(result.length());
			} else if (intent.getAction().equals("zqh.number.send")) {
				if(result.equals("")){
					Toast.makeText(getActivity(), "输入不能为空", 0).show();
				}else{
				ChangeUnit changeUnit=new ChangeUnit();
				float output=changeUnit.ChangetoUnitenergy(unit, result, unit2);
			
				tv.setText(output+"");
				}
			} else if (intent.getAction().equals("zqh.number.del")) {
				if (result.equals("")) {
					Toast.makeText(getActivity(), "删完了", 0).show();
				} else {
					et.setText(result.subSequence(0, result.length() - 1));
				}
			} else if (intent.getAction().equals("zqh.number.c")) {
				et.setText("");
			} else if (intent.getAction().equals("zqh.number.pont")) {
				et.setText(result + ".");
				et.setSelection(result.length());
			}

		}

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
	
		
			unit = (String) parent.getItemAtPosition(position);
//		   			Toast.makeText(getActivity(), "你点击的是:" + unit, 0).show();
//		     
			
		
	

	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub
		
	}

	public class myspinner implements OnItemSelectedListener{

		@Override
		public void onItemSelected(AdapterView<?> parent, View view,
				int position, long id) {

			 unit2 = (String) parent.getItemAtPosition(position);
//		   			Toast.makeText(getActivity(), "点击:" + unit2, 0).show();
			
		}

		@Override
		public void onNothingSelected(AdapterView<?> parent) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
