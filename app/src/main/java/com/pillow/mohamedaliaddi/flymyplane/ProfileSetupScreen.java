package com.pillow.mohamedaliaddi.flymyplane;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.TextView;


public class ProfileSetupScreen extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setup_screen);

        TextView tv1=(TextView)findViewById(R.id.email);
        Typeface face1=Typeface.createFromAsset(getAssets(),"fonts/Oswald-Regular.ttf");
        tv1.setTypeface(face1);
        TextView tv2=(TextView)findViewById(R.id.mobile);
        Typeface face2=Typeface.createFromAsset(getAssets(),"fonts/Oswald-Regular.ttf");
        tv2.setTypeface(face2);
        TextView tv3=(TextView)findViewById(R.id.password);
        Typeface face3=Typeface.createFromAsset(getAssets(),"fonts/Oswald-Regular.ttf");
        tv3.setTypeface(face3);


    }

    public void ToPaymentInfoScreen(View view){
        Intent intent = new Intent(this,PaymentInfoScreen.class);
        startActivity(intent);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile_setup_screen, menu);
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

}
