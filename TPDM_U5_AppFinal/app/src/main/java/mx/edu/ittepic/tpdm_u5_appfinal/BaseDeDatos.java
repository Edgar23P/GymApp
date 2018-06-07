package mx.edu.ittepic.tpdm_u5_appfinal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BaseDeDatos extends SQLiteOpenHelper{

    public BaseDeDatos(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        //crear base de datos
    /*
    *  public int id { get; set; }
        public string categoria { get; set; }
        public string nombre { get; set; }
        public float calorias { get; set; }
        public string marca { get; set; }
        public int cantidad { get; set; }
        public string unidadmedida { get; set; }
        public float carbohidratos { get; set; }
        public float fibra { get; set; }
        public float azucar { get; set; }
        public float proteinas { get; set; }
        public float grasas { get; set; }
        public float monoinsaturadas { get; set; }
        public float poliinsaturadas { get; set; }
        public float saturadas { get; set; }
        public float sodio { get; set; }
    * */

        db.execSQL("CREATE TABLE ALIMENTOS (" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "CATEGORIA VARCHAR(500)," +
                "NOMBRE VARCHAR(500)," +
                "CALORIAS FLOAT," +
                "MARCA VARCHAR(500)," +
                "CANTIDAD INTEGER," +
                "UNIDADMEDIDA VARCHAR(500)," +
                "CARBOHIDRATOS FLOAT," +
                "FIBRA FLOAT," +
                "AZUCAR FLOAT," +
                "PROTEINAS FLOAT," +
                "GRASAS FLOAT," +
                "MONOINSATURADAS FLOAT," +
                "POLIINSATURADAS FLOAT," +
                "SATURADAS FLOAT," +
                "SODIO FLOAT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
