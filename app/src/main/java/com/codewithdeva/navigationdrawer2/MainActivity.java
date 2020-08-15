package com.codewithdeva.navigationdrawer2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    NavigationView navigation;
    DrawerLayout drawer;
    Toolbar toolbar;
    ActionBarDrawerToggle Toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigation=findViewById(R.id.navigation);
        drawer=findViewById(R.id.drawer);

        Toggle=new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.addDrawerListener(Toggle);
        Toggle.syncState();

        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

               switch (item.getItemId())
               {
                   case R.id.home:
                       Toast.makeText(MainActivity.this, "open home", Toast.LENGTH_SHORT).show();
                       drawer.closeDrawer(GravityCompat.START);
                       break;

                   case R.id.call:
                       Toast.makeText(MainActivity.this, "open call", Toast.LENGTH_SHORT).show();
                       drawer.closeDrawer(GravityCompat.START);
                       break;

                   case R.id.settings:
                       Toast.makeText(MainActivity.this, "open settings", Toast.LENGTH_SHORT).show();
                       drawer.closeDrawer(GravityCompat.START);
                       break;
               }
                return false;
            }
        });
    }
}