package Emisora;

import java.util.Scanner;

/*Al momento de escoger la opci�n que se desea se ejecutar�, 
pero al escoger la siguiente opci�n se ejecutar� con la respuesta de la anterior*/

public class Main {
	
	public static void main(String[]arg) {
		
		//Se ingresa una frecuencia de 80 
		EmisoraFM fr1 = new EmisoraFM ();
		fr1.setFrecuencia(70);
		Scanner in = new Scanner (System.in);
		int opcion;
		
		do {

        System.out.println("\n   Menu Principal   ");
        System.out.println("*********************");
        System.out.println("1. Subir frecuencia");
        System.out.println("2. Bajar frecuencia");
        System.out.println("3. Mostrar frecuencia");
        System.out.println("4. Salir");
        System.out.println("Digite opcion (1/4): ");
        opcion = in.nextInt();
			 
        switch(opcion){
            case 1: fr1.controlador();fr1.subir();break;
            case 2: fr1.controlador();fr1.bajar();break;
            case 3: fr1.display();break;
            case 4: break;
            default: System.out.println("Opcion no v�lida");//Mensaje de dato err�neo
        }
    }while (opcion != 4);
  }
}