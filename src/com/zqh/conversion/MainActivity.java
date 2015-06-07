package com.zqh.conversion;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.zqh.conversion.fragment.Fragment_List;
import com.zqh.conversion.fragment.Fragment_content;
import com.zqh.conversion.fragment.Fragment_length;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends SlidingFragmentActivity implements
		OnClickListener {
	private Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt00,
			pont, btc, del, send;
	private EditText editText;
	private Fragment_length fragment_length;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		bt0 = (Button) findViewById(R.id.num_0);
		// 用Fragment替代两个View
		FragmentManager fragmentManager = getSupportFragmentManager();
		FragmentTransaction fragmentTransaction = fragmentManager
				.beginTransaction();
		fragmentTransaction.replace(R.id.menu, new Fragment_List());
		fragmentTransaction.replace(R.id.swtich, new Fragment_length());
		fragmentTransaction.commit();
		SlidingMenu slidingMenu = getSlidingMenu();// 必须注意是getSlidingMenu不然会被划出菜单全覆盖，没有效果
		setBehindContentView(R.layout.menu);
		slidingMenu.setMode(SlidingMenu.LEFT);// 划出的模式（从左边划出）
		slidingMenu.setTouchModeAbove(SlidingMenu.LEFT);// 触摸的模式（全屏滑动相应）
		slidingMenu.setShadowWidth(50);// 划出的阴影宽度
		slidingMenu.setShadowDrawable(R.drawable.shadow);// 引用文件来设置阴影效果
		slidingMenu.setBehindOffset(200);// 设置弹出时的偏移量
		slidingMenu.setFadeDegree(0.35f);// 设置渐入渐出的效果值
		fragment_length = new Fragment_length();
		initView();

	}

	public void initView() {
		bt0 = (Button) findViewById(R.id.num_0);
		bt1 = (Button) findViewById(R.id.num_1);
		bt2 = (Button) findViewById(R.id.num_2);
		bt3 = (Button) findViewById(R.id.num_3);
		bt4 = (Button) findViewById(R.id.num_4);
		bt5 = (Button) findViewById(R.id.num_5);
		bt6 = (Button) findViewById(R.id.num_6);
		bt7 = (Button) findViewById(R.id.num_7);
		bt8 = (Button) findViewById(R.id.num_8);
		bt9 = (Button) findViewById(R.id.num_9);
		bt00 = (Button) findViewById(R.id.num_00);
		btc = (Button) findViewById(R.id.btc);
		pont = (Button) findViewById(R.id.pont);
		del = (Button) findViewById(R.id.del);
		send = (Button) findViewById(R.id.send);
		bt0.setOnClickListener(this);
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
		bt4.setOnClickListener(this);
		bt5.setOnClickListener(this);
		bt6.setOnClickListener(this);
		bt7.setOnClickListener(this);
		bt8.setOnClickListener(this);
		bt9.setOnClickListener(this);
		bt00.setOnClickListener(this);
		btc.setOnClickListener(this);
		pont.setOnClickListener(this);
		del.setOnClickListener(this);
		send.setOnClickListener(this);
	
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.num_0:
			Intent intent0 = new Intent("zqh.number.0");
			editText = (EditText) findViewById(R.id.et_input);
			//intent0.putExtra("result", editText.getText().toString());//放入已经输入的值
			sendBroadcast(intent0);//发送广播
			break;
		case R.id.num_1:
			Intent intent1 = new Intent("zqh.number.1");
			editText = (EditText) findViewById(R.id.et_input);
			//intent1.putExtra("result", editText.getText().toString());
			sendBroadcast(intent1);
			break;
		case R.id.num_2:
			Intent intent2 = new Intent("zqh.number.2");
			editText = (EditText) findViewById(R.id.et_input);
			//intent2.putExtra("result", editText.getText().toString());
			sendBroadcast(intent2);
			break;
		case R.id.num_3:
			Intent intent3 = new Intent("zqh.number.3");
			editText = (EditText) findViewById(R.id.et_input);
			//intent3.putExtra("result", editText.getText().toString());
			sendBroadcast(intent3);
			break;
		case R.id.num_4:
			Intent intent4 = new Intent("zqh.number.4");
			editText = (EditText) findViewById(R.id.et_input);
			//intent4.putExtra("result", editText.getText().toString());
			sendBroadcast(intent4);
			break;
		case R.id.num_5:
			Intent intent5 = new Intent("zqh.number.5");
			editText = (EditText) findViewById(R.id.et_input);
			//intent5.putExtra("result", editText.getText().toString());
			sendBroadcast(intent5);
			break;
		case R.id.num_6:
			Intent intent6 = new Intent("zqh.number.6");
			editText = (EditText) findViewById(R.id.et_input);
			//intent6.putExtra("result", editText.getText().toString());
			sendBroadcast(intent6);
			break;
		case R.id.num_7:
			Intent intent7 = new Intent("zqh.number.7");
			editText = (EditText) findViewById(R.id.et_input);
			//intent7.putExtra("result", editText.getText().toString());
			sendBroadcast(intent7);
			break;
		case R.id.num_8:
			Intent intent8 = new Intent("zqh.number.8");
			editText = (EditText) findViewById(R.id.et_input);
			//intent8.putExtra("result", editText.getText().toString());
			sendBroadcast(intent8);
			break;
		case R.id.num_9:
			Intent intent9 = new Intent("zqh.number.9");
			editText = (EditText) findViewById(R.id.et_input);
			//intent9.putExtra("result", editText.getText().toString());
			sendBroadcast(intent9);
			break;
		case R.id.num_00:
			Intent intent00 = new Intent("zqh.number.00");
			editText = (EditText) findViewById(R.id.et_input);
			//intent00.putExtra("result", editText.getText().toString());
			sendBroadcast(intent00);
			break;
		case R.id.del:
			Intent del = new Intent("zqh.number.del");
			editText = (EditText) findViewById(R.id.et_input);
			//del.putExtra("result", editText.getText().toString());
			sendBroadcast(del);
			break;
		case R.id.send:
			Intent send = new Intent("zqh.number.send");
			editText = (EditText) findViewById(R.id.et_input);
			//send.putExtra("result", editText.getText().toString());
			sendBroadcast(send);
			break;
		case R.id.btc:
			Intent btc = new Intent("zqh.number.c");
			editText = (EditText) findViewById(R.id.et_input);
			//btc.putExtra("result", editText.getText().toString());
			sendBroadcast(btc);
			break;
		case R.id.pont:
			Intent pont = new Intent("zqh.number.pont");
			editText = (EditText) findViewById(R.id.et_input);
			//pont.putExtra("result", editText.getText().toString());
			sendBroadcast(pont);
			break;

		default:
			break;
		}
	}
	


}
