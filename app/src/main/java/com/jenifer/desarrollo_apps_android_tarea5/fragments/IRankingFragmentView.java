package com.jenifer.desarrollo_de_apps_android_tarea5.fragments;

import com.jenifer.desarrollo_de_apps_android_tarea5.adapters.MascotaAdaptador;
import com.jenifer.desarrollo_de_apps_android_tarea5.classes.Mascota;

import java.util.ArrayList;

public interface IRankingFragmentView {

    public void generateLinearLayot();
    public MascotaAdaptador generateMascotaAdaptador(ArrayList<Mascota> mascotas );
    public void initAdaptadorRV( MascotaAdaptador adaptador );

}
