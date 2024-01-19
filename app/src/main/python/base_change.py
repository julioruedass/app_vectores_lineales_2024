from mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console import ClaseDatosPythonJava as Datos
from sympy import  sqrt, Matrix, pprint, eye, init_printing
from sympy import latex

init_printing()

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

def leerMatriz():
    tam_vectores = Datos.tamano_vector
    A = []
    STRING_VECTOR_1=""
    STRING_VECTOR_2=""
    STRING_VECTOR_3=""
    STRING_VECTOR_4=""
    AB1 = []
    AB2 = []
    AB3 = []
    AB4 = []
    GLOB =[]
    #CEROS =[]
    #LETRAS =[]
    CEROS =""
    LETRAS =""
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
        A.append(STRING_VECTOR_1.split(","))
        print("Vector 1  :")
        pprint(V1)
    if compo > 1:
        V2.append(Matrix(Datos.d_vector2))
        STRING_VECTOR_2 =crear_matrix_porvector(V2)
        A.append(STRING_VECTOR_2.split(","))
        print("Vector 2  :")
        pprint(V2)
    if compo > 2:
        V3.append(Matrix(Datos.d_vector3))
        STRING_VECTOR_3 =crear_matrix_porvector(V3)
        A.append(STRING_VECTOR_3.split(","))
        print("Vector 3  :")
        pprint(V3)
    if compo > 3:
        V4.append(Matrix(Datos.d_vector4))
        STRING_VECTOR_4 =crear_matrix_porvector(V4)
        A.append(STRING_VECTOR_4.split(","))
        print("Vector 4 :")
        pprint(V4)
        print(" ---------------- Iniciar -------------------------")
    Datos.vectoresentrada = array_to_LaTeX(A)
    A = Matrix(A).T
    return A

def leerMatriz_2():
    tam_vectores = Datos.tamano_vector
    A = []
    STRING_VECTOR_1=""
    STRING_VECTOR_2=""
    STRING_VECTOR_3=""
    STRING_VECTOR_4=""
    AB1 = []
    AB2 = []
    AB3 = []
    AB4 = []
    GLOB =[]
    #CEROS =[]
    #LETRAS =[]
    CEROS =""
    LETRAS =""
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
        print(" ---------------- Iniciar -------------------------")
    Datos.vectoresentrada = array_to_LaTeX(A)
    A = Matrix(A).T
    return A




def leerMatriz_in():
    Datos.itera_vector =0
    Datos.secuencia = 0
    compo = Datos.componentes
    print("Matriz A original de vectores uno")
    pprint(compo)

    A = []
    #for i in range((compo-1)):
    #v1str = np.array(Datos.v1).tolist()
    if compo > 0:
        A.append(Matrix(Datos.d_vector1).T)
        B = []
        B.append(Matrix(Datos.d_vector1).T)
        print(" Vector 1")
        pprint(B)
    if compo > 1:
        A.append(Matrix(Datos.d_vector2).T)
        C = []
        C.append(Matrix(Datos.d_vector2).T)
        print(" Vector 2")
        pprint(C)
    if compo > 2:
        A.append(Matrix(Datos.d_vector3).T)
        D = []
        D.append(Matrix(Datos.d_vector3).T)
        print(" Vector 3")
        pprint(D)
    if compo > 3:
        A.append(Matrix(Datos.d_vector4).T)
        E = []
        E.append(Matrix(Datos.d_vector4).T)
        print(" Vector 4")
        pprint(E)
    print(" ---------------- Iniciar -------------------------")
    Datos.vectoresentrada = array_to_LaTeX(A)
    return A

def leerMatriz_2():
    Datos.itera_vector =0
    Datos.secuencia = 0
    compo = Datos.componentes
    print("Matriz A original de vectores dos")
    pprint(compo)

    A = []
    #for i in range((compo-1)):
    #v1str = np.array(Datos.v1).tolist()
    if compo > 0:
        A.append(Matrix(Datos.d2_vector1).T)
        B = []
        B.append(Matrix(Datos.d2_vector1).T)
        print(" Vector 1")
        pprint(B)
    if compo > 1:
        A.append(Matrix(Datos.d2_vector2).T)
        C = []
        C.append(Matrix(Datos.d2_vector2).T)
        print(" Vector 2")
        pprint(C)
    if compo > 2:
        A.append(Matrix(Datos.d2_vector3).T)
        D = []
        D.append(Matrix(Datos.d2_vector3).T)
        print(" Vector 3")
        pprint(D)
    if compo > 3:
        A.append(Matrix(Datos.d2_vector4).T)
        E = []
        E.append(Matrix(Datos.d2_vector4).T)
        print(" Vector 4")
        pprint(E)
    print(" ---------------- Iniciar -------------------------")
    Datos.vectoresentrada2 = array_to_LaTeX(A)
    return A

def leerVector():
    #vstr = input("Ingrese su vector separado por comas\n")
    #v = Matrix(vstr.split(","))
    A = []
    A.append(Matrix(Datos.vector_canonico).T)
    print(" Vector canonico")
    pprint(A)
    A=Matrix(A).T
    return A

