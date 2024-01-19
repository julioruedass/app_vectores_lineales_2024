package mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console;

public class ClaseDatosPythonJava {
    public static float lado1;
    public static float lado2;
    public static float area;

/* variables para metodo de ortonormalización*/
    public static int componentes;
    public static int tamano_vector;
    public static int secuencia  ;

    //datos para los vectores que muestra python
    public static String vectoresentrada = new String();
    public static String vectoresentrada2 = new String();

    public static String latexMatriz = new String();

    public static int tamano_letra =39;

    public static int valida_base =0;
    public static int genera_base =0;

    public static int procedimiento = 0;
    public static int itera_vector =0;
    public static String u1[][] = new String[5][5];



    public ClaseDatosPythonJava() {
        v1 = new String[4];
    }

    public static float getLado1() {
        return lado1;
    }

    public static void setLado1(float lado1) {
        ClaseDatosPythonJava.lado1 = lado1;
    }

    public static float getLado2() {
        return lado2;
    }

    public static void setLado2(float lado2) {
        ClaseDatosPythonJava.lado2 = lado2;
    }

    public static float getArea() {
        return area;
    }

    public static void setArea(float area) {
        ClaseDatosPythonJava.area = area;
    }

    public static String[][] getresultado() {
        return u1;
    }

    public static void setresultado(String[][] u1) {
        ClaseDatosPythonJava.u1 = u1;
    }
    public static int getComponentes() {
        return componentes;
    }

    public static void setComponentes(int componentes) {
        ClaseDatosPythonJava.componentes = componentes;
    }

    /*variables para el metodo de cambio de base*/
    public static int componentesbase;
    public static String d_vector1[] ;
    public static String d_vector2[] ;
    public static String d_vector3[] ;
    public static String d_vector4[] ;

    public static String d2_vector1[] ;
    public static String d2_vector2[] ;
    public static String d2_vector3[] ;
    public static String d2_vector4[] ;

    public static String vector_canonico[];
    public static String v_canonico;
    public static String v_where_base;

    public static String v_independiente;

    public static String vector[] = new String [4];

    /*vector 1*/
    public static String v1[] = new String [4]; /*[1,2,3,4]*/

    //Comentado po no uso
    /*
    public static String v2[] = new String [4];
    public static String v3[] = new String [4];
    public static String v4[] = new String [4];
    public static String A1[][] = new String [4][4];

    public static String base1_vector1[] = new String [4];
    public static String base1_vector2[] = new String [4];
    public static String base1_vector3[] = new String [4];
    public static String base1_vector4[] = new String [4];
    public static String base2_vector1[] = new String [4];
    public static String base2_vector2[] = new String [4];
    public static String base2_vector3[] = new String [4];
    public static String base2_vector4[] = new String [4];
    public static String respuesta = new String(); */
    public static String d_vector_aumentado[] = new String [4];
    public static String d_vector_aumentadol[] = new String [4];


    /*titulos de pasos avanzados*/
    /*titulos de pasos avanzados*/
    public static String tpass1 = new String();
    public static String tpass2 = new String();
    public static String tpass3 = new String();
    public static String tpass4 = new String();
    public static String tpass5 = new String();
    public static String tpass6 = new String();
    public static String tpass7 = new String();
    public static String tpass8 = new String();
    public static String tpass9 = new String();
    public static String tpass10 = new String();
    public static String tpass11 = new String();
    public static String tpass12 = new String();
    public static String tpass13 = new String();
    public static String tpass14 = new String();
    public static String tpass15 = new String();
    public static String tpass16 = new String();
    public static String tpass17 = new String();
    public static String tpass18 = new String();
    public static String tpass19 = new String();
    public static String tpass20 = new String();
    public static String tpass21 = new String();
    public static String tpass22 = new String();
    public static String tpass23 = new String();
    public static String tpass24 = new String();
    public static String tpass25 = new String();
    public static String tpass26 = new String();
    public static String tpass27 = new String();
    public static String tpass28 = new String();
    public static String tpass29 = new String();
    public static String tpass30 = new String();
    public static String tpass31 = new String();
    public static String tpass32 = new String();
    public static String tpass33 = new String();
    public static String tpass34 = new String();

    public static String tpass35 = new String();

    public static String tpass36 = new String();

    public static String tpass37 = new String();

    public static String tpass38 = new String();

    public static String tpass39 = new String();

    public static String tpass40 = new String();

    public static String tpass41 = new String();

    public static String tpass42 = new String();
    public static String tpass43 = new String();
    public static String tpass44 = new String();
    public static String tpass45 = new String();
    public static String tpass46 = new String();
    public static String tpass47 = new String();
    public static String tpass48 = new String();
    public static String tpass49 = new String();

    public static String tpass50 = new String();
    public static String tpass51  = new String();
    public static String tpass52  = new String();
    public static String tpass53  = new String();
    public static String tpass54  = new String();
    public static String tpass55  = new String();
    public static String tpass56  = new String();
    public static String tpass57  = new String();
    public static String tpass58  = new String();
    public static String tpass59  = new String();
    public static String tpass60  = new String();
    public static String tpass61  = new String();
    public static String tpass62  = new String();
    public static String tpass63  = new String();
    public static String tpass64  = new String();
    public static String tpass65  = new String();
    public static String tpass66  = new String();
    public static String tpass67  = new String();
    public static String tpass68  = new String();
    public static String tpass69  = new String();
    public static String tpass70  = new String();
    public static String tpass71  = new String();
    public static String tpass72  = new String();
    public static String tpass73  = new String();
    public static String tpass74  = new String();
    public static String tpass75  = new String();

    public static String tpass76  = new String();
    public static String tpass77  = new String();
    public static String tpass78  = new String();
    public static String tpass79  = new String();
    public static String tpass80  = new String();
    public static String tpass81  = new String();
    public static String tpass82  = new String();
    public static String tpass83  = new String();
    public static String tpass84  = new String();
    public static String tpass85  = new String();
    public static String tpass86  = new String();
    public static String tpass87  = new String();
    public static String tpass88  = new String();
    public static String tpass89  = new String();
    public static String tpass90  = new String();
    public static String tpass91  = new String();
    public static String tpass92  = new String();
    public static String tpass93  = new String();
    public static String tpass94  = new String();
    public static String tpass95  = new String();
    public static String tpass96  = new String();
    public static String tpass97  = new String();
    public static String tpass98  = new String();
    public static String tpass99  = new String();
    public static String tpass100  = new String();

    public static String tpass101 = new String();
    public static String tpass102 = new String();
    public static String tpass103 = new String();
    public static String tpass104 = new String();
    public static String tpass105 = new String();
    public static String tpass106 = new String();
    public static String tpass107 = new String();
    public static String tpass108 = new String();
    public static String tpass109 = new String();
    public static String tpass110 = new String();
    public static String tpass111 = new String();
    public static String tpass112 = new String();
    public static String tpass113 = new String();
    public static String tpass114 = new String();
    public static String tpass115 = new String();
    public static String tpass116 = new String();
    public static String tpass117 = new String();
    public static String tpass118 = new String();
    public static String tpass119 = new String();
    public static String tpass120 = new String();

