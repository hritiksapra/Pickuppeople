package com.hritiksapra.pickuppeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginForCompany extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_for_company);
    }
    public void login(View view)
    {
        Intent intent=new Intent(this, HomePageCompany.class);
        startActivity(intent);
    }
}
