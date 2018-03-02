package com.example.adrianch.volumen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    EditText edtxtRadio;
    EditText edtxtAngulo;
    Button btnCal;

    double Angulo;
    double Radio;
    double total;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        ((SeekBar)findViewById(R.id.seekBar)).setOnSeekBarChangeListener(this);
        edtxtRadio = (EditText)findViewById(R.id.edtxtRadio);
        edtxtAngulo = (EditText)findViewById(R.id.edtxtAngulo);
        btnCal = (Button)findViewById(R.id.btnCal);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == R.id.seekBar){
            edtxtAngulo.setText("" + progress);

        }

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        if (seekBar.getId() == R.id.seekBar) {
            ((TextView) findViewById(R.id.edtxtAngulo)).setText("" + seekBar.getProgress());
        }
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        if (seekBar.getId() == R.id.seekBar) {
            ((TextView) findViewById(R.id.edtxtAngulo)).setText("" + seekBar.getProgress());
        }
    }

    public  void onClickCal (View view){


          Angulo = Integer.parseInt(edtxtAngulo.getText().toString());
          Radio = Integer.parseInt(edtxtRadio.getText().toString());
          total = 0;
          if (Radio > 0)
              total = (0.66666) * (Angulo * Radio * 3);
          Toast.makeText(this, "" + total, Toast.LENGTH_SHORT).show();

      }


    }