    /*Valores matematicos*/
    public static String pass1 = new String();
    public static String pass2 = new String();
    public static String pass3 = new String();
    public static String pass4 = new String();
    public static String pass5 = new String();
    public static String pass6 = new String();
    public static String pass7 = new String();
    public static String pass8 = new String();
    public static String pass9 = new String();
    public static String pass10 = new String();
    public static String pass11 = new String();
    public static String pass12 = new String();
    public static String pass13 = new String();
    public static String pass14 = new String();
    public static String pass15 = new String();
    public static String pass16 = new String();
    public static String pass17 = new String();
    public static String pass18 = new String();
    public static String pass19 = new String();
    public static String pass20 = new String();
    public static String pass21 = new String();
    public static String pass22 = new String();
    public static String pass23 = new String();
    public static String pass24 = new String();
    public static String pass25 = new String();
    public static String pass26 = new String();
    public static String pass27 = new String();
    public static String pass28 = new String();
    public static String pass29 = new String();
    public static String pass30 = new String();
    public static String pass31 = new String();
    public static String pass32 = new String();
    public static String pass33 = new String();
    public static String pass34 = new String();
    public static String pass35 = new String();
    public static String pass36 = new String();
    public static String pass37 = new String();
    public static String pass38 = new String();
    public static String pass39 = new String();
    public static String pass40 = new String();
    public static String pass41 = new String();

    public static String pass42 = new String();
    public static String pass43 = new String();
    public static String pass44 = new String();
    public static String pass45 = new String();
    public static String pass46 = new String();
    public static String pass47 = new String();
    public static String pass48 = new String();

    public static String pass49 = new String();

    public static String pass50 = new String();

    public static String pass51  = new String();
    public static String pass52  = new String();
    public static String pass53  = new String();
    public static String pass54  = new String();
    public static String pass55  = new String();
    public static String pass56  = new String();
    public static String pass57  = new String();
    public static String pass58  = new String();
    public static String pass59  = new String();
    public static String pass60  = new String();
    public static String pass61  = new String();
    public static String pass62  = new String();
    public static String pass63  = new String();
    public static String pass64  = new String();
    public static String pass65  = new String();
    public static String pass66  = new String();
    public static String pass67  = new String();
    public static String pass68  = new String();
    public static String pass69  = new String();
    public static String pass70  = new String();
    public static String pass71  = new String();
    public static String pass72  = new String();
    public static String pass73  = new String();
    public static String pass74  = new String();
    public static String pass75  = new String();
    public static String pass76  = new String();
    public static String pass77  = new String();
    public static String pass78  = new String();
    public static String pass79  = new String();
    public static String pass80  = new String();
    public static String pass81  = new String();
    public static String pass82  = new String();
    public static String pass83  = new String();
    public static String pass84  = new String();
    public static String pass85  = new String();
    public static String pass86  = new String();
    public static String pass87  = new String();
    public static String pass88  = new String();
    public static String pass89  = new String();
    public static String pass90  = new String();
    public static String pass91  = new String();
    public static String pass92  = new String();
    public static String pass93  = new String();
    public static String pass94  = new String();
    public static String pass95  = new String();
    public static String pass96  = new String();
    public static String pass97  = new String();
    public static String pass98  = new String();
    public static String pass99  = new String();
    public static String pass100  = new String();

    public static String pass101 = new String();
    public static String pass102 = new String();
    public static String pass103 = new String();
    public static String pass104 = new String();
    public static String pass105 = new String();
    public static String pass106 = new String();
    public static String pass107 = new String();
    public static String pass108 = new String();
    public static String pass109 = new String();
    public static String pass110 = new String();
    public static String pass111 = new String();
    public static String pass112 = new String();
    public static String pass113 = new String();
    public static String pass114 = new String();
    public static String pass115 = new String();
    public static String pass116 = new String();
    public static String pass117 = new String();
    public static String pass118 = new String();
    public static String pass119 = new String();
    public static String pass120 = new String();

