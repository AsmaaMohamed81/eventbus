package com.asmaa.m.eventbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class Main3Activity extends AppCompatActivity {

    String txt,txt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        EventBus.getDefault().register(this);
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getText(Data data)
    {
        txt = data.getTxt();
        txt1=data.getTxt1();

        Toast.makeText(this, ""+txt, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, ""+txt1, Toast.LENGTH_LONG).show();
    }


}
