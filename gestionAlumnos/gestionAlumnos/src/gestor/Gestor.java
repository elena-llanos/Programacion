package gestor;

import alumno.Alumno;

// Tiene la responsabilidad de guardar y devolver Alumnos
public class Gestor {

	// Para guardar los Alumnos
	private Alumno[] alumnos = null;

	// Constructor
	public Gestor() {
		alumnos = new Alumno[20];
	}

	// Guarda un Alumno en el Array
	public void anadirAlumno(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				alumnos[i] = alumno;
				break;
			}
		}
	}

	// Devuelve TODOS los Alumnos
	public Alumno[] getTodosAlumnos() {
		return alumnos;
	}

	// Devuelve un Alumno por nombre
	public Alumno getAlumno(String nombre) {
		Alumno ret = null;
		for (int i = 0; i < alumnos.length; i++) {
			if (null == alumnos[i]) {
				continue;
			} else if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
				ret = alumnos[i];
			} 
		}
		return ret;
	}

}
