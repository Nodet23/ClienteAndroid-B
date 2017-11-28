package com.example.nodet.apibruno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textViewNombre;
    EditText editTextNombre;
    Button buttonAdd;
    Button buttonGet;
    Button buttonDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNombre = findViewById(R.id.textViewNombre);
        editTextNombre = findViewById(R.id.editTextNombre);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonGet = findViewById(R.id.buttonGet);
        buttonDelete = findViewById(R.id.buttonDelete);

    }

    public void addJugador(View view) {
    }

    public void getJugador(View view) {
    }

    public void deleteJugador(View view) {
    }
}
