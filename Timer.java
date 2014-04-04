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
	private int tick=25;	//tick 的值是可设置的
	public TimeCount time;
	
	public class TimeCount extends CountDownTimer {
		private int startTime;

		public TimeCount(long millisInFuture, long countDownInterval) {
		super(millisInFuture, countDownInterval);// 参数依次为总时长,和计时的时间间隔
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
		InnerInturrptTimes++;   //用户主动暂停番茄
	}
	
	public void outerInturrpt(){
		
		
		OuterInturrptTimes++;   //被动暂停番茄
	}
*/
	public void finish(){
		//getNextTask();  下一个Task
	}
	public void stop(){
		//getAbortTask(); 放弃Task
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







