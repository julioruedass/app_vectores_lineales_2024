package mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.agog.mathdisplay.MTMathView;
import com.chaquo.python.PyObject;
import com.chaquo.python.Python;
import com.chaquo.python.console.R;

public class Procedimiento extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MTMathView pass1,pass2,pass3,pass4,pass5,pass6,pass7,pass8,pass9,pass10,pass11,pass12,pass13,pass14,pass15,pass16,pass17, pass18,
                pass19,pass20,pass21,pass22,pass23,pass24,pass25,pass26,pass27,pass28,pass29,pass30,pass31,pass32, pass33,pass34,
                pass35,pass36,pass37,pass38,pass39, pass40,pass41,pass42,pass43,pass44,pass45,pass46, pass47,pass48, pass49,pass50,
                pass51,pass52,pass53,pass54,pass55,pass56,pass57,pass58,pass59,pass60,pass61,pass62
                ,pass63,pass64,pass65,pass66,pass67,pass68,pass69,pass70,pass71,pass72,pass73,pass74
                ,pass75,pass76,pass77,pass78,pass79,pass80,pass81,pass82,pass83
                ,pass84,pass85,pass86,pass87,pass88,pass89,pass90,pass91,pass92,pass93
                ,pass94,pass95,pass96,pass97,pass98,pass99,pass100,
                pass101,pass102,pass103,pass104,pass105,pass106,pass107,pass108,pass109,pass110,pass111,pass112,pass113,pass114,pass115,pass116,pass117, pass118,
                pass119,pass120;

        TextView tpass1,tpass2,tpass3,tpass4,tpass5,tpass6,tpass7,tpass8,tpass9,tpass10,tpass11,tpass12,tpass13,tpass14,tpass15,tpass16,tpass17, tpass18,
                tpass19,tpass20,tpass21,tpass22,tpass23,tpass24,tpass25,tpass26,tpass27,tpass28,tpass29,tpass30,tpass31,tpass32, tpass33,tpass34
                ,tpass35,tpass36,tpass37,tpass38,tpass39, tpass40,tpass41,tpass42,tpass43,tpass44,tpass45,tpass46, tpass47,tpass48,tpass49,tpass50,
                tpass51,tpass52,tpass53,tpass54,tpass55,tpass56,tpass57,tpass58,tpass59,tpass60,tpass61,tpass62
                ,tpass63,tpass64,tpass65,tpass66,tpass67,tpass68,tpass69,tpass70,tpass71,tpass72,tpass73,tpass74
                ,tpass75,tpass76,tpass77,tpass78,tpass79,tpass80,tpass81,tpass82,tpass83
                ,tpass84,tpass85,tpass86,tpass87,tpass88,tpass89,tpass90,tpass91,tpass92,tpass93
                ,tpass94,tpass95,tpass96,tpass97,tpass98,tpass99,tpass100,
                tpass101,tpass102,tpass103,tpass104,tpass105,tpass106,tpass107,tpass108,tpass109,tpass110,tpass111,tpass112,tpass113,tpass114,tpass115,tpass116,tpass117, tpass118,
                tpass119,tpass120;

        Button button_mas,button_menos;


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedimiento_gral);
        /*asignar identificador de elementos*/
        // mathview_vectores_entrada = setup_etiqueta_math(R.id.mathview_vectores_entrada);
        pass1 = setup_etiqueta_math(R.id.pass1);
        pass2 = setup_etiqueta_math(R.id.pass2);
        pass3 = setup_etiqueta_math(R.id.pass3);
        pass4 = setup_etiqueta_math(R.id.pass4);
        pass5 = setup_etiqueta_math(R.id.pass5);
        pass6 = setup_etiqueta_math(R.id.pass6);
        pass7 = setup_etiqueta_math(R.id.pass7);
        pass8 = setup_etiqueta_math(R.id.pass8);
        pass9 = setup_etiqueta_math(R.id.pass9);
        pass10 = setup_etiqueta_math(R.id.pass10);
        pass11 = setup_etiqueta_math(R.id.pass11);
        pass12 = setup_etiqueta_math(R.id.pass12);
        pass13 = setup_etiqueta_math(R.id.pass13);
        pass14 = setup_etiqueta_math(R.id.pass14);
        pass15 = setup_etiqueta_math(R.id.pass15);
        pass16 = setup_etiqueta_math(R.id.pass16);
        pass17 = setup_etiqueta_math(R.id.pass17);
        pass18 = setup_etiqueta_math(R.id.pass18);
        pass19 = setup_etiqueta_math(R.id.pass19);
        pass20 = setup_etiqueta_math(R.id.pass20);
        pass21 = setup_etiqueta_math(R.id.pass21);
        pass22 = setup_etiqueta_math(R.id.pass22);
        pass23 = setup_etiqueta_math(R.id.pass23);
        pass24 = setup_etiqueta_math(R.id.pass24);
        pass25 = setup_etiqueta_math(R.id.pass25);
        pass26 = setup_etiqueta_math(R.id.pass26);
        pass27 = setup_etiqueta_math(R.id.pass27);
        pass28 = setup_etiqueta_math(R.id.pass28);
        pass29 = setup_etiqueta_math(R.id.pass29);
        pass30 = setup_etiqueta_math(R.id.pass30);
        pass31 = setup_etiqueta_math(R.id.pass31);
        pass32 = setup_etiqueta_math(R.id.pass32);
        pass33 = setup_etiqueta_math(R.id.pass33);
        pass34 = setup_etiqueta_math(R.id.pass34);

        pass35 = setup_etiqueta_math(R.id.pass35);
        pass36 = setup_etiqueta_math(R.id.pass36);
        pass37 = setup_etiqueta_math(R.id.pass37);
        pass38 = setup_etiqueta_math(R.id.pass38);
        pass39 = setup_etiqueta_math(R.id.pass39);
        pass40 = setup_etiqueta_math(R.id.pass40);
        pass41 = setup_etiqueta_math(R.id.pass41);

        pass42 = setup_etiqueta_math(R.id.pass42);
        pass43 = setup_etiqueta_math(R.id.pass43);
        pass44 = setup_etiqueta_math(R.id.pass44);
        pass45 = setup_etiqueta_math(R.id.pass45);
        pass46 = setup_etiqueta_math(R.id.pass46);
        pass47 = setup_etiqueta_math(R.id.pass47);
        pass48 = setup_etiqueta_math(R.id.pass48);
        pass49 = setup_etiqueta_math(R.id.pass49);
        pass50 = setup_etiqueta_math(R.id.pass50);

        pass51=setup_etiqueta_math(R.id.pass51);
        pass52=setup_etiqueta_math(R.id.pass52);
        pass53=setup_etiqueta_math(R.id.pass53);
        pass54=setup_etiqueta_math(R.id.pass54);
        pass55=setup_etiqueta_math(R.id.pass55);
        pass56=setup_etiqueta_math(R.id.pass56);
        pass57=setup_etiqueta_math(R.id.pass57);
        pass58=setup_etiqueta_math(R.id.pass58);
        pass59=setup_etiqueta_math(R.id.pass59);
        pass60=setup_etiqueta_math(R.id.pass60);
        pass61=setup_etiqueta_math(R.id.pass61);
        pass62=setup_etiqueta_math(R.id.pass62);
        pass63=setup_etiqueta_math(R.id.pass63);
        pass64=setup_etiqueta_math(R.id.pass64);
        pass65=setup_etiqueta_math(R.id.pass65);
        pass66=setup_etiqueta_math(R.id.pass66);
        pass67=setup_etiqueta_math(R.id.pass67);
        pass68=setup_etiqueta_math(R.id.pass68);
        pass69=setup_etiqueta_math(R.id.pass69);
        pass70=setup_etiqueta_math(R.id.pass70);
        pass71=setup_etiqueta_math(R.id.pass71);
        pass72=setup_etiqueta_math(R.id.pass72);
        pass73=setup_etiqueta_math(R.id.pass73);
        pass74=setup_etiqueta_math(R.id.pass74);
        pass75=setup_etiqueta_math(R.id.pass75);


        pass76=setup_etiqueta_math(R.id.pass76);
        pass77=setup_etiqueta_math(R.id.pass77);
        pass78=setup_etiqueta_math(R.id.pass78);
        pass79=setup_etiqueta_math(R.id.pass79);
        pass80=setup_etiqueta_math(R.id.pass80);
        pass81=setup_etiqueta_math(R.id.pass81);
        pass82=setup_etiqueta_math(R.id.pass82);
        pass83=setup_etiqueta_math(R.id.pass83);
        pass84=setup_etiqueta_math(R.id.pass84);
        pass85=setup_etiqueta_math(R.id.pass85);
        pass86=setup_etiqueta_math(R.id.pass86);
        pass87=setup_etiqueta_math(R.id.pass87);
        pass88=setup_etiqueta_math(R.id.pass88);
        pass89=setup_etiqueta_math(R.id.pass89);
        pass90=setup_etiqueta_math(R.id.pass90);
        pass91=setup_etiqueta_math(R.id.pass91);
        pass92=setup_etiqueta_math(R.id.pass92);
        pass93=setup_etiqueta_math(R.id.pass93);
        pass94=setup_etiqueta_math(R.id.pass94);
        pass95=setup_etiqueta_math(R.id.pass95);
        pass96=setup_etiqueta_math(R.id.pass96);
        pass97=setup_etiqueta_math(R.id.pass97);
        pass98=setup_etiqueta_math(R.id.pass98);
        pass99=setup_etiqueta_math(R.id.pass99);
        pass100=setup_etiqueta_math(R.id.pass100);

        pass101 = setup_etiqueta_math(R.id.pass101);
        pass102 = setup_etiqueta_math(R.id.pass102);
        pass103 = setup_etiqueta_math(R.id.pass103);
        pass104 = setup_etiqueta_math(R.id.pass104);
        pass105 = setup_etiqueta_math(R.id.pass105);
        pass106 = setup_etiqueta_math(R.id.pass106);
        pass107 = setup_etiqueta_math(R.id.pass107);
        pass108 = setup_etiqueta_math(R.id.pass108);
        pass109 = setup_etiqueta_math(R.id.pass109);
        pass110 = setup_etiqueta_math(R.id.pass110);
        pass111 = setup_etiqueta_math(R.id.pass111);
        pass112 = setup_etiqueta_math(R.id.pass112);
        pass113 = setup_etiqueta_math(R.id.pass113);
        pass114 = setup_etiqueta_math(R.id.pass114);
        pass115 = setup_etiqueta_math(R.id.pass115);
        pass116 = setup_etiqueta_math(R.id.pass116);
        pass117 = setup_etiqueta_math(R.id.pass117);
        pass118 = setup_etiqueta_math(R.id.pass118);
        pass119 = setup_etiqueta_math(R.id.pass119);
        pass120 = setup_etiqueta_math(R.id.pass120);

        tpass1 = findViewById(R.id.tpass1);
        tpass2 = findViewById(R.id.tpass2);
        tpass3 = findViewById(R.id.tpass3);
        tpass4 = findViewById(R.id.tpass4);
        tpass5 = findViewById(R.id.tpass5);
        tpass6 = findViewById(R.id.tpass6);
        tpass7 = findViewById(R.id.tpass7);
        tpass8 = findViewById(R.id.tpass8);
        tpass9 = findViewById(R.id.tpass9);
        tpass10 = findViewById(R.id.tpass10);
        tpass11 = findViewById(R.id.tpass11);
        tpass12 = findViewById(R.id.tpass12);
        tpass13 = findViewById(R.id.tpass13);
        tpass14 = findViewById(R.id.tpass14);
        tpass15 = findViewById(R.id.tpass15);
        tpass16 = findViewById(R.id.tpass16);
        tpass17 = findViewById(R.id.tpass17);
        tpass18 = findViewById(R.id.tpass18);
        tpass19 = findViewById(R.id.tpass19);
        tpass20 = findViewById(R.id.tpass20);
        tpass21 = findViewById(R.id.tpass21);
        tpass22 = findViewById(R.id.tpass22);
        tpass23 = findViewById(R.id.tpass23);
        tpass24 = findViewById(R.id.tpass24);
        tpass25 = findViewById(R.id.tpass25);
        tpass26 = findViewById(R.id.tpass26);
        tpass27 = findViewById(R.id.tpass27);
        tpass28 = findViewById(R.id.tpass28);
        tpass29 = findViewById(R.id.tpass29);
        tpass30 = findViewById(R.id.tpass30);
        tpass31 = findViewById(R.id.tpass31);
        tpass32 = findViewById(R.id.tpass32);
        tpass33 = findViewById(R.id.tpass33);
        tpass34 = findViewById(R.id.tpass34);

        tpass35 = findViewById(R.id.tpass35);
        tpass36 = findViewById(R.id.tpass36);
        tpass37 = findViewById(R.id.tpass37);
        tpass38 = findViewById(R.id.tpass38);
        tpass39 = findViewById(R.id.tpass39);
        tpass40 = findViewById(R.id.tpass40);
        tpass41 = findViewById(R.id.tpass41);

        tpass42 = findViewById(R.id.tpass42);
        tpass43 = findViewById(R.id.tpass43);
        tpass44 = findViewById(R.id.tpass44);
        tpass45 = findViewById(R.id.tpass45);
        tpass46 = findViewById(R.id.tpass46);
        tpass47 = findViewById(R.id.tpass47);
        tpass48 = findViewById(R.id.tpass48);
        tpass49 = findViewById(R.id.tpass49);
        tpass50 = findViewById(R.id.tpass50);

        tpass51=findViewById(R.id.tpass51);
        tpass52=findViewById(R.id.tpass52);
        tpass53=findViewById(R.id.tpass53);
        tpass54=findViewById(R.id.tpass54);
        tpass55=findViewById(R.id.tpass55);
        tpass56=findViewById(R.id.tpass56);
        tpass57=findViewById(R.id.tpass57);
        tpass58=findViewById(R.id.tpass58);
        tpass59=findViewById(R.id.tpass59);
        tpass60=findViewById(R.id.tpass60);
        tpass61=findViewById(R.id.tpass61);
        tpass62=findViewById(R.id.tpass62);
        tpass63=findViewById(R.id.tpass63);
        tpass64=findViewById(R.id.tpass64);
        tpass65=findViewById(R.id.tpass65);
        tpass66=findViewById(R.id.tpass66);
        tpass67=findViewById(R.id.tpass67);
        tpass68=findViewById(R.id.tpass68);
        tpass69=findViewById(R.id.tpass69);
        tpass70=findViewById(R.id.tpass70);
        tpass71=findViewById(R.id.tpass71);
        tpass72=findViewById(R.id.tpass72);
        tpass73=findViewById(R.id.tpass73);
        tpass74=findViewById(R.id.tpass74);
        tpass75=findViewById(R.id.tpass75);

        tpass76=findViewById(R.id.tpass76);
        tpass77=findViewById(R.id.tpass77);
        tpass78=findViewById(R.id.tpass78);
        tpass79=findViewById(R.id.tpass79);
        tpass80=findViewById(R.id.tpass80);
        tpass81=findViewById(R.id.tpass81);
        tpass82=findViewById(R.id.tpass82);
        tpass83=findViewById(R.id.tpass83);
        tpass84=findViewById(R.id.tpass84);
        tpass85=findViewById(R.id.tpass85);
        tpass86=findViewById(R.id.tpass86);
        tpass87=findViewById(R.id.tpass87);
        tpass88=findViewById(R.id.tpass88);
        tpass89=findViewById(R.id.tpass89);
        tpass90=findViewById(R.id.tpass90);
        tpass91=findViewById(R.id.tpass91);
        tpass92=findViewById(R.id.tpass92);
        tpass93=findViewById(R.id.tpass93);
        tpass94=findViewById(R.id.tpass94);
        tpass95=findViewById(R.id.tpass95);
        tpass96=findViewById(R.id.tpass96);
        tpass97=findViewById(R.id.tpass97);
        tpass98=findViewById(R.id.tpass98);
        tpass99=findViewById(R.id.tpass99);
        tpass100=findViewById(R.id.tpass100);

        tpass101 = findViewById(R.id.tpass101);
        tpass102 = findViewById(R.id.tpass102);
        tpass103 = findViewById(R.id.tpass103);
        tpass104 = findViewById(R.id.tpass104);
        tpass105 = findViewById(R.id.tpass105);
        tpass106 = findViewById(R.id.tpass106);
        tpass107 = findViewById(R.id.tpass107);
        tpass108 = findViewById(R.id.tpass108);
        tpass109 = findViewById(R.id.tpass109);
        tpass110 = findViewById(R.id.tpass110);
        tpass111 = findViewById(R.id.tpass111);
        tpass112 = findViewById(R.id.tpass112);
        tpass113 = findViewById(R.id.tpass113);
        tpass114 = findViewById(R.id.tpass114);
        tpass115 = findViewById(R.id.tpass115);
        tpass116 = findViewById(R.id.tpass116);
        tpass117 = findViewById(R.id.tpass117);
        tpass118 = findViewById(R.id.tpass118);
        tpass119 = findViewById(R.id.tpass119);
        tpass120 = findViewById(R.id.tpass120);

        /*asignacion de valores*/
        tpass1.setText(ClaseDatosPythonJava.tpass1);
        tpass2.setText(ClaseDatosPythonJava.tpass2);
        tpass3.setText(ClaseDatosPythonJava.tpass3);
        tpass4.setText(ClaseDatosPythonJava.tpass4);
        tpass5.setText(ClaseDatosPythonJava.tpass5);
        tpass6.setText(ClaseDatosPythonJava.tpass6);
        tpass7.setText(ClaseDatosPythonJava.tpass7);
        tpass8.setText(ClaseDatosPythonJava.tpass8);
        tpass9.setText(ClaseDatosPythonJava.tpass9);
        tpass10.setText(ClaseDatosPythonJava.tpass10);
        tpass11.setText(ClaseDatosPythonJava.tpass11);
        tpass12.setText(ClaseDatosPythonJava.tpass12);
        tpass13.setText(ClaseDatosPythonJava.tpass13);
        tpass14.setText(ClaseDatosPythonJava.tpass14);
        tpass15.setText(ClaseDatosPythonJava.tpass15);
        tpass16.setText(ClaseDatosPythonJava.tpass16);
        tpass17.setText(ClaseDatosPythonJava.tpass17);
        tpass18.setText(ClaseDatosPythonJava.tpass18);
        tpass19.setText(ClaseDatosPythonJava.tpass19);
        tpass20.setText(ClaseDatosPythonJava.tpass20);
        tpass21.setText(ClaseDatosPythonJava.tpass21);
        tpass22.setText(ClaseDatosPythonJava.tpass22);
        tpass23.setText(ClaseDatosPythonJava.tpass23);
        tpass24.setText(ClaseDatosPythonJava.tpass24);
        tpass25.setText(ClaseDatosPythonJava.tpass25);
        tpass26.setText(ClaseDatosPythonJava.tpass26);
        tpass27.setText(ClaseDatosPythonJava.tpass27);
        tpass28.setText(ClaseDatosPythonJava.tpass28);
        tpass29.setText(ClaseDatosPythonJava.tpass29);
        tpass30.setText(ClaseDatosPythonJava.tpass30);
        tpass31.setText(ClaseDatosPythonJava.tpass31);
        tpass32.setText(ClaseDatosPythonJava.tpass32);
        tpass33.setText(ClaseDatosPythonJava.tpass33);
        tpass34.setText(ClaseDatosPythonJava.tpass34);
        tpass35.setText(ClaseDatosPythonJava.tpass35);
        tpass36.setText(ClaseDatosPythonJava.tpass36);
        tpass37.setText(ClaseDatosPythonJava.tpass37);
        tpass38.setText(ClaseDatosPythonJava.tpass38);
        tpass39.setText(ClaseDatosPythonJava.tpass39);
        tpass40.setText(ClaseDatosPythonJava.tpass40);
        tpass41.setText(ClaseDatosPythonJava.tpass41);
        tpass42.setText(ClaseDatosPythonJava.tpass42);
        tpass43.setText(ClaseDatosPythonJava.tpass43);
        tpass44.setText(ClaseDatosPythonJava.tpass44);
        tpass45.setText(ClaseDatosPythonJava.tpass45);
        tpass46.setText(ClaseDatosPythonJava.tpass46);
        tpass47.setText(ClaseDatosPythonJava.tpass47);
        tpass48.setText(ClaseDatosPythonJava.tpass48);
        tpass49.setText(ClaseDatosPythonJava.tpass49);
        tpass50.setText(ClaseDatosPythonJava.tpass50);
        tpass51.setText(ClaseDatosPythonJava.tpass51);
        tpass52.setText(ClaseDatosPythonJava.tpass52);
        tpass53.setText(ClaseDatosPythonJava.tpass53);
        tpass54.setText(ClaseDatosPythonJava.tpass54);
        tpass55.setText(ClaseDatosPythonJava.tpass55);
        tpass56.setText(ClaseDatosPythonJava.tpass56);
        tpass57.setText(ClaseDatosPythonJava.tpass57);
        tpass58.setText(ClaseDatosPythonJava.tpass58);
        tpass59.setText(ClaseDatosPythonJava.tpass59);
        tpass60.setText(ClaseDatosPythonJava.tpass60);
        tpass61.setText(ClaseDatosPythonJava.tpass61);
        tpass62.setText(ClaseDatosPythonJava.tpass62);
        tpass63.setText(ClaseDatosPythonJava.tpass63);
        tpass64.setText(ClaseDatosPythonJava.tpass64);
        tpass65.setText(ClaseDatosPythonJava.tpass65);
        tpass66.setText(ClaseDatosPythonJava.tpass66);
        tpass67.setText(ClaseDatosPythonJava.tpass67);
        tpass68.setText(ClaseDatosPythonJava.tpass68);
        tpass69.setText(ClaseDatosPythonJava.tpass69);
        tpass70.setText(ClaseDatosPythonJava.tpass70);
        tpass71.setText(ClaseDatosPythonJava.tpass71);
        tpass72.setText(ClaseDatosPythonJava.tpass72);
        tpass73.setText(ClaseDatosPythonJava.tpass73);
        tpass74.setText(ClaseDatosPythonJava.tpass74);
        tpass75.setText(ClaseDatosPythonJava.tpass75);
        tpass76.setText(ClaseDatosPythonJava.tpass76);
        tpass77.setText(ClaseDatosPythonJava.tpass77);
        tpass78.setText(ClaseDatosPythonJava.tpass78);
        tpass79.setText(ClaseDatosPythonJava.tpass79);
        tpass80.setText(ClaseDatosPythonJava.tpass80);
        tpass81.setText(ClaseDatosPythonJava.tpass81);
        tpass82.setText(ClaseDatosPythonJava.tpass82);
        tpass83.setText(ClaseDatosPythonJava.tpass83);
        tpass84.setText(ClaseDatosPythonJava.tpass84);
        tpass85.setText(ClaseDatosPythonJava.tpass85);
        tpass86.setText(ClaseDatosPythonJava.tpass86);
        tpass87.setText(ClaseDatosPythonJava.tpass87);
        tpass88.setText(ClaseDatosPythonJava.tpass88);
        tpass89.setText(ClaseDatosPythonJava.tpass89);
        tpass90.setText(ClaseDatosPythonJava.tpass90);
        tpass91.setText(ClaseDatosPythonJava.tpass91);
        tpass92.setText(ClaseDatosPythonJava.tpass92);
        tpass93.setText(ClaseDatosPythonJava.tpass93);
        tpass94.setText(ClaseDatosPythonJava.tpass94);
        tpass95.setText(ClaseDatosPythonJava.tpass95);
        tpass96.setText(ClaseDatosPythonJava.tpass96);
        tpass97.setText(ClaseDatosPythonJava.tpass97);
        tpass98.setText(ClaseDatosPythonJava.tpass98);
        tpass99.setText(ClaseDatosPythonJava.tpass99);
        tpass100.setText(ClaseDatosPythonJava.tpass100);

        tpass101.setText(ClaseDatosPythonJava.tpass101);
        tpass102.setText(ClaseDatosPythonJava.tpass102);
        tpass103.setText(ClaseDatosPythonJava.tpass103);
        tpass104.setText(ClaseDatosPythonJava.tpass104);
        tpass105.setText(ClaseDatosPythonJava.tpass105);
        tpass106.setText(ClaseDatosPythonJava.tpass106);
        tpass107.setText(ClaseDatosPythonJava.tpass107);
        tpass108.setText(ClaseDatosPythonJava.tpass108);
        tpass109.setText(ClaseDatosPythonJava.tpass109);
        tpass110.setText(ClaseDatosPythonJava.tpass110);
        tpass111.setText(ClaseDatosPythonJava.tpass111);
        tpass112.setText(ClaseDatosPythonJava.tpass112);
        tpass113.setText(ClaseDatosPythonJava.tpass113);
        tpass114.setText(ClaseDatosPythonJava.tpass114);
        tpass115.setText(ClaseDatosPythonJava.tpass115);
        tpass116.setText(ClaseDatosPythonJava.tpass116);
        tpass117.setText(ClaseDatosPythonJava.tpass117);
        tpass118.setText(ClaseDatosPythonJava.tpass118);
        tpass119.setText(ClaseDatosPythonJava.tpass119);
        tpass120.setText(ClaseDatosPythonJava.tpass120);

        /*Asignacion de valores matematicos*/
        //mathview_vectores_entrada.setLatex(ClaseDatosPythonJava.vectoresentrada);
        pass1.setLatex(ClaseDatosPythonJava.pass1);
        pass2.setLatex(ClaseDatosPythonJava.pass2);
        pass3.setLatex(ClaseDatosPythonJava.pass3);
        pass4.setLatex(ClaseDatosPythonJava.pass4);
        pass5.setLatex(ClaseDatosPythonJava.pass5);
        pass6.setLatex(ClaseDatosPythonJava.pass6);
        pass7.setLatex(ClaseDatosPythonJava.pass7);
        pass8.setLatex(ClaseDatosPythonJava.pass8);
        pass9.setLatex(ClaseDatosPythonJava.pass9);
        pass10.setLatex(ClaseDatosPythonJava.pass10);
        pass11.setLatex(ClaseDatosPythonJava.pass11);
        pass12.setLatex(ClaseDatosPythonJava.pass12);
        pass13.setLatex(ClaseDatosPythonJava.pass13);
        pass14.setLatex(ClaseDatosPythonJava.pass14);
        pass15.setLatex(ClaseDatosPythonJava.pass15);
        pass16.setLatex(ClaseDatosPythonJava.pass16);
        pass17.setLatex(ClaseDatosPythonJava.pass17);
        pass18.setLatex(ClaseDatosPythonJava.pass18);
        pass19.setLatex(ClaseDatosPythonJava.pass19);
        pass20.setLatex(ClaseDatosPythonJava.pass20);
        pass21.setLatex(ClaseDatosPythonJava.pass21);
        pass22.setLatex(ClaseDatosPythonJava.pass22);
        pass23.setLatex(ClaseDatosPythonJava.pass23);
        pass24.setLatex(ClaseDatosPythonJava.pass24);
        pass25.setLatex(ClaseDatosPythonJava.pass25);
        pass26.setLatex(ClaseDatosPythonJava.pass26);
        pass27.setLatex(ClaseDatosPythonJava.pass27);
        pass28.setLatex(ClaseDatosPythonJava.pass28);
        pass29.setLatex(ClaseDatosPythonJava.pass29);
        pass30.setLatex(ClaseDatosPythonJava.pass30);
        pass31.setLatex(ClaseDatosPythonJava.pass31);
        pass32.setLatex(ClaseDatosPythonJava.pass32);
        pass33.setLatex(ClaseDatosPythonJava.pass33);
        pass34.setLatex(ClaseDatosPythonJava.pass34);
        pass35.setLatex(ClaseDatosPythonJava.pass35);
        pass36.setLatex(ClaseDatosPythonJava.pass36);
        pass37.setLatex(ClaseDatosPythonJava.pass37);
        pass38.setLatex(ClaseDatosPythonJava.pass38);
        pass39.setLatex(ClaseDatosPythonJava.pass39);
        pass40.setLatex(ClaseDatosPythonJava.pass40);
        pass41.setLatex(ClaseDatosPythonJava.pass41);
        pass42.setLatex(ClaseDatosPythonJava.pass42);
        pass43.setLatex(ClaseDatosPythonJava.pass43);
        pass44.setLatex(ClaseDatosPythonJava.pass44);
        pass45.setLatex(ClaseDatosPythonJava.pass45);
        pass46.setLatex(ClaseDatosPythonJava.pass46);
        pass47.setLatex(ClaseDatosPythonJava.pass47);
        pass48.setLatex(ClaseDatosPythonJava.pass48);
        pass49.setLatex(ClaseDatosPythonJava.pass49);
        pass50.setLatex(ClaseDatosPythonJava.pass50);
        pass51.setLatex(ClaseDatosPythonJava.pass51);
        pass52.setLatex(ClaseDatosPythonJava.pass52);
        pass53.setLatex(ClaseDatosPythonJava.pass53);
        pass54.setLatex(ClaseDatosPythonJava.pass54);
        pass55.setLatex(ClaseDatosPythonJava.pass55);
        pass56.setLatex(ClaseDatosPythonJava.pass56);
        pass57.setLatex(ClaseDatosPythonJava.pass57);
        pass58.setLatex(ClaseDatosPythonJava.pass58);
        pass59.setLatex(ClaseDatosPythonJava.pass59);
        pass60.setLatex(ClaseDatosPythonJava.pass60);
        pass61.setLatex(ClaseDatosPythonJava.pass61);
        pass62.setLatex(ClaseDatosPythonJava.pass62);
        pass63.setLatex(ClaseDatosPythonJava.pass63);
        pass64.setLatex(ClaseDatosPythonJava.pass64);
        pass65.setLatex(ClaseDatosPythonJava.pass65);
        pass66.setLatex(ClaseDatosPythonJava.pass66);
        pass67.setLatex(ClaseDatosPythonJava.pass67);
        pass68.setLatex(ClaseDatosPythonJava.pass68);
        pass69.setLatex(ClaseDatosPythonJava.pass69);
        pass70.setLatex(ClaseDatosPythonJava.pass70);
        pass71.setLatex(ClaseDatosPythonJava.pass71);
        pass72.setLatex(ClaseDatosPythonJava.pass72);
        pass73.setLatex(ClaseDatosPythonJava.pass73);
        pass74.setLatex(ClaseDatosPythonJava.pass74);
        pass75.setLatex(ClaseDatosPythonJava.pass75);
        pass76.setLatex(ClaseDatosPythonJava.pass76);
        pass77.setLatex(ClaseDatosPythonJava.pass77);
        pass78.setLatex(ClaseDatosPythonJava.pass78);
        pass79.setLatex(ClaseDatosPythonJava.pass79);
        pass80.setLatex(ClaseDatosPythonJava.pass80);
        pass81.setLatex(ClaseDatosPythonJava.pass81);
        pass82.setLatex(ClaseDatosPythonJava.pass82);
        pass83.setLatex(ClaseDatosPythonJava.pass83);
        pass84.setLatex(ClaseDatosPythonJava.pass84);
        pass85.setLatex(ClaseDatosPythonJava.pass85);
        pass86.setLatex(ClaseDatosPythonJava.pass86);
        pass87.setLatex(ClaseDatosPythonJava.pass87);
        pass88.setLatex(ClaseDatosPythonJava.pass88);
        pass89.setLatex(ClaseDatosPythonJava.pass89);
        pass90.setLatex(ClaseDatosPythonJava.pass90);
        pass91.setLatex(ClaseDatosPythonJava.pass91);
        pass92.setLatex(ClaseDatosPythonJava.pass92);
        pass93.setLatex(ClaseDatosPythonJava.pass93);
        pass94.setLatex(ClaseDatosPythonJava.pass94);
        pass95.setLatex(ClaseDatosPythonJava.pass95);
        pass96.setLatex(ClaseDatosPythonJava.pass96);
        pass97.setLatex(ClaseDatosPythonJava.pass97);
        pass98.setLatex(ClaseDatosPythonJava.pass98);
        pass99.setLatex(ClaseDatosPythonJava.pass99);
        pass100.setLatex(ClaseDatosPythonJava.pass100);

        pass101.setLatex(ClaseDatosPythonJava.pass101);
        pass102.setLatex(ClaseDatosPythonJava.pass102);
        pass103.setLatex(ClaseDatosPythonJava.pass103);
        pass104.setLatex(ClaseDatosPythonJava.pass104);
        pass105.setLatex(ClaseDatosPythonJava.pass105);
        pass106.setLatex(ClaseDatosPythonJava.pass106);
        pass107.setLatex(ClaseDatosPythonJava.pass107);
        pass108.setLatex(ClaseDatosPythonJava.pass108);
        pass109.setLatex(ClaseDatosPythonJava.pass109);
        pass110.setLatex(ClaseDatosPythonJava.pass110);
        pass111.setLatex(ClaseDatosPythonJava.pass111);
        pass112.setLatex(ClaseDatosPythonJava.pass112);
        pass113.setLatex(ClaseDatosPythonJava.pass113);
        pass114.setLatex(ClaseDatosPythonJava.pass114);
        pass115.setLatex(ClaseDatosPythonJava.pass115);
        pass116.setLatex(ClaseDatosPythonJava.pass116);
        pass117.setLatex(ClaseDatosPythonJava.pass117);
        pass118.setLatex(ClaseDatosPythonJava.pass118);
        pass119.setLatex(ClaseDatosPythonJava.pass119);
        pass120.setLatex(ClaseDatosPythonJava.pass120);

        button_mas = findViewById(R.id.button_mas);
        button_menos = findViewById(R.id.button_menos);

        /*clic al boton de reduccion de tamaño de letra*/
        button_menos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( ClaseDatosPythonJava.tamano_letra > 30 ){
                    ClaseDatosPythonJava.tamano_letra=ClaseDatosPythonJava.tamano_letra-2;
                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(getIntent());
                    overridePendingTransition(0, 0);
                }


            }
        });


        /*clic al boton de aumento de tamaño de letra*/
        button_mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if ( ClaseDatosPythonJava.tamano_letra < 50){
                    ClaseDatosPythonJava.tamano_letra=ClaseDatosPythonJava.tamano_letra+2;
                    finish();
                    overridePendingTransition(0, 0);
                    startActivity(getIntent());
                    overridePendingTransition(0, 0);
                }


            }
        });
    }

    public void llamarortonormalizacion(){
        // Obtener una instancia Python, punto de inicio para enlace Java-Python
        final Python py = Python.getInstance();
        ClaseDatosPythonJava.procedimiento= 1;
        // Crear objeto Python para vincular con programa Python
        PyObject pyo = py.getModule("main");
        // Llamar función Python y especificar parámetros si existen
        Object obj = pyo.callAttr("main");

    }

    public MTMathView setup_etiqueta_math ( int id_etiqueta ){
        MTMathView v_etiquetar =  findViewById(id_etiqueta);
        v_etiquetar.setFontSize(ClaseDatosPythonJava.tamano_letra);
        return v_etiquetar;
    }

}