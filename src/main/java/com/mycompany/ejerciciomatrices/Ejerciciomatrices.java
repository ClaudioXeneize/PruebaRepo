
package com.mycompany.ejerciciomatrices;

import java.util.Scanner;


public class Ejerciciomatrices {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("INGRESE LA DIMENSION DE LA MATRIZ");
        n= leer.nextInt();
        int[][] a = new int [n][n];
        int[][] b = new int [n][n];
       
        llenar_matriz(a,n);
        llenar_matriz(b,n);
        System.out.println("matriz a");
        mostrar_matriz(a,n);
        System.out.println("matriz b");
        mostrar_matriz(b,n);
        int opc=0;
        switch (opc) {
            case 0:
                System.out.println("Las matrices se suman");
                sumar_matriz(a, b, n);
                break;
            case 1:
                System.out.println("Las matrices se restan");
                restar_matriz(a, b, n);
                break;
                       
            default:
                System.out.println("La matriz se multiplica por un escalar");
                productoescalar_matriz(a, n, leer.nextInt());
        }
                
        
    }
    
    
    public static void llenar_matriz(int[][] a, int n){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                a[i][j]=(int) (Math.random() * 10) + 1;
                
            }
            
        }





}
    
     public static void mostrar_matriz(int[][] a, int n){
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(a[i][j]+" ; ");
                
            }
            System.out.println("");
        }





}
     public static void sumar_matriz(int[][] a, int[][] b, int n){
         int[][] respuesta= new int[n] [n];
         for (int i = 0; i < 3; i++) {
             
             for (int j = 0; j < 3; j++) {
                 
                 respuesta[i][j]=a[i][j]+b[i][j];
             }
             
         }
         System.out.println("La suma entre matrices es: ");
         mostrar_matriz(respuesta,n);
     
     
     
     }
     
     public static void restar_matriz(int[][] a, int[][] b, int n){
         int[][] respuesta= new int[n] [n];
         for (int i = 0; i < 3; i++) {
             
             for (int j = 0; j < 3; j++) {
                 
                 respuesta[i][j]=a[i][j]-b[i][j];
             }
             
         }
     
     
     
     }
     
     public static void productoescalar_matriz(int[][] a, int n, int k){
         
         int[][] respuesta= new int[n] [n];
         
         for (int i = 0; i < 3; i++) {
             
             for (int j = 0; j < 3; j++) {
                 
                 respuesta[i][j]=k*a[i][j];
             }
             
         }
         System.out.println("La suma entre matrices es: ");
         mostrar_matriz(respuesta,n);
     
     
     
     }
    
    
    
    
    
    
    
}
