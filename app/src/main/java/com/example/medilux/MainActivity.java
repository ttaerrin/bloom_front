package com.example.medilux;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);


        TextView textView = findViewById(R.id.textView);

        // TextView 클릭 이벤트 처리
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // SignUpActivity로 이동
                startActivity(new Intent(MainActivity.this, SignupActivity.class));
            }
        });


        Context context = this;

        SpannableString spannableString = new SpannableString("아직 가입 전이신가요? 회원가입하기");

            // "아직 가입 전이신가요?~ " 부분의 글자 굵기 설정한 코드
        spannableString.setSpan(new StyleSpan(Typeface.NORMAL), 0, 12, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        spannableString.setSpan(new StyleSpan(Typeface.BOLD), 13, spannableString.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);





    }
}
