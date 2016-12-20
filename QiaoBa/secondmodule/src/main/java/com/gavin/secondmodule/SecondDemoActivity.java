package com.gavin.secondmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.gavin.secondmodule.caller.TestService;
import com.protocol.ProtocolInterpreter;

/**
 * Created by wangfei on 2016/12/20.
 */

public class SecondDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second_demo);

        findViewById(R.id.show_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    ProtocolInterpreter.getInstance().create(TestService.class).doService(SecondDemoActivity.this, "second activity show toast");
                }catch (Exception e){
                    e.printStackTrace();
                    Log.e("mytest", e.toString());
                }
            }
        });

    }


}