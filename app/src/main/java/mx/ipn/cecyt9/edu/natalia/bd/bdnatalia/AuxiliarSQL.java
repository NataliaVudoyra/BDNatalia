package mx.ipn.cecyt9.edu.natalia.bd.bdnatalia;

import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;


/**
 * Created by Profesor on 08/02/2019.
 */

public class AuxiliarSQL  extends SQLiteOpenHelper{
    String Tabla = "CREATE TABLE Reservacion (" + "_id INTEGER PRIMARY KEY AUTOINCREMENT, " + "Nombre TEXT) ";

    public AuxiliarSQL(Context context, String DBname, SQLiteDatabase.CursorFactory factory, int version){
        super(context, DBname, factory, version);
    }

    @Override

    public void onCreate(SQLiteDatabase baseDatos){
        baseDatos.execSQL(Tabla);
    }

    @Override
    public void onUpgrade(SQLiteDatabase baseDatos, int oldVersion, int newVersion){
        baseDatos.execSQL("DROP TABLE IF EXISTS Reservacion");
        baseDatos.execSQL(Tabla);
    }
}
