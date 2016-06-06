package com.hritiksapra.pickuppeople;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Plus;

public class Profile extends AppCompatActivity {
    private static final int PROFILE_PIC_SIZE = 400;
    private ImageView imgProfilePic;
    private TextView txtName, txtEmail;
    private LinearLayout llProfileLayout;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        txtName = (TextView) findViewById(R.id.txtName);
        btn=(Button) findViewById(R.id.pickbtn);
        Intent intent=getIntent();
        Bundle extras=intent.getExtras();
        if(extras!=null)
        {
            String name= extras.getString("Name");
            String personPhotoUrl= extras.getString("imgurl");
            txtName.setText("Welcome "+ name);
        }
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Profile.this, PickupRequest.class);
                startActivity(intent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.sign_out:

                Intent intent=new Intent(Profile.this, MainActivity.class);
                startActivity(intent);break;

        }
        return super.onOptionsItemSelected(item);
    }
}
