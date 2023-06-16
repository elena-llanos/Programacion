package ejercicios;


import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		int[] numbers = new int[10];
		
		//lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numbers[i]=sc.nextInt();
            sc.close();
        }
        System.out.println(Arrays.toString(numbers));
        
        
        
        
        
        
        
       
		

	}

	

}
