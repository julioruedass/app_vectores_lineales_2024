# This is a sample Python script.

# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import ortonormalizacion


def main():
    Matriz,verbose = ortonormalizacion.leerMatriz()
    resultado = ortonormalizacion.gramSchmidt(Matriz,verbose)
