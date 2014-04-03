package com.example.chronometer1;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.os.SystemClock;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends Activity {
	
	private Chronometer myChronometer=null;
	private Button butStart=null;
	private Button butStop=null;
	private Button butBase=null;
	//private Button butFormat=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);
        this.myChronometer=(Chronometer)super.findViewById(R.id.myChronometer);
        this.butStart = (Button)super.findViewById(R.id.butStart);
        this.butStop = (Button)super.findViewById(R.id.butStop);
        this.butBase = (Button)super.findViewById(R.id.butBase);
        //this.butFormat = (Button)super.findViewById(R.id.butFormat);
        this.butStart.setOnClickListener(new OnClickListenerImpIStart()	);
        this.butStop.setOnClickListener(new OnClickListenerImpIStop());
        this.butBase.setOnClickListener(new OnClickListenerImpIBase());
        //this.butFormat.setOnClickListener(new OnClickListenerImpIFormat());		
    }
    
    
    private class OnClickListenerImpIStart implements OnClickListener{
    	@Override    	
    	 public void onClick(View view){
    		MainActivity.this.myChronometer.start();
    	}
    }
    private class OnClickListenerImpIStop implements OnClickListener{
    	@Override    	
    	 public void onClick(View view){
    		MainActivity.this.myChronometer.stop();
    	}
    }
    private class OnClickListenerImpIBase implements OnClickListener{
    	@Override    	
    	 public void onClick(View view){
    		MainActivity.this.myChronometer.setBase(SystemClock.elapsedRealtime());
    	}
    }
    /*private class OnClickListenerImpIFormat implements OnClickListener{
    	@Override    	
    	 public void onClick(View view){
    		MainActivity.this.myChronometer.setFormat("新的显示格式：%s。");
    	}
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
