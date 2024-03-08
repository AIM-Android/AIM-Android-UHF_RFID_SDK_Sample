package com.advantech.uhf.rfid.sample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private static final String ACTION_TRANSFER_DATA = "com.advantech.uhf.rfid.TRANSFER_DATA";
    private static final String ACTION_SCAN = "com.advantech.uhf.rfid.NFC_SCAN";


    private TextView textView;
    RFIDDataBroadcastReceiver rfidDataBroadcastReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textview);

        IntentFilter filter = new IntentFilter();
        filter.addAction(ACTION_TRANSFER_DATA);
        rfidDataBroadcastReceiver = new RFIDDataBroadcastReceiver();
        registerReceiver(rfidDataBroadcastReceiver, filter);

        Button mBtnTrigger = findViewById(R.id.btn_trigger);
        mBtnTrigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ACTION_SCAN);
                intent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(intent);
            }
        });

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                textView.setText("");
                return true;
            }
        });

    }

    private class RFIDDataBroadcastReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            String barcodeData = intent.getStringExtra("scan_data");
            if (barcodeData != null) {
                textView.append(barcodeData + "\n");
            }
        }
    }

    @Override
    protected void onDestroy() {
        unregisterReceiver(rfidDataBroadcastReceiver);
        super.onDestroy();
    }
}