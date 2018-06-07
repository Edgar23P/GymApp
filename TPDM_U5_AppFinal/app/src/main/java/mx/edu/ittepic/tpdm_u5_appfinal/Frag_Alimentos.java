package mx.edu.ittepic.tpdm_u5_appfinal;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.database.sqlite.SQLiteAbortException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.function.ToIntBiFunction;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link } interface
 * to handle interaction events.
 * Use the {@link Frag_Alimentos#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_Alimentos extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    Button add;
    BaseDeDatos dbms;
    EditText et,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15,et16,et17;
    ListView lista;
    TextView no;
    boolean editar = true;
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public Frag_Alimentos() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag_Alimentos.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag_Alimentos newInstance(String param1, String param2) {
        Frag_Alimentos fragment = new Frag_Alimentos();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_frag__alimentos, container, false);
        add = v.findViewById(R.id.btnAgregarAlimento);
        lista =  v.findViewById(R.id.Lista);
        final EditText et = new EditText(getContext());
        final EditText et2 = new EditText(getContext());
        final EditText et3 = new EditText(getContext());
        final EditText et4 = new EditText(getContext());
        final EditText et5 = new EditText(getContext());
        final EditText et6 = new EditText(getContext());
        final EditText et7 = new EditText(getContext());
        final EditText et8 = new EditText(getContext());
        final EditText et9 = new EditText(getContext());
        final EditText et10 = new EditText(getContext());
        final EditText et11 = new EditText(getContext());
        final EditText et12 = new EditText(getContext());
        final EditText et13 = new EditText(getContext());
        final EditText et14 = new EditText(getContext());
        final EditText et15 = new EditText(getContext());
        final EditText et16 = new EditText(getContext());
        final EditText et17 = new EditText(getContext());
        dbms =  new BaseDeDatos(getContext(),"BDTAREA",null,1);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                try {
                    ScrollView scroll =  new ScrollView(getContext());
                    LinearLayout layout = new LinearLayout(getContext());
                    LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                    layout.setOrientation(LinearLayout.VERTICAL);
                    layout.setLayoutParams(parms);

                    layout.setGravity(Gravity.CLIP_VERTICAL);
                    layout.setPadding(2, 2, 2, 2);

                    /// Campos de Texto

                    int temp = 0;
                    et.setId(temp);
                    et.setHint("Categoria");
                    layout.addView(et, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));



                    temp = 1;
                    et2.setId(temp);
                    et2.setHint("Nombre");
                    layout.addView(et2, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 2;
                    et3.setId(temp);
                    et3.setHint("Calorias");
                    layout.addView(et3, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 4;
                    et4.setId(temp);
                    et4.setHint("Marca");
                    layout.addView(et4, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 5;
                    et5.setId(temp);
                    et5.setHint("Cantidad");
                    layout.addView(et5, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 6;
                    et6.setId(temp);
                    et6.setHint("Unidad Medida");
                    layout.addView(et6, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 7;
                    et7.setId(temp);
                    et7.setHint("Carbohidratos");
                    layout.addView(et7, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                    temp = 10;
                    et10.setId(temp);
                    et10.setHint("Fibra");
                    layout.addView(et10, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 11;
                    et11.setId(temp);
                    et11.setHint("Azucar");
                    layout.addView(et11, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 12;
                    et12.setId(temp);
                    et12.setHint("Proteinas");
                    layout.addView(et12, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 13;
                    et13.setId(temp);
                    et13.setHint("Grasas");
                    layout.addView(et13, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 14;
                    et14.setId(temp);
                    et14.setHint("monoinsaturadas");
                    layout.addView(et14, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 15;
                    et15.setId(temp);
                    et15.setHint("poliinsaturados");
                    layout.addView(et15, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 16;
                    et16.setId(temp);
                    et16.setHint("Saturadas");
                    layout.addView(et16, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                    temp = 17;
                    et17.setId(temp);
                    et17.setHint("sodio");
                    layout.addView(et17, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                    scroll.addView(layout);
                    alertDialogBuilder.setView(scroll);
                    // alertDialogBuilder.setMessage("Input Student ID");


                    alertDialogBuilder.setCancelable(false);

                    // Setting Negative "Cancel" Button
                    alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int whichButton) {
                            dialog.cancel();
                        }
                    });

                    // Setting Positive "OK" Button
                    alertDialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            try{
                                if(!et.getText().toString().equals("")) {
                                    SQLiteDatabase db = dbms.getWritableDatabase();
                                    //String SQL = "INSERT INTO USUARIO VALUES(NULL,'"+usuario.getText().toString()+"','"+password.getText().toString()+"')";

                                    String SQL = "INSERT INTO ALIMENTOS VALUES(NULL," +
                                            "'{CATEGORIA}'," +
                                            "'{NOMBRE}'," +
                                            "'{CALORIAS}'," +
                                            "'{MARCA}'," +
                                            "'{CANTIDAD}'," +
                                            "'{UNIDADMEDIDA}'," +
                                            "'{CARBOHIDRATOS}'," +
                                            "'{FIBRA}'," +
                                            "'{AZUCAR}'," +
                                            "'{PROTEINAS}'," +
                                            "'{GRASAS}'," +
                                            "'{MONOINSATURADAS}'," +
                                            "'{POLIINSATURADAS}'," +
                                            "'{SATURADAS}'," +
                                            "'{SODIO}')";
                                    SQL = SQL.replace("{CATEGORIA}", et.getText().toString());
                                    SQL = SQL.replace("{NOMBRE}", et2.getText().toString());
                                    SQL = SQL.replace("{CALORIAS}", et3.getText().toString());
                                    SQL = SQL.replace("{MARCA}", et4.getText().toString());
                                    SQL = SQL.replace("{CANTIDAD}", et5.getText().toString());
                                    SQL = SQL.replace("{UNIDADMEDIDA}", et6.getText().toString());
                                    SQL = SQL.replace("{CARBOHIDRATOS}", et7.getText().toString());
                                    SQL = SQL.replace("{FIBRA}", et10.getText().toString());
                                    SQL = SQL.replace("{AZUCAR}", et11.getText().toString());
                                    SQL = SQL.replace("{PROTEINAS}", et12.getText().toString());
                                    SQL = SQL.replace("{GRASAS}", et13.getText().toString());
                                    SQL = SQL.replace("{MONOINSATURADAS}", et14.getText().toString());
                                    SQL = SQL.replace("{POLIINSATURADAS}", et15.getText().toString());
                                    SQL = SQL.replace("{SATURADAS}", et15.getText().toString());
                                    SQL = SQL.replace("{SODIO}", et17.getText().toString());
                                    db.execSQL(SQL);//SE EJECUTA EL INSERT DENTRO DE LA BASE DE DATOS "LOGIN"

                                    db.close();


                                    Toast.makeText(getContext(), "Se Agrego tu Alimento!", Toast.LENGTH_LONG).show();
                                }else{
                                    Toast.makeText(getContext(),"no se puede insertar Campos Vacios",Toast.LENGTH_SHORT).show();
                                }
                            }catch (SQLiteAbortException error){
                                android.support.v7.app.AlertDialog.Builder alerta=new android.support.v7.app.AlertDialog.Builder(getContext());
                                alerta.setTitle("ATENCION");
                                alerta.setMessage("ERROR: "+error.getMessage());
                                alerta.show();
                            }
                        }
                    });

                    AlertDialog alertDialog = alertDialogBuilder.create();

                    try {

                            alertDialog.show();


                    } catch (Exception e) {
                        // WindowManager$BadTokenException will be caught and the app would
                        // not display the 'Force Close' message
                        e.printStackTrace();
                    }
                }catch(Exception e){
                    Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        lista.setOnItemClickListener( new OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Object h = lista.getItemAtPosition(position);
                String row = h.toString();
                row = row.trim();
                String y[] = row.split(" ");

                try {
                    SQLiteDatabase base = dbms.getReadableDatabase();
                    String sql="select * from ALIMENTOS where ID="+y[0];

                    Cursor x = base.rawQuery(sql,null);
                    if(x.moveToFirst()==false){
                        AlertDialog.Builder a = new AlertDialog.Builder(getContext());
                        a.setMessage("Tu Alimento no fue encotrado").show();

                        base.close();
                        return;

                    }
                    String[] Datos = new String[x.getCount()];
                    int i=0;
                    do{
                        Datos[i] = x.getString(0) +" "
                                + x.getString(1)+" "
                                + x.getString(2)+" "
                                + x.getString(3)+" "
                                + x.getString(4)+" "
                                + x.getString(5)+" "
                                + x.getString(6)+" "
                                + x.getString(7)+" "
                                + x.getString(8)+" "
                                + x.getString(9)+" "
                                + x.getString(10)+" "
                                + x.getString(11)+" "
                                + x.getString(12)+" "
                                + x.getString(13)+" "
                                + x.getString(14)+" "
                                + x.getString(15)+" "
                                + "pilon";
                        i++;
                    }while(x.moveToNext());
                    base.close();
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
                    try {
                        ScrollView scroll =  new ScrollView(getContext());
                        LinearLayout layout = new LinearLayout(getContext());
                        LinearLayout.LayoutParams parms = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
                        layout.setOrientation(LinearLayout.VERTICAL);
                        layout.setLayoutParams(parms);

                        layout.setGravity(Gravity.CLIP_VERTICAL);
                        layout.setPadding(2, 2, 2, 2);

                        /// Campos de Texto
                        String dep = Datos[0];
                        dep =  dep.trim();
                        final String datosDepurados[] = dep.split(" ");

                        //categoria
                        int temp = 0;
                        et.setId(temp);
                        et.setText(datosDepurados[1]);
                        layout.addView(et, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));


                        //nombre
                        temp = 1;
                        et2.setId(temp);
                        et2.setText(datosDepurados[2]);
                        layout.addView(et2, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Calorias
                        temp = 2;
                        et3.setId(temp);
                        et3.setText(datosDepurados[3]);
                        layout.addView(et3, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Marca
                        temp = 4;
                        et4.setId(temp);
                        et4.setText(datosDepurados[4]);
                        layout.addView(et4, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Cantida
                        temp = 5;
                        et5.setId(temp);
                        et5.setText(datosDepurados[5]);
                        layout.addView(et5, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //unidad de medida
                        temp = 6;
                        et6.setId(temp);
                        et6.setText(datosDepurados[6]);
                        layout.addView(et6, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Carbohidratos
                        temp = 7;
                        et7.setId(temp);
                        et7.setText(datosDepurados[7]);
                        layout.addView(et7, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Fibra
                        temp = 10;
                        et10.setId(temp);
                        et10.setText(datosDepurados[8]);
                        layout.addView(et10, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Azucar9
                        temp = 11;
                        et11.setId(temp);
                        et11.setText(datosDepurados[9]);
                        layout.addView(et11, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Proteinas
                        temp = 12;
                        et12.setId(temp);
                        et12.setText(datosDepurados[10]);
                        layout.addView(et12, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //grasas
                        temp = 13;
                        et13.setId(temp);
                        et13.setText(datosDepurados[11]);
                        layout.addView(et13, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //moinsaturadas
                        temp = 14;
                        et14.setId(temp);
                        et14.setText(datosDepurados[12]);
                        layout.addView(et14, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //poliinsaturadas
                        temp = 15;
                        et15.setId(temp);
                        et15.setText(datosDepurados[13]);
                        layout.addView(et15, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //sauradas
                        temp = 16;
                        et16.setId(temp);
                        et16.setText(datosDepurados[14]);
                        layout.addView(et16, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        //Sodio
                        temp = 17;
                        et17.setId(temp);
                        et17.setText(datosDepurados[15]);
                        layout.addView(et17, new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));

                        scroll.addView(layout);
                        alertDialogBuilder.setView(scroll);
                        // alertDialogBuilder.setMessage("Input Student ID");


                        alertDialogBuilder.setCancelable(false);

                        // Setting Negative "Cancel" Button

                        alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int whichButton) {
                                dialog.cancel();
                            }
                        });

                        // Setting Positive "OK" Button
                        alertDialogBuilder.setPositiveButton("EDITAR", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                try{
                                    if(editar) {
                                        SQLiteDatabase db = dbms.getWritableDatabase();
                                        //String SQL = "INSERT INTO USUARIO VALUES(NULL,'"+usuario.getText().toString()+"','"+password.getText().toString()+"')";

                                        String SQL = "UPDATE ALIMENTOS SET " +
                                                "CATEGORIA="+"'{CATEGORIA}'," +
                                                "NOMBRE="+ "'{NOMBRE}'," +
                                                "CALORIAS="+"'{CALORIAS}'," +
                                                "MARCA="+"'{MARCA}'," +
                                                "CANTIDAD="+"'{CANTIDAD}'," +
                                                "UNIDADMEDIDA="+"'{UNIDADMEDIDA}'," +
                                                "CARBOHIDRATOS="+"'{CAROHIDRATOS}'," +
                                                "FIBRA="+"'{FIBRA}'," +
                                                "AZUCAR="+"'{AZUCAR}'," +
                                                "PROTEINAS="+"'{PROTEINAS}'," +
                                                "GRASAS="+"'{GRASAS}'," +
                                                "MONOINSATURADAS="+"'{MONOINSATURADAS}'," +
                                                "POLIINSATURADAS="+"'{POLIINSATURADAS}'," +
                                                "SATURADAS="+"'{SATURADAS}'," +
                                                "SODIO="+"'{SODIO}'"+" WHERE ID ="+ datosDepurados[0];
                                        SQL = SQL.replace("{CATEGORIA}", et.getText().toString());
                                        SQL = SQL.replace("{NOMBRE}", et2.getText().toString());
                                        SQL = SQL.replace("{CALORIAS}", et3.getText().toString());
                                        SQL = SQL.replace("{MARCA}", et4.getText().toString());
                                        SQL = SQL.replace("{CANTIDAD}", et5.getText().toString());
                                        SQL = SQL.replace("{UNIDADMEDIDA}", et6.getText().toString());
                                        SQL = SQL.replace("{CARBOHIDRATOS}", et7.getText().toString());
                                        SQL = SQL.replace("{FIBRA}", et10.getText().toString());
                                        SQL = SQL.replace("{AZUCAR}", et11.getText().toString());
                                        SQL = SQL.replace("{PROTEINAS}", et12.getText().toString());
                                        SQL = SQL.replace("{GRASAS}", et13.getText().toString());
                                        SQL = SQL.replace("{MONOINSATURADAS}", et14.getText().toString());
                                        SQL = SQL.replace("{POLIINSATURADAS}", et15.getText().toString());
                                        SQL = SQL.replace("{SATURADAS}", et15.getText().toString());
                                        SQL = SQL.replace("{SODIO}", et17.getText().toString());
                                        db.execSQL(SQL);//SE EJECUTA EL INSERT DENTRO DE LA BASE DE DATOS "LOGIN"

                                        db.close();
                                        editar=false;
                                        Toast.makeText(getContext(), "Se Edito tu Alimento!", Toast.LENGTH_LONG).show();
                                    }else{
                                        Toast.makeText(getContext(),"no se puede insertar Campos Vacios",Toast.LENGTH_SHORT).show();
                                    }
                                }catch (SQLiteAbortException error){
                                    android.support.v7.app.AlertDialog.Builder alerta=new android.support.v7.app.AlertDialog.Builder(getContext());
                                    alerta.setTitle("ATENCION");
                                    alerta.setMessage("ERROR: "+error.getMessage());
                                    alerta.show();
                                }
                            }
                        });

                        AlertDialog alertDialog = alertDialogBuilder.create();

                        try {
                            alertDialog.show();
                        } catch (Exception e) {
                            // WindowManager$BadTokenException will be caught and the app would
                            // not display the 'Force Close' message
                            e.printStackTrace();
                        }
                    }catch(Exception e){
                        Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
                    }


                }catch(SQLiteException s){
                    Toast.makeText(getContext(),s.getMessage(),Toast.LENGTH_SHORT).show();
                }


            }
        });

        hacerSelect();
        return v;
    }



    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    private void hacerSelect(){
        try {
            SQLiteDatabase base = dbms.getReadableDatabase();
            String sql="select * from ALIMENTOS";

            Cursor x = base.rawQuery(sql,null);
            if(x.moveToFirst()==false){
                AlertDialog.Builder a = new AlertDialog.Builder(getContext());
                a.setMessage("No Tienes Alimentos").show();

                base.close();
                return;

            }

            String[] Datos = new String[x.getCount()];
            int i=0;
            do{
                Datos[i] = x.getString(0) +" "+ x.getString(2);
                i++;
            }while(x.moveToNext());
            base.close();

            ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getContext(),R.layout.support_simple_spinner_dropdown_item,Datos);

            lista.setAdapter(adaptador);
        }catch(SQLiteException s){
            AlertDialog.Builder a =  new AlertDialog.Builder(getContext());
        }

    }
}

