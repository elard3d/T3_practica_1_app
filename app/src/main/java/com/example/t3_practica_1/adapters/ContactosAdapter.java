package com.example.t3_practica_1.adapters;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.t3_practica_1.entities.Contactos;

import java.util.List;
import com.example.t3_practica_1.R;


public class ContactosAdapter extends RecyclerView.Adapter<ContactosAdapter.ContactosViewHolder> {

    List<Contactos> contactos;

    public ContactosAdapter(List<Contactos> contactos){this.contactos = contactos;}

    @Override
    public ContactosViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(androidx.viewpager2.R.layout.item_contactos,parent,false);
        return new ContactosViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactosAdapter.ContactosViewHolder holder, int position) {
        View view = holder.itemView;

        Contactos contacto = contactos.get(position);

        TextView txtNombre = view.findViewById(R.id.txtNombre);
        TextView txtApellido = view.findViewById(R.id.txtNombre);
        TextView txtNumero = view.findViewById(R.id.txtNumero);
        Button btnLlamar = view.findViewById(R.id.btnLlamar);
        Button btnMensaje = view.findViewById(R.id.btnMensaje);

        txtNombre.setText(contacto.nombre + " " + contacto.apellido );
        txtNumero.setText(contacto.numero);

        btnLlamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btnMensaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class ContactosViewHolder extends RecyclerView.ViewHolder{

        public ContactosViewHolder(View itemView) {
            super(itemView);
        }
    }

}