    public static void dinamicSetvalue(String titulo, String valor_math ){
        secuencia++;
        String valorStr = secuencia + " - " + titulo;
        switch(secuencia) {
            case 0: System.out.println("la secuencia es cero.");
                break;
            case 1: setPass1(valor_math); setTpass1(valorStr  );
                break;
            case 2: setPass2(valor_math); setTpass2(valorStr  );
                break;
            case 3: setPass3(valor_math); setTpass3(valorStr  );
                break;
            case 4: setPass4(valor_math); setTpass4(valorStr  );
                break;
            case 5: setPass5(valor_math); setTpass5(valorStr  );
                break;
            case 6: setPass6(valor_math); setTpass6(valorStr  );
                break;
            case 7: setPass7(valor_math); setTpass7(valorStr  );
                break;
            case 8: setPass8(valor_math); setTpass8(valorStr  );
                break;
            case 9: setPass9(valor_math); setTpass9(valorStr  );
                break;
            case 10: setPass10(valor_math); setTpass10(valorStr);
                break;
            case 11: setPass11(valor_math); setTpass11(valorStr  );
                break;
            case 12: setPass12(valor_math); setTpass12(valorStr  );
                break;
            case 13: setPass13(valor_math); setTpass13(valorStr  );
                break;
            case 14: setPass14(valor_math); setTpass14(valorStr  );
                break;
            case 15: setPass15(valor_math); setTpass15(valorStr  );
                break;
            case 16: setPass16(valor_math); setTpass16(valorStr  );
                break;
            case 17: setPass17(valor_math); setTpass17(valorStr  );
                break;
            case 18: setPass18(valor_math); setTpass18(valorStr  );
                break;
            case 19: setPass19(valor_math); setTpass19(valorStr  );
                break;
            case 20: setPass20(valor_math); setTpass20(valorStr  );
                break;
            case 21: setPass21(valor_math); setTpass21(valorStr  );
                break;
            case 22: setPass22(valor_math); setTpass22(valorStr  );
                break;
            case 23: setPass23(valor_math); setTpass23(valorStr  );
                break;
            case 24: setPass24(valor_math); setTpass24(valorStr  );
                break;
            case 25: setPass25(valor_math); setTpass25(valorStr  );
                break;
            case 26: setPass26(valor_math); setTpass26(valorStr  );
                break;
            case 27: setPass27(valor_math); setTpass27(valorStr  );
                break;
            case 28: setPass28(valor_math); setTpass28(valorStr  );
                break;
            case 29: setPass29(valor_math); setTpass29(valorStr  );
                break;
            case 30: setPass30(valor_math); setTpass30(valorStr  );
                break;
            case 31: setPass31(valor_math); setTpass31(valorStr );
                break;
            case 32: setPass32(valor_math); setTpass32(valorStr  );
                break;
            case 33: setPass33(valor_math); setTpass33(valorStr  );
                break;
            case 34: setPass34(valor_math); setTpass34(valorStr  );
                break;
            case 35: setPass35(valor_math); setTpass35(valorStr  );
                break;
            case 36: setPass36(valor_math); setTpass36(valorStr  );
                break;
            case 37: setPass37(valor_math); setTpass37(valorStr  );
                break;
            case 38: setPass38(valor_math); setTpass38(valorStr );
                break;
            case 39: setPass39(valor_math); setTpass39(valorStr  );
                break;
            case 40: setPass40(valor_math); setTpass40(valorStr  );
                break;
            case 41: setPass41(valor_math); setTpass41(valorStr  );
                break;
            case 42: setPass42(valor_math); setTpass42(valorStr  );
                break;
            case 43: setPass43(valor_math); setTpass43(valorStr  );
                break;
            case 44: setPass44(valor_math); setTpass44(valorStr  );
                break;
            case 45: setPass45(valor_math); setTpass45(valorStr  );
                break;
            case 46: setPass46(valor_math); setTpass46(valorStr );
                break;
            case 47: setPass47(valor_math); setTpass47(valorStr  );
                break;
            case 48: setPass48(valor_math); setTpass48(valorStr  );
                break;
            case 49: setPass49(valor_math); setTpass49(valorStr  );
                break;
            case 50: setPass50(valor_math); setTpass50(valorStr);
                break;
            case 51: setPass51(valor_math); setTpass51(valorStr);
                break;
            case 52: setPass52(valor_math); setTpass52(valorStr);
                break;
            case 53: setPass53(valor_math); setTpass53(valorStr);
                break;
            case 54: setPass54(valor_math); setTpass54(valorStr);
                break;
            case 55: setPass55(valor_math); setTpass55(valorStr);
                break;
            case 56: setPass56(valor_math); setTpass56(valorStr);
                break;
            case 57: setPass57(valor_math); setTpass57(valorStr);
                break;
            case 58: setPass58(valor_math); setTpass58(valorStr);
                break;
            case 59: setPass59(valor_math); setTpass59(valorStr);
                break;
            case 60: setPass60(valor_math); setTpass60(valorStr);
                break;
            case 61: setPass61(valor_math); setTpass61(valorStr);
                break;
            case 62: setPass62(valor_math); setTpass62(valorStr);
                break;
            case 63: setPass63(valor_math); setTpass63(valorStr);
                break;
            case 64: setPass64(valor_math); setTpass64(valorStr);
                break;
            case 65: setPass65(valor_math); setTpass65(valorStr);
                break;
            case 66: setPass66(valor_math); setTpass66(valorStr);
                break;
            case 67: setPass67(valor_math); setTpass67(valorStr);
                break;
            case 68: setPass68(valor_math); setTpass68(valorStr);
                break;
            case 69: setPass69(valor_math); setTpass69(valorStr);
                break;
            case 70: setPass70(valor_math); setTpass70(valorStr);
                break;
            case 71: setPass71(valor_math); setTpass71(valorStr);
                break;
            case 72: setPass72(valor_math); setTpass72(valorStr);
                break;
            case 73: setPass73(valor_math); setTpass73(valorStr);
                break;
            case 74: setPass74(valor_math); setTpass74(valorStr);
                break;
            case 75: setPass75(valor_math); setTpass75(valorStr);
                break;
            case 76: setPass76(valor_math); setTpass76(valorStr);
                break;
            case 77: setPass77(valor_math); setTpass77(valorStr);
                break;
            case 78: setPass78(valor_math); setTpass78(valorStr);
                break;
            case 79: setPass79(valor_math); setTpass79(valorStr);
                break;
            case 80: setPass80(valor_math); setTpass80(valorStr);
                break;
            case 81: setPass81(valor_math); setTpass81(valorStr);
                break;
            case 82: setPass82(valor_math); setTpass82(valorStr);
                break;
            case 83: setPass83(valor_math); setTpass83(valorStr);
                break;
            case 84: setPass84(valor_math); setTpass84(valorStr);
                break;
            case 85: setPass85(valor_math); setTpass85(valorStr);
                break;
            case 86: setPass86(valor_math); setTpass86(valorStr);
                break;
            case 87: setPass87(valor_math); setTpass87(valorStr);
                break;
            case 88: setPass88(valor_math); setTpass88(valorStr);
                break;
            case 89: setPass89(valor_math); setTpass89(valorStr);
                break;
            case 90: setPass90(valor_math); setTpass90(valorStr);
                break;
            case 91: setPass91(valor_math); setTpass91(valorStr);
                break;
            case 92: setPass92(valor_math); setTpass92(valorStr);
                break;
            case 93: setPass93(valor_math); setTpass93(valorStr);
                break;
            case 94: setPass94(valor_math); setTpass94(valorStr);
                break;
            case 95: setPass95(valor_math); setTpass95(valorStr);
                break;
            case 96: setPass96(valor_math); setTpass96(valorStr);
                break;
            case 97: setPass97(valor_math); setTpass97(valorStr);
                break;
            case 98: setPass98(valor_math); setTpass98(valorStr);
                break;
            case 99: setPass99(valor_math); setTpass99(valorStr);
                break;
            case 100: setPass100(valor_math); setTpass100(valorStr);
                break;
            case 101: setPass101(valor_math); setTpass101(valorStr  );
                break;
            case 102: setPass102(valor_math); setTpass102(valorStr  );
                break;
            case 103: setPass103(valor_math); setTpass103(valorStr  );
                break;
            case 104: setPass104(valor_math); setTpass104(valorStr  );
                break;
            case 105: setPass105(valor_math); setTpass105(valorStr  );
                break;
            case 106: setPass106(valor_math); setTpass106(valorStr  );
                break;
            case 107: setPass107(valor_math); setTpass107(valorStr  );
                break;
            case 108: setPass108(valor_math); setTpass108(valorStr  );
                break;
            case 109: setPass109(valor_math); setTpass109(valorStr  );
                break;
            case 110: setPass110(valor_math); setTpass110(valorStr);
                break;
            case 111: setPass111(valor_math); setTpass111(valorStr  );
                break;
            case 112: setPass112(valor_math); setTpass112(valorStr  );
                break;
            case 113: setPass113(valor_math); setTpass113(valorStr  );
                break;
            case 114: setPass114(valor_math); setTpass114(valorStr  );
                break;
            case 115: setPass115(valor_math); setTpass115(valorStr  );
                break;
            case 116: setPass116(valor_math); setTpass116(valorStr  );
                break;
            case 117: setPass117(valor_math); setTpass117(valorStr  );
                break;
            case 118: setPass118(valor_math); setTpass118(valorStr  );
                break;
            case 119: setPass119(valor_math); setTpass119(valorStr  );
                break;
            case 120: setPass120(valor_math); setTpass120(valorStr  );
                break;
            default:
                System.out.println("secuencia es mayor a opciones validas.");
        }

    }


    public static void setTpass35(String tpass35) {
        ClaseDatosPythonJava.tpass35 = tpass35;
    }

