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

 	

    public static void main(String[] args) {
    	int peso, altura;
    	System..out.println("Escriba su peso: ");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        peso = entradaEscaner.nextLine ();
        System..out.println("Escriba su altura: ");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        altura = entradaEscaner.nextLine ();
        int imc= calculaIndice(peso, altura);
        
    }
    
    public int calculaIndice(int peso, int altura){
    	int imc= peso/(altura*altura);
    	return imc;
    }
}
