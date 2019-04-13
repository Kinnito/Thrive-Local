package com.example.thrivelocal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Scanner scan = null;
        try {
            scan = new Scanner(new InputStreamReader(getAssets().open("ListofGoodsExcel.csv")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        BusinessLab lab = BusinessLab.get(this);

        scan.useDelimiter("[,\n]");

        while (scan.hasNextLine()) {
            String country = scan.next();
            String good = scan.next();
            String child = scan.next();
            String forced = scan.next();

            lab.addToDatabase(new Business(country, good, child, forced));
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_nav, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.about:
                startActivity(new Intent(this, AboutActivity.class));
                return true;
            case R.id.help:
                startActivity(new Intent(this, MainActivity.class));
                return true;
            case R.id.searchresults:
                startActivity(new Intent(this, SearchResults.class));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
