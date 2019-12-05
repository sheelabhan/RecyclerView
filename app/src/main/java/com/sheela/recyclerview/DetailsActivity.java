package com.sheela.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    ImageView imgProfile;
    TextView tvName, tvPhoneNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        imgProfile=findViewById(R.id.imgProfile);
        tvName=findViewById(R.id.tvName);
        tvPhoneNo=findViewById(R.id.tvPhoneNo);
        Bundle bundle= getIntent().getExtras();


                if(bundle!=null){
                    imgProfile.setImageResource(bundle.getInt("image"));
                    tvName.setText(bundle.getString("name"));
                    tvPhoneNo.setText(bundle.getString("phone"));
                }




    }
}
