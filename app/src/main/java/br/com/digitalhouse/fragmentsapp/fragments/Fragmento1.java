package br.com.digitalhouse.fragmentsapp.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import br.com.digitalhouse.fragmentsapp.R;

public class Fragmento1 extends Fragment {

    public Fragmento1(){}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragmento_1,container, false);

        Button btnMessage = view.findViewById(R.id.btnMessage);

        btnMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Botão Clicado", Snackbar.LENGTH_SHORT).show();

            }
        });

        return view;
    }
}