def cambioDeBase(v,B1,B2):
    vp = B1 * v
    if v and B1 != eye(B1.shape[0]):
        print("Se multiplicó el vector por su base para hacerlo canonico")
        pprint(vp)
        dato_1 = "Se multiplicó el vector por su base para hacerlo canonico"
        Datos.dinamicSetvalue(dato_1, array_to_LaTeX(vp));
    inv = inversa(B2)
    dato_1 = "Inversa :"
    Datos.dinamicSetvalue(dato_1, array_to_LaTeX(inv));
    if inv != None:
        vp = inv * vp
        if v:
            print("Se multiplicó el vector canonico con la matriz de transición")
            dato_1 = "Se multiplicó el vector canonico con la matriz de transición"
            Datos.dinamicSetvalue(dato_1,"");
        pprint(vp)
        Datos.latexMatriz =  array_to_LaTeX(vp)
        dato_1 = "Resultado"
        Datos.dinamicSetvalue(dato_1, array_to_LaTeX(vp));


def bases(dim, baseStr):
    flag = True
    while(flag):
        #baseStr = input("En que base esta tu vector: Canonica(C), Base1(B1) o Base2(B2)?\n")
        if baseStr == "Canonica":
            flag = False
            print("Favor de ingresar Base2")
            B2 = Matrix(leerMatriz()).T
            B1 = Matrix(eye(dim))
            return B1,B2
        elif baseStr == "B1":
            flag = False
            print("Favor de ingresar Base1")
            B1 = Matrix(leerMatriz()).T
            print("Favor de ingresar Base2")
            B2 = Matrix(leerMatriz_2()).T
            return B1,B2
        elif baseStr == "B2":
            flag = False
            print("Favor de ingresar Base1")
            B1 = Matrix(leerMatriz()).T
            print("Favor de ingresar Base2")
            B2 = Matrix(leerMatriz_2()).T
            return B2,B1

def inversa(v):
    A = v.copy()
    Shape = A.shape
    Res = eye(Shape[0])
    try:
        A.inv()
    except:
        print("La matriz no tiene inversa")
        dato_1 = "La matriz no tiene inversa"
        Datos.dinamicSetvalue(dato_1, array_to_LaTeX(A));
        return None
    for j in range(Shape[0]):
        if A[j, j] == 0:
            print(j)
            for i in range(Shape[0]):
                if A[i, j] != 0:
                    print("Se cambia la fila", j+1, "por la fila", i+1)
                    dato_1 = "Se cambia la fila " + str(j+1) + " por la fila" + str(i+1)
                    Datos.dinamicSetvalue(dato_1,"");
                    Res.row_swap(j, i)
                    A.row_swap(j, i)
                    pprint(A)
                    dato_1 = "Matrix "
                    Datos.dinamicSetvalue(dato_1, array_to_LaTeX(A));
                    pprint(Res)
        if A[j, j] != 1:
            print("Convertir el elemento", j+1,",", j+1, "en 1")
            dato_1 = "Convertir el elemento" + str(j+1)+ " " +  str(j+1) + " en 1"
            Res[j, :] = Res[j, :] * 1 / A[j, j]
            A[j, :] = A[j, :] * 1 / A[j, j]
            pprint(A)
            Datos.dinamicSetvalue(dato_1, array_to_LaTeX(A));
            pprint(Res)
        else:
            print("El elemento", j+1,",", j+1, "ya es 1")
            dato_1 = "El elemento"+ str(j+1) + ","  + str(j+1) +  " ya es 1"
            Datos.dinamicSetvalue(dato_1,"");
        for i in range(j + 1, Shape[0]):
            if A[i, j] != 0:
                print("Convertir el elemento", i+1,",", j+1, "en 0")
                Res[i, :] = Res[i, :] - (Res[j, :] * A[i, j])
                A[i, :] = A[i, :] - (A[j, :] * A[i, j])
                pprint(A)
                dato_1 = "Convertir el elemento "+ str(i+1) + ","  + str(j+1) +  " ya en 0"
                Datos.dinamicSetvalue(dato_1, array_to_LaTeX(A));
                pprint(Res)
            else:
                print("El elemento", i+1,",", j+1, "ya es 0")
                dato_1 = "El elemento"+ str(i+1) + ","  + str(j+1) +  " ya es 0"
                Datos.dinamicSetvalue(dato_1,"");
    for j in range(Shape[0] - 1, -1, -1):
        for i in range(j - 1, -1, -1):
            if A[i, j] != 0:
                print("Convertir el elemento", i+1,",", j+1, "en 0")
                Res[i, :] = Res[i, :] - (Res[j, :] * A[i, j])
                A[i, :] = A[i, :] - (A[j, :] * A[i, j])
                pprint(A)
                pprint(Res)
                dato_1 = "Convertir el elemento "+ str(i+1) + ","  + str(j+1) +  " en 0"
                Datos.dinamicSetvalue(dato_1, array_to_LaTeX(A));
            else:
                print("El elemento", i+1,",", j+1, "ya es 0")
                dato_1 = "El elemento"+ str(i+1) + ","  + str(j+1) +  " ya es 0"
                Datos.dinamicSetvalue(dato_1,"");
    return Res


def iniciar_cambio() :
    sn = Datos.v_where_base
    v = leerVector()
    print("Vector canonico: ")
    pprint(v)
    dato_1 = "Vector"
    Datos.dinamicSetvalue(dato_1, array_to_LaTeX(v))
    BC,BT = bases(Datos.componentes,sn)
    print("MTR1: ")
    pprint(BC)
    dato_1 = "Matrix 1"
    Datos.dinamicSetvalue(dato_1, array_to_LaTeX(BC));
    print("MTR2: ")
    pprint(BT)
    if sn != "Canonica":
        dato_1 = "Matrix 2"
        Datos.dinamicSetvalue(dato_1, array_to_LaTeX(BT));
    cambioDeBase(v,BC,BT)