    public static void setTpass36(String tpass36) {
        ClaseDatosPythonJava.tpass36 = tpass36;
    }

    public static void setTpass37(String tpass37) {
        ClaseDatosPythonJava.tpass37 = tpass37;
    }

    public static void setTpass38(String tpass38) {
        ClaseDatosPythonJava.tpass38 = tpass38;
    }

    public static void setTpass39(String tpass39) {
        ClaseDatosPythonJava.tpass39 = tpass39;
    }

    public static void setTpass40(String tpass40) {
        ClaseDatosPythonJava.tpass40 = tpass40;
    }

    public static void setTpass41(String tpass41) {
        ClaseDatosPythonJava.tpass41 = tpass41;
    }

    public static void setPass35(String pass35) {
        ClaseDatosPythonJava.pass35 = pass35;
    }

    public static void setPass36(String pass36) {
        ClaseDatosPythonJava.pass36 = pass36;
    }

    public static void setPass37(String pass37) {
        ClaseDatosPythonJava.pass37 = pass37;
    }

    public static void setPass38(String pass38) {
        ClaseDatosPythonJava.pass38 = pass38;
    }

    public static void setPass39(String pass39) {
        ClaseDatosPythonJava.pass39 = pass39;
    }

    public static void setPass40(String pass40) {
        ClaseDatosPythonJava.pass40 = pass40;
    }

    public static void setPass41(String pass41) {
        ClaseDatosPythonJava.pass41 = pass41;
    }

    public static void setTpass101(String tpass101) {
        ClaseDatosPythonJava.tpass101 = tpass101;
    }

    public static void setTpass102(String tpass102) {
        ClaseDatosPythonJava.tpass102 = tpass102;
    }

    public static void setTpass103(String tpass103) {
        ClaseDatosPythonJava.tpass103 = tpass103;
    }

    public static void setTpass104(String tpass104) {
        ClaseDatosPythonJava.tpass104 = tpass104;
    }

    public static void setTpass105(String tpass105) {
        ClaseDatosPythonJava.tpass105 = tpass105;
    }

    public static void setTpass106(String tpass106) {
        ClaseDatosPythonJava.tpass106 = tpass106;
    }

    public static void setTpass107(String tpass107) {
        ClaseDatosPythonJava.tpass107 = tpass107;
    }

    public static void setTpass108(String tpass108) {
        ClaseDatosPythonJava.tpass108 = tpass108;
    }

    public static void setTpass109(String tpass109) {
        ClaseDatosPythonJava.tpass109 = tpass109;
    }

    public static void setTpass110(String tpass110) {
        ClaseDatosPythonJava.tpass110 = tpass110;
    }

    public static void setTpass111(String tpass111) {
        ClaseDatosPythonJava.tpass111 = tpass111;
    }

    public static void setTpass112(String tpass112) {
        ClaseDatosPythonJava.tpass112 = tpass112;
    }

    public static void setTpass113(String tpass113) {
        ClaseDatosPythonJava.tpass113 = tpass113;
    }

    public static void setTpass114(String tpass114) {
        ClaseDatosPythonJava.tpass114 = tpass114;
    }

    public static void setTpass115(String tpass115) {
        ClaseDatosPythonJava.tpass115 = tpass115;
    }

    public static void setTpass116(String tpass116) {
        ClaseDatosPythonJava.tpass116 = tpass116;
    }

    public static void setTpass117(String tpass117) {
        ClaseDatosPythonJava.tpass117 = tpass117;
    }

    public static void setTpass118(String tpass118) {
        ClaseDatosPythonJava.tpass118 = tpass118;
    }

    public static void setTpass119(String tpass119) {
        ClaseDatosPythonJava.tpass119 = tpass119;
    }

    public static void setTpass120(String tpass120) {
        ClaseDatosPythonJava.tpass120 = tpass120;
    }

    public static void setPass101(String pass101) {
        ClaseDatosPythonJava.pass101 = pass101;
    }

    public static void setPass102(String pass102) {
        ClaseDatosPythonJava.pass102 = pass102;
    }

    public static void setPass103(String pass103) {
        ClaseDatosPythonJava.pass103 = pass103;
    }

    public static void setPass104(String pass104) {
        ClaseDatosPythonJava.pass104 = pass104;
    }

    public static void setPass105(String pass105) {
        ClaseDatosPythonJava.pass105 = pass105;
    }

    public static void setPass106(String pass106) {
        ClaseDatosPythonJava.pass106 = pass106;
    }

    public static void setPass107(String pass107) {
        ClaseDatosPythonJava.pass107 = pass107;
    }

    public static void setPass108(String pass108) {
        ClaseDatosPythonJava.pass108 = pass108;
    }

    public static void setPass109(String pass109) {
        ClaseDatosPythonJava.pass109 = pass109;
    }

    public static void setPass110(String pass110) {
        ClaseDatosPythonJava.pass110 = pass110;
    }

    public static void setPass111(String pass111) {
        ClaseDatosPythonJava.pass111 = pass111;
    }

    public static void setPass112(String pass112) {
        ClaseDatosPythonJava.pass112 = pass112;
    }

    public static void setPass113(String pass113) {
        ClaseDatosPythonJava.pass113 = pass113;
    }

    public static void setPass114(String pass114) {
        ClaseDatosPythonJava.pass114 = pass114;
    }

    public static void setPass115(String pass115) {
        ClaseDatosPythonJava.pass115 = pass115;
    }

    public static void setPass116(String pass116) {
        ClaseDatosPythonJava.pass116 = pass116;
    }

    public static void setPass117(String pass117) {
        ClaseDatosPythonJava.pass117 = pass117;
    }

    public static void setPass118(String pass118) {
        ClaseDatosPythonJava.pass118 = pass118;
    }

    public static void setPass119(String pass119) {
        ClaseDatosPythonJava.pass119 = pass119;
    }

    public static void setPass120(String pass120) {
        ClaseDatosPythonJava.pass120 = pass120;
    }

