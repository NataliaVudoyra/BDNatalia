package mx.ipn.cecyt9.edu.natalia.bd.bdnatalia;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends Activity {


    TextView mostrar;
    String nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mostrar = (TextView) findViewById(R.id.mostrar);

        Bundle paquetito = new Bundle();
        paquetito = this.getIntent().getExtras();

        nombre = paquetito.getString("nombre");

        mostrar.setText("Nombre: " + nombre);

    }
}
