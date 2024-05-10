package com.example.medilux;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

public class SignupActivity {


    ImageView arrowImageView;

    public SignupActivity(Context context) {

        arrowImageView = new ImageView(context);
        arrowImageView.setId(R.id.arrowImageView);


        arrowImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, MainActivity.class);
                context.startActivity(intent);
            }
        });
    }
}