    public static void dinamicSetvalue_null( ){
        secuencia++;

        switch(secuencia) {
            case 0:
                System.out.println("la secuencia es cero.");
                break;
            case 1: setPass1("");
                setTpass1("" );
                break;
            case 2: setPass2("");
                setTpass2(""  );
                break;
            case 3: setPass3("");
                setTpass3("" );
                break;
            case 4: setPass4("");
                setTpass4(""  );
                break;
            case 5: setPass5("");
                setTpass5(""  );
                break;
            case 6: setPass6("");
                setTpass6("" );
                break;
            case 7: setPass7("");
                setTpass7(""  );
                break;
            case 8: setPass8("");
                setTpass8(""  );
                break;
            case 9: setPass9("");
                setTpass9(""  );
                break;
            case 10: setPass10("");
                setTpass10("");
                break;
            case 11: setPass11("");
                setTpass11(""  );
                break;
            case 12: setPass12("");
                setTpass12(""  );
                break;
            case 13: setPass13("");
                setTpass13(""  );
                break;
            case 14: setPass14("");
                setTpass14("" );
                break;
            case 15: setPass15("");
                setTpass15(""  );
                break;
            case 16: setPass16("");
                setTpass16(""  );
                break;
            case 17: setPass17("");
                setTpass17(""  );
                break;
            case 18: setPass18("");
                setTpass18(""  );
                break;
            case 19: setPass19("");
                setTpass19("" );
                break;
            case 20: setPass20("");
                setTpass20("" );
                break;
            case 21: setPass21("");
                setTpass21(""  );
                break;
            case 22: setPass22("");
                setTpass22(""  );
                break;
            case 23: setPass23("");
                setTpass23(""  );
                break;
            case 24: setPass24("");
                setTpass24(""  );
                break;
            case 25: setPass25("");
                setTpass25(""  );
                break;
            case 26: setPass26("");
                setTpass26(""  );
                break;
            case 27: setPass27("");
                setTpass27(""  );
                break;
            case 28: setPass28("");
                setTpass28("" );
                break;
            case 29: setPass29("");
                setTpass29(""  );
                break;
            case 30: setPass30("");
                setTpass30("" );
                break;
            case 31: setPass31("");
                setTpass31("" );
                break;
            case 32: setPass32("");
                setTpass32(""  );
                break;
            case 33: setPass33("");
                setTpass33(""  );
                break;
            case 34: setPass34("");
                setTpass34(""  );
                break;

            case 35: setPass35("");
                setTpass35("" );
                break;
            case 36: setPass36("");
                setTpass36(""  );
                break;
            case 37: setPass37("");
                setTpass37("" );
                break;
            case 38: setPass38("");
                setTpass38("" );
                break;
            case 39: setPass39("");
                setTpass39(""  );
                break;
            case 40: setPass40("");
                setTpass40(""  );
                break;
            case 41: setPass41("");
                setTpass41(""  );
                break;
            case 42: setPass42("");
                setTpass42(""  );
                break;
            case 43: setPass43("");
                setTpass43("" );
                break;
            case 44: setPass44("");
                setTpass44("" );
                break;
            case 45: setPass45("");
                setTpass45(""  );
                break;
            case 46: setPass46("");
                setTpass46(""  );
                break;
            case 47: setPass47("");
                setTpass47(""  );
                break;
            case 48: setPass48("");
                setTpass48(""  );
                break;
                case 49: setPass49("");
                setTpass49(""  );
                break;
            case 50: setPass50(""); setTpass50(""  );
                break;
            case 51: setPass51(""); setTpass51(""  );
                break;
            case 52: setPass52(""); setTpass52(""  );
                break;
            case 53: setPass53(""); setTpass53(""  );
                break;
            case 54: setPass54(""); setTpass54("" );
                break;
            case 55: setPass55(""); setTpass55(""  );
                break;
            case 56: setPass56(""); setTpass56("" );
                break;
            case 57: setPass57(""); setTpass57("" );
                break;
            case 58: setPass58(""); setTpass58(""  );
                break;
            case 59: setPass59(""); setTpass59(""  );
                break;
            case 60: setPass60(""); setTpass60(""  );
                break;

            case 61: setPass61(""); setTpass61("" );
                break;
            case 62: setPass62(""); setTpass62(""  );
                break;
            case 63: setPass63(""); setTpass63("" );
                break;
            case 64: setPass64(""); setTpass64("" );
                break;
            case 65: setPass65(""); setTpass65(""  );
                break;
            case 66: setPass66(""); setTpass66(""  );
                break;
            case 67: setPass67(""); setTpass67(""  );
                break;
            case 68: setPass68(""); setTpass68(""  );
                break;
            case 69: setPass69(""); setTpass69("" );
                break;
            case 70: setPass70(""); setTpass70("" );
                break;
            case 71: setPass71(""); setTpass71(""  );
                break;
            case 72: setPass72(""); setTpass72(""  );
                break;
            case 73: setPass73(""); setTpass73(""  );
                break;
            case 74: setPass74(""); setTpass74("" );
                break;
            case 75: setPass75(""); setTpass75(""  );
                break;
            case 76: setPass76(""); setTpass76("");
                break;
            case 77: setPass77(""); setTpass77("");
                break;
            case 78: setPass78(""); setTpass78("");
                break;
            case 79: setPass79(""); setTpass79("");
                break;
            case 80: setPass80(""); setTpass80("");
                break;
            case 81: setPass81(""); setTpass81("");
                break;
            case 82: setPass82(""); setTpass82("");
                break;
            case 83: setPass83(""); setTpass83("");
                break;
            case 84: setPass84(""); setTpass84("");
                break;
            case 85: setPass85(""); setTpass85("");
                break;
            case 86: setPass86(""); setTpass86("");
                break;
            case 87: setPass87(""); setTpass87("");
                break;
            case 88: setPass88(""); setTpass88("");
                break;
            case 89: setPass89(""); setTpass89("");
                break;
            case 90: setPass90(""); setTpass90("");
                break;
            case 91: setPass91(""); setTpass91("");
                break;
            case 92: setPass92(""); setTpass92("");
                break;
            case 93: setPass93(""); setTpass93("");
                break;
            case 94: setPass94(""); setTpass94("");
                break;
            case 95: setPass95(""); setTpass95("");
                break;
            case 96: setPass96(""); setTpass96("");
                break;
            case 97: setPass97(""); setTpass97("");
                break;
            case 98: setPass98(""); setTpass98("");
                break;
            case 99: setPass99(""); setTpass99("");
                break;
            case 100: setPass100(""); setTpass100("");
                break;
            case 101: setPass101("");
                setTpass101("" );
                break;
            case 102: setPass102("");
                setTpass102(""  );
                break;
            case 103: setPass103("");
                setTpass103("" );
                break;
            case 104: setPass104("");
                setTpass104(""  );
                break;
            case 105: setPass105("");
                setTpass105(""  );
                break;
            case 106: setPass106("");
                setTpass106("" );
                break;
            case 107: setPass107("");
                setTpass107(""  );
                break;
            case 108: setPass108("");
                setTpass108(""  );
                break;
            case 109: setPass109("");
                setTpass109(""  );
                break;
            case 110: setPass110("");
                setTpass110("");
                break;
            case 111: setPass111("");
                setTpass111(""  );
                break;
            case 112: setPass112("");
                setTpass112(""  );
                break;
            case 113: setPass113("");
                setTpass113(""  );
                break;
            case 114: setPass114("");
                setTpass114("" );
                break;
            case 115: setPass115("");
                setTpass115(""  );
                break;
            case 116: setPass116("");
                setTpass116(""  );
                break;
            case 117: setPass117("");
                setTpass117(""  );
                break;
            case 118: setPass118("");
                setTpass118(""  );
                break;
            case 119: setPass119("");
                setTpass119("" );
                break;
            case 120: setPass120("");
                setTpass120("" );
                break;
            default:
                System.out.println("secuencia es mayor a opciones validas.");
        }

    }
    public static void vaciar_etiquetas(){
        secuencia =0;
        for (int i = 0; i < 100 ; i++) {
            dinamicSetvalue_null();
        }
        secuencia =0;
    }

