from mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console import ClaseDatosPythonJava as Datos
from sympy import Matrix, pprint, symbols, Eq, zeros,  init_printing
from sympy import latex
import numpy as np
init_printing()

def F_INICIO_VARIABLES(p_ok):
    Datos.itera_vector =0
    Datos.secuencia = 0
    Datos.v_independiente=""
    Datos.valida_base = 0
    Datos.genera_base = 0
    #Datos.matrix_identidad = 0

def array_to_LaTeX(arr):
    return latex(arr)

def crear_matrix_porvector(mat):
    cadena_vector= ""
    compo = Datos.componentes
    tam_vectores = Datos.tamano_vector
    print("vectores     : "  +  str(compo))
    print("tam vectores : "  +  str(tam_vectores))
    print("Matrix   : "  +  str(mat[0]))
    mimat =mat[0]
    for v in range(0,tam_vectores,1) :
        if cadena_vector=="":
            cadena_vector =""+ str(mimat[v])
        else:
            cadena_vector =cadena_vector+","+ str(mimat[v])
        print("VALOR DE VECTOR " + str(mimat[v]))
    return cadena_vector

def crear_matrix_porvector_numpy(mat):
    cadena_vector= ""
    p_array =[];
    compo = Datos.componentes
    tam_vectores = Datos.tamano_vector
    mimat =mat[0]
    for v in range(0,tam_vectores,1) :
        valor = mimat[v]
        if v == 0 :
            print("|||||||||||||||||||| igual a cero  Valor log   : "  ,  valor)
            p_array = np.array([[valor]])
        else :
            print("|||||||||||||||||||| diferente cero  Valor log   : "  ,  valor)
            p_array = np.append([p_array],[valor])
    return p_array

def F_IMPRIMIR_VALORES(p_texto ):
    print(p_texto)
    Datos.dinamicSetvalue(p_texto, "");

def F_PRINCIPAL():
    F_INICIO_VARIABLES("ok")
    A = []
    A2 = []
    Gen = np.array([])
    V1 = []
    V2 = []
    V3 = []
    V4 = []
    compo = Datos.componentes
    print("Matriz A original de vectores")
    pprint(compo)
    if compo > 0:
        V1.append(Matrix(Datos.d_vector1))
        STRING_VECTOR_1 =crear_matrix_porvector(V1)
        Gen =crear_matrix_porvector_numpy(V1)
        A.append(STRING_VECTOR_1.split(","))
        print("Vector 1  :")
        pprint(V1)
    if compo > 1:
        V2.append(Matrix(Datos.d_vector2))
        STRING_VECTOR_2 =crear_matrix_porvector(V2)
        ve2 = crear_matrix_porvector_numpy(V2)
        Gen = np.concatenate((Gen,ve2), 0)
        A.append(STRING_VECTOR_2.split(","))
        print("Vector 2  :")
        pprint(V2)
    if compo > 2:
        V3.append(Matrix(Datos.d_vector3))
        STRING_VECTOR_3 =crear_matrix_porvector(V3)
        ve3 = crear_matrix_porvector_numpy(V3)
        Gen = np.concatenate((Gen,ve3), 0)
        A.append(STRING_VECTOR_3.split(","))
        print("Vector 3  :")
        pprint(V3)
    if compo > 3:
        V4.append(Matrix(Datos.d_vector4))
        STRING_VECTOR_4 =crear_matrix_porvector(V4)
        ve4 = crear_matrix_porvector_numpy(V4)
        Gen = np.concatenate((Gen,ve4), 0)
        A.append(STRING_VECTOR_4.split(","))
        print("Vector 4 :")
        pprint(V4)
    ################################################
    Datos.vectoresentrada = array_to_LaTeX(A)
    A2 =Matrix(A).T
    return  A2

