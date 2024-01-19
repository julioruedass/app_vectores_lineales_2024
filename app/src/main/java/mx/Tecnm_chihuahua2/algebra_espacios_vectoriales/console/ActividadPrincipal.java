package mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console;
//ACTIVITI PRINCIPAL BY
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.chaquo.python.console.R;

public class ActividadPrincipal extends AppCompatActivity {

    Button button_BaseOrtonormal;
    Button button_CambioDeBase;
    Button button_DeterminarUnaBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_principal);

        button_BaseOrtonormal = findViewById(R.id.button_baseortonormal);
        button_CambioDeBase = findViewById(R.id.button_cambiodebase);
        button_DeterminarUnaBase = findViewById(R.id.button_determinarbase);

        /* agregar escuchadores y acciones para los botones
         */
        button_BaseOrtonormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // llamar a la actividad base ortonormal

                Intent actividadBaseOrtonormal = new Intent(getApplicationContext(),BaseOrtonormal.class);
                startActivity(actividadBaseOrtonormal);
            }
        });


        button_CambioDeBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // llamar a la actividad base ortonormal

                Intent actividadCambioDeBase = new Intent(getApplicationContext(),CambioBase.class);
                startActivity(actividadCambioDeBase);
            }
        });

        button_DeterminarUnaBase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // llamar a la actividad base ortonormal

                Intent Determinar_base = new Intent(getApplicationContext(),Determinar_base.class);
                startActivity(Determinar_base);
            }
        });
    }
}