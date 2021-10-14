package com.example.t3_practica_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.t3_practica_1.entities.Contactos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        List<Contactos> contactos = GetContactos();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private List<Contactos> GetContactos(){

        List<Contactos> listaContactos = new ArrayList<>();

        listaContactos.add(new Contactos("Elard", "Burga", "934478626"));
        listaContactos.add(new Contactos("Diego", "Guevara", "926587896"));
        listaContactos.add(new Contactos("Javier", "Vergara", "968854523"));
        listaContactos.add(new Contactos("Pedro", "Solano", "968853626"));
        listaContactos.add(new Contactos("Jorge", "Saenz", "978846325"));
        listaContactos.add(new Contactos("Elard", "Burga", "934478626"));
        listaContactos.add(new Contactos("Diego", "Guevara", "926587896"));
        listaContactos.add(new Contactos("Javier", "Vergara", "968854523"));
        listaContactos.add(new Contactos("Pedro", "Solano", "968853626"));
        listaContactos.add(new Contactos("Pedro", "Solano", "968853626"));
        listaContactos.add(new Contactos("Jorge", "Saenz", "978846325"));

        return listaContactos;

    }

}