def F_PRINCIPAL_P(P_A2) :
    Datos.dinamicSetvalue("Matrix inicial :",array_to_LaTeX(P_A2) );
    Shape_original = P_A2.shape
    Matric_c = P_A2.copy()
    Matric_cuadrada = F_HACER_CUADRADA(Matric_c)
    Mat_temp = Matric_cuadrada
    Shape_cuadrada = Mat_temp.shape
    filas = Shape_cuadrada[0]
    print("-----------------------------------------------------------------------")
    print("                       Matrix entrada")
    pprint(Mat_temp)
    B =[]
    B = F_MATRIX_AUMENTADA('letras',filas,B)
    C =[]
    C = F_MATRIX_AUMENTADA('ceros',filas,C)
    print("____________________________________________________________________________")
    text = "__________________-______   GAUSS DETERMINANTE   _______-__________________"
    F_IMPRIMIR_VALORES(text)
    r_gauss = F_GAUSS(Matric_cuadrada,B,C,Shape_original,"D")
    print("____________________________________________________________________________")
    text = "__________________-______   GAUSS GENERADOR     _______-___________________"
    F_IMPRIMIR_VALORES(text)
    r_gauss_g = F_GAUSS(Matric_cuadrada,B,C,Shape_original,"G")

    Datos.dinamicSetvalue(" ____________  RESULTADO FINAL EVALUAR INDEPENDIENTE ___________________ ","" );
    F_IMPRIMIR_TEXT_MATRIX(r_gauss[0], r_gauss[3],r_gauss[4] ," Final ",Shape_original ,"-------==== Resultado ===-------","D")
    Datos.dinamicSetvalue(" ___________   RESULTADO FINAL EVALUAR GENERADOR     ___________________ ","" );
    F_IMPRIMIR_TEXT_MATRIX(r_gauss[0], r_gauss[3],r_gauss[4] ," Final ",Shape_original ,"-------==== Resultado ===-------","G")

    print("________________- Validar infinito de soluciones 1 -__________________")
    val = " " + str(Shape_original[0])
    #Datos.dinamicSetvalue("Validacion de Filas :" , val)
    val = " " + str(Shape_original[1])

    print("_____________________- Validar inconsistencia resultados dependiente -______________________")
    #RESULTADOS DE INDEPENDIENTE
    v_matrix_d =0
    v_resultado_d =0
    v_resultado_arr_d =[]
    v_inconsistente_d = False
    v_infinito_d      = False
    for i in range(Shape_original[0]):
        matrix_temp_d = r_gauss[0]
        v_resultado_arr_d =r_gauss[3] #resultado dependiente
        v_matrix_d    = F_VALIDAR_SOLO_UN_NUMERO(matrix_temp_d[i,:],0)
        v_resultado_d = F_VALIDAR_SOLO_UN_NUMERO_RES(v_resultado_arr_d[i],0)

        if (v_matrix_d == 1 and v_resultado_d == 1) :
            v_infinito_d = True
           # val = " _  Posicion Infinito soluciones p/independiente Matrix " + str(i)
           # Datos.dinamicSetvalue(val,array_to_LaTeX(matrix_temp_d[i,:]) );
           # Datos.dinamicSetvalue("Resultado : infinito p/independiente",array_to_LaTeX(v_resultado_arr_d[i]) );

        if (v_matrix_d == 1 and v_resultado_d == 0 and v_infinito_d == False )  :
            v_inconsistente_d = True
           # val = " _  Posicion inconsistente p/dependiente Matrix " + str(i)
           # Datos.dinamicSetvalue(val,array_to_LaTeX(matrix_temp_d[i,:]) );
           # Datos.dinamicSetvalue("resultado p/dependiente",array_to_LaTeX(v_resultado_arr_d[i]) );

    #Evaluacion dependiente
    if ( v_inconsistente_d == True or v_infinito_d == True  )  :
        Datos.valida_base = 0
        #POR DEFAULT NO GENERA BASE
        if (v_infinito_d) :
            #POSITIVO CON INFINITO SOLUCIONES
            Datos.v_independiente=" Es linealmente dependiente (infinito soluciones)"
            print("Es linealmente dependiente (infinito soluciones)")
            #print("El conjunto de vectores no genera a R",Shape_original[1])
        else :
            #POSITIVO INCONSISTENCIA
            Datos.v_independiente=" Es linealmente dependiente (inconsistencia)"
            print("Es linealmente dependiente (inconsistencia)")
            #print("El conjunto de vectores no genera a R",Shape_original[1])

    else :
        print("__________________- Validar independiente 3 -________________________")
        #NEGATIVO SIN INFINITO SOLUCIONES ni inconsistencias = Validar independiente
        v_identidad       = F_VALIDACION_MATRIX_IDENTIDAD(r_gauss[0],Shape_original)
        v_all_ceros = 0
        v_ceros_all =False
        for i in range(Shape_original[0]):
            v_resultado_arr_d_2 =r_gauss[3] #resultado dependiente
            v_resultado_ceros = F_VALIDAR_SOLO_UN_NUMERO_RES(v_resultado_arr_d_2[i],0)
            if  v_resultado_ceros == 1  :
                v_all_ceros = v_all_ceros + 1
        if Shape_original[0] == v_all_ceros :
            v_ceros_all = True

        if  v_identidad == 1 and v_ceros_all == True   :
            ###POSITIVO INDEPENDIENTE
            Datos.v_independiente=" Es independiente"
            Datos.valida_base = 1
            print("Es linealmente independiente")
        else :
            ###NEGATIVO INDEPENDIENTE
            Datos.v_independiente=" Es linealmente dependiente"
            Datos.valida_base = 0
            print("Es linealmente dependiente")
            print("__________________- Validar generador 4 -________________________")

    Datos.dinamicSetvalue(" ----------   Validar Generador  ---------- ","" );

    #RESULTADOS DE GENERADOR
    v_matrix_g =0
    v_resultado_g =0
    v_resultado_arr_g =[]
    v_inconsistente_g = False
    v_infinito_g      = False
    v_valida_inicio_gen = False

    for i in range(Shape_original[0]):
        matrix_temp_g     = r_gauss[0]
        v_resultado_arr_g =r_gauss[4] #resultado Generador
        v_matrix_g    = F_VALIDAR_SOLO_UN_NUMERO(matrix_temp_g[i,:],0)
        v_resultado_g = F_VALIDAR_SOLO_UN_NUMERO_RES(v_resultado_arr_g[i],0)
        if (v_matrix_g == 1 and v_resultado_g == 1 ) :
            v_infinito_g = True
            #val = " _  Posicion Infinito soluciones p/independiente Matrix " + str(i)
            #Datos.dinamicSetvalue(val,array_to_LaTeX(matrix_temp_1[i,:]) );
            #Datos.dinamicSetvalue("Resultado : infinito p/generador",array_to_LaTeX(v_resultado_arr_g[i]) );
        if (v_matrix_g == 1 and v_resultado_g == 0 and v_infinito_g == False )  :
            v_inconsistente_g = True
            ##val = " _  Posicion inconsistente p/dependiente Matrix " + str(i)
            ##Datos.dinamicSetvalue(val,array_to_LaTeX(matrix_temp_1[i,:]) );
            #Datos.dinamicSetvalue("resultado p/Generador",array_to_LaTeX(v_resultado_arr_g[i]) );

    if ( v_inconsistente_g == True or v_infinito_g == True  )  :
        if (v_infinito_g) :
            Datos.genera_base = 1
            #POSITIVO CON INFINITO SOLUCIONES
            #Datos.v_independiente="R Generador : (infinito soluciones)"
            print("El conjunto si genera base  (infinito soluciones)")
            #print("El conjunto de vectores no genera a R",Shape_original[1])
        else :
            Datos.genera_base = 0
            #POSITIVO INCONSISTENCIA
            #Datos.v_independiente="R Generador : (inconsistencia)"
            print("no genera base (inconsistencia)")
            #print("El conjunto de vectores no genera a R",Shape_original[1])

    else :
        print("__________________- Validar generador 3 -________________________")
        #NEGATIVO SIN INFINITO SOLUCIONES ni inconsistencias = Validar independiente
        v_identidad       = F_VALIDACION_MATRIX_IDENTIDAD(r_gauss[0],Shape_original)
        v_resultado_ceros = F_VALIDAR_SOLO_UN_NUMERO_RES (r_gauss[4],0)
        if ( v_identidad == 1  )  :
            ###POSITIVO INDEPENDIENTE
            Datos.genera_base = 1
        else :
            ###NEGATIVO INDEPENDIENTE
            Datos.genera_base = 0
            print("No genera base")
    if Shape_original[0] < Shape_original[1] :
        Datos.genera_base = 1
        print("Si genera base")


