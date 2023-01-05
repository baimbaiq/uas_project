package com.baim.projectuas;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailHeroAdapter extends AppCompatActivity {
    TextView name, detail, legal, type, tahun;
    String n_name, n_detail, n_legal, n_type, n_tahun;
    Button btn;
    int n_photo, n_view;
    ImageView photo, view;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hero_adapter);
        btn=(Button)findViewById(R.id.btn_share);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(Intent.ACTION_SEND);
                myIntent.setType("text/plain");
                String shareBody = "Your body here";
                String shareSub = "Your Subject Here";
                myIntent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
                myIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
                startActivity(Intent.createChooser(myIntent, "Share Using"));
            }
        });


        Bundle bundle = getIntent().getExtras();
        n_name = bundle.getString("name");
        n_detail = bundle.getString("detail");
        n_photo = bundle.getInt("photo");
        n_view = bundle.getInt("view");
        n_legal = bundle.getString("legal");
        n_tahun = bundle.getString("tahun");
        n_type = bundle.getString("type");

        name = (TextView) findViewById(R.id.detail_name);
        detail = (TextView) findViewById(R.id.detail_detail);
        photo = (ImageView) findViewById(R.id.img_item_photo);
        view = (ImageView) findViewById(R.id.image_view);
        legal = (TextView) findViewById(R.id.legal_legal);
        type = (TextView) findViewById(R.id.type_type);
        tahun = (TextView) findViewById(R.id.tahun_tahun);

        name.setText(""+n_name);
        detail.setText(""+n_detail);
        legal.setText(""+n_legal);
        type.setText(""+n_type);
        tahun.setText(""+n_tahun);

        Glide.with(DetailHeroAdapter.this)
                .load(n_photo)
                .apply(new RequestOptions().override(370, 370))
                .into(photo);
    }
}