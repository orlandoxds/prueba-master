package com.example.yonathan.proyecto;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Fade;
import android.transition.Transition;
import android.view.Menu;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;

public class Inicio extends AppCompatActivity {

    private Button mNext;

    public static final long DURATION_TRANSITION = 1000;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        mNext=findViewById(R.id.button);
        mNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Inicio.this, MenuActivity.class));
               overridePendingTransition(R.anim.fade_in,R.anim.fade);
                finish();
            }
        });
    }
}
