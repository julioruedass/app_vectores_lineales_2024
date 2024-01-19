# This is a sample Python script.
# Press Mayús+F10 to execute it or replace it with your code.
# Press Double Shift to search everywhere for classes, files, tool windows, actions, and settings.
import determinar_base
from sympy import Matrix, pprint, symbols, Eq, zeros,  init_printing
from sympy import latex
import numpy as np
init_printing()

def main():
    R_MATRIX = determinar_base.F_PRINCIPAL()
    determinar_base.F_PRINCIPAL_P(R_MATRIX)