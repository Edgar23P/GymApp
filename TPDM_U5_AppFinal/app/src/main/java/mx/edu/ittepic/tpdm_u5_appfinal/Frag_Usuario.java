package mx.edu.ittepic.tpdm_u5_appfinal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Map;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Frag_Usuario.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Frag_Usuario#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag_Usuario extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private EditText edad, peso, altura;

    private OnFragmentInteractionListener mListener;

    public Frag_Usuario() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag_Usuario.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag_Usuario newInstance(String param1, String param2) {
        Frag_Usuario fragment = new Frag_Usuario();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        View v = new View(this.getContext());

        edad = v.findViewById(R.id.edadUsuario);
        altura = v.findViewById(R.id.alturaUsuario);
        peso  = v.findViewById(R.id.pesoUsuario);



    }

    public void insertUsuario(View v) {
        BaseDeDatos admin = new BaseDeDatos(this.getContext(), "administracion", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        Usuario  usuario = new Usuario(1, "BRAYAN ULISSES ARIAS PEREZ", Integer.parseInt(edad.getText().toString()), Double.parseDouble(altura.getText().toString()), Double.parseDouble(peso.getText().toString()), "Hombre") ;
        ContentValues registro = new ContentValues();

        registro.put("NOMBRE", usuario.getNombre());
        registro.put("EDAD", usuario.getEdad());
        registro.put("ALTURA", usuario.getAltura());
        registro.put("PESO", usuario.getPeso());
        registro.put("SEXO", usuario.getSexo());

        bd.insert("USUARIO", null, registro);

        bd.close();

        Toast.makeText(this.getContext(), "Datos del usuario cargados", Toast.LENGTH_SHORT).show();

    }//INSERTAR NUEVO USUARIO

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag__usuario, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
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
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