#///////////////////////////////////////////////////////////////////////////////////////////////////

def F_IMPRIMIR_TEXT_MATRIX(p_matrix, p_r1,p_r2 ,p_extra,p_lon, p_texto,p_tipo ):
    salida_mat_determinante = [p_matrix[:p_lon[0],:p_lon[1]],[Matrix(p_r1)] ]
    salida_mat_generador    = [p_matrix[:p_lon[0],:p_lon[1]],[Matrix(p_r2)] ]
    if (p_texto != "") :
        print(p_texto)

    if (p_tipo == "D") :
        print("R = ",p_extra)
        pprint(salida_mat_determinante)
        print("")
        Datos.dinamicSetvalue("Matrix : ", array_to_LaTeX(salida_mat_determinante));
    if (p_tipo == "G") :
        print("")
        print("R = ",p_extra)
        pprint(salida_mat_generador)
        Datos.dinamicSetvalue("Matrix : ", array_to_LaTeX(salida_mat_generador));

def F_VALIDAR_SOLO_UN_NUMERO_RES(p_arr_mtrx, p_number )  :
    evaluar = 0
    # Use sympy.subs() method
    if (p_arr_mtrx == p_number) :
        evaluar = 1
        #print("Es igual a cero: ",p_arr_mtrx )
    else :
        evaluar = 0
        #print("No es igual a cero: ",p_arr_mtrx )
    #print("_________________________")
    return evaluar

