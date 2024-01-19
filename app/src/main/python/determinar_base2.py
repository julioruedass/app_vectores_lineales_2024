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
    print("Matrix       : "  +  str(mat[0]))
    mimat =mat[0]
    for v in range(0,tam_vectores,1) :
        if cadena_vector=="":
            cadena_vector =""+ str(mimat[v])
        else:
            cadena_vector =cadena_vector+","+ str(mimat[v])
        print("VALOR DE VECTOR " + str(mimat[v]))
    return cadena_vector


def F_IMPRIMIR_VALORES(p_texto ):
    print(p_texto)
    Datos.dinamicSetvalue(p_texto, "");

def F_PRINCIPAL():
    F_INICIO_VARIABLES("ok")
    A = []
    A2 = []
    V1 = []
    V2 = []
    V3 = []
    V4 = []
    compo = Datos.componentes
    print("Matriz A original de vectores")
    pprint(compo)
    if compo > 0:
        V1.append(Matrix(Datos.d2_vector1))
        STRING_VECTOR_1 =crear_matrix_porvector(V1)
        A.append(STRING_VECTOR_1.split(","))
        print("Vector 1  :")
        pprint(V1)
    if compo > 1:
        V2.append(Matrix(Datos.d2_vector2))
        STRING_VECTOR_2 =crear_matrix_porvector(V2)
        A.append(STRING_VECTOR_2.split(","))
        print("Vector 2  :")
        pprint(V2)
    if compo > 2:
        V3.append(Matrix(Datos.d2_vector3))
        STRING_VECTOR_3 =crear_matrix_porvector(V3)
        A.append(STRING_VECTOR_3.split(","))
        print("Vector 3  :")
        pprint(V3)
    if compo > 3:
        V4.append(Matrix(Datos.d2_vector4))
        STRING_VECTOR_4 =crear_matrix_porvector(V4)
        A.append(STRING_VECTOR_4.split(","))
        print("Vector 4 :")
        pprint(V4)
    Datos.vectoresentrada = array_to_LaTeX(A)
    A2 =Matrix(A).T
    return  A2