package com.pmesa.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSpotify;

    private Button btnScores;

    private Button btnLibrary;

    private Button btnBuildIt;

    private Button btnXYZReader;

    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        loadButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void loadButtons()
    {
        btnSpotify = (Button)findViewById(R.id.btn_spotify);
        btnSpotify.setOnClickListener(this);

        btnScores = (Button)findViewById(R.id.btn_scores);
        btnScores.setOnClickListener(this);

        btnLibrary = (Button)findViewById(R.id.btn_library);
        btnLibrary.setOnClickListener(this);

        btnBuildIt = (Button)findViewById(R.id.btn_build_it);
        btnBuildIt.setOnClickListener(this);

        btnXYZReader = (Button)findViewById(R.id.btn_xyz);
        btnXYZReader.setOnClickListener(this);

        btnCapstone = (Button)findViewById(R.id.btn_capstone);
        btnCapstone.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String message = "This button will launch my ";
        if( v.getId() == R.id.btn_spotify )
            Toast.makeText(this, message + "Spotify Streamer App",Toast.LENGTH_SHORT).show();
        else if( v.getId() == R.id.btn_scores)
            Toast.makeText(this, message + "Scores App",Toast.LENGTH_SHORT).show();
        else if( v.getId() == R.id.btn_library)
            Toast.makeText(this, message + "Library App",Toast.LENGTH_SHORT).show();
        else if( v.getId() == R.id.btn_build_it)
            Toast.makeText(this, message + "Build It Bigger App",Toast.LENGTH_SHORT).show();
        else if( v.getId() == R.id.btn_xyz)
            Toast.makeText(this, message + "XYZ Reader App",Toast.LENGTH_SHORT).show();
        else if( v.getId() == R.id.btn_capstone)
            Toast.makeText(this, message + "Capstone App",Toast.LENGTH_SHORT).show();
    }
}
