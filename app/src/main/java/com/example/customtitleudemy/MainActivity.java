package com.example.customtitleudemy;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.item1) {
            //user clicked item 1...
            Toast.makeText(this, "Item 1 clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item2) {
            //user clicked item 2...
            Toast.makeText(this, "Item 2 clicked", Toast.LENGTH_SHORT).show();
        }
        if (item.getItemId() == R.id.item3) {
            //user clicked item 3...
            Toast.makeText(this, "Item 3 clicked", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}