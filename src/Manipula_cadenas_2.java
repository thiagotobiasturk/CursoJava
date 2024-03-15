// EN ESTE CODIGO USAMOS LA CLASE STRING PARA ESCRIBIR TEXTO Y METODO SUBSTRING PARA EXTRAER LETRAS DE UN TEXTO.

public class Manipula_cadenas_2 {

	public static void main(String[] args) {
		
		String frase="Hoy es un estupendo dia para aprender a  programar en java ";
		/* SE USA EL NOMBRE DE LA VARIABLE EN ESTE CASO 'FRASE' DELANTE EL METODO SUBSTRING SEGUIDO DE (23,59).
		 LAS ORACIONES SE LEEN DESDE 0,1,2,3 . 23 EN ESTE CASO REPRESENTA LA PRIMERA LETRA DE 'PARA'
		 Y 59 REPRESENTA EL FINAL EN ESTE CASO SERIA EL ESPACIO DESPUES DE JAVA. 
		 COMO RESULTADO OBTENEMOS "PARA APRENDER A PROGRAMAR EN JAVA" . */
		String frase_resumen=frase.substring(23,59);
		
		System.out.println(frase_resumen);

	}

}
