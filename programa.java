package programa;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Programa {

 	

    public static void main(String[] args) {
    	int peso, altura;
        System.out.println();
    	System.out.println("Escriba su peso: ");
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        
        peso = Integer.parseInt(entradaEscaner.nextLine ());
        System.out.println("Escriba su altura: ");
        Scanner entradaEscaner2 = new Scanner(System.in); //Creación de un objeto Scanner
        altura = Integer.parseInt(entradaEscaner2.nextLine ());
        int imc= calculaIndice(peso, altura);
        analizaIndice(imc);

    }
    
    public static int calculaIndice(int peso, int altura){
    	int imc= peso/(altura*altura);
    	return imc;
    }
    public static void analizaIndice(int imc){
    	if(imc>30){
    		System.out.println("Estás obeso");
    	}
    	if(imc<30 && imc>25){
    		System.out.println("Estás sobrepeso");
    	}
    	if(imc<25){
    		System.out.println("Tu peso es normal");
    	}
    }

}

