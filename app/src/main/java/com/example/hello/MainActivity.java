package com.example.hello;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView mTextCount;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main);
        mTextCount=findViewById(R.id.textView);
//        Log.d("MainAcivity","Saya di onCreate MainActivity");
//        Log.v("MainAcivity","Saya di onCreate MainActivity");
//        Log.w("MainAcivity","Saya di onCreate MainActivity");
//        Log.e("MainAcivity","Saya di onCreate MainActivity")
//        Log.i("MainAcivity","Saya di onCreate MainActivity");
        if (savedInstanceState!=null){
            count=savedInstanceState.getInt("count");
            mTextCount.setText(String.valueOf(count));
        }
    }

    public void incrementCount(View view) {
        count++;
        mTextCount.setText(String.valueOf(count));
    }

    public void showToast(View view) {
        Toast.makeText(this, "Halo "+mTextCount.getText(),Toast.LENGTH_SHORT).show();
    }

    public void reset(View view) {
        count=0;
        mTextCount.setText(String.valueOf(count));
        Toast.makeText(this, "Reset halo "+mTextCount.getText(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count",count);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getInt("count",count);

    }

    public void Decrement(View view) {
        count--;
        mTextCount.setText(String.valueOf(count));
    }
}