def F_VALIDAR_SOLO_UN_NUMERO(p_arr_mtrx, p_number )  :
    evaluar = 0
    numero_evalua = np.array(p_arr_mtrx)
    arr_mtrx_longitudes =  p_arr_mtrx.shape
    fila = arr_mtrx_longitudes[0]
    columna = arr_mtrx_longitudes[1]
    #print("-----------------------------Evaluando ceros-----------------------")
    #pprint(p_arr_mtrx)
    for i in range(arr_mtrx_longitudes[1]) :
        #print("Value",p_arr_mtrx[0, i])
        if (p_arr_mtrx[0, i] == p_number ) :
            evaluar = evaluar +1
            #print("Si es cero: ",p_arr_mtrx[0, i] )
    if (evaluar == arr_mtrx_longitudes[1]):
        #print("Todos los numeros contenidos son : "    , p_number , " # encontrados " , evaluar , " = " , columna)
        evaluar = 1
    else:
        #print("No todos los numeros contenidos son : " , p_number , " # encontrados " , evaluar , " dif " ,  columna)
        evaluar = 0
    #print("-----------------------------Evaluando ceros fin-----------------------")
    return evaluar

def F_VALIDACION_MATRIX_IDENTIDAD (v_mtr,v_shape_no_cua) :
    #SE OBTIENE UNA MATRIX IDENTIDAD CUADRADA CON EL MENOR DE LOS TAMAÑOS DE LA MATRIX CAPTURADA (VARIABLE FILAS)
    v_identidad =0
    v_matrizcomparacion = Matrix.eye(v_shape_no_cua[0])
    print("------------------  COMPARACIÓN DE MATRIX  --------------------------")
    print("Matrix (Identidad):")
    print("")
    pprint(Matrix( [Matrix([v_matrizcomparacion])]))
    print("Matrix (Resultante)")
    print("")
    pprint(Matrix( [Matrix([v_mtr[:v_shape_no_cua[0],:v_shape_no_cua[1]]]) ] ))
    # Validaciones de matrix identidad
    if v_mtr[:v_shape_no_cua[0],:v_shape_no_cua[1]] == v_matrizcomparacion:
        v_identidad = 1
        print("Tiene igualdad de matrix identidad ")
    else :
        v_identidad = 0
        print("No hay igualdad de matrix identidad ")
    return v_identidad

