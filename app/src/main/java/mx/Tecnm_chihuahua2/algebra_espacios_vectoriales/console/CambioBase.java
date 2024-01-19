package mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.agog.mathdisplay.MTMathView;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.chaquo.python.console.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CambioBase extends AppCompatActivity {

    EditText editText_v_dato1;
    EditText editText_v_dato2;
    EditText editText_v_dato3;
    EditText editText_v_dato4;

    EditText editText_b1_dato1;
    EditText editText_b1_dato2;
    EditText editText_b1_dato3;
    EditText editText_b1_dato4;
    EditText editText_b2_dato1;
    EditText editText_b2_dato2;
    EditText editText_b2_dato3;
    EditText editText_b2_dato4;
    EditText editText_b3_dato1;
    EditText editText_b3_dato2;
    EditText editText_b3_dato3;
    EditText editText_b3_dato4;
    EditText editText_b4_dato1;
    EditText editText_b4_dato2;
    EditText editText_b4_dato3;
    EditText editText_b4_dato4;

    RadioButton rad_base1, rad_base2, rad_canonica;
    /*base 2*/
    EditText editText2_b1_dato1;
    EditText editText2_b1_dato2;
    EditText editText2_b1_dato3;
    EditText editText2_b1_dato4;
    EditText editText2_b2_dato1;
    EditText editText2_b2_dato2;
    EditText editText2_b2_dato3;
    EditText editText2_b2_dato4;
    EditText editText2_b3_dato1;
    EditText editText2_b3_dato2;
    EditText editText2_b3_dato3;
    EditText editText2_b3_dato4;
    EditText editText2_b4_dato1;
    EditText editText2_b4_dato2;
    EditText editText2_b4_dato3;
    EditText editText2_b4_dato4;

    Switch v_canonico;
    MTMathView etiqueta_Resultado;
    TextView resultado_base;

    EditText editText_respuesta2;
    TextView textview_resultado2;
    Button button_resultado2;
    Button button_limpia;
    Button button_mas,button_menos;

    LinearLayout linea_vector_1, linea_vector_2, linea_vector_3, linea_vector_4 ;
    LinearLayout linea2_vector_1, linea2_vector_2, linea2_vector_3, linea2_vector_4 ;

    Button establecer_lon_canonico;
    Button button_procedimiento2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_cambio_de_base);
        try {
            etiqueta_Resultado = findViewById(R.id.mathviewFormula1);
            etiqueta_Resultado.setFontSize(40);
            etiqueta_Resultado.setScrollContainer(true);
            resultado_base = findViewById(R.id.textView90);
            editText_v_dato1 = findViewById(R.id.editText_v_dato1);
            editText_v_dato2 = findViewById(R.id.editText_v_dato2);
            editText_v_dato3 = findViewById(R.id.editText_v_dato3);
            editText_v_dato4 = findViewById(R.id.editText_v_dato4);
            /*base 1*/
            editText_b1_dato1 = findViewById(R.id.editText_b1_dato1);
            editText_b1_dato2 = findViewById(R.id.editText_b1_dato2);
            editText_b1_dato3 = findViewById(R.id.editText_b1_dato3);
            editText_b1_dato4 = findViewById(R.id.editText_b1_dato4);
            editText_b2_dato1 = findViewById(R.id.editText_b2_dato1);
            editText_b2_dato2 = findViewById(R.id.editText_b2_dato2);
            editText_b2_dato3 = findViewById(R.id.editText_b2_dato3);
            editText_b2_dato4 = findViewById(R.id.editText_b2_dato4);
            editText_b3_dato1 = findViewById(R.id.editText_b3_dato1);
            editText_b3_dato2 = findViewById(R.id.editText_b3_dato2);
            editText_b3_dato3 = findViewById(R.id.editText_b3_dato3);
            editText_b3_dato4 = findViewById(R.id.editText_b3_dato4);
            editText_b4_dato1 = findViewById(R.id.editText_b4_dato1);
            editText_b4_dato2 = findViewById(R.id.editText_b4_dato2);
            editText_b4_dato3 = findViewById(R.id.editText_b4_dato3);
            editText_b4_dato4 = findViewById(R.id.editText_b4_dato4);

            /*base 2*/
            editText2_b1_dato1 = findViewById(R.id.editText2_b1_dato1);
            editText2_b1_dato2 = findViewById(R.id.editText2_b1_dato2);
            editText2_b1_dato3 = findViewById(R.id.editText2_b1_dato3);
            editText2_b1_dato4 = findViewById(R.id.editText2_b1_dato4);
            editText2_b2_dato1 = findViewById(R.id.editText2_b2_dato1);
            editText2_b2_dato2 = findViewById(R.id.editText2_b2_dato2);
            editText2_b2_dato3 = findViewById(R.id.editText2_b2_dato3);
            editText2_b2_dato4 = findViewById(R.id.editText2_b2_dato4);
            editText2_b3_dato1 = findViewById(R.id.editText2_b3_dato1);
            editText2_b3_dato2 = findViewById(R.id.editText2_b3_dato2);
            editText2_b3_dato3 = findViewById(R.id.editText2_b3_dato3);
            editText2_b3_dato4 = findViewById(R.id.editText2_b3_dato4);
            editText2_b4_dato1 = findViewById(R.id.editText2_b4_dato1);
            editText2_b4_dato2 = findViewById(R.id.editText2_b4_dato2);
            editText2_b4_dato3 = findViewById(R.id.editText2_b4_dato3);
            editText2_b4_dato4 = findViewById(R.id.editText2_b4_dato4);

            rad_base1 = findViewById(R.id.radbtn_b1);
            rad_base2 = findViewById(R.id.radbtn_b2);
            rad_canonica = findViewById(R.id.radbtn_canonica);

            linea_vector_1 = findViewById(R.id.v_row_v1);
            linea_vector_2 = findViewById(R.id.v_row_v2);
            linea_vector_3 = findViewById(R.id.v_row_v3);
            linea_vector_4 = findViewById(R.id.v_row_v4);

            linea2_vector_1 = findViewById(R.id.v_row2_v1);
            linea2_vector_2 = findViewById(R.id.v_row2_v2);
            linea2_vector_3 = findViewById(R.id.v_row2_v3);
            linea2_vector_4 = findViewById(R.id.v_row2_v4);

            button_resultado2 = findViewById(R.id.button_resultado2);
            button_procedimiento2 = findViewById(R.id.button_procedimiento2);
            button_limpia = findViewById(R.id.btn_limpiar);
            button_mas = findViewById(R.id.button_mas);
            button_menos = findViewById(R.id.button_menos);

            v_canonico = findViewById(R.id.switch1);
            establecer_lon_canonico = findViewById(R.id.button_establecer_vector);

        }catch (Error e) {
            Toast.makeText(getApplicationContext() , "Ocurrio :" + e.toString(), Toast.LENGTH_SHORT).show();
        }

        /* try {
       }catch (Error e) {
        Toast.makeText(getApplicationContext() , "Python :" + e.toString(), Toast.LENGTH_SHORT).show();
        }*/
        // Obtener una instancia Python, punto de inicio para enlace Java-Python
        // Revisar si Python está iniciado
        if (!Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }

        final Python py = Python.getInstance();

        button_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( ClaseDatosPythonJava.tamano_letra > 30 ){
                    ClaseDatosPythonJava.tamano_letra=ClaseDatosPythonJava.tamano_letra-2;
                    etiqueta_Resultado.setFontSize(ClaseDatosPythonJava.tamano_letra);
                }
            }
        });


        /*clic al boton de aumento de tamaño de letra*/
        button_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( ClaseDatosPythonJava.tamano_letra < 50){
                    ClaseDatosPythonJava.tamano_letra=ClaseDatosPythonJava.tamano_letra+2;
                    etiqueta_Resultado.setFontSize(ClaseDatosPythonJava.tamano_letra);
                }
            }
        });


        establecer_lon_canonico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (f_tamaño()){
                    asignar_tamaños_vectores();
                    if( ClaseDatosPythonJava.v_where_base == "Canonica"){
                        //asignar_tamaños_vectores_no_canonica();
                        inicio_pantalla_no_canonico();
                    }else {
                        asignar_tamaños_vectores_no_canonica();
                    }
                    ClaseDatosPythonJava.componentes = ClaseDatosPythonJava.tamano_vector;
                }
            }
        });

        //Evaluar resutados y mostrar el retuldado y detalles
        button_resultado2.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               ClaseDatosPythonJava.vaciar_etiquetas();
               if( ClaseDatosPythonJava.v_where_base == "Canonica"){
                   if( get_elemts_pantalla( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector)){

                       String result_det_1 = "";
                       // Llamar función Python y especificar parámetros si existen (B1)
                       PyObject py_determinar_base = py.getModule("main_determinar_base");
                       Object res_determinarte_re2_b1 = py_determinar_base.callAttr("main");
                       result_det_1 = get_resultados_determinante(" B1");
                       ClaseDatosPythonJava.vaciar_etiquetas();
                       resultado_base.setText(result_det_1);
                       // Llamar función Python y especificar parámetros si existen (B2)
                       PyObject py_cambio_base = py.getModule("main_base_change");
                       Object res_cambio_base_re2  = py_cambio_base.callAttr("main");
                       etiqueta_Resultado.setLatex(ClaseDatosPythonJava.latexMatriz);
                   }else{
                       Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 1 invalidos", Toast.LENGTH_SHORT).show();
                   }
               }else{
                  Boolean  matrix1, matrix2;
                  matrix1=get_elemts_pantalla( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector);
                  matrix2=get_elemts_pantalla_no_canonico( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector);

                   if( !matrix1){
                       Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 1 invalidos", Toast.LENGTH_SHORT).show();
                   }
                   if( !matrix2){
                       Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 2 invalidos", Toast.LENGTH_SHORT).show();
                   }
                   if( matrix1 && matrix2){
                       String result_det_1 = "";
                       String result_det_2 = "";

                       // Llamar función Python y especificar parámetros si existen
                       PyObject py_determinante = py.getModule("main_determinar_base");
                       Object res_determinante_re2_b1  = py_determinante.callAttr("main");
                       result_det_1 = get_resultados_determinante(" B1");

                       // Llamar función Python y especificar parámetros si existen
                       ClaseDatosPythonJava.vaciar_etiquetas();
                       PyObject py_determinante_2 = py.getModule("main_determinar_base2");
                       Object res_determinante_re2_b2  = py_determinante_2.callAttr("main");
                       result_det_2 = get_resultados_determinante(" B2");
                       resultado_base.setText("Base 1"+ "\n" + result_det_1 + "\n" + "Base 2"+ "\n" + result_det_2);
                       ClaseDatosPythonJava.vaciar_etiquetas();
                       ClaseDatosPythonJava.dinamicSetvalue(" - " + result_det_1 + "\n" + result_det_2 ,"");
                       // Llamar función Python y especificar parámetros si existen
                       PyObject py_cambio_base = py.getModule("main_base_change");
                       Object res_cambio_base  = py_cambio_base.callAttr("main");
                       // Intent ortonormal_procedimiento = new Intent(getApplicationContext(), ActivityDeterminarBaseProced.class);
                       // startActivity(ortonormal_procedimiento);
                       etiqueta_Resultado.setLatex(ClaseDatosPythonJava.latexMatriz);
                   }
               }
            }
        });

        // Boton que manda ala pantalla de procedimiento
        //  Evaluar si es canonica o no
        button_procedimiento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClaseDatosPythonJava.vaciar_etiquetas();
                //Canonica solo una base
                if( ClaseDatosPythonJava.v_where_base == "Canonica"){
                    if( get_elemts_pantalla( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector)){
                        String result_1 = "";
                        String result_2 = "";
                        // Llamar función Python y especificar parámetros si existen base 1
                        PyObject py_canonica_determina_b1 = py.getModule("main_determinar_base");
                        Object respuesta_pro2_b1 = py_canonica_determina_b1.callAttr("main");
                        result_1 = get_resultados_determinante(" B1");
                        ClaseDatosPythonJava.vaciar_etiquetas();

                        // Llamar función Python y especificar parámetros si existen base 2
                     /*   PyObject py_canonica_determina_b2 = py.getModule("main_determinar_base2");
                        Object respuesta_pro2_b2 = py_canonica_determina_b2.callAttr("main");
                        result_2 = get_resultados_determinante(" B2");
                        resultado_base.setText("Base 1"+ "\n" + result_1 + "\n"  + "Base 2"+ "\n" + result_2);
                        ClaseDatosPythonJava.vaciar_etiquetas();
                        */

                        // Llamar función Python y especificar parámetros si existen
                        PyObject py_canonica_cambio_base = py.getModule("main_base_change");
                        Object res_cambio_base_pro2  = py_canonica_cambio_base.callAttr("main");
                        etiqueta_Resultado.setLatex(ClaseDatosPythonJava.latexMatriz);
                        ClaseDatosPythonJava.dinamicSetvalue(" - " +  result_1 + "\n" + result_2,"");
                        Intent ortonormal_procedimiento = new Intent(getApplicationContext(), Procedimiento.class);
                        startActivity(ortonormal_procedimiento);

                    }else{
                        Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 1 invalidos", Toast.LENGTH_SHORT).show();
                    }

                    //Evaluar procedimiento no Canonica
                }else{
                    Boolean  matrix1, matrix2;
                    matrix1=get_elemts_pantalla( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector);
                    matrix2=get_elemts_pantalla_no_canonico( ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.tamano_vector);
                    if( !matrix1){
                        Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 1 invalidos", Toast.LENGTH_SHORT).show();
                    }
                    if( !matrix2){
                        Toast.makeText(getApplicationContext() , "Valores en conjunto de vectores 2 invalidos", Toast.LENGTH_SHORT).show();
                    }
                    if( matrix1 && matrix2){
                        String result_1 = "";
                        String result_2 = "";
                        // Llamar función Python y especificar parámetros si existen
                        PyObject pyov_no_canonica_b1 = py.getModule("main_determinar_base");
                        Object respuesta_pro2_b1 = pyov_no_canonica_b1.callAttr("main");
                        result_1 =get_resultados_determinante(" B1");
                        ClaseDatosPythonJava.vaciar_etiquetas();

                        // Llamar función Python y especificar parámetros si existen
                        PyObject pyov_no_canonica_b2 = py.getModule("main_determinar_base2");
                        Object respuesta_pro2_b2 = pyov_no_canonica_b2.callAttr("main");
                        result_2 =get_resultados_determinante(" B2");
                        resultado_base.setText("Base 1"+ "\n" + result_1 + "\n"  + "Base 2"+ "\n" + result_2);
                        ClaseDatosPythonJava.vaciar_etiquetas();

                        // Llamar función Python y especificar parámetros si existen
                        PyObject py_cambio_base = py.getModule("main_base_change");
                        Object res_cambio_base_pro2  = py_cambio_base.callAttr("main");
                        etiqueta_Resultado.setLatex(ClaseDatosPythonJava.latexMatriz);
                        ClaseDatosPythonJava.dinamicSetvalue(" - " +  result_1 + "\n - " + result_2,"");
                        Intent ortonormal_procedimiento = new Intent(getApplicationContext(), Procedimiento.class);
                        startActivity(ortonormal_procedimiento);
                    }
                }
            }
        });

        /* if (v_canonico.isChecked()){
            Toast.makeText(getApplicationContext() , "is true", Toast.LENGTH_SHORT).show();
            ClaseDatosPythonJava.v_canonico="Y";
        }else{
            Toast.makeText(getApplicationContext() , "is false", Toast.LENGTH_SHORT).show();
            ClaseDatosPythonJava.v_canonico="N";
        }  */
        inicio_pantalla();
        inicio_pantalla_no_canonico();
        ClaseDatosPythonJava.v_where_base = "Canonica";
        ClaseDatosPythonJava.tamano_vector=0;
        ClaseDatosPythonJava.componentes=0;
        rad_canonica.setChecked(true);
        etiqueta_Resultado.setLatex("");
        resultado_base.setText("");
        editText_v_dato1.setText("");
        editText_v_dato2.setText("");
        editText_v_dato3.setText("");
        editText_v_dato4.setText("");
    }

    public String get_resultados_determinante( String p_base){
        String cadena_d ="";
        String cadena_g ="";
        String result ="";

        if ( ClaseDatosPythonJava.valida_base ==1 ) {
            cadena_d =  ClaseDatosPythonJava.v_independiente ;
        }else{
            cadena_d =  ClaseDatosPythonJava.v_independiente ;
        }

        if ( ClaseDatosPythonJava.genera_base == 1 ) {
            cadena_g =  "El conjunto de vectores si genera a R" + ClaseDatosPythonJava.tamano_vector;
        }else{
            cadena_g =  "El conjunto de vectores no genera a R" + ClaseDatosPythonJava.tamano_vector;
        }

        if ( ClaseDatosPythonJava.valida_base == 1 && ClaseDatosPythonJava.genera_base == 1  ) {
            //resultado_tamano.setText(  " Si es base  ");
            result = " Si es base " + p_base + "\n "  + cadena_d + "\n " + cadena_g;
        }else {
            //resultado_tamano.setText(  " No es base  ");
            result = " No es base "  + p_base + "\n "  + cadena_d + "\n " + cadena_g;
        }
        return result;
    }

    public void Onclick(View view){
        if (view.getId()==R.id.switch1){
            if (v_canonico.isChecked()){
                Toast.makeText(getApplicationContext() , "is true", Toast.LENGTH_SHORT).show();
                ClaseDatosPythonJava.v_canonico="Y";
            }else{
                Toast.makeText(getApplicationContext() , "is false", Toast.LENGTH_SHORT).show();
                ClaseDatosPythonJava.v_canonico="N";
            }
        }
        if (view.getId()==R.id.radbtn_b1){
                rad_base1.setChecked(true);
                rad_base2.setChecked(false);
                rad_canonica.setChecked(false);
                ClaseDatosPythonJava.v_where_base="B1";
            Toast.makeText(getApplicationContext() , "BASE 1", Toast.LENGTH_SHORT).show();
            asignar_tamaños_vectores();
            asignar_tamaños_vectores_no_canonica();
        }
        if (view.getId()==R.id.radbtn_b2){
            rad_base2.setChecked(true);
            rad_base1.setChecked(false);
            rad_canonica.setChecked(false);
            ClaseDatosPythonJava.v_where_base="B2";
            Toast.makeText(getApplicationContext() , "BASE 2", Toast.LENGTH_SHORT).show();
            asignar_tamaños_vectores();
            asignar_tamaños_vectores_no_canonica();
        }
        if (view.getId()==R.id.radbtn_canonica){
            ClaseDatosPythonJava.v_where_base="Canonica";
            rad_base2.setChecked(false);
            rad_base1.setChecked(false);
            rad_canonica.setChecked(true);
            Toast.makeText(getApplicationContext() , "Canonica", Toast.LENGTH_SHORT).show();
            asignar_tamaños_vectores();
            inicio_pantalla_no_canonico();
        }
    }


    public  void f_limpiar_pantalla(View  view){
        inicio_pantalla();
        inicio_pantalla_no_canonico();
        ClaseDatosPythonJava.v_where_base = "Canonica";
        ClaseDatosPythonJava.vaciar_etiquetas();
        ClaseDatosPythonJava.tamano_vector=0;
        ClaseDatosPythonJava.componentes=0;
        resultado_base.setText("");
        etiqueta_Resultado.setLatex("");
        rad_canonica.setChecked(true);
        editText_v_dato1.setText("");
        editText_v_dato2.setText("");
        editText_v_dato3.setText("");
        editText_v_dato4.setText("");
}

    private Boolean v_vect( Pattern pat,String v_vect){
        Boolean validacion = false;
        String vector_valor;
        vector_valor = v_vect;
        Matcher mat1 = pat.matcher(vector_valor);
        validacion   = mat1.matches();
        if (vector_valor.equals("")){validacion =true;}
        return validacion;
    }

    public Boolean f_tamaño(){
        Pattern pat = Pattern.compile("[a-zA-z\\s;#]");
        Boolean validacion = false;
        ClaseDatosPythonJava.tamano_vector=0;
        String v1_d1,v1_d2,v1_d3,v1_d4;
        v1_d1="";
        v1_d2="";
        v1_d3="";
        v1_d4="";
        v1_d1 =editText_v_dato1.getText().toString();
        validacion   = v_vect(pat,v1_d1);

        if (!validacion){
            ClaseDatosPythonJava.tamano_vector=1;
            v1_d2 = editText_v_dato2.getText().toString();
            validacion   = v_vect(pat,v1_d2);

            if (!validacion){
                ClaseDatosPythonJava.tamano_vector=2;
                v1_d3 = editText_v_dato3.getText().toString();
                validacion   = v_vect(pat,v1_d3);
                if (!validacion){
                    ClaseDatosPythonJava.tamano_vector=3;
                    v1_d4 = editText_v_dato4.getText().toString();
                    validacion   = v_vect(pat,v1_d4);
                    if (!validacion){
                        ClaseDatosPythonJava.tamano_vector=4;
                    }
                }
            }

            }
        String unidas = "Invalido espacios o signos tam:" + ClaseDatosPythonJava.tamano_vector +
                " v1:" + v1_d1 + " v2:" + v1_d2 + " v3:" + v1_d3 + " v4:" + v1_d4 ;
        if ( ClaseDatosPythonJava.tamano_vector > 0){
            int v_ciclo = ClaseDatosPythonJava.tamano_vector;
            Boolean validacion2_2,validacion2_3,validacion2_4;
            validacion2_2 = false;
            validacion2_3 = false;
            validacion2_4 = false;
            if (v_ciclo == 1){
                v1_d2 = editText_v_dato2.getText().toString();
                validacion2_2   = v_vect(pat,v1_d2);
                if (v1_d2.equals("")){validacion2_2 =false;}
                v1_d3 = editText_v_dato3.getText().toString();
                validacion2_3   = v_vect(pat,v1_d3);
                if (v1_d3.equals("")){validacion2_3 =false;}
                v1_d4 = editText_v_dato4.getText().toString();
                validacion2_4   = v_vect(pat,v1_d4);
                if (v1_d4.equals("")){validacion2_4 =false;}
            }
            if (v_ciclo == 2){
                v1_d3 = editText_v_dato3.getText().toString();
                validacion2_3   = v_vect(pat,v1_d3);
                if (v1_d3.equals("")){validacion2_3 =false;}
                v1_d4 = editText_v_dato4.getText().toString();
                validacion2_4   = v_vect(pat,v1_d4);
                if (v1_d4.equals("")){validacion2_4 =false;}
            }

            if (v_ciclo == 3){
                v1_d4 = editText_v_dato4.getText().toString();
                validacion2_4   = v_vect(pat,v1_d4);
                if (v1_d4.equals("")){validacion2_4 =false;}
            }

            if ( validacion2_2 == false && validacion2_3 == false && validacion2_4 == false){
                String vector_canonico[] = new String [ClaseDatosPythonJava.tamano_vector];
                ClaseDatosPythonJava.vector_canonico = vector_canonico;

                if (v_ciclo > 0){ ClaseDatosPythonJava.vector_canonico[0] = (v1_d1);}
                if (v_ciclo > 1){ ClaseDatosPythonJava.vector_canonico[1] = (v1_d2);}
                if (v_ciclo > 2){ ClaseDatosPythonJava.vector_canonico[2] = (v1_d3);}
                if (v_ciclo > 3){ ClaseDatosPythonJava.vector_canonico[3] = (v1_d4);}
                return true;
            }else {
                Toast.makeText(getApplicationContext() , "El vector no se ingreso incorrectamente", Toast.LENGTH_SHORT).show();
                return false;
            }

        }else{
            Toast.makeText(getApplicationContext() , unidas, Toast.LENGTH_SHORT).show();
            //Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector ", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void asignar_tamaños_vectores( ){
        int v_tamano =  ClaseDatosPythonJava.tamano_vector;
        int v_vactores =  ClaseDatosPythonJava.tamano_vector;

        if (v_vactores < 1){
            editText_b1_dato1.setText("");
            editText_b1_dato1.setEnabled(false);
            editText_b1_dato2.setText("");
            editText_b1_dato2.setEnabled(false);
            editText_b1_dato3.setText("");
            editText_b1_dato3.setEnabled(false);
            editText_b1_dato4.setText("");
            editText_b1_dato4.setEnabled(false);
            editText_b1_dato1.setVisibility(View.INVISIBLE);
            editText_b1_dato2.setVisibility(View.INVISIBLE);
            editText_b1_dato3.setVisibility(View.INVISIBLE);
            editText_b1_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 2){
            editText_b2_dato1.setText("");
            editText_b2_dato1.setEnabled(false);
            editText_b2_dato2.setText("");
            editText_b2_dato2.setEnabled(false);
            editText_b2_dato3.setText("");
            editText_b2_dato3.setEnabled(false);
            editText_b2_dato4.setText("");
            editText_b2_dato4.setEnabled(false);
            editText_b2_dato1.setVisibility(View.INVISIBLE);
            editText_b2_dato2.setVisibility(View.INVISIBLE);
            editText_b2_dato3.setVisibility(View.INVISIBLE);
            editText_b2_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 3){
            editText_b3_dato1.setText("");
            editText_b3_dato1.setEnabled(false);
            editText_b3_dato2.setText("");
            editText_b3_dato2.setEnabled(false);
            editText_b3_dato3.setText("");
            editText_b3_dato3.setEnabled(false);
            editText_b3_dato4.setText("");
            editText_b3_dato4.setEnabled(false);
            editText_b3_dato1.setVisibility(View.INVISIBLE);
            editText_b3_dato2.setVisibility(View.INVISIBLE);
            editText_b3_dato3.setVisibility(View.INVISIBLE);
            editText_b3_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 4){
            editText_b4_dato1.setText("");
            editText_b4_dato1.setEnabled(false);
            editText_b4_dato2.setText("");
            editText_b4_dato2.setEnabled(false);
            editText_b4_dato3.setText("");
            editText_b4_dato3.setEnabled(false);
            editText_b4_dato4.setText("");
            editText_b4_dato4.setEnabled(false);
            editText_b4_dato1.setVisibility(View.INVISIBLE);
            editText_b4_dato2.setVisibility(View.INVISIBLE);
            editText_b4_dato3.setVisibility(View.INVISIBLE);
            editText_b4_dato4.setVisibility(View.INVISIBLE);
        }

        if (v_tamano < 1){
            editText_b1_dato1.setText("");
            editText_b1_dato1.setEnabled(false);
            editText_b2_dato1.setText("");
            editText_b2_dato1.setEnabled(false);
            editText_b3_dato1.setText("");
            editText_b3_dato1.setEnabled(false);
            editText_b4_dato1.setText("");
            editText_b4_dato1.setEnabled(false);
            editText_b1_dato1.setVisibility(View.INVISIBLE);
            editText_b2_dato1.setVisibility(View.INVISIBLE);
            editText_b3_dato1.setVisibility(View.INVISIBLE);
            editText_b4_dato1.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 2){
            editText_b1_dato2.setText("");
            editText_b1_dato2.setEnabled(false);
            editText_b2_dato2.setText("");
            editText_b2_dato2.setEnabled(false);
            editText_b3_dato2.setText("");
            editText_b3_dato2.setEnabled(false);
            editText_b4_dato2.setText("");
            editText_b4_dato2.setEnabled(false);
            editText_b1_dato2.setVisibility(View.INVISIBLE);
            editText_b2_dato2.setVisibility(View.INVISIBLE);
            editText_b3_dato2.setVisibility(View.INVISIBLE);
            editText_b4_dato2.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 3){
            editText_b1_dato3.setText("");
            editText_b1_dato3.setEnabled(false);
            editText_b2_dato3.setText("");
            editText_b2_dato3.setEnabled(false);
            editText_b3_dato3.setText("");
            editText_b3_dato3.setEnabled(false);
            editText_b4_dato3.setText("");
            editText_b4_dato3.setEnabled(false);
            editText_b1_dato3.setVisibility(View.INVISIBLE);
            editText_b2_dato3.setVisibility(View.INVISIBLE);
            editText_b3_dato3.setVisibility(View.INVISIBLE);
            editText_b4_dato3.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 4){
            editText_b1_dato4.setText("");
            editText_b1_dato4.setEnabled(false);
            editText_b2_dato4.setText("");
            editText_b2_dato4.setEnabled(false);
            editText_b3_dato4.setText("");
            editText_b3_dato4.setEnabled(false);
            editText_b4_dato4.setText("");
            editText_b4_dato4.setEnabled(false);
            editText_b1_dato4.setVisibility(View.INVISIBLE);
            editText_b2_dato4.setVisibility(View.INVISIBLE);
            editText_b3_dato4.setVisibility(View.INVISIBLE);
            editText_b4_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 1){
            linea_vector_1.setVisibility(View.GONE);
        }
        if (v_vactores < 2){
            linea_vector_2.setVisibility(View.GONE);
        }
        if (v_vactores < 3){
            linea_vector_3.setVisibility(View.GONE);
        }
        if (v_vactores < 4){
            linea_vector_4.setVisibility(View.GONE);
        }
        if (v_vactores >= 1){
            linea_vector_1.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 2){
            linea_vector_2.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 3){
            linea_vector_3.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 4){
            linea_vector_4.setVisibility(View.VISIBLE);
        }

        //habilitar si es mayor
        if (v_tamano > 0){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText_b1_dato1.setEnabled(true);
                editText_b1_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText_b2_dato1.setEnabled(true);
                editText_b2_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText_b3_dato1.setEnabled(true);
                editText_b3_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText_b4_dato1.setEnabled(true);
                editText_b4_dato1.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 1){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText_b1_dato2.setEnabled(true);
                editText_b1_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText_b2_dato2.setEnabled(true);
                editText_b2_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText_b3_dato2.setEnabled(true);
                editText_b3_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText_b4_dato2.setEnabled(true);
                editText_b4_dato2.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 2){
            if (v_vactores >= 1){
                editText_b1_dato3.setEnabled(true);
                editText_b1_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText_b2_dato3.setEnabled(true);
                editText_b2_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText_b3_dato3.setEnabled(true);
                editText_b3_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText_b4_dato3.setEnabled(true);
                editText_b4_dato3.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 3){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText_b1_dato4.setEnabled(true);
                editText_b1_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText_b2_dato4.setEnabled(true);
                editText_b2_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText_b3_dato4.setEnabled(true);
                editText_b3_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText_b4_dato4.setEnabled(true);
                editText_b4_dato4.setVisibility(View.VISIBLE);
            }
        }

    }


    public void asignar_tamaños_vectores_no_canonica( ){
        int v_tamano =  ClaseDatosPythonJava.tamano_vector;
        int v_vactores =  ClaseDatosPythonJava.tamano_vector;

        if (v_vactores < 1){
           editText2_b1_dato1.setText("");
           editText2_b1_dato1.setEnabled(false);
           editText2_b1_dato2.setText("");
           editText2_b1_dato2.setEnabled(false);
           editText2_b1_dato3.setText("");
           editText2_b1_dato3.setEnabled(false);
           editText2_b1_dato4.setText("");
           editText2_b1_dato4.setEnabled(false);
            editText2_b1_dato1.setVisibility(View.INVISIBLE);
            editText2_b1_dato2.setVisibility(View.INVISIBLE);
            editText2_b1_dato3.setVisibility(View.INVISIBLE);
            editText2_b1_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 2){
           editText2_b2_dato1.setText("");
           editText2_b2_dato1.setEnabled(false);
           editText2_b2_dato2.setText("");
           editText2_b2_dato2.setEnabled(false);
           editText2_b2_dato3.setText("");
           editText2_b2_dato3.setEnabled(false);
           editText2_b2_dato4.setText("");
           editText2_b2_dato4.setEnabled(false);
           editText2_b2_dato1.setVisibility(View.INVISIBLE);
           editText2_b2_dato2.setVisibility(View.INVISIBLE);
           editText2_b2_dato3.setVisibility(View.INVISIBLE);
           editText2_b2_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 3){
           editText2_b3_dato1.setText("");
           editText2_b3_dato1.setEnabled(false);
           editText2_b3_dato2.setText("");
           editText2_b3_dato2.setEnabled(false);
           editText2_b3_dato3.setText("");
           editText2_b3_dato3.setEnabled(false);
           editText2_b3_dato4.setText("");
           editText2_b3_dato4.setEnabled(false);
           editText2_b3_dato1.setVisibility(View.INVISIBLE);
           editText2_b3_dato2.setVisibility(View.INVISIBLE);
           editText2_b3_dato3.setVisibility(View.INVISIBLE);
           editText2_b3_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 4){
           editText2_b4_dato1.setText("");
           editText2_b4_dato1.setEnabled(false);
           editText2_b4_dato2.setText("");
           editText2_b4_dato2.setEnabled(false);
           editText2_b4_dato3.setText("");
           editText2_b4_dato3.setEnabled(false);
           editText2_b4_dato4.setText("");
           editText2_b4_dato4.setEnabled(false);
           editText2_b4_dato1.setVisibility(View.INVISIBLE);
           editText2_b4_dato2.setVisibility(View.INVISIBLE);
           editText2_b4_dato3.setVisibility(View.INVISIBLE);
           editText2_b4_dato4.setVisibility(View.INVISIBLE);
        }

        if (v_tamano < 1){
           editText2_b1_dato1.setText("");
           editText2_b1_dato1.setEnabled(false);
           editText2_b2_dato1.setText("");
           editText2_b2_dato1.setEnabled(false);
           editText2_b3_dato1.setText("");
           editText2_b3_dato1.setEnabled(false);
           editText2_b4_dato1.setText("");
           editText2_b4_dato1.setEnabled(false);
           editText2_b1_dato1.setVisibility(View.INVISIBLE);
           editText2_b2_dato1.setVisibility(View.INVISIBLE);
           editText2_b3_dato1.setVisibility(View.INVISIBLE);
           editText2_b4_dato1.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 2){
           editText2_b1_dato2.setText("");
           editText2_b1_dato2.setEnabled(false);
           editText2_b2_dato2.setText("");
           editText2_b2_dato2.setEnabled(false);
           editText2_b3_dato2.setText("");
           editText2_b3_dato2.setEnabled(false);
           editText2_b4_dato2.setText("");
           editText2_b4_dato2.setEnabled(false);
           editText2_b1_dato2.setVisibility(View.INVISIBLE);
           editText2_b2_dato2.setVisibility(View.INVISIBLE);
           editText2_b3_dato2.setVisibility(View.INVISIBLE);
           editText2_b4_dato2.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 3){
           editText2_b1_dato3.setText("");
           editText2_b1_dato3.setEnabled(false);
           editText2_b2_dato3.setText("");
           editText2_b2_dato3.setEnabled(false);
           editText2_b3_dato3.setText("");
           editText2_b3_dato3.setEnabled(false);
           editText2_b4_dato3.setText("");
           editText2_b4_dato3.setEnabled(false);
           editText2_b1_dato3.setVisibility(View.INVISIBLE);
           editText2_b2_dato3.setVisibility(View.INVISIBLE);
           editText2_b3_dato3.setVisibility(View.INVISIBLE);
           editText2_b4_dato3.setVisibility(View.INVISIBLE);
        }
        if (v_tamano < 4){
           editText2_b1_dato4.setText("");
           editText2_b1_dato4.setEnabled(false);
           editText2_b2_dato4.setText("");
           editText2_b2_dato4.setEnabled(false);
           editText2_b3_dato4.setText("");
           editText2_b3_dato4.setEnabled(false);
           editText2_b4_dato4.setText("");
           editText2_b4_dato4.setEnabled(false);
           editText2_b1_dato4.setVisibility(View.INVISIBLE);
           editText2_b2_dato4.setVisibility(View.INVISIBLE);
           editText2_b3_dato4.setVisibility(View.INVISIBLE);
           editText2_b4_dato4.setVisibility(View.INVISIBLE);
        }
        if (v_vactores < 1){
            linea2_vector_1.setVisibility(View.GONE);
        }
        if (v_vactores < 2){
            linea2_vector_2.setVisibility(View.GONE);
        }
        if (v_vactores < 3){
            linea2_vector_3.setVisibility(View.GONE);
        }
        if (v_vactores < 4){
            linea2_vector_4.setVisibility(View.GONE);
        }
        if (v_vactores >= 1){
            linea2_vector_1.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 2){
            linea2_vector_2.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 3){
            linea2_vector_3.setVisibility(View.VISIBLE);
        }
        if (v_vactores >= 4){
            linea2_vector_4.setVisibility(View.VISIBLE);
        }
        //habilitar si es mayor
        if (v_tamano > 0){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText2_b1_dato1.setEnabled(true);
                editText2_b1_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText2_b2_dato1.setEnabled(true);
                editText2_b2_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
               editText2_b3_dato1.setEnabled(true);
               editText2_b3_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
               editText2_b4_dato1.setEnabled(true);
               editText2_b4_dato1.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 1){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText2_b1_dato2.setEnabled(true);
                editText2_b1_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText2_b2_dato2.setEnabled(true);
                editText2_b2_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText2_b3_dato2.setEnabled(true);
                editText2_b3_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText2_b4_dato2.setEnabled(true);
                editText2_b4_dato2.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 2){
            if (v_vactores >= 1){
                editText2_b1_dato3.setEnabled(true);
                editText2_b1_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText2_b2_dato3.setEnabled(true);
                editText2_b2_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText2_b3_dato3.setEnabled(true);
                editText2_b3_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText2_b4_dato3.setEnabled(true);
                editText2_b4_dato3.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 3){
            if (v_vactores >= 1){ //editText_b1_dato4.setText("");
                editText2_b1_dato4.setEnabled(true);
                editText2_b1_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_b2_dato4.setText("");
                editText2_b2_dato4.setEnabled(true);
                editText2_b2_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_b3_dato4.setText("");
                editText2_b3_dato4.setEnabled(true);
                editText2_b3_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_b4_dato4.setText("");
                editText2_b4_dato4.setEnabled(true);
                editText2_b4_dato4.setVisibility(View.VISIBLE);
            }
        }

    }


    public void inicio_pantalla(){

       editText_b1_dato1.setText("");
       editText_b1_dato1.setEnabled(false);
       editText_b1_dato2.setText("");
       editText_b1_dato2.setEnabled(false);
       editText_b1_dato3.setText("");
       editText_b1_dato3.setEnabled(false);
       editText_b1_dato4.setText("");
       editText_b1_dato4.setEnabled(false);

       editText_b2_dato1.setText("");
       editText_b2_dato1.setEnabled(false);
       editText_b2_dato2.setText("");
       editText_b2_dato2.setEnabled(false);
       editText_b2_dato3.setText("");
       editText_b2_dato3.setEnabled(false);
       editText_b2_dato4.setText("");
       editText_b2_dato4.setEnabled(false);

       editText_b3_dato1.setText("");
       editText_b3_dato1.setEnabled(false);
       editText_b3_dato2.setText("");
       editText_b3_dato2.setEnabled(false);
       editText_b3_dato3.setText("");
       editText_b3_dato3.setEnabled(false);
       editText_b3_dato4.setText("");
       editText_b3_dato4.setEnabled(false);

       editText_b4_dato1.setText("");
       editText_b4_dato1.setEnabled(false);
       editText_b4_dato2.setText("");
       editText_b4_dato2.setEnabled(false);
       editText_b4_dato3.setText("");
       editText_b4_dato3.setEnabled(false);
       editText_b4_dato4.setText("");
       editText_b4_dato4.setEnabled(false);

        editText_b1_dato1.setVisibility(View.INVISIBLE);
        editText_b2_dato1.setVisibility(View.INVISIBLE);
        editText_b3_dato1.setVisibility(View.INVISIBLE);
        editText_b4_dato1.setVisibility(View.INVISIBLE);

        editText_b1_dato2.setVisibility(View.INVISIBLE);
        editText_b2_dato2.setVisibility(View.INVISIBLE);
        editText_b3_dato2.setVisibility(View.INVISIBLE);
        editText_b4_dato2.setVisibility(View.INVISIBLE);

        editText_b1_dato3.setVisibility(View.INVISIBLE);
        editText_b2_dato3.setVisibility(View.INVISIBLE);
        editText_b3_dato3.setVisibility(View.INVISIBLE);
        editText_b4_dato3.setVisibility(View.INVISIBLE);

        editText_b1_dato4.setVisibility(View.INVISIBLE);
        editText_b2_dato4.setVisibility(View.INVISIBLE);
        editText_b3_dato4.setVisibility(View.INVISIBLE);
        editText_b4_dato4.setVisibility(View.INVISIBLE);

        linea_vector_1.setVisibility(View.GONE);
        linea_vector_2.setVisibility(View.GONE);
        linea_vector_3.setVisibility(View.GONE);
        linea_vector_4.setVisibility(View.GONE);
/////////////////////////////////////////////////////
        // resultado_base.setText("");
       // textview_resultado.setText("");
        rad_base2.setChecked(false);
        rad_base1.setChecked(false);
        rad_canonica.setChecked(true);
    }

    public void inicio_pantalla_no_canonico(){
        editText2_b1_dato1.setText("");
        editText2_b1_dato1.setEnabled(false);
        editText2_b1_dato2.setText("");
        editText2_b1_dato2.setEnabled(false);
        editText2_b1_dato3.setText("");
        editText2_b1_dato3.setEnabled(false);
        editText2_b1_dato4.setText("");
        editText2_b1_dato4.setEnabled(false);

        editText2_b2_dato1.setText("");
        editText2_b2_dato1.setEnabled(false);
        editText2_b2_dato2.setText("");
        editText2_b2_dato2.setEnabled(false);
        editText2_b2_dato3.setText("");
        editText2_b2_dato3.setEnabled(false);
        editText2_b2_dato4.setText("");
        editText2_b2_dato4.setEnabled(false);

        editText2_b3_dato1.setText("");
        editText2_b3_dato1.setEnabled(false);
        editText2_b3_dato2.setText("");
        editText2_b3_dato2.setEnabled(false);
        editText2_b3_dato3.setText("");
        editText2_b3_dato3.setEnabled(false);
        editText2_b3_dato4.setText("");
        editText2_b3_dato4.setEnabled(false);

        editText2_b4_dato1.setText("");
        editText2_b4_dato1.setEnabled(false);
        editText2_b4_dato2.setText("");
        editText2_b4_dato2.setEnabled(false);
        editText2_b4_dato3.setText("");
        editText2_b4_dato3.setEnabled(false);
        editText2_b4_dato4.setText("");
        editText2_b4_dato4.setEnabled(false);


        editText2_b1_dato1.setVisibility(View.INVISIBLE);
        editText2_b2_dato1.setVisibility(View.INVISIBLE);
        editText2_b3_dato1.setVisibility(View.INVISIBLE);
        editText2_b4_dato1.setVisibility(View.INVISIBLE);

        editText2_b1_dato2.setVisibility(View.INVISIBLE);
        editText2_b2_dato2.setVisibility(View.INVISIBLE);
        editText2_b3_dato2.setVisibility(View.INVISIBLE);
        editText2_b4_dato2.setVisibility(View.INVISIBLE);

        editText2_b1_dato3.setVisibility(View.INVISIBLE);
        editText2_b2_dato3.setVisibility(View.INVISIBLE);
        editText2_b3_dato3.setVisibility(View.INVISIBLE);
        editText2_b4_dato3.setVisibility(View.INVISIBLE);

        editText2_b1_dato4.setVisibility(View.INVISIBLE);
        editText2_b2_dato4.setVisibility(View.INVISIBLE);
        editText2_b3_dato4.setVisibility(View.INVISIBLE);
        editText2_b4_dato4.setVisibility(View.INVISIBLE);

        linea2_vector_1.setVisibility(View.GONE);
        linea2_vector_2.setVisibility(View.GONE);
        linea2_vector_3.setVisibility(View.GONE);
        linea2_vector_4.setVisibility(View.GONE);
    }

///------------------------------------------|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    public Boolean get_elemts_pantalla(int v_tamano,int n_vectores) {
        Pattern pat = Pattern.compile("[a-zA-z\\s;#]");

        int v_ciclo = ClaseDatosPythonJava.tamano_vector-1;
        String vector_dinamic[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 0){
            try {
                Boolean validacion = false;
                if (v_tamano > 0){
                    String v1_d1 = editText_b1_dato1.getText().toString();
                    Matcher mat1 = pat.matcher(v1_d1);
                    validacion   = mat1.matches();
                    if (v1_d1.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 1 && !validacion  ){
                    String v1_d2 = editText_b1_dato2.getText().toString();
                    Matcher mat2 = pat.matcher(v1_d2);
                    validacion   = mat2.matches();
                    if (v1_d2.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 2 && !validacion){
                    String v1_d3 = editText_b1_dato3.getText().toString();
                    Matcher mat3 = pat.matcher(v1_d3);
                    validacion   = mat3.matches();
                    if (v1_d3.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 3 && !validacion){
                    String v1_d4 = editText_b1_dato4.getText().toString();
                    Matcher mat4 = pat.matcher(v1_d4);
                    validacion   = mat4.matches();
                    if (v1_d4.equals("")){
                        validacion =true;}
                }

                if (validacion ) {
                    System.out.println("SIN letras  " + v_tamano);
                    Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  1", Toast.LENGTH_SHORT).show();
                    return  false;
                } else {
                    System.out.println("NO letras :" + v_tamano);
                    ClaseDatosPythonJava.d_vector1 = vector_dinamic;
                    if (v_tamano > 0){ ClaseDatosPythonJava.d_vector1[0] = (editText_b1_dato1.getText().toString());}
                    if (v_tamano > 1){ ClaseDatosPythonJava.d_vector1[1] = (editText_b1_dato2.getText().toString());}
                    if (v_tamano > 2){ ClaseDatosPythonJava.d_vector1[2] = (editText_b1_dato3.getText().toString());}
                    if (v_tamano > 3){ ClaseDatosPythonJava.d_vector1[3] = (editText_b1_dato4.getText().toString());}
                }
            }catch (Error e) {
                Toast.makeText(getApplicationContext() , "Ingrese todos los campos", Toast.LENGTH_SHORT).show();
            }

        }
        String vector_dinamic2[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 1) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v2_d1 =editText_b2_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v2_d1);
                validacion = mat1.matches();
                if (v2_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v2_d2 =editText_b2_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v2_d2);
                validacion = mat2.matches();
                if (v2_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v2_d3 =editText_b2_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v2_d3);
                validacion = mat3.matches();
                if (v2_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v2_d4 =editText_b2_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v2_d4);
                validacion = mat4.matches();
                if (v2_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  2", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector2 = vector_dinamic2;
                if (v_tamano > 0){ ClaseDatosPythonJava.d_vector2[0] = (editText_b2_dato1.getText().toString());}
                if (v_tamano > 1){ ClaseDatosPythonJava.d_vector2[1] = (editText_b2_dato2.getText().toString());}
                if (v_tamano > 2){ ClaseDatosPythonJava.d_vector2[2] = (editText_b2_dato3.getText().toString());}
                if (v_tamano > 3){ ClaseDatosPythonJava.d_vector2[3] = (editText_b2_dato4.getText().toString());}
            }

        }
        String vector_dinamic3[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 2) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v3_d1 =editText_b3_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v3_d1);
                validacion = mat1.matches();
                if (v3_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v3_d2 =editText_b3_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v3_d2);
                validacion = mat2.matches();
                if (v3_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v3_d3 =editText_b3_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v3_d3);
                validacion = mat3.matches();
                if (v3_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v3_d4 =editText_b3_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v3_d4);
                validacion = mat4.matches();
                if (v3_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  3", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector3 = vector_dinamic3;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d_vector3[0] = (editText_b3_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d_vector3[1] = (editText_b3_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d_vector3[2] = (editText_b3_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d_vector3[3] = (editText_b3_dato4.getText().toString());
                }
            }
        }
        String vector_dinamic4[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 3) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v4_d1 =editText_b4_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v4_d1);
                validacion = mat1.matches();
                if (v4_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v4_d2 =editText_b4_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v4_d2);
                validacion = mat2.matches();
                if (v4_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v4_d3 =editText_b4_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v4_d3);
                validacion = mat3.matches();
                if (v4_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v4_d4 =editText_b4_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v4_d4);
                validacion = mat4.matches();
                if (v4_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SIN letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  4", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector4 = vector_dinamic4;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d_vector4[0] = (editText_b4_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d_vector4[1] = (editText_b4_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d_vector4[2] = (editText_b4_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d_vector4[3] = (editText_b4_dato4.getText().toString());
                }
            }
        }
        return  true;


    }

    ///------------------------------------------|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    public Boolean get_elemts_pantalla_no_canonico(int v_tamano,int n_vectores) {
        Pattern pat = Pattern.compile("[a-zA-z\\s;#]");

        int v_ciclo = ClaseDatosPythonJava.tamano_vector-1;
        String vector_dinamic[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 0){
            try {
                Boolean validacion = false;
                if (v_tamano > 0){
                    String v1_d1 = editText2_b1_dato1.getText().toString();
                    Matcher mat1 = pat.matcher(v1_d1);
                    validacion   = mat1.matches();
                    if (v1_d1.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 1 && !validacion  ){
                    String v1_d2 = editText2_b1_dato2.getText().toString();
                    Matcher mat2 = pat.matcher(v1_d2);
                    validacion   = mat2.matches();
                    if (v1_d2.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 2 && !validacion){
                    String v1_d3 = editText2_b1_dato3.getText().toString();
                    Matcher mat3 = pat.matcher(v1_d3);
                    validacion   = mat3.matches();
                    if (v1_d3.equals("")){
                        validacion =true;}
                }
                if (v_tamano > 3 && !validacion){
                    String v1_d4 = editText2_b1_dato4.getText().toString();
                    Matcher mat4 = pat.matcher(v1_d4);
                    validacion   = mat4.matches();
                    if (v1_d4.equals("")){
                        validacion =true;}
                }

                if (validacion ) {
                    System.out.println("SIN letras");
                    Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  1", Toast.LENGTH_SHORT).show();
                    return  false;
                } else {
                    System.out.println("NO letras");
                    ClaseDatosPythonJava.d2_vector1 = vector_dinamic;
                    if (v_tamano > 0){ ClaseDatosPythonJava.d2_vector1[0] = (editText2_b1_dato1.getText().toString());}
                    if (v_tamano > 1){ ClaseDatosPythonJava.d2_vector1[1] = (editText2_b1_dato2.getText().toString());}
                    if (v_tamano > 2){ ClaseDatosPythonJava.d2_vector1[2] = (editText2_b1_dato3.getText().toString());}
                    if (v_tamano > 3){ ClaseDatosPythonJava.d2_vector1[3] = (editText2_b1_dato4.getText().toString());}
                }
            }catch (Error e) {
                Toast.makeText(getApplicationContext() , "Ingrese todos los campos", Toast.LENGTH_SHORT).show();
            }

        }
        String vector_dinamic2[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 1) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v2_d1 =editText2_b2_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v2_d1);
                validacion = mat1.matches();
                if (v2_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v2_d2 =editText2_b2_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v2_d2);
                validacion = mat2.matches();
                if (v2_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v2_d3 =editText2_b2_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v2_d3);
                validacion = mat3.matches();
                if (v2_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v2_d4 =editText2_b2_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v2_d4);
                validacion = mat4.matches();
                if (v2_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  2", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d2_vector2 = vector_dinamic2;
                if (v_tamano > 0){ ClaseDatosPythonJava.d2_vector2[0] = (editText2_b2_dato1.getText().toString());}
                if (v_tamano > 1){ ClaseDatosPythonJava.d2_vector2[1] = (editText2_b2_dato2.getText().toString());}
                if (v_tamano > 2){ ClaseDatosPythonJava.d2_vector2[2] = (editText2_b2_dato3.getText().toString());}
                if (v_tamano > 3){ ClaseDatosPythonJava.d2_vector2[3] = (editText2_b2_dato4.getText().toString());}
            }

        }
        String vector_dinamic3[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 2) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v3_d1 =editText2_b3_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v3_d1);
                validacion = mat1.matches();
                if (v3_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v3_d2 =editText2_b3_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v3_d2);
                validacion = mat2.matches();
                if (v3_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v3_d3 =editText2_b3_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v3_d3);
                validacion = mat3.matches();
                if (v3_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v3_d4 =editText2_b3_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v3_d4);
                validacion = mat4.matches();
                if (v3_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  3", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d2_vector3 = vector_dinamic3;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d2_vector3[0] = (editText2_b3_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d2_vector3[1] = (editText2_b3_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d2_vector3[2] = (editText2_b3_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d2_vector3[3] = (editText2_b3_dato4.getText().toString());
                }
            }
        }
        String vector_dinamic4[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 3) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v4_d1 =editText2_b4_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v4_d1);
                validacion = mat1.matches();
                if (v4_d1.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 1 && !validacion){
                String v4_d2 =editText2_b4_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v4_d2);
                validacion = mat2.matches();
                if (v4_d2.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 2 && !validacion){
                String v4_d3 =editText2_b4_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v4_d3);
                validacion = mat3.matches();
                if (v4_d3.equals("")){
                    validacion =true;}
            }
            if (v_tamano > 3 && !validacion){
                String v4_d4 =editText2_b4_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v4_d4);
                validacion = mat4.matches();
                if (v4_d4.equals("")){
                    validacion =true;}
            }

            if (validacion ) {
                System.out.println("SIN letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  4", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d2_vector4 = vector_dinamic4;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d2_vector4[0] = (editText2_b4_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d2_vector4[1] = (editText2_b4_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d2_vector4[2] = (editText2_b4_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d2_vector4[3] = (editText2_b4_dato4.getText().toString());
                }
            }
        }
        return  true;

    }



}