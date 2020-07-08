package com.example.android;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.tencent.mmkv.MMKV;

public class MMKVActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmkv);


        MMKV kv = MMKV.defaultMMKV();

        kv.encode("bool", true);
        boolean bValue = kv.decodeBool("bool");
        Log.d("mmkv","bValue: " + bValue);


        kv.encode("int", Integer.MIN_VALUE);
        int iValue = kv.decodeInt("int");
        Log.d("mmkv","iValue: " + iValue);

        kv.encode("string", "Hello from mmkv");
        String str = kv.decodeString("string");
        Log.d("mmkv","str: " + str);
    }
}
