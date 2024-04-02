/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspert7;

/**
 *
 * @author dewipermatasuci
 */
import java.util.Scanner;
public class TugasPert7 {

    public static void main(String[] args) {
        Scanner linear = new Scanner(System.in);
        
        System.out.println("Masukan Angka :");
        double a = linear.nextDouble();
        System.out.println("Masukan Angka :");
        double b = linear.nextDouble();
        System.out.println("Masukan Angka :");
        double c = linear.nextDouble();
        System.out.println("Masukan Angka :");
        double d = linear.nextDouble();
        System.out.println("Masukan Angka :");
        double e = linear.nextDouble();
        System.out.println("Masukan Angka :");
        double f = linear.nextDouble();
        
        LinearEquation angka = new LinearEquation(a,b,c,d,e,f);
        
        if(angka.isSolvable()){
            System.out.println("solusi dari nilai X = " + angka.getX() +"dan Y = " + angka.getY());
        }else{
            System.out.println("Persamaan tidak memiliki solusi");
        }
    }
}
