package com.example.a1143878729.ejercicios4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnIrMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            //coommmmmm
        btnIrMenu = findViewById(R.id.btn_ir_menu);
        btnIrMenu.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent intento = new Intent(getApplicationContext(), Menu.class);
                nombreUsuario = elUserName.getText().toString();
                //// otro
                //lololol bxvsdfgdfg
            }
        }

    }
}
