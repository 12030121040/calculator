package com.example.my;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	private Button bt5;
	private Button bt6;
	private Button bt7;
	private Button bt8;
	private Button bt9;
	private Button bt0;
	private Button btm;
	private Button btmn;
	private Button bte;
	private Button btd;
	private Button btp;
	private Button btdt;
	private Button clr;
	private EditText cal;
	private String a;
	private int b;
	private double n1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		bt1=(Button) findViewById(R.id.bt1);
		bt2=(Button) findViewById(R.id.bt2);
		bt3=(Button) findViewById(R.id.bt3);
		bt4=(Button) findViewById(R.id.bt4);
		bt5=(Button) findViewById(R.id.bt5);
		bt6=(Button) findViewById(R.id.bt6);
		bt7=(Button) findViewById(R.id.bt7);
		bt8=(Button) findViewById(R.id.bt8);
		bt9=(Button) findViewById(R.id.bt9);
		bt0=(Button) findViewById(R.id.bt0);
		btm=(Button) findViewById(R.id.btm);
		btmn=(Button) findViewById(R.id.btmn);
		bte=(Button) findViewById(R.id.bte);
		btd=(Button) findViewById(R.id.btd);
		btp=(Button) findViewById(R.id.btp);
		btdt=(Button) findViewById(R.id.btdt);
		clr=(Button) findViewById(R.id.clr);
		cal = (EditText) findViewById(R.id.cal);
	OnClickListener listener1=new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			cal.setText("");
		}
	};
	clr.setOnClickListener(listener1);
		
		
	 OnClickListener Listener= new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String digit= ((Button)v).getText().toString();
			String text=cal.getText().toString();
			cal.setText(text+digit);
			a=text+digit;
		}
	};
		 bt1.setOnClickListener(Listener);
		 bt2.setOnClickListener(Listener);
		 bt3.setOnClickListener(Listener);
		 bt4.setOnClickListener(Listener);
		 bt5.setOnClickListener(Listener);
		 bt6.setOnClickListener(Listener);
		 bt7.setOnClickListener(Listener);
		 bt8.setOnClickListener(Listener);
		 bt9.setOnClickListener(Listener);
		 bt0.setOnClickListener(Listener);
		 btdt.setOnClickListener(Listener);
		 
		 OnClickListener Listener3=new OnClickListener() {
			
			@Override
			public void onClick(View v1) {
			switch(v1.getId())
			{
			case R.id.btm:				
				cal.setText("");
				n1=Double.parseDouble(a);
				b=1;
				break;
			case R.id.btd:
				cal.setText("");
				n1=Double.parseDouble(a);
				b=2;
				break;
			case R.id.btp:
				cal.setText("");
				n1=Double.parseDouble(a);
				b=3;
				break;
			case R.id.btmn:
				cal.setText("");
				n1=Double.parseDouble(a);
				b=4;
				break;
				
			}
				
			}
		};
		btm.setOnClickListener(Listener3);
		btd.setOnClickListener(Listener3);
		btp.setOnClickListener(Listener3);
		btmn.setOnClickListener(Listener3);
		
		OnClickListener Listener4=new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Double n2=Double.parseDouble(a);
				if(b==1)
				{
					cal.setText(Double.toString(n1*n2));
				}
				else
					if(b==2)
					{
						cal.setText(Double.toString(n1/n2));
					}
					else
						if(b==3)
						{
							cal.setText(Double.toString(n1+n2));
						}	
						else
							if(b==4)
							{
								cal.setText(Double.toString(n1-n2));
							}	
			}
			
		};
		bte.setOnClickListener(Listener4);
	 }
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
