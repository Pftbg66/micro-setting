package com.example.microsettings;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open(R.id.btnWifi, Settings.ACTION_WIFI_SETTINGS);
        open(R.id.btnBluetooth, Settings.ACTION_BLUETOOTH_SETTINGS);
        open(R.id.btnNetwork, Settings.ACTION_WIRELESS_SETTINGS);
        open(R.id.btnSound, Settings.ACTION_SOUND_SETTINGS);
        open(R.id.btnDisplay, Settings.ACTION_DISPLAY_SETTINGS);
        open(R.id.btnBattery, Settings.ACTION_BATTERY_SAVER_SETTINGS);
    }

    private void open(int viewId, String action) {
        findViewById(viewId).setOnClickListener(v -> {
            try {
                startActivity(new Intent(action));
            } catch (ActivityNotFoundException | SecurityException e) {
                Toast.makeText(this, R.string.not_available, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
