package operaciones;

public class Operaciones {
	
	public double sumar(double op1, double op2) {
		double ret = 0;
		ret = op1 + op2;
		return ret;		
	}

	public double restar(double op1, double op2) {
		double ret = 0;
		ret = op1 - op2;
		return ret;
	}

	public double multiplicar(double op1, double op2) {
		double ret = 0;
		ret = op1 * op2;
		return ret;
	}

	public double dividir(double op1, double op2) {
		double ret = 0;
		if (op2 == 0)
			System.out.println("No se puede dividir por cero...");
		else
			ret = op1 / op2;
		return ret;
	}

	public double raizCuadrada(double op1) {
		double ret = 0;
		ret = Math.sqrt(op1);
		return ret;
	}

	public double factorial(double op1) {
		if (op1 == 0)
			return 1;
		else
			return op1 * factorial(op1 - 1);
	}

	public double sumatorio(double op1) {
		if (op1 == 1)
			return 1;
		else
			return op1 + sumatorio(op1 - 1);
	}

}
