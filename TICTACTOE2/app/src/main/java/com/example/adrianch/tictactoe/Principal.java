package com.example.adrianch.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Principal extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    int turno;
    public void JuegoGanado(){
        checar(b1,b2,b3);
        checar(b4,b5,b6);
        checar(b7,b8,b9);
        checar(b1,b4,b7);
        checar(b2,b5,b8);
        checar(b3,b6,b9);
        checar(b1,b5,b9);
        checar(b3,b5,b7);

    }

    public void checar(Button b1,Button b2,Button b3){
        if (b1.getText()==b2.getText().toString() && b2.getText().toString()==b3.getText().toString() && b3.getText().toString()=="X"){
            Toast.makeText(Principal.this,"Jugador 1 es el ganador ",Toast.LENGTH_LONG).show();

        }
        if (b1.getText()==b2.getText().toString() && b2.getText().toString()==b3.getText().toString() && b3.getText().toString()=="O"){
            Toast.makeText(Principal.this,"Jugador 2 es el ganador",Toast.LENGTH_LONG).show();
        }
    }
    public void reset(View view){
        turno =1;
        b1.setText("-");
        b2.setText("-");
        b3.setText("-");
        b4.setText("-");
        b5.setText("-");
        b6.setText("-");
        b7.setText("-");
        b8.setText("-");
        b9.setText("-");

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        b1=(Button) findViewById(R.id.b1);
        b2=(Button) findViewById(R.id.b2);
        b3=(Button) findViewById(R.id.b3);
        b4=(Button) findViewById(R.id.b4);
        b5=(Button) findViewById(R.id.b5);
        b6=(Button) findViewById(R.id.b6);
        b7=(Button) findViewById(R.id.b7);
        b8=(Button) findViewById(R.id.b8);
        b9=(Button) findViewById(R.id.b9);
        turno=1;
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("-")){
                    if (turno==1) {
                        b1.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b1.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("-")){
                    if (turno==1) {
                        b2.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b2.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();

            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("-")){
                    if (turno==1) {
                        b3.setText("X");
                        turno= 2;
                    }

                    else if (turno==2) {
                        b3.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }

        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("-")){
                    if (turno==1) {
                        b4.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b4.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("-")){
                    if (turno==1) {
                        b5.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b5.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("-")) {
                    if (turno == 1) {
                        b6.setText("X");
                        turno = 2;
                    } else if (turno == 2) {
                        b6.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("-")){
                    if (turno==1) {
                        b7.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b7.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("-")){
                    if (turno==1) {
                        b8.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b8.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("-")){
                    if (turno==1) {
                        b9.setText("X");
                        turno = 2;
                    }

                    else if (turno==2) {
                        b9.setText("O");
                        turno = 1;
                    }
                }
                JuegoGanado();
            }
        });
    }


    }





