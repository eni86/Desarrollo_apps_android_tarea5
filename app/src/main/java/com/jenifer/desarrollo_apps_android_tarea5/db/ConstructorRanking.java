package com.jenifer.desarrollo_de_apps_android_tarea5.db;

import android.content.ContentValues;
import android.content.Context;

import com.mauro.mascotas.R;
import com.mauro.mascotas.classes.Mascota;

import java.util.ArrayList;

public class ConstructorRanking {

    private Context context;

    public ConstructorRanking(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> getRanking(){

        BaseDatos db = new BaseDatos( context );
        return db.getRanking();
    }

    public void insertMascotas( BaseDatos db ){
        ContentValues contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Toby" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app1 );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Hugo" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app8 );
        db.insertMascota( contentValues );

        contentValues = new ContentValues();
        contentValues.put( Config.TABLE_MASCOTAS_NOMBRE, "Paco" );
        contentValues.put( Config.TABLE_MASCOTAS_FOTO, R.drawable.app2 );
        db.insertMascota( contentValues );
    }
}
