package com.example.nikhil.kriture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.mikhaellopez.circularimageview.CircularImageView;

public class MainActivity extends AppCompatActivity {
    CircularImageView pikka,ashe,selava;
    Button next;
    TextView selected;
    public static int player1=-1;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pikka=findViewById(R.id.pikkaicon);
        ashe=findViewById(R.id.ashicon);
        next=findViewById(R.id.nxt);
        selava=findViewById(R.id.selava);
        button=findViewById(R.id.button);
        selected=findViewById(R.id.selected);

        pikka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1=1;
                selava.setImageResource(R.drawable.pikachu);
                selava.setVisibility(View.VISIBLE);
                selected.setText("PLAYER 1 selected PIKACHU");
                selected.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                pikka.setVisibility(View.GONE);
                ashe.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);
            }
        });
        ashe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player1=2;
                selava.setImageResource(R.drawable.ash1);
                selava.setVisibility(View.VISIBLE);
                selected.setText("PLAYER 1 selected ASH");
                selected.setVisibility(View.VISIBLE);
                next.setVisibility(View.VISIBLE);
                pikka.setVisibility(View.GONE);
                ashe.setVisibility(View.GONE);
                button.setVisibility(View.VISIBLE);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selava.setVisibility(View.GONE);
                pikka.setVisibility(View.VISIBLE);
                ashe.setVisibility(View.VISIBLE);
                button.setVisibility(View.GONE);
                selected.setVisibility(View.GONE);
                next.setVisibility(View.GONE);
            }
        });

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent= new Intent(MainActivity.this,Main2Activity.class);
                    if(player1!=-1) {
                        intent.putExtra("player1", player1);
                        startActivity(intent);
                    }
                }
            });

    }
}