    public static void setTpass1(String tpass1) {
        ClaseDatosPythonJava.tpass1 = tpass1;
    }

    public static void setTpass2(String tpass2) {
        ClaseDatosPythonJava.tpass2 = tpass2;
    }

    public static void setTpass3(String tpass3) {
        ClaseDatosPythonJava.tpass3 = tpass3;
    }

    public static void setTpass4(String tpass4) {
        ClaseDatosPythonJava.tpass4 = tpass4;
    }

    public static void setTpass5(String tpass5) {
        ClaseDatosPythonJava.tpass5 = tpass5;
    }

    public static void setTpass6(String tpass6) {
        ClaseDatosPythonJava.tpass6 = tpass6;
    }

    public static void setTpass7(String tpass7) {
        ClaseDatosPythonJava.tpass7 = tpass7;
    }

    public static void setTpass8(String tpass8) {
        ClaseDatosPythonJava.tpass8 = tpass8;
    }

    public static void setTpass9(String tpass9) {
        ClaseDatosPythonJava.tpass9 = tpass9;
    }

    public static void setTpass10(String tpass10) {
        ClaseDatosPythonJava.tpass10 = tpass10;
    }

    public static void setTpass11(String tpass11) {
        ClaseDatosPythonJava.tpass11 = tpass11;
    }

    public static void setTpass12(String tpass12) {
        ClaseDatosPythonJava.tpass12 = tpass12;
    }

    public static void setTpass13(String tpass13) {
        ClaseDatosPythonJava.tpass13 = tpass13;
    }

    public static void setTpass14(String tpass14) {
        ClaseDatosPythonJava.tpass14 = tpass14;
    }

    public static void setTpass15(String tpass15) {
        ClaseDatosPythonJava.tpass15 = tpass15;
    }

    public static void setTpass16(String tpass16) {
        ClaseDatosPythonJava.tpass16 = tpass16;
    }

    public static void setTpass17(String tpass17) {
        ClaseDatosPythonJava.tpass17 = tpass17;
    }

    public static void setTpass18(String tpass18) {
        ClaseDatosPythonJava.tpass18 = tpass18;
    }

    public static void setTpass19(String tpass19) {
        ClaseDatosPythonJava.tpass19 = tpass19;
    }

    public static void setTpass20(String tpass20) {
        ClaseDatosPythonJava.tpass20 = tpass20;
    }

    public static void setTpass21(String tpass21) {
        ClaseDatosPythonJava.tpass21 = tpass21;
    }

    public static void setTpass22(String tpass22) {
        ClaseDatosPythonJava.tpass22 = tpass22;
    }

    public static void setTpass23(String tpass23) {
        ClaseDatosPythonJava.tpass23 = tpass23;
    }

    public static void setTpass24(String tpass24) {
        ClaseDatosPythonJava.tpass24 = tpass24;
    }

    public static void setTpass25(String tpass25) {
        ClaseDatosPythonJava.tpass25 = tpass25;
    }

    public static void setTpass26(String tpass26) {
        ClaseDatosPythonJava.tpass26 = tpass26;
    }

    public static void setTpass27(String tpass27) {
        ClaseDatosPythonJava.tpass27 = tpass27;
    }

    public static void setTpass28(String tpass28) {
        ClaseDatosPythonJava.tpass28 = tpass28;
    }

    public static void setTpass29(String tpass29) {
        ClaseDatosPythonJava.tpass29 = tpass29;
    }

    public static void setTpass30(String tpass30) {
        ClaseDatosPythonJava.tpass30 = tpass30;
    }

    public static void setTpass31(String tpass31) {
        ClaseDatosPythonJava.tpass31 = tpass31;
    }

    public static void setTpass32(String tpass32) {
        ClaseDatosPythonJava.tpass32 = tpass32;
    }

    public static void setTpass33(String tpass33) {
        ClaseDatosPythonJava.tpass33 = tpass33;
    }

    public static void setTpass34(String tpass34) {
        ClaseDatosPythonJava.tpass34 = tpass34;
    }

    public static void setPass1(String pass1) {
        ClaseDatosPythonJava.pass1 = pass1;
    }

    public static void setPass2(String pass2) {
        ClaseDatosPythonJava.pass2 = pass2;
    }

    public static void setPass3(String pass3) {
        ClaseDatosPythonJava.pass3 = pass3;
    }

    public static void setPass4(String pass4) {
        ClaseDatosPythonJava.pass4 = pass4;
    }

    public static void setPass5(String pass5) {
        ClaseDatosPythonJava.pass5 = pass5;
    }

    public static void setPass6(String pass6) {
        ClaseDatosPythonJava.pass6 = pass6;
    }

    public static void setPass7(String pass7) {
        ClaseDatosPythonJava.pass7 = pass7;
    }

    public static void setPass8(String pass8) {
        ClaseDatosPythonJava.pass8 = pass8;
    }

    public static void setPass9(String pass9) {
        ClaseDatosPythonJava.pass9 = pass9;
    }

    public static void setPass10(String pass10) {
        ClaseDatosPythonJava.pass10 = pass10;
    }

    public static void setPass11(String pass11) {
        ClaseDatosPythonJava.pass11 = pass11;
    }

    public static void setPass12(String pass12) {
        ClaseDatosPythonJava.pass12 = pass12;
    }

    public static void setPass13(String pass13) {
        ClaseDatosPythonJava.pass13 = pass13;
    }

    public static void setPass14(String pass14) {
        ClaseDatosPythonJava.pass14 = pass14;
    }

    public static void setPass15(String pass15) {
        ClaseDatosPythonJava.pass15 = pass15;
    }

    public static void setPass16(String pass16) {
        ClaseDatosPythonJava.pass16 = pass16;
    }

    public static void setPass17(String pass17) {
        ClaseDatosPythonJava.pass17 = pass17;
    }

    public static void setPass18(String pass18) {
        ClaseDatosPythonJava.pass18 = pass18;
    }

    public static void setPass19(String pass19) {
        ClaseDatosPythonJava.pass19 = pass19;
    }

    public static void setPass20(String pass20) {
        ClaseDatosPythonJava.pass20 = pass20;
    }

    public static void setPass21(String pass21) {
        ClaseDatosPythonJava.pass21 = pass21;
    }

    public static void setPass22(String pass22) {
        ClaseDatosPythonJava.pass22 = pass22;
    }

    public static void setPass23(String pass23) {
        ClaseDatosPythonJava.pass23 = pass23;
    }

    public static void setPass24(String pass24) {
        ClaseDatosPythonJava.pass24 = pass24;
    }

    public static void setPass25(String pass25) {
        ClaseDatosPythonJava.pass25 = pass25;
    }

    public static void setPass26(String pass26) {
        ClaseDatosPythonJava.pass26 = pass26;
    }

    public static void setPass27(String pass27) {
        ClaseDatosPythonJava.pass27 = pass27;
    }

