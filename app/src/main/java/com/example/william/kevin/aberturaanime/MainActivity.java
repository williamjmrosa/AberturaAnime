package com.example.william.kevin.aberturaanime;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp = new MediaPlayer();

    private Button btnBleach;
    private Button btnCavaleiros;
    private Button btnFairy;
    private Button btnNarutoShipudesn;
    private Button btnNarutoClassico;
    private Button btnDragonSuper;
    private Button btnDragonZ;
    private Button btnOmega;
    private Button btnHunter;
    private Button btnParar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBleach = (Button) findViewById(R.id.btn_bleach);
        btnCavaleiros = (Button) findViewById(R.id.btn_cavaleiros);
        btnFairy = (Button) findViewById(R.id.btn_fairy);
        btnOmega = (Button) findViewById(R.id.btn_omega);
        btnDragonSuper = (Button) findViewById(R.id.btn_dragon_super);
        btnNarutoShipudesn = (Button) findViewById(R.id.btn_naruto_shippuden);
        btnNarutoClassico = (Button) findViewById(R.id.btn_naruto);
        btnHunter = (Button) findViewById(R.id.btn_hunter);
        btnDragonZ = (Button) findViewById(R.id.btn_dragon);

        btnBleach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.stop();
                Toast.makeText(getBaseContext(),getResources().getText(R.string.bleach),Toast.LENGTH_LONG).show();
                play(view, R.raw.bleach);


            }
        });

        btnBleach.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.bleach);
                msg.setMessage(R.string.descriBleach);
                msg.setIcon(R.drawable.bleach);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnCavaleiros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(),getResources().getText(R.string.cavaleiros),Toast.LENGTH_LONG).show();
                play(view, R.raw.cavaleiros_do_zodiaco);

            }
        });

        btnCavaleiros.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.cavaleiros);
                msg.setMessage(R.string.descriCavaleiros);
                msg.setIcon(R.drawable.cavaleiros_do_zodiaco);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnFairy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(),getResources().getText(R.string.fairy),Toast.LENGTH_LONG).show();
                play(view,R.raw.fairy_tail);
            }
        });

        btnFairy.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.fairy);
                msg.setMessage(R.string.descriFairy);
                msg.setIcon(R.drawable.fairy_tail);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnOmega.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.omega), Toast.LENGTH_LONG).show();
                play(view, R.raw.cavaleiros_do_zodiaco_omega);
            }
        });

        btnOmega.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.omega);
                msg.setMessage(R.string.descriOmega);
                msg.setIcon(R.drawable.cavaleiros_do_zodiaco_omega);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnNarutoShipudesn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.narutoShippuden), Toast.LENGTH_LONG).show();
                play(view, R.raw.naruto_shippuden);

            }
        });

        btnNarutoShipudesn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.narutoShippuden);
                msg.setMessage(R.string.descriNarutoShippuden);
                msg.setIcon(R.drawable.naruto_shippuden);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnDragonSuper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.dragonSuper), Toast.LENGTH_LONG).show();
                play(view, R.raw.dragon_ball_super);
            }
        });

        btnDragonSuper.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.dragonSuper);
                msg.setMessage(R.string.descriDragonSuper);
                msg.setIcon(R.drawable.dragon_ball_super);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnDragonZ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.dragon), Toast.LENGTH_LONG).show();
                play(view, R.raw.dragon_ball_z);
            }
        });

        btnDragonZ.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.dragon);
                msg.setMessage(R.string.descriDragon);
                msg.setIcon(R.drawable.dragon_ball_z);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnHunter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.hunter), Toast.LENGTH_LONG).show();
                play(view, R.raw.hunter_x_hunter);
            }
        });

        btnHunter.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.hunter);
                msg.setMessage(R.string.descriHunter);
                msg.setIcon(R.drawable.hunter_x_hunter);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });

        btnNarutoClassico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mp.stop();
                Toast.makeText(getBaseContext(), getResources().getText(R.string.naruto), Toast.LENGTH_LONG).show();
                play(view, R.raw.naruto_shippuden);
            }
        });

        btnNarutoClassico.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                AlertDialog.Builder msg = new AlertDialog.Builder(MainActivity.this);
                msg.setTitle(R.string.naruto);
                msg.setMessage(R.string.descriNaruto);
                msg.setIcon(R.drawable.naruto_classico);
                msg.setNeutralButton("OK", null);
                msg.show();
                return false;
            }
        });





    }//fecha OnCreate

public void play(View v, int som){

    try {
        mp.stop();
        mp = MediaPlayer.create(getBaseContext(), som);
        mp.start();


    }catch (Exception e){

    }

}


}//fecha MainActivity
