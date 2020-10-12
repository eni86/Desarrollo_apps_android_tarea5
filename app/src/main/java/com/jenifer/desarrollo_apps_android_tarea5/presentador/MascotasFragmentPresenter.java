package com.jenifer.desarrollo_de_apps_android_tarea5.presentador;

import android.content.Context;

import com.jenifer.desarrollo_de_apps_android_tarea5.classes.Mascota;
import com.jenifer.desarrollo_de_apps_android_tarea5.db.ConstructorMascotas;
import com.jenifer.desarrollo_de_apps_android_tarea5.db.ConstructorRanking;
import com.jenifer.desarrollo_de_apps_android_tarea5.fragments.IMascotasFragmentView;
import com.jenifer.desarrollo_de_apps_android_tarea5.fragments.IRankingFragmentView;

import java.util.ArrayList;

public class MascotasFragmentPresenter implements IMascotasFragmentPresenter {

    private IMascotasFragmentView iMascotasFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public MascotasFragmentPresenter(IMascotasFragmentView iMascotasFragmentView, Context context) {
        this.iMascotasFragmentView = iMascotasFragmentView;
        this.context = context;
    }

    @Override
    public void obtenerMascotasBD() {
        constructorMascotas = new ConstructorMascotas( context );
        mascotas =  constructorMascotas.getMascotas();
        mostrarMascotas();
    }

    @Override
    public void mostrarMascotas() {
        iMascotasFragmentView.initAdaptadorRV( iMascotasFragmentView.generateMascotaAdaptador( mascotas ) );
        iMascotasFragmentView.generateLinearLayot();
    }
}
