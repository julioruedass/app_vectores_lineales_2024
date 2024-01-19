package mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.agog.mathdisplay.MTMathView;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.android.AndroidPlatform;
import com.chaquo.python.console.R;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Determinar_base extends AppCompatActivity {

    TextView resultado_tamano;
    EditText textNumber_componentes;
    EditText textNumber_tamano_vectores;
    EditText editText_v1_dato1;
    EditText editText_v1_dato2;
    EditText editText_v1_dato3;
    EditText editText_v1_dato4;
    EditText editText_v2_dato1;
    EditText editText_v2_dato2;
    EditText editText_v2_dato3;
    EditText editText_v2_dato4;
    EditText editText_v3_dato1;
    EditText editText_v3_dato2;
    EditText editText_v3_dato3;
    EditText editText_v3_dato4;
    EditText editText_v4_dato1;
    EditText editText_v4_dato2;
    EditText editText_v4_dato3;
    EditText editText_v4_dato4;
    TextView textview_resultado;
    TextView textview_procedimiento;
    Button button_resultado;
    Button button_limpiar;

    Button button_procedimiento;
    Button button_establecer;

    MTMathView mathView_formula1;
    LinearLayout linea_vector_1, linea_vector_2, linea_vector_3, linea_vector_4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_determinar_base);
        /*Numero de vectores*/
        textNumber_componentes = findViewById(R.id.edittext_numero_componentes);
        textNumber_tamano_vectores = findViewById(R.id.editText_tamano_vectores);
        resultado_tamano = findViewById(R.id.textview_valido_vector);
        /*vector1*/
        editText_v1_dato1 = findViewById(R.id.editText_v1_dato1);
        editText_v1_dato2 = findViewById(R.id.editText_v1_dato2);
        editText_v1_dato3 = findViewById(R.id.editText_v1_dato3);
        editText_v1_dato4 = findViewById(R.id.editText_v1_dato4);
        /*vector 2*/
        editText_v2_dato1 = findViewById(R.id.editText_v2_dato1);
        editText_v2_dato2 = findViewById(R.id.editTextT_v2_dato2);
        editText_v2_dato3 = findViewById(R.id.editText_v2_dato3);
        editText_v2_dato4 = findViewById(R.id.editText_v2_dato4);
        /*vector 3*/
        editText_v3_dato1 = findViewById(R.id.editText_v3_dato1);
        editText_v3_dato2 = findViewById(R.id.editText_v3_dato2);
        editText_v3_dato3 = findViewById(R.id.editText_v3_dato3);
        editText_v3_dato4 = findViewById(R.id.editText_v3_dato4);
        /*vector 4*/
        editText_v4_dato1 = findViewById(R.id.editText_v4_dato1);
        editText_v4_dato2 = findViewById(R.id.editText_v4_dato2);
        editText_v4_dato3 = findViewById(R.id.editText_v4_dato3);
        editText_v4_dato4 = findViewById(R.id.editText_v4_dato4);

        button_establecer = findViewById(R.id.button_numero_vectores);
        button_resultado = findViewById(R.id.button_resultadoOrtonormal);
        button_limpiar = findViewById(R.id.button_limpiarOrtonormal);

        textview_resultado = findViewById(R.id.textView9);
        button_procedimiento = findViewById(R.id.button_procedimientoOrtonormal);

        linea_vector_1 = findViewById(R.id.v_row_v1);
        linea_vector_2 = findViewById(R.id.v_row_v2);
        linea_vector_3 = findViewById(R.id.v_row_v3);
        linea_vector_4 = findViewById(R.id.v_row_v4);

      /*  mathView_formula1 = findViewById(R.id.mathviewFormula1);
        mathView_formula1.setFontSize(40);
        mathView_formula1.setScrollContainer(true);*/

        // Revisar si Python está iniciado
        if (!Python.isStarted()) {
            Python.start(new AndroidPlatform(this));
        }
        // Obtener una instancia Python, punto de inicio para enlace Java-Python
        final Python py = Python.getInstance();

        /*metodos de escucha de botones ala espera de un clic*/
        button_procedimiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClaseDatosPythonJava.vaciar_etiquetas();
                if(get_elemts_tamano()){
                    //Obtener datos a clase datos
                    if (get_elemts_pantalla(ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.componentes))
                    {
                        ClaseDatosPythonJava.procedimiento = 0;
                        // Llamar función Python y especificar parámetros si existen
                        PyObject pyov_validar = py.getModule("main_determinar_base");
                        Object respuesta = pyov_validar.callAttr("main");
                        Intent determinar_base = new Intent(getApplicationContext(), Procedimiento.class);
                        startActivity(determinar_base);
                        String result ="";
                        result = get_resultados_determinante();
                        ClaseDatosPythonJava.dinamicSetvalue(" - " +  result,"");
                        textview_resultado.setText(result);

                    }else{
                        resultado_tamano.setText("Datos invalidos");
                    }
                }else{
                    resultado_tamano.setText("Invalido");
                    textNumber_componentes.setText("");
                    textNumber_tamano_vectores.setText("");
                }
            }
        });

        /*clic al boton de resultado*/
        button_resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ClaseDatosPythonJava.vaciar_etiquetas();
                if(get_elemts_tamano()){
                    //Obtener datos a clase datos
                    if (get_elemts_pantalla(ClaseDatosPythonJava.tamano_vector, ClaseDatosPythonJava.componentes))
                    {
                        ClaseDatosPythonJava.procedimiento = 0;
                        // Llamar función Python y especificar parámetros si existen
                        PyObject pyov_validar = py.getModule("main_determinar_base");
                        Object respuesta = pyov_validar.callAttr("main");
                        String result ="";
                        result = get_resultados_determinante();
                        ClaseDatosPythonJava.dinamicSetvalue(" - " +  result,"");
                        textview_resultado.setText(result);
                    }else{
                        resultado_tamano.setText("Datos invalidos");
                    }

                }else{
                    resultado_tamano.setText("Invalido");
                    textNumber_componentes.setText("");
                    textNumber_tamano_vectores.setText("");
                }
            }
        });

        /*clic al boton de limpiar*/
        button_limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textview_resultado.setText("");
                resultado_tamano.setText("");
                textNumber_componentes.setText("");
                textNumber_tamano_vectores.setText("");

                ClaseDatosPythonJava.vaciar_etiquetas();
                inicio_pantalla();

            }
        });

        /*clic al boton de logitud*/
        button_establecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(get_elemts_tamano()){
                    asignar_tamaños_vectores(ClaseDatosPythonJava.tamano_vector,ClaseDatosPythonJava.componentes);
                    resultado_tamano.setText("Valido");
                }else{
                    resultado_tamano.setText("Invalido");
                    textNumber_componentes.setText("");
                    textNumber_tamano_vectores.setText("");
                }
            }
        });
        ClaseDatosPythonJava.vaciar_etiquetas();
        inicio_pantalla();
    }

    public String get_resultados_determinante(){
        String cadena_d = "";
        String cadena_g = "";
        String result   = "";
        cadena_d        =  ClaseDatosPythonJava.v_independiente ;

        if ( ClaseDatosPythonJava.genera_base == 1 ) {
            cadena_g =  "El conjunto de vectores si genera a R" + ClaseDatosPythonJava.tamano_vector;
        }else{
            cadena_g =  "El conjunto de vectores no genera a R" + ClaseDatosPythonJava.tamano_vector;
        }

        if ( ClaseDatosPythonJava.valida_base == 1 && ClaseDatosPythonJava.genera_base == 1  ) {
            resultado_tamano.setText(  " Si es base  ");
            result ="Si es base \n" + cadena_d + "\n " + cadena_g;
        }else {
            resultado_tamano.setText(  " No es base  ");
            result ="No es base \n" + cadena_d + "\n " + cadena_g;
        }
        return result;
    }

    public Boolean get_elemts_pantalla(int v_tamano,int n_vectores) {
        Pattern pat = Pattern.compile("[a-zA-z\\s;#]");



        int v_ciclo = ClaseDatosPythonJava.tamano_vector-1;
        String vector_dinamic[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 0){
            Boolean validacion = false;
            if (v_tamano > 0){
                String v1_d1 =editText_v1_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v1_d1);
                validacion = mat1.matches();}
            if (v_tamano > 1 && !validacion){
                String v1_d2 =editText_v1_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v1_d2);
                validacion = mat2.matches();                }
            if (v_tamano > 2 && !validacion){
                String v1_d3 =editText_v1_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v1_d3);
                validacion = mat3.matches();                }
            if (v_tamano > 3 && !validacion){
                String v1_d4 =editText_v1_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v1_d4);
                validacion = mat4.matches();                }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  1", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector1 = vector_dinamic;
                if (v_tamano > 0){ ClaseDatosPythonJava.d_vector1[0] = (editText_v1_dato1.getText().toString());}
                if (v_tamano > 1){ ClaseDatosPythonJava.d_vector1[1] = (editText_v1_dato2.getText().toString());}
                if (v_tamano > 2){ ClaseDatosPythonJava.d_vector1[2] = (editText_v1_dato3.getText().toString());}
                if (v_tamano > 3){ ClaseDatosPythonJava.d_vector1[3] = (editText_v1_dato4.getText().toString());}
            }

        }
        String vector_dinamic2[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 1) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v2_d1 =editText_v2_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v2_d1);
                validacion = mat1.matches();}
            if (v_tamano > 1 && !validacion){
                String v2_d2 =editText_v2_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v2_d2);
                validacion = mat2.matches();                }
            if (v_tamano > 2 && !validacion){
                String v2_d3 =editText_v2_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v2_d3);
                validacion = mat3.matches();                }
            if (v_tamano > 3 && !validacion){
                String v2_d4 =editText_v2_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v2_d4);
                validacion = mat4.matches();                }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  2", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector2 = vector_dinamic2;
                if (v_tamano > 0){ ClaseDatosPythonJava.d_vector2[0] = (editText_v2_dato1.getText().toString());}
                if (v_tamano > 1){ ClaseDatosPythonJava.d_vector2[1] = (editText_v2_dato2.getText().toString());}
                if (v_tamano > 2){ ClaseDatosPythonJava.d_vector2[2] = (editText_v2_dato3.getText().toString());}
                if (v_tamano > 3){ ClaseDatosPythonJava.d_vector2[3] = (editText_v2_dato4.getText().toString());}
            }

        }
        String vector_dinamic3[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 2) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v3_d1 =editText_v3_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v3_d1);
                validacion = mat1.matches();}
            if (v_tamano > 1 && !validacion){
                String v3_d2 =editText_v3_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v3_d2);
                validacion = mat2.matches();                }
            if (v_tamano > 2 && !validacion){
                String v3_d3 =editText_v3_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v3_d3);
                validacion = mat3.matches();                }
            if (v_tamano > 3 && !validacion){
                String v3_d4 =editText_v3_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v3_d4);
                validacion = mat4.matches();                }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  3", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector3 = vector_dinamic3;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d_vector3[0] = (editText_v3_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d_vector3[1] = (editText_v3_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d_vector3[2] = (editText_v3_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d_vector3[3] = (editText_v3_dato4.getText().toString());
                }
            }
        }
        String vector_dinamic4[] = new String [ClaseDatosPythonJava.tamano_vector];
        if (n_vectores > 3) {
            Boolean validacion = false;
            if (v_tamano > 0){
                String v4_d1 =editText_v3_dato1.getText().toString();
                Matcher mat1 = pat.matcher(v4_d1);
                validacion = mat1.matches();}
            if (v_tamano > 1 && !validacion){
                String v4_d2 =editText_v4_dato2.getText().toString();
                Matcher mat2 = pat.matcher(v4_d2);
                validacion = mat2.matches();                }
            if (v_tamano > 2 && !validacion){
                String v4_d3 =editText_v4_dato3.getText().toString();
                Matcher mat3 = pat.matcher(v4_d3);
                validacion = mat3.matches();                }
            if (v_tamano > 3 && !validacion){
                String v4_d4 =editText_v4_dato4.getText().toString();
                Matcher mat4 = pat.matcher(v4_d4);
                validacion = mat4.matches();                }

            if (validacion ) {
                System.out.println("SI letras");
                Toast.makeText(getApplicationContext() , "Se ha ingresado letras, espacios o signos en vector #  4", Toast.LENGTH_SHORT).show();
                return  false;
            } else {
                System.out.println("NO letras");
                ClaseDatosPythonJava.d_vector4 = vector_dinamic4;
                if (v_tamano > 0) {
                    ClaseDatosPythonJava.d_vector4[0] = (editText_v4_dato1.getText().toString());
                }
                if (v_tamano > 1) {
                    ClaseDatosPythonJava.d_vector4[1] = (editText_v4_dato2.getText().toString());
                }
                if (v_tamano > 2) {
                    ClaseDatosPythonJava.d_vector4[2] = (editText_v4_dato3.getText().toString());
                }
                if (v_tamano > 3) {
                    ClaseDatosPythonJava.d_vector4[3] = (editText_v4_dato4.getText().toString());
                }
            }
        }

        String vector_dinamic_aumentado[] = new String [n_vectores];
        ClaseDatosPythonJava.d_vector_aumentado = vector_dinamic_aumentado;

        if (n_vectores > 0) {
            ClaseDatosPythonJava.d_vector_aumentado[0] = "0";
        }
        if (n_vectores > 1) {
            ClaseDatosPythonJava.d_vector_aumentado[1] = "0";
        }
        if (n_vectores > 2) {
            ClaseDatosPythonJava.d_vector_aumentado[2] = "0";
        }
        if (n_vectores > 3) {
            ClaseDatosPythonJava.d_vector_aumentado[3] = "0";
        }

        String vector_dinamic_aumentadol[] = new String [n_vectores];
        ClaseDatosPythonJava.d_vector_aumentadol = vector_dinamic_aumentadol;

        if (n_vectores > 0) {
            ClaseDatosPythonJava.d_vector_aumentadol[0] = "z";
        }
        if (n_vectores > 1) {
            ClaseDatosPythonJava.d_vector_aumentadol[1] = "y";
        }
        if (n_vectores > 2) {
            ClaseDatosPythonJava.d_vector_aumentadol[2] = "x";
        }
        if (n_vectores > 3) {
            ClaseDatosPythonJava.d_vector_aumentadol[3] = "w";
        }
        return  true;

    }


    public Boolean get_elemts_tamano() {
        try {
            if (textNumber_componentes.getText().toString().isEmpty()
                    || textNumber_tamano_vectores.getText().toString().isEmpty() ){
                return false;
            }else{
                int valovectores    =  Integer.parseInt(textNumber_componentes.getText().toString());
                int valortamano     =  Integer.parseInt(textNumber_tamano_vectores.getText().toString());
                ClaseDatosPythonJava.componentes = valovectores;
                ClaseDatosPythonJava.tamano_vector = valortamano;
                if (valovectores >= 1 && valortamano >= 1 && valovectores < 5 && valortamano < 5){
                    return true;
                }else{return false;}

            }
        }catch (Error e){
            return false;
        }


    }

    public void asignar_tamaños_vectores(int l_tamano, int l_vectores ){
        int v_tamano = l_tamano;
        int v_vactores = l_vectores;

        if (v_vactores < 1){
            editText_v1_dato1.setText("");
            editText_v1_dato1.setEnabled(false);
            editText_v1_dato1.setVisibility(View.INVISIBLE);
            editText_v1_dato2.setText("");
            editText_v1_dato2.setEnabled(false);
            editText_v1_dato2.setVisibility(View.INVISIBLE);
            editText_v1_dato3.setText("");
            editText_v1_dato3.setEnabled(false);
            editText_v1_dato3.setVisibility(View.INVISIBLE);
            editText_v1_dato4.setText("");
            editText_v1_dato4.setEnabled(false);
            editText_v1_dato4.setVisibility(View.INVISIBLE);
            linea_vector_1.setVisibility(View.GONE);

        }
        if (v_vactores < 2){
            editText_v2_dato1.setText("");
            editText_v2_dato1.setEnabled(false);
            editText_v2_dato1.setVisibility(View.INVISIBLE);
            editText_v2_dato2.setText("");
            editText_v2_dato2.setEnabled(false);
            editText_v2_dato2.setVisibility(View.INVISIBLE);
            editText_v2_dato3.setText("");
            editText_v2_dato3.setEnabled(false);
            editText_v2_dato3.setVisibility(View.INVISIBLE);
            editText_v2_dato4.setText("");
            editText_v2_dato4.setEnabled(false);
            editText_v2_dato4.setVisibility(View.INVISIBLE);
            linea_vector_2.setVisibility(View.GONE);

        }
        if (v_vactores < 3){
            editText_v3_dato1.setText("");
            editText_v3_dato1.setEnabled(false);
            editText_v3_dato1.setVisibility(View.INVISIBLE);
            editText_v3_dato2.setText("");
            editText_v3_dato2.setEnabled(false);
            editText_v3_dato2.setVisibility(View.INVISIBLE);
            editText_v3_dato3.setText("");
            editText_v3_dato3.setEnabled(false);
            editText_v3_dato3.setVisibility(View.INVISIBLE);
            editText_v3_dato4.setText("");
            editText_v3_dato4.setEnabled(false);
            editText_v3_dato4.setVisibility(View.INVISIBLE);
            linea_vector_3.setVisibility(View.GONE);


        }
        if (v_vactores < 4){
            editText_v4_dato1.setText("");
            editText_v4_dato1.setEnabled(false);
            editText_v4_dato1.setVisibility(View.INVISIBLE);
            editText_v4_dato2.setText("");
            editText_v4_dato2.setEnabled(false);
            editText_v4_dato2.setVisibility(View.INVISIBLE);
            editText_v4_dato3.setText("");
            editText_v4_dato3.setEnabled(false);
            editText_v4_dato3.setVisibility(View.INVISIBLE);
            editText_v4_dato4.setText("");
            editText_v4_dato4.setEnabled(false);
            editText_v4_dato4.setVisibility(View.INVISIBLE);
            linea_vector_4.setVisibility(View.GONE);

        }

        if (v_tamano < 1){
            editText_v1_dato1.setText("");
            editText_v1_dato1.setEnabled(false);
            editText_v1_dato1.setVisibility(View.INVISIBLE);
            editText_v2_dato1.setText("");
            editText_v2_dato1.setEnabled(false);
            editText_v2_dato1.setVisibility(View.INVISIBLE);
            editText_v3_dato1.setText("");
            editText_v3_dato1.setEnabled(false);
            editText_v3_dato1.setVisibility(View.INVISIBLE);
            editText_v4_dato1.setText("");
            editText_v4_dato1.setEnabled(false);
            editText_v4_dato1.setVisibility(View.INVISIBLE);

        }
        if (v_tamano < 2){
            editText_v1_dato2.setText("");
            editText_v1_dato2.setEnabled(false);
            editText_v1_dato2.setVisibility(View.INVISIBLE);
            editText_v2_dato2.setText("");
            editText_v2_dato2.setEnabled(false);
            editText_v2_dato2.setVisibility(View.INVISIBLE);
            editText_v3_dato2.setText("");
            editText_v3_dato2.setEnabled(false);
            editText_v3_dato2.setVisibility(View.INVISIBLE);
            editText_v4_dato2.setText("");
            editText_v4_dato2.setEnabled(false);
            editText_v4_dato2.setVisibility(View.INVISIBLE);

        }
        if (v_tamano < 3){
            editText_v1_dato3.setText("");
            editText_v1_dato3.setEnabled(false);
            editText_v1_dato3.setVisibility(View.INVISIBLE);

            editText_v2_dato3.setText("");
            editText_v2_dato3.setEnabled(false);
            editText_v2_dato3.setVisibility(View.INVISIBLE);

            editText_v3_dato3.setText("");
            editText_v3_dato3.setEnabled(false);
            editText_v3_dato3.setVisibility(View.INVISIBLE);

            editText_v4_dato3.setText("");
            editText_v4_dato3.setEnabled(false);
            editText_v4_dato3.setVisibility(View.INVISIBLE);

        }
        if (v_tamano < 4){
            editText_v1_dato4.setText("");
            editText_v1_dato4.setEnabled(false);
            editText_v1_dato4.setVisibility(View.INVISIBLE);
            editText_v2_dato4.setVisibility(View.INVISIBLE);
            editText_v3_dato4.setVisibility(View.INVISIBLE);
            editText_v4_dato4.setVisibility(View.INVISIBLE);

            editText_v2_dato4.setText("");
            editText_v2_dato4.setEnabled(false);
            editText_v3_dato4.setText("");
            editText_v3_dato4.setEnabled(false);
            editText_v4_dato4.setText("");
            editText_v4_dato4.setEnabled(false);
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


            if (v_vactores >= 1){ //editText_v1_dato4.setText("");
                editText_v1_dato1.setEnabled(true);
                editText_v1_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_v2_dato4.setText("");
                editText_v2_dato1.setEnabled(true);
                editText_v2_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_v3_dato4.setText("");
                editText_v3_dato1.setEnabled(true);
                editText_v3_dato1.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_v4_dato4.setText("");
                editText_v4_dato1.setEnabled(true);
                editText_v4_dato1.setVisibility(View.VISIBLE);

            }
        }
        if (v_tamano > 1){
            if (v_vactores >= 1){ //editText_v1_dato4.setText("");
                editText_v1_dato2.setEnabled(true);
                editText_v1_dato2.setVisibility(View.VISIBLE);

            }
            if (v_vactores >= 2){//editText_v2_dato4.setText("");
                editText_v2_dato2.setEnabled(true);
                editText_v2_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_v3_dato4.setText("");
                editText_v3_dato2.setEnabled(true);
                editText_v3_dato2.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_v4_dato4.setText("");
                editText_v4_dato2.setEnabled(true);
                editText_v4_dato2.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 2){
            if (v_vactores >= 1){
                editText_v1_dato3.setEnabled(true);
                editText_v1_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_v2_dato4.setText("");
                editText_v2_dato3.setEnabled(true);
                editText_v2_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_v3_dato4.setText("");
                editText_v3_dato3.setEnabled(true);
                editText_v3_dato3.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_v4_dato4.setText("");
                editText_v4_dato3.setEnabled(true);
                editText_v4_dato3.setVisibility(View.VISIBLE);
            }
        }
        if (v_tamano > 3){
            if (v_vactores >= 1){ //editText_v1_dato4.setText("");
                editText_v1_dato4.setEnabled(true);
                editText_v1_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 2){//editText_v2_dato4.setText("");
                editText_v2_dato4.setEnabled(true);
                editText_v2_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 3){ //editText_v3_dato4.setText("");
                editText_v3_dato4.setEnabled(true);
                editText_v3_dato4.setVisibility(View.VISIBLE);
            }
            if (v_vactores >= 4){//editText_v4_dato4.setText("");
                editText_v4_dato4.setEnabled(true);
                editText_v4_dato4.setVisibility(View.VISIBLE);
            }
        }

    }

    public void inicio_pantalla(){

        editText_v1_dato1.setText("");
        editText_v1_dato1.setEnabled(false);
        editText_v1_dato2.setText("");
        editText_v1_dato2.setEnabled(false);
        editText_v1_dato3.setText("");
        editText_v1_dato3.setEnabled(false);
        editText_v1_dato4.setText("");
        editText_v1_dato4.setEnabled(false);


        editText_v2_dato1.setText("");
        editText_v2_dato1.setEnabled(false);
        editText_v2_dato2.setText("");
        editText_v2_dato2.setEnabled(false);
        editText_v2_dato3.setText("");
        editText_v2_dato3.setEnabled(false);
        editText_v2_dato4.setText("");
        editText_v2_dato4.setEnabled(false);

        editText_v3_dato1.setText("");
        editText_v3_dato1.setEnabled(false);
        editText_v3_dato2.setText("");
        editText_v3_dato2.setEnabled(false);
        editText_v3_dato3.setText("");
        editText_v3_dato3.setEnabled(false);
        editText_v3_dato4.setText("");
        editText_v3_dato4.setEnabled(false);


        editText_v4_dato1.setText("");
        editText_v4_dato1.setEnabled(false);
        editText_v4_dato2.setText("");
        editText_v4_dato2.setEnabled(false);
        editText_v4_dato3.setText("");
        editText_v4_dato3.setEnabled(false);
        editText_v4_dato4.setText("");
        editText_v4_dato4.setEnabled(false);


        editText_v1_dato1.setVisibility(View.INVISIBLE);
        editText_v2_dato1.setVisibility(View.INVISIBLE);
        editText_v3_dato1.setVisibility(View.INVISIBLE);
        editText_v4_dato1.setVisibility(View.INVISIBLE);

        editText_v1_dato2.setVisibility(View.INVISIBLE);
        editText_v2_dato2.setVisibility(View.INVISIBLE);
        editText_v3_dato2.setVisibility(View.INVISIBLE);
        editText_v4_dato2.setVisibility(View.INVISIBLE);

        editText_v1_dato3.setVisibility(View.INVISIBLE);
        editText_v2_dato3.setVisibility(View.INVISIBLE);
        editText_v3_dato3.setVisibility(View.INVISIBLE);
        editText_v4_dato3.setVisibility(View.INVISIBLE);

        editText_v1_dato4.setVisibility(View.INVISIBLE);
        editText_v2_dato4.setVisibility(View.INVISIBLE);
        editText_v3_dato4.setVisibility(View.INVISIBLE);
        editText_v4_dato4.setVisibility(View.INVISIBLE);

            linea_vector_1.setVisibility(View.GONE);
            linea_vector_2.setVisibility(View.GONE);
            linea_vector_3.setVisibility(View.GONE);
            linea_vector_4.setVisibility(View.GONE);

    }

    @Override
    public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) {
        String codesString="Codigo :" + keyCode;
        Log.v("Evento onKeyUp   ", codesString);
        return super.onKeyMultiple(keyCode, repeatCount, event);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        String codesString="Codigo :" + keyCode;
        Log.v("Evento onKeyUp   ", codesString);

        switch (keyCode) {
            case KeyEvent.KEYCODE_0:
                    Log.v("is pressed", "keycode 0");
                return true;
            case KeyEvent.KEYCODE_1:
                Log.v("is pressed", "keycode 1");
                return true;
            case KeyEvent.KEYCODE_2:
                Log.v("is pressed", "keycode 2");
                return true;
            case KeyEvent.KEYCODE_3:
                Log.v("is pressed", "keycode3");
                return true;
            case KeyEvent.KEYCODE_4:
                Log.v("is pressed", "keycode 4");
                return true;
            case KeyEvent.KEYCODE_5:
                Log.v("is pressed", "keycode 5");
                return true;
            case KeyEvent.KEYCODE_6:
                Log.v("is pressed", "keycode 6");
                return true;
            case KeyEvent.KEYCODE_7:
                Log.v("is pressed", "keycode 7");
                return true;
            case KeyEvent.KEYCODE_8:
                Log.v("is pressed", "keycode 8");
                return true;
            case KeyEvent.KEYCODE_9:
                Log.v("is pressed", "keycode 9");
                return true;
            default:
                return super.onKeyUp(keyCode, event);
        }
    }

 /*   @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        String codesString="upcode:" + keyCode;
        Log.d("upOnkey code: ", codesString);
        return super.onKeyUp(keyCode, event);
    }
   */
}
