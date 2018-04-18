/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author Alumno
 */
public class Programa {

 	int peso, altura;

    public static void main(String[] args) {
    	System..out.println("Escriba su peso: ")
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        peso = entradaEscaner.nextLine ();
        System..out.println("Escriba su altura: ")
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        altura = entradaEscaner.nextLine ();
    }
    
}