    public static void setPass28(String pass28) {
        ClaseDatosPythonJava.pass28 = pass28;
    }

    public static void setPass29(String pass29) {
        ClaseDatosPythonJava.pass29 = pass29;
    }

    public static void setPass30(String pass30) {
        ClaseDatosPythonJava.pass30 = pass30;
    }

    public static void setPass31(String pass31) {
        ClaseDatosPythonJava.pass31 = pass31;
    }

    public static void setPass32(String pass32) {
        ClaseDatosPythonJava.pass32 = pass32;
    }

    public static void setPass33(String pass33) {
        ClaseDatosPythonJava.pass33 = pass33;
    }

    public static void setPass34(String pass34) {
        ClaseDatosPythonJava.pass34 = pass34;
    }

    public static void setTpass42(String tpass42) {
        ClaseDatosPythonJava.tpass42 = tpass42;
    }

    public static void setTpass43(String tpass43) {
        ClaseDatosPythonJava.tpass43 = tpass43;
    }

    public static void setTpass44(String tpass44) {
        ClaseDatosPythonJava.tpass44 = tpass44;
    }

    public static void setTpass45(String tpass45) {
        ClaseDatosPythonJava.tpass45 = tpass45;
    }

    public static void setTpass46(String tpass46) {
        ClaseDatosPythonJava.tpass46 = tpass46;
    }

    public static void setTpass47(String tpass47) {
        ClaseDatosPythonJava.tpass47 = tpass47;
    }

    public static void setTpass48(String tpass48) {
        ClaseDatosPythonJava.tpass48 = tpass48;
    }

    public static void setPass42(String pass42) {
        ClaseDatosPythonJava.pass42 = pass42;
    }

    public static void setPass43(String pass43) {
        ClaseDatosPythonJava.pass43 = pass43;
    }

    public static void setPass44(String pass44) {
        ClaseDatosPythonJava.pass44 = pass44;
    }

    public static void setPass45(String pass45) {
        ClaseDatosPythonJava.pass45 = pass45;
    }

    public static void setPass46(String pass46) {
        ClaseDatosPythonJava.pass46 = pass46;
    }

    public static void setPass47(String pass47) {
        ClaseDatosPythonJava.pass47 = pass47;
    }

    public static void setPass48(String pass48) {
        ClaseDatosPythonJava.pass48 = pass48;
    }

    public static void setTpass49(String tpass49) {
        ClaseDatosPythonJava.tpass49 = tpass49;
    }

    public static void setPass49(String pass49) {
        ClaseDatosPythonJava.pass49 = pass49;
    }

    public static void setTpass50(String tpass50) {
        ClaseDatosPythonJava.tpass50 = tpass50;
    }

    public static void setTpass51(String tpass51) {
        ClaseDatosPythonJava.tpass51 = tpass51;
    }

    public static void setTpass52(String tpass52) {
        ClaseDatosPythonJava.tpass52 = tpass52;
    }

    public static void setTpass53(String tpass53) {
        ClaseDatosPythonJava.tpass53 = tpass53;
    }

    public static void setTpass54(String tpass54) {
        ClaseDatosPythonJava.tpass54 = tpass54;
    }

    public static void setTpass55(String tpass55) {
        ClaseDatosPythonJava.tpass55 = tpass55;
    }

    public static void setTpass56(String tpass56) {
        ClaseDatosPythonJava.tpass56 = tpass56;
    }

    public static void setTpass57(String tpass57) {
        ClaseDatosPythonJava.tpass57 = tpass57;
    }

    public static void setTpass58(String tpass58) {
        ClaseDatosPythonJava.tpass58 = tpass58;
    }

    public static void setTpass59(String tpass59) {
        ClaseDatosPythonJava.tpass59 = tpass59;
    }

    public static void setTpass60(String tpass60) {
        ClaseDatosPythonJava.tpass60 = tpass60;
    }

    public static void setTpass61(String tpass61) {
        ClaseDatosPythonJava.tpass61 = tpass61;
    }

    public static void setTpass62(String tpass62) {
        ClaseDatosPythonJava.tpass62 = tpass62;
    }

    public static void setTpass63(String tpass63) {
        ClaseDatosPythonJava.tpass63 = tpass63;
    }

    public static void setTpass64(String tpass64) {
        ClaseDatosPythonJava.tpass64 = tpass64;
    }

    public static void setTpass65(String tpass65) {
        ClaseDatosPythonJava.tpass65 = tpass65;
    }

    public static void setTpass66(String tpass66) {
        ClaseDatosPythonJava.tpass66 = tpass66;
    }

    public static void setTpass67(String tpass67) {
        ClaseDatosPythonJava.tpass67 = tpass67;
    }

    public static void setTpass68(String tpass68) {
        ClaseDatosPythonJava.tpass68 = tpass68;
    }

    public static void setTpass69(String tpass69) {
        ClaseDatosPythonJava.tpass69 = tpass69;
    }

    public static void setTpass70(String tpass70) {
        ClaseDatosPythonJava.tpass70 = tpass70;
    }

    public static void setTpass71(String tpass71) {
        ClaseDatosPythonJava.tpass71 = tpass71;
    }

    public static void setTpass72(String tpass72) {
        ClaseDatosPythonJava.tpass72 = tpass72;
    }

    public static void setTpass73(String tpass73) {
        ClaseDatosPythonJava.tpass73 = tpass73;
    }

    public static void setTpass74(String tpass74) {
        ClaseDatosPythonJava.tpass74 = tpass74;
    }

    public static void setTpass75(String tpass75) {
        ClaseDatosPythonJava.tpass75 = tpass75;
    }

    public static void setPass50(String pass50) {
        ClaseDatosPythonJava.pass50 = pass50;
    }

    public static void setPass51(String pass51) {
        ClaseDatosPythonJava.pass51 = pass51;
    }

    public static void setPass52(String pass52) {
        ClaseDatosPythonJava.pass52 = pass52;
    }

    public static void setPass53(String pass53) {
        ClaseDatosPythonJava.pass53 = pass53;
    }

    public static void setPass54(String pass54) {
        ClaseDatosPythonJava.pass54 = pass54;
    }

    public static void setPass55(String pass55) {
        ClaseDatosPythonJava.pass55 = pass55;
    }

    public static void setPass56(String pass56) {
        ClaseDatosPythonJava.pass56 = pass56;
    }

    public static void setPass57(String pass57) {
        ClaseDatosPythonJava.pass57 = pass57;
    }

    public static void setPass58(String pass58) {
        ClaseDatosPythonJava.pass58 = pass58;
    }

    public static void setPass59(String pass59) {
        ClaseDatosPythonJava.pass59 = pass59;
    }

    public static void setPass60(String pass60) {
        ClaseDatosPythonJava.pass60 = pass60;
    }

    public static void setPass61(String pass61) {
        ClaseDatosPythonJava.pass61 = pass61;
    }

    public static void setPass62(String pass62) {
        ClaseDatosPythonJava.pass62 = pass62;
    }

