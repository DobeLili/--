package com.example.timerdemo;

import android.R.integer;
import android.os.CountDownTimer;
import android.os.SystemClock;

public class Timer {
	
	private int startTime;
	//private int InnerInturrptTimes;
	//private int OuterInturrptTimes;
	private boolean checkFinish=false;
	private int timeSpan;
	private int tick=25;	//tick ��ֵ�ǿ����õ�
	public TimeCount time;
	
	public class TimeCount extends CountDownTimer {
		private int startTime;

		public TimeCount(long millisInFuture, long countDownInterval) {
		super(millisInFuture, countDownInterval);// ��������Ϊ��ʱ��,�ͼ�ʱ��ʱ����
		}

		@Override
		public void onFinish() {
			// TODO Auto-generated method stub
			checkFinish=true;
		}

		@Override
		public void onTick(long millisUntilFinished) {
			// TODO Auto-generated method stub
			
		}	
	
	public void Timer(){	
		this.startTime=(int) SystemClock.elapsedRealtime();
		//InnerInturrptTimes=0;
		//OuterInturrptTimes=0;
		
	}
			
	public void Start(){
		int during;
		timeSpan = tick * 60 * 1000;
		time = new TimeCount(timeSpan, 1000);
		time.start();
		
	}

	/*public void innerInturrpt(){
		InnerInturrptTimes++;   //�û�������ͣ����
	}
	
	public void outerInturrpt(){
		
		
		OuterInturrptTimes++;   //������ͣ����
	}
*/
	public void finish(){
		//getNextTask();  ��һ��Task
	}
	public void stop(){
		//getAbortTask(); ����Task
	}

	public void nowTaskclear(){
		

	}
	
	/*public void set(int startTime,int InnerInturrptTimes,int OuterInturrptTimes){
			this.startTime=(int) SystemClock.elapsedRealtime();
			//this.InnerInturrptTimes=InnerInturrptTimes;
			//this.OuterInturrptTimes=OuterInturrptTimes;				
	}
	public String get(){
			return "'"+startTime+InnerInturrptTimes+","+OuterInturrptTimes+",";
		}*/		
}
}







