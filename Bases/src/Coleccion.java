import java.util.ArrayList;

public class Coleccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Sale en Java8 si no: new ArrayList<String>();
		ArrayList<String> textos = new ArrayList<>();
		textos.add("uno");
		textos.add("dos");
		textos.add("tres");
		
		for(String texto: textos) {
			System.out.println(texto);
		}
		

	}

}
