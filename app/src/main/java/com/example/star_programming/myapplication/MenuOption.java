package com.example.star_programming.myapplication;


import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MenuOption extends AppCompatActivity {
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_option);

        fab = (FloatingActionButton) findViewById(R.id.floatingBtn);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Aksinya nanti disini",Snackbar.LENGTH_LONG).setAction( "", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_utama,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==R.id.baru)
        {
            Intent inten = new Intent( MenuOption.this,FormBaru.class);
            startActivity(inten);
        }
        else if (item.getItemId()==R.id.edit)
        {
            Intent inten = new Intent( MenuOption.this,EditData.class);
            startActivity(inten);
        }
        return true;

    }
}