    public static void setPass63(String pass63) {
        ClaseDatosPythonJava.pass63 = pass63;
    }

    public static void setPass64(String pass64) {
        ClaseDatosPythonJava.pass64 = pass64;
    }

    public static void setPass65(String pass65) {
        ClaseDatosPythonJava.pass65 = pass65;
    }

    public static void setPass66(String pass66) {
        ClaseDatosPythonJava.pass66 = pass66;
    }

    public static void setPass67(String pass67) {
        ClaseDatosPythonJava.pass67 = pass67;
    }

    public static void setPass68(String pass68) {
        ClaseDatosPythonJava.pass68 = pass68;
    }

    public static void setPass69(String pass69) {
        ClaseDatosPythonJava.pass69 = pass69;
    }

    public static void setPass70(String pass70) {
        ClaseDatosPythonJava.pass70 = pass70;
    }

    public static void setPass71(String pass71) {
        ClaseDatosPythonJava.pass71 = pass71;
    }

    public static void setPass72(String pass72) {
        ClaseDatosPythonJava.pass72 = pass72;
    }

    public static void setPass73(String pass73) {
        ClaseDatosPythonJava.pass73 = pass73;
    }

    public static void setPass74(String pass74) {
        ClaseDatosPythonJava.pass74 = pass74;
    }

    public static void setPass75(String pass75) {
        ClaseDatosPythonJava.pass75 = pass75;
    }

    public static void setTpass76(String tpass76) {
        ClaseDatosPythonJava.tpass76 = tpass76;
    }

    public static void setTpass77(String tpass77) {
        ClaseDatosPythonJava.tpass77 = tpass77;
    }

    public static void setTpass78(String tpass78) {
        ClaseDatosPythonJava.tpass78 = tpass78;
    }

    public static void setTpass79(String tpass79) {
        ClaseDatosPythonJava.tpass79 = tpass79;
    }

    public static void setTpass80(String tpass80) {
        ClaseDatosPythonJava.tpass80 = tpass80;
    }

    public static void setTpass81(String tpass81) {
        ClaseDatosPythonJava.tpass81 = tpass81;
    }

    public static void setTpass82(String tpass82) {
        ClaseDatosPythonJava.tpass82 = tpass82;
    }

    public static void setTpass83(String tpass83) {
        ClaseDatosPythonJava.tpass83 = tpass83;
    }

    public static void setTpass84(String tpass84) {
        ClaseDatosPythonJava.tpass84 = tpass84;
    }

    public static void setTpass85(String tpass85) {
        ClaseDatosPythonJava.tpass85 = tpass85;
    }

    public static void setTpass86(String tpass86) {
        ClaseDatosPythonJava.tpass86 = tpass86;
    }

    public static void setTpass87(String tpass87) {
        ClaseDatosPythonJava.tpass87 = tpass87;
    }

    public static void setTpass88(String tpass88) {
        ClaseDatosPythonJava.tpass88 = tpass88;
    }

    public static void setTpass89(String tpass89) {
        ClaseDatosPythonJava.tpass89 = tpass89;
    }

    public static void setTpass90(String tpass90) {
        ClaseDatosPythonJava.tpass90 = tpass90;
    }

    public static void setTpass91(String tpass91) {
        ClaseDatosPythonJava.tpass91 = tpass91;
    }

    public static void setTpass92(String tpass92) {
        ClaseDatosPythonJava.tpass92 = tpass92;
    }

    public static void setTpass93(String tpass93) {
        ClaseDatosPythonJava.tpass93 = tpass93;
    }

    public static void setTpass94(String tpass94) {
        ClaseDatosPythonJava.tpass94 = tpass94;
    }

    public static void setTpass95(String tpass95) {
        ClaseDatosPythonJava.tpass95 = tpass95;
    }

    public static void setTpass96(String tpass96) {
        ClaseDatosPythonJava.tpass96 = tpass96;
    }

    public static void setTpass97(String tpass97) {
        ClaseDatosPythonJava.tpass97 = tpass97;
    }

    public static void setTpass98(String tpass98) {
        ClaseDatosPythonJava.tpass98 = tpass98;
    }

    public static void setTpass99(String tpass99) {
        ClaseDatosPythonJava.tpass99 = tpass99;
    }

    public static void setTpass100(String tpass100) {
        ClaseDatosPythonJava.tpass100 = tpass100;
    }

    public static void setPass76(String pass76) {
        ClaseDatosPythonJava.pass76 = pass76;
    }

    public static void setPass77(String pass77) {
        ClaseDatosPythonJava.pass77 = pass77;
    }

    public static void setPass78(String pass78) {
        ClaseDatosPythonJava.pass78 = pass78;
    }

    public static void setPass79(String pass79) {
        ClaseDatosPythonJava.pass79 = pass79;
    }

    public static void setPass80(String pass80) {
        ClaseDatosPythonJava.pass80 = pass80;
    }

    public static void setPass81(String pass81) {
        ClaseDatosPythonJava.pass81 = pass81;
    }

    public static void setPass82(String pass82) {
        ClaseDatosPythonJava.pass82 = pass82;
    }

    public static void setPass83(String pass83) {
        ClaseDatosPythonJava.pass83 = pass83;
    }

    public static void setPass84(String pass84) {
        ClaseDatosPythonJava.pass84 = pass84;
    }

    public static void setPass85(String pass85) {
        ClaseDatosPythonJava.pass85 = pass85;
    }

    public static void setPass86(String pass86) {
        ClaseDatosPythonJava.pass86 = pass86;
    }

    public static void setPass87(String pass87) {
        ClaseDatosPythonJava.pass87 = pass87;
    }

    public static void setPass88(String pass88) {
        ClaseDatosPythonJava.pass88 = pass88;
    }

    public static void setPass89(String pass89) {
        ClaseDatosPythonJava.pass89 = pass89;
    }

    public static void setPass90(String pass90) {
        ClaseDatosPythonJava.pass90 = pass90;
    }

    public static void setPass91(String pass91) {
        ClaseDatosPythonJava.pass91 = pass91;
    }

    public static void setPass92(String pass92) {
        ClaseDatosPythonJava.pass92 = pass92;
    }

    public static void setPass93(String pass93) {
        ClaseDatosPythonJava.pass93 = pass93;
    }

    public static void setPass94(String pass94) {
        ClaseDatosPythonJava.pass94 = pass94;
    }

    public static void setPass95(String pass95) {
        ClaseDatosPythonJava.pass95 = pass95;
    }

    public static void setPass96(String pass96) {
        ClaseDatosPythonJava.pass96 = pass96;
    }

    public static void setPass97(String pass97) {
        ClaseDatosPythonJava.pass97 = pass97;
    }

    public static void setPass98(String pass98) {
        ClaseDatosPythonJava.pass98 = pass98;
    }

    public static void setPass99(String pass99) {
        ClaseDatosPythonJava.pass99 = pass99;
    }

    public static void setPass100(String pass100) {
        ClaseDatosPythonJava.pass100 = pass100;
    }
}

