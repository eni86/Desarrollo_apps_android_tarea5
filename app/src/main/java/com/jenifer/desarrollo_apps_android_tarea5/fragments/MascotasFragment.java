package com.jenifer.desarrollo_de_apps_android_tarea5.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jenifer.desarrollo_de_apps_android_tarea5.classes.Mascota;
import com.jenifer.desarrollo_de_apps_android_tarea5.R;
import com.jenifer.desarrollo_de_apps_android_tarea5.adapters.MascotaAdaptador;
import com.jenifer.desarrollo_de_apps_android_tarea5.presentador.IMascotasFragmentPresenter;
import com.jenifer.desarrollo_de_apps_android_tarea5.presentador.IRankingFragmentPresenter;
import com.jenifer.desarrollo_de_apps_android_tarea5.presentador.MascotasFragmentPresenter;
import com.jenifer.desarrollo_de_apps_android_tarea5.presentador.RankingFragmentPresenter;

import java.util.ArrayList;

public class MascotasFragment extends Fragment implements IMascotasFragmentView {

    private ArrayList<Mascota> mascotas;
    private RecyclerView rvMascotas;
    private IMascotasFragmentPresenter iMascotasFragmentPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_mascotas, container, false);
        rvMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        iMascotasFragmentPresenter = new MascotasFragmentPresenter( this, getContext() );
        iMascotasFragmentPresenter.obtenerMascotasBD();
        generateLinearLayot();

        return v;
    }

    public void initMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add( new Mascota(R.drawable.app1, "Toby", 5) );
        mascotas.add( new Mascota(R.drawable.app2, "Hugo", 1) );
        mascotas.add( new Mascota(R.drawable.app3, "Paco", 2) );
        mascotas.add( new Mascota(R.drawable.app4, "Luis", 11) );
        mascotas.add( new Mascota(R.drawable.app5, "Alvin", 10) );
        mascotas.add( new Mascota(R.drawable.app6, "Simon", 4) );
        mascotas.add( new Mascota(R.drawable.app7, "Theodore", 20) );
        mascotas.add( new Mascota(R.drawable.app8, "Ailyn", 2) );
    }

    @Override
    public void generateLinearLayot() {
        LinearLayoutManager llm = new LinearLayoutManager( getContext() );
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rvMascotas.setLayoutManager(llm);
    }

    @Override
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador mascotaAdaptador = new MascotaAdaptador( mascotas );
        return mascotaAdaptador;
    }

    @Override
    public void initAdaptadorRV(MascotaAdaptador adaptador) {
        rvMascotas.setAdapter( adaptador );
    }
}