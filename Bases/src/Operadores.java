import java.util.Date;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double square = Math.sqrt(25);
		System.out.println(square);
		
		double power = Math.pow(5, 2);
		System.out.println(power);
		
		
		int x = -5;
		System.out.println("X = 5");
		System.out.println( x == 5);
		System.out.println("x != 5");
		System.out.println(x != 5);
		
		System.out.println(1 <= x && x <= 10);
		
		
		int a , b , c;
		
		a = b = c = 1;
		
		a = 7;
		
		c = a > b ? a : b;
		
		System.out.println("Ternario");
		System.out.println(c);

		boolean arrancado = false;
		System.out.println(arrancado ? "Arrancado": "Parado");
		
		 System.out.println((int)(Math.random() * 6 )+ 1); 
		 // En realidad a esto le hemos hecho un casting a INT. 
		 // Se puede hacer así en tipos primitivos
		 
		 System.out.println(new Date().getTime());
	}

}