def F_HACER_CUADRADA(p_array):
    print("____________________ Realizando matrix cuadrada ______________________")
    print("                MATRIX ANTES DE EVALUAR SI ES CUADRADA")
    pprint(p_array)
    COUNT = 4
    l_lon = p_array.shape
    print("______   Filas  _______________________________________________________")
    print(l_lon[0])
    print("______ Columnas _______________________________________________________")
    print(l_lon[1])
    M_FILA_0 = []
    M_ARR_R = p_array
    while  l_lon[0] != l_lon[1] and COUNT > 0 :
        COUNT -=1
        if l_lon[1] < l_lon[0] :
            print("Opcion 1 - Agregar tamaño ")
            if l_lon[0] == 1 :
                M_FILA_0 = np.array([[0]])
            elif l_lon[0] == 2:
                M_FILA_0 = np.array([[0],[0]])
            elif l_lon[0] == 3:
                M_FILA_0 = np.array([[0],[0],[0]])
            elif l_lon[0] == 4:
                M_FILA_0 = np.array([[0],[0],[0],[0]])
            M_ARR_R = np.concatenate((M_ARR_R,M_FILA_0), 1)

        if l_lon[1] > l_lon[0] :
            print("Opcion 2 - Agregar vector ")
            if l_lon[1] == 1 :
                M_VETOR_0 = np.array([[0]])
            elif l_lon[1] == 2:
                M_VETOR_0 = np.array([[0,0]])
            elif l_lon[1] == 3:
                M_VETOR_0 = np.array([[0,0,0]])
            elif l_lon[1] == 4:
                M_VETOR_0 = np.array([[0,0,0,0]])
            M_ARR_R = np.concatenate((M_ARR_R,M_VETOR_0), 0)
        l_lon = M_ARR_R.shape
    print("________________________ MATRIX  CUADRADA______________________________")
    pprint(M_ARR_R)
    print("______   Filas  _______________________________________________________")
    print(l_lon[0])
    print("______ Columnas _______________________________________________________")
    print(l_lon[1])
    return M_ARR_R

#Evalua que el valor se pueda obtener desde una coordenada
def validar_valor_matrix(matrix_eva,punto1, punto2):
    try:
        valor = matrix_eva[punto1,punto2]
        print('Valor valido :' , valor)
        v_entrar='no'
    except IndexError:
        print('Valor invalido :' , 0)
        valor = 0
        v_entrar='si'
    except KeyError:
        print('Valor invalido :' , 0)
        valor = 0
        v_entrar='si'
    if  v_entrar =='si' :
        print("Valor de coordenada")
        print(valor)
        print("_____________________________________________________________________")
    return valor,v_entrar

#Funcion que agrega columna de letras o columna de ceros
def F_MATRIX_AUMENTADA(tipo,p_filas ,array_aumento):
    if tipo == 'ceros':
        if p_filas == 1:
            array_aumento = Matrix([[0]])
        if p_filas == 2:
            array_aumento = Matrix([[0],[0]])
        if p_filas == 3:
            array_aumento = Matrix([[0],[0],[0]])
        if p_filas == 4:
            array_aumento = Matrix([[0],[0],[0],[0]])
    elif tipo=='letras' :
        abc = [chr(i) for i in range(ord('a'), ord('z') + 1)]
        array_aumento = Matrix(abc[-p_filas:])
    return array_aumento

#Validacione s de matrix cuadrada vector mayor o tamaño mayor
def F_EVALUAR_DIMENCIONES(p_dimenciones):
    #vectores iguales columnas
    if (p_dimenciones[0] == p_dimenciones[1]):
        return p_dimenciones[0],True
    #FILAS(VECTORES) mayores
    elif (p_dimenciones[0] > p_dimenciones[1]):
        return p_dimenciones[1] , False
    #COLUMNAS(TAMAÑO) mayores
    elif (p_dimenciones[1] > p_dimenciones[0]):
        return False

