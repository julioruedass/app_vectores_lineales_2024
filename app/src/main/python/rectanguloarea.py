from mx.Tecnm_chihuahua2.algebra_espacios_vectoriales.console import ClaseDatosPythonJava as Datos


def rectanguloarea():
    lado1 = Datos.lado1
    lado2 = Datos.lado2

    area = lado1 * lado2
    Datos.area = area

    return area

