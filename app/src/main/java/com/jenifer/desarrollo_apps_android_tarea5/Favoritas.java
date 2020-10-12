package com.jenifer.desarrollo_de_apps_android_tarea5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.jenifer.desarrollo_de_apps_android_tarea5.adapters.MascotaAdaptador;
import com.jenifer.desarrollo_de_apps_android_tarea5.adapters.PageAdapter;
import com.jenifer.desarrollo_de_apps_android_tarea5.classes.Mascota;
import com.jenifer.desarrollo_de_apps_android_tarea5.fragments.MascotasFragment;
import com.jenifer.desarrollo_de_apps_android_tarea5.fragments.MiMascotaFragment;
import com.jenifer.desarrollo_de_apps_android_tarea5.fragments.RankingFragment;

import java.util.ArrayList;

public class Favoritas extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritas);

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        /*if(toolbar != null){
            setSupportActionBar( toolbar );
        }*/

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setUpViewPager();

    }

    public void setUpViewPager(){
        viewPager.setAdapter( new PageAdapter( getSupportFragmentManager(), agregarFragments() ));
        tabLayout.setupWithViewPager( viewPager );
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<Fragment>();

        fragments.add( new RankingFragment() );

        return fragments;
    }


}