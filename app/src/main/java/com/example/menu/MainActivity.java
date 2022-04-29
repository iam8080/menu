package com.example.menu;

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

    public boolean onCreateOptionsMenu(Menu m)
    {
       // MenuInflater inflater = getMenuInflater();
        getMenuInflater().inflate(R.menu.option_menu,m);
        return  true ;
    }
    public  boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        switch (id)
        {
            case R.id.o1:

                Toast.makeText(this,"iTem 1 SELECTED", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.o2:

                Toast.makeText(this,"iTem 2 SELECTED", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.o3:

                Toast.makeText(this,"ÏTem 3 SELECTED", Toast.LENGTH_SHORT).show();
                return  true;

            case R.id.o4:

                Toast.makeText(this,"ÏTem 4 SELECTED", Toast.LENGTH_SHORT).show();
                return  true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}