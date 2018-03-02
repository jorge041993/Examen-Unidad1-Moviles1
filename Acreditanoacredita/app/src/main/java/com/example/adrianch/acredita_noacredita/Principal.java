package com.example.adrianch.acredita_noacredita;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    TextView edtxtPuntos, edttxtCalif;
    int puntos_pasar = 70 , calificacion=70;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ((SeekBar)findViewById(R.id.seekBarPuntos)).setOnSeekBarChangeListener(this);
        ((SeekBar)findViewById(R.id.seekBarCal)).setOnSeekBarChangeListener(this);

        edtxtPuntos = (TextView)findViewById(R.id.ediTxtPuntos);
        edttxtCalif = (TextView)findViewById(R.id.ediTxtCal);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == R.id.seekBarPuntos){
            edtxtPuntos.setText("" + progress);
            puntos_pasar = progress;
        } else if (seekBar.getId() == R.id.seekBarCal){
            edttxtCalif.setText("" + progress);
            calificacion = progress;
        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar.getId() == R.id.seekBarPuntos) {
            ((TextView) findViewById(R.id.ediTxtPuntos)).setText("" + seekBar.getProgress());
        }

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar.getId() == R.id.seekBarPuntos) {
            ((TextView) findViewById(R.id.ediTxtPuntos)).setText("" + seekBar.getProgress());
        }
        if (puntos_pasar > calificacion){
            Toast miToast = Toast.makeText(this, "No acreditado", Toast.LENGTH_SHORT);
            miToast.show();
        } else {
            Toast miToast = Toast.makeText(this, "Acreditado", Toast.LENGTH_SHORT);
            miToast.show();
        }

    }
}
