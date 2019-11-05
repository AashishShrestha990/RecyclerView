package com.example.recyclerviewforclass.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewforclass.R;

public class DetailActivity extends AppCompatActivity {

    private ImageView CirImage;
    private TextView Name;
    private TextView Phoneno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        CirImage = findViewById(R.id.cirimage);
        Name = findViewById(R.id.name);
        Phoneno = findViewById(R.id.num);

        Bundle bundle = getIntent().getExtras( );

        if (bundle != null){
            CirImage.setImageResource(bundle.getInt("image"));
            Name.setText(bundle.getString("name"));
            Phoneno.setText(bundle.getString("phone"));
        }
    }
}
