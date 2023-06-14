
public class ArrayEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 		int[] array = new int[3];
 		
 		array[0] = 1;
 		array[1] = 3;
 		array[2] = 5;
 		
 		for(int i = 0; i < array.length; i++) {
 			System.out.println(array[i]);
 		}
 		
 		System.out.println("foreach");
 		for(int dato: array) {
 			
 			System.out.println(dato);
 		}
 		
	}

}
