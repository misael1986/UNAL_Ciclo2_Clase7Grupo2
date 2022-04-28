/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unal.unal_ciclo2_clase7grupo2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //-------------ARREGLOS----------------------------
        int Arreglo[] = {1, 0, 7, -2, 8};
        // 0  1 2  3 4
        //tipo nombre[]={}
        int array[] = new int[5];

        Scanner t = new Scanner(System.in);

        /*
        System.out.println(Arreglo[4]);

        
        System.out.println("Digite el tamaño del arreglo a crear:");
        int tamano = t.nextInt();
        imprimeArreglos(lee_arreglo_enteros(t, tamano));

         */
 /*
        double datos[] = {1.2, 4.2, 4.6, 5.3};
        System.out.println("Suma da: " + suma_arreglo_reales(datos));

        //---------------MATRICES-------------------------------
        char[][] c = new char[10][20]; //matriz de 10x20 caracteres
        int[][] A = new int[5][4]; //matriz de 5x4 enteros
        double[][] y = new double[6][6]; //matriz de 6x6 reales
        boolean[][] b = new boolean[2][3]; //matriz de 2x3 booleanos
        
         */
 /*
        int nroFilas, nroColumnas;
        System.out.println("Digite la cantidad de filas:");
        nroFilas = t.nextInt();
        System.out.println("Digite la cantidad de columnas:");
        nroColumnas = t.nextInt();

        int M[][] = llenarMatriz(nroFilas, nroColumnas);
        imprimeMatrix(M);
        int cuad[][] = cuadrados_matriz(M);
        imprimeMatrix(cuad);
        
         */
 /*
        double[][] N = llenarMatrizD(nroFilas, nroColumnas);
        double diag[] = diagonal_matriz(N);
        for (double x : diag) {
            System.out.println(x);
        }
         */
 
 
         /*
        int V1[] = lee_arreglo_enteros(t, 4);
        int V2[] = lee_arreglo_enteros(t, 4);
        int Punto[] = ProductoPuntoArreglos(V1, V2);
        imprimeArreglos(Punto);
        */
         
         
         double datos[]={1.5,2.35,2.0,1.7,3.4};
         double promedio=promedioReales(datos);
         System.out.println("El promedio es: "+promedio);

    }

    //------------------------------------------------------
    public static int[] lee_arreglo_enteros(Scanner sc, int n) {
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Componente " + i + "-\u00E9sima?");
            x[i] = sc.nextInt();
        }
        return x;
    }

    //--------------------------------------------------------------------
    public static void imprimeArreglos(int a[]) {
        System.out.print("[ ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i != a.length - 1) {
                System.out.print(" , ");
            }
        }

        System.out.println(" ]");

    }

    //----------------------------------------------------------------
    public static double suma_arreglo_reales(double[] A) {
        double s = 0;
        for (double num : A) {
            s += num;//s=s+num
        }
        return s;
    }

    //----------------------------------------------------
    public static int[][] llenarMatriz(int filas, int cols) {
        Scanner data = new Scanner(System.in);
        int m[][] = new int[filas][cols];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Digite el valor para [" + i + "],[" + j + "]:");
                m[i][j] = data.nextInt();
            }
        }

        return m;

    }

    public static double[][] llenarMatrizD(int filas, int cols) {
        Scanner data = new Scanner(System.in);
        double m[][] = new double[filas][cols];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("Digite el valor para [" + i + "],[" + j + "]:");
                m[i][j] = data.nextDouble();
            }
        }

        return m;

    }

    //-----------------------------------------------------------
    public static void imprimeMatrix(int A[][]) {

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " , ");
            }
            System.out.println("");
        }

    }

    //---------------------------------------------------------------
    public static int[][] cuadrados_matriz(int[][] X) {
        int[][] Y = new int[X.length][X[0].length];
        for (int i = 0; i < X.length; i++) {
            for (int j = 0; j < X[i].length; j++) {
                Y[i][j] = X[i][j] * X[i][j];
            }
        }
        return Y;
    }

    //---------------------------------------------------------------
    public static double[] diagonal_matriz(double[][] X) {
        double[] Y = new double[X.length];
        if (X.length == X[0].length) {
            for (int i = 0; i < X.length; i++) {
                Y[i] = X[i][i];
            }
        } else {
            System.out.println("ERROR, Matriz no es cuadrada");
            Y = Y;
        }
        return Y;
    }

    //-------------------------------------------------------
    public static int[] ProductoPuntoArreglos(int[] A, int[] B) {
        int Res[];
        if (A.length == B.length) {
            Res = new int[A.length];
            for (int p = 0; p < A.length; p++) {
                Res[p] = A[p] * B[p];
            }

        } else {
            Res = new int[0];
        }

        return Res;
    }

    //------------------------------------------------
    public static double promedioReales(double[] D) {
        double prom = 0.0, sumatoria = 0;
        int cantidad = D.length;
        for (int i = 0; i < D.length; i++) {
            sumatoria = sumatoria + D[i];
        }
        prom = sumatoria / cantidad;

        return prom;

    }

}//-----------FIN D CLASE
