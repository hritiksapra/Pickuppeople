package com.hritiksapra.pickuppeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomePageCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page_company);
    }
    public void getDirectionsBtn(View view)
    {
        Intent intent=new Intent(this,DisplayLocationPickup.class );
        startActivity(intent);
    }
}