#Funcion principal metodo de GAUSS
def F_GAUSS(Matri,P_arr_letras,P_arr_ceros,shape_no_cua,p_metodo):
    # Esta es una columna que requiere ser del mismo que el tamaño
    Res   = P_arr_ceros.copy()
    #Se crea para mostrar los resultados igual que el numero de vectores
    Res_2 = P_arr_letras.copy()
    Res_3 = P_arr_letras.copy()
    #Esto es para tener el maximo numero cuadrado de la matrix
    v_valida_fila = 0
    v_valida_res  = 0
    Mat_temp = Matrix(Matri)
    mtr_temp = Mat_temp.copy()
    Shape = mtr_temp.shape
    #pprint("Es el array (Numeros) para dependiente")   #log
    a_array = P_arr_ceros.copy()
    #pprint(Res)
    a_array_2 = a_array.copy()
    #pprint("Es el array (Letras) para generador") #log
    #pprint(Res_2)
    numero_linea = 0
    filas    = Shape[0]
    columnas = Shape[1]
    mtr = Mat_temp
    # Evaluar uno solo por medio de numero de vectores
    text ="Permutacion Filas : " + str(shape_no_cua[0]) + " Columnas : " + str(shape_no_cua[1])
    F_IMPRIMIR_VALORES(text)
    #||||||||||||||||||||||||||| FOR 1 ||||||||||||||||||||||||||||||||||||||||||||||||||
    for j in range(shape_no_cua[0]): #Esta linea queda pendiente para verificacion(PENDIENTE)
        #print("-----------------------   Loop principal 1  ---------------------")
        # Reinicio de valores de verificacion
        filas_2_arr = a_array_2.shape
        for ran in range(filas_2_arr[0]):   # filas_2_arr cambio por
            a_array_2[ran] = 0
        validos_punto = 0
        #==============================================================================
        if mtr[j, j] == 0:
            text = "(Per)Posición: " +  str(j + 1) + " : " + str(j + 1) + " es igual a cero requiere cambio"
            F_IMPRIMIR_VALORES(text)
            for i in range(Shape[0]):
                #Esta linea queda pendiente para verificacion (pendiente)
                #print(" Loop 2 Buscando lineas con el valor 1 en  fila: ", i)
                #pprint(a_array[i])
                if mtr[i, j] != 0 and a_array[i] != 1:
                    #print("Se puede cambiar la fila", j + 1, " por la fila", i + 1)
                    # Se incrementa en 1 cuando aplica para cambio
                    validos_punto += 1
                    # Se asigna 1 cuando aplica para cambio
                    a_array_2[i] = 1
                    numero_linea = i
                else:
                    text = "(Per)No aplica permutación posicion : " +  str(i + 1)
                    F_IMPRIMIR_VALORES(text)
            #print("Vectores disponibles a cambio ", validos_punto)

            if (validos_punto == 1):
                # Verificar si esta disponible
                Res.row_swap(j, numero_linea)
                Res_2.row_swap(j, numero_linea)
                Res_3.row_swap(j, numero_linea)
                mtr.row_swap(j, numero_linea)
                text = "  --- Matrix despues de permutación ---  ", j , " - ",  numero_linea
                if (p_metodo == "D") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ,"",shape_no_cua, text,"D" )
                if (p_metodo == "G") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ,"",shape_no_cua, text,"G" )
                a_array[j] = 1
            elif (validos_punto > 1):
                #print("Tiene varias opciones :________ Posición: ", j + 1, ":", j + 1)
                in_vector = "n"
                num_vector=0
                for i in range(Shape[0]):
                    #Esta linea queda pendiente para verificacion (pendiente) el uso de shape
                    # Se cambian las filas dependiendo si aplica
                    if a_array_2[i] == 1 and a_array[i] != 1 and  in_vector == "n":
                        num_vector=i
                        in_vector="s"
                Res.row_swap(j, num_vector)
                Res_2.row_swap(j, num_vector)
                Res_3.row_swap(j, numero_linea)
                mtr.row_swap(j, num_vector)
                text ="  --- Matrix despues de permutación ---  " + str(j) +  " - " +  str(num_vector)
                if (p_metodo == "D") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ,"",shape_no_cua, text,"D" )
                if (p_metodo == "G") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ,"",shape_no_cua, text,"G" )
                a_array[j]=1
        else:
            a_array[j] = 1
            text = "Permutacion : No se requeiere mover row : Posición : " + str(j + 1) + " : " + str(j + 1)
            F_IMPRIMIR_VALORES(text)
        # END  IF 1 ======================================================================================
        #print("_______________________________________________________________")
        #print(" ---------- Log centro Multiplicacion de resultados   ----------")
        #F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ," antes ",shape_no_cua,"","D")

        if F_VALIDAR_SOLO_UN_NUMERO(mtr[j,:],0) == 0 :
            #Metodo dependiente
            if (p_metodo == "D") :
                text = "R = " + str(Res[j])   + "  *  1 / " + str(mtr[j, j])
                F_IMPRIMIR_VALORES(text)
            #Metodo generador
            if (p_metodo == "G") :
                text = "R = " + str(Res_2[j]) + "  *  1 / " + str(mtr[j, j])
                F_IMPRIMIR_VALORES(text)

            if Res[j] == 0  or mtr[j, j] == 0 :
                Res[j] = [0];
            else :
                #Metodo dependiente
                Res[j] = [Res[j] * 1 / mtr[j, j]]

            if  mtr[j, j] == 0 :
                Res_2[j] = Res_3[j]
            else:
                Res_2[j] = [Res_2[j] * 1 / mtr[j, j]]

        #matrix
        text = "Matrix = Fila(" + str(j+1) + ")  *  1 / " + str(mtr[j, j])
        F_IMPRIMIR_VALORES(text)
        if F_VALIDAR_SOLO_UN_NUMERO(mtr[j,:],0) == 1 :
            #print("Toda la fila ", j ," es cero ")
            #pprint(mtr[j,:])
            print("")
        else:
            if  mtr[j, j] == 0 :
                mtr[j, :] = mtr[j,:]  * 0
            else :
                mtr[j, :] = mtr[j,:]  * 1 / mtr[j, j]
        if (p_metodo == "D") :
            F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ," despues ",shape_no_cua,"","D" )
        if (p_metodo == "G") :
            F_IMPRIMIR_TEXT_MATRIX(mtr, Res,Res_2 ," despues ",shape_no_cua,"","G" )

        valida_fila = F_VALIDAR_SOLO_UN_NUMERO(mtr[j,:],0)
        if mtr[j, j] != 1 and valida_fila == 0 :
            text = " - Convertir el elemento " + str(j + 1) +  " , " + str(j + 1) +  " en 1" #c2
            F_IMPRIMIR_VALORES(text)
            if (p_metodo == "D") :
                #Metodo dependiente
                text = "R = (" + str(Res[j]) +  ")  *  1 / "  + str(mtr[j, j])
                F_IMPRIMIR_VALORES(text)
            if (p_metodo == "G")  :
                #Metodo generador
                text = "R = (" + str(Res_2[j]) +  ")  *  1 / " + str(mtr[j, j])
                F_IMPRIMIR_VALORES(text)
            text = "Matrix = Fila(" + str(j+1) +  ")  *  1 / " + str(mtr[j, j])
            F_IMPRIMIR_VALORES(text)
            #Metodo generador
            #validacion de infinito
            if  mtr[j, j] == 0 :
                Res[j] = [0];
                Res_2[j]  = Res_3[j]
                mtr[j, :] = mtr[j, :] *0
            else :
                Res_2[j] = [Res_2[j] * 1 / mtr[j, j]]
                mtr[j, :] = mtr[j, :] * 1 / mtr[j, j]
                if Res[j] == 0  :
                    Res[j] = [0];
                else :
                    Res[j] = [Res[j] * 1 / mtr[j, j]]
            #Matrix
            if (p_metodo == "D") :
                F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","D")
            if (p_metodo == "G") :
                F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","G")

        else:
            if valida_fila == 0 :
                text = " - El elemento " + str(j + 1) + "," + str(j + 1) + " ya es 1" # c3
                F_IMPRIMIR_VALORES(text)
            else:
                text =" - Toda la fila es cero no aplica " #c3
                #F_IMPRIMIR_VALORES(text)

        # END  IF 2  ===============================================================================================
        for i in range(j + 1, filas):
            # Cambio por diferencia de dimenciones por filas - linea queda pendiente para verificacion (pendiente)
            # for i in range(j + 1, Shape[1]):  # cambio de pruebas
            #print("Punto log: 4 :  j:", j, " i :", i)

            valida_fila = F_VALIDAR_SOLO_UN_NUMERO(mtr[i,:],0)
            if mtr[i, j] != 0 and valida_fila == 0:
                text = " - Convertir el elemento " +  str(i + 1) +  "," + str(j + 1) + " en 0" #c4
                F_IMPRIMIR_VALORES(text)
                if p_metodo =="D" :
                    text = "R = " + str(Res[i])  +  " - (" + str(Res[j])   + "  *  " + str(mtr[i, j]) + ")"
                    F_IMPRIMIR_VALORES(text)
                if p_metodo == "G" :
                    text = "R = " + str(Res_2[i]) + " - (" + str(Res_2[j]) + "  *  " + str(mtr[i, j]) + ")"
                    F_IMPRIMIR_VALORES(text)
                if  Res[i] == 0 :
                    Res[i] =[0]
                else :
                    Res[i]   = [Res[i]     - (Res[j]     * mtr[i, j])]

                Res_2[i] = [Res_2[i]   - (Res_2[j]   * mtr[i, j])]
                mtr[i,:] = mtr[i, :]   - (mtr[j,:]   * mtr[i, j])
                if (p_metodo == "D") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","D")
                if (p_metodo == "G") :
                    F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","G")
            else:
                if valida_fila == 0 :
                    text = " - El elemento " +  str(i + 1) + "," + str(j + 1) +  " ya es 0"  #c5
                    F_IMPRIMIR_VALORES(text)
                else:
                    text = " - Toda la fila es cero no es valida " #c5
                    #F_IMPRIMIR_VALORES(text)
    #||||||||||||||||||||||||||| END FOR 1 |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    #||||||||||||||||||||||||||| FOR 2 |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    # Evaluar uno solo por medio de numero de tamaño
    for j in range(filas - 1, -1, -1):  #cambio  Shape[0] por shape_no_cua[1]
        for i in range(j - 1, -1, -1):
            valor_mult = validar_valor_matrix(mtr, i, j)
            valida_fila = F_VALIDAR_SOLO_UN_NUMERO(mtr[i,:],0)
            valida_fila_2 = F_VALIDAR_SOLO_UN_NUMERO(mtr[j,:],0)
            if (valor_mult[0] != 0 or valor_mult[1] == 'si') and (valida_fila_2 == 0 and valida_fila == 0 )  :
                #if valor_mult[0] != 0 or valor_mult[1] == 'si' or true : #cambio para debug
                #print("Punto log: 6")
                text = " - Convertir el elemento " + str(i + 1) + "," + str(j + 1) +  " en 0"  #c6
                F_IMPRIMIR_VALORES(text)
                if (p_metodo == "D"):
                    text = "F = " + str(Res[i])   + " - (" + str(Res[j])   + "  *  " +  str(mtr[i, j]) + ")"
                    F_IMPRIMIR_VALORES(text)
                if (p_metodo =="G"):
                    text = "F = " + str(Res_2[i]) + " - (" + str(Res_2[j]) + "  *  " +  str(mtr[i, j]) + ")"
                    F_IMPRIMIR_VALORES(text)

                if  Res[i] == 0 :
                    Res[i] =[0]
                else :
                    Res[i]   = [Res[i]   - (Res[j]   * mtr[i, j])]
                Res_2[i] = [Res_2[i] - (Res_2[j] * mtr[i, j])]
                mtr[i, :] = mtr[i, :] - (mtr[j, :] * mtr[i, j])
                if (p_metodo == "D"):
                    F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","D")
                if (p_metodo == "G"):
                    F_IMPRIMIR_TEXT_MATRIX(mtr,Res,Res_2," despues ", shape_no_cua,"","G")
            else:
                if valida_fila == 0 and valida_fila_2 == 0  :
                    text ="- El elemento" + str(i + 1) + "," + str(j + 1) + " ya es 0"  #c7
                    F_IMPRIMIR_VALORES(text)
                else :
                    text = " - Toda la fila es cero no es valida " #c7
                    #F_IMPRIMIR_VALORES(text)

    #||||||||||||||||||||||||||| END FOR 2 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    #||||||||||||||||||||||||||| RESULTADOS |||||||||||||||||||||||||||||||||||

    #||||||||||||||||||||||||||| FOR RESULTADOS 1 |||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    metodo_dependiente = []
    longitud = Res.shape
    for i in range(longitud[0]):
        metodo_dependiente.append((symbols(f"a{i + 1}"), Res[i]))
    #||||||||||||||||||||||||||| END RESULTADOS 1 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||

    #||||||||||||||||||||||||||| FOR RESULTADOS 2 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    metodo_generador = []
    longitud_2 = Res_2.shape
    for i in range(longitud_2[0]):
        metodo_generador.append((symbols(f"a{i + 1}"), Res_2[i]))
    #||||||||||||||||||||||||||| END RESULTADOS 2 ||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    return mtr, metodo_dependiente, metodo_generador,Res, Res_2



