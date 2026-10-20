package com.example.microsettings;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btnWifi).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_WIFI_SETTINGS)));
        findViewById(R.id.btnBluetooth).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_BLUETOOTH_SETTINGS)));
        findViewById(R.id.btnNetwork).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_WIRELESS_SETTINGS)));
        findViewById(R.id.btnSound).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_SOUND_SETTINGS)));
        findViewById(R.id.btnDisplay).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_DISPLAY_SETTINGS)));
        findViewById(R.id.btnBattery).setOnClickListener(v -> startActivity(new Intent(Settings.ACTION_BATTERY_SAVER_SETTINGS)));
    }
}
