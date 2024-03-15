
public class Manipula_cadenas {

	public static void main(String[] args) {
		
		String nombre="Thiago";
		
		System.out.println("Mi nombre es " + nombre);
		
		// EL METODO 'LENGTH' SE USA PARA SABER LA CANTIDAD DE LETRAS EN ESTE CASO 'THIAGO'
		System.out.println("Mi nombre tiene " + nombre.length() + " letras. ");
		
		// ACA UTILIZO EL METODO 'CHARAT' SEGUIDO DE (0). EL (0) REPRESENTA LA PRIMERA LETRA DE THIAGO.  
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		// DECLARO VARIABLE .
		int ultima_letra;
		
		// LA VARIABLE ALMACENA EL NOMBRE SEGUIDO DEL METODO LENGTH.
		ultima_letra=nombre.length();
		
		// USO EL NOMBRE.CHARAT SEGIDO DE ENTRE ENTRE PARENTESIS DE LA VARIABLE (ULTIMA_LETRA-1) LO CUAL REPRESENTA LA LETRA 'O DE 'THIAGO'.
		System.out.println("Y la ultima letra de Thiago es la " + nombre.charAt(ultima_letra-1));

	}

}
