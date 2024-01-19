from  mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console import ClaseDatosPythonJava as Datos
from sympy import sqrt, Matrix, init_printing, pprint
from sympy import latex

init_printing()

def normalizacion(v,verbose=0):
  if verbose:
    print("Normalizamos el vector")
    print("u = 1/|v| * v")
    pprint(v)
  Datos.dinamicSetvalue(" Normalizamos el vector \n u = 1/|v| * v", array_to_LaTeX(v));
  count=0
  for i in v:
    count = i**2 + count
  raiz = 1/sqrt(count) * v
  if verbose:
    print("Obtenemos")
    pprint(raiz)
    #formula1
  C = []
  C.append(Matrix(raiz))
  Datos.Formula = array_to_LaTeX(C)
  Datos.dinamicSetvalue(" Obtenemos : " , array_to_LaTeX(C));
  return raiz

def gramSchmidt(L,verbose=0):
  u =[]
  if verbose:
    #consola o terminal
    print("Vectores de entrada")
    pprint(L)
  Datos.dinamicSetvalue(" Vectores de entrada",array_to_LaTeX(L));
  for v in L:
    vp = v
    for u_temp in u:
      vp = vp - v.dot(u_temp) * u_temp
      pc = v.dot(u_temp)
      if verbose:
        print("Resultado de producto punto")
        pprint(pc)
        print("Ortogonalizamos v")
        pprint(vp)
        print("Respecto a u")
        pprint(u_temp)
      Datos.dinamicSetvalue(" Resultado de producto punto",array_to_LaTeX(pc));
      Datos.dinamicSetvalue(" Ortogonalizamos v",array_to_LaTeX(vp));
      Datos.dinamicSetvalue(" Respecto a u",array_to_LaTeX(u_temp));
      if verbose:
        pprint("Obtenemos")
        pprint(vp)
      Datos.dinamicSetvalue(" Obtenemos",array_to_LaTeX(vp));
    u_temp = normalizacion(vp,verbose)
    u.append(u_temp)
  descripcion = f"Base ortonormal en R{Datos.tamano_vector}"
  #print(descripcion)
  #Resultado ortonormalizacion
  Datos.latexMatriz =  array_to_LaTeX(u)
  pprint(u)
  Datos.dinamicSetvalue(descripcion , array_to_LaTeX(u));
  return u

def array_to_LaTeX(arr):
  return latex(arr)

def aumentarsec():
  Datos.itera_vector = Datos.itera_vector +1

def imprimirrsec():
  print("Secuencia:")
  pprint(Datos.secuencia)

def leerMatriz():
  Datos.itera_vector =0
  Datos.secuencia = 0
  compo = Datos.componentes
  print("Matriz A original de vectores")
  pprint(compo)
  x = Datos.procedimiento
  #consola o terminal para mostrar procedimiento
  if x == 1:
    verbose = 1
  else:
    verbose = 0
  A = []
  #for i in range((compo-1)):
  #v1str = np.array(Datos.v1).tolist()
  if compo > 0:
    A.append(Matrix(Datos.d_vector1))
    B = []
    B.append(Matrix(Datos.d_vector1))
    print(" Vector 1")
    pprint(B)
  if compo > 1:
    A.append(Matrix(Datos.d_vector2))
    C = []
    C.append(Matrix(Datos.d_vector2))
    print(" Vector 2")
    pprint(C)
  if compo > 2:
    A.append(Matrix(Datos.d_vector3))
    D = []
    D.append(Matrix(Datos.d_vector3))
    print(" Vector 3")
    pprint(D)
  if compo > 3:
    A.append(Matrix(Datos.d_vector4))
    E = []
    E.append(Matrix(Datos.d_vector4))
    print(" Vector 4")
    pprint(E)
  #v1str = np.array(Datos.v2).tolist()
  #v1str = np.array(Datos.v3).tolist()
  #v1str = np.array(Datos.v4).tolist()
  #pprint(A)
  #clase datos consumida por android view
  print(" ---------------- Iniciar -------------------------")
  Datos.vectoresentrada = array_to_LaTeX(A)
  return A,verbose