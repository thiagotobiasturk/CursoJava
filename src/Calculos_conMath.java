// EN ESTE CODIGO USAMOS LA CLASE MATH CON SU METODO POW QUE SE USA PARA POTENCIAR CON UNA BASE Y EXPONENTE.

public class Calculos_conMath {

	public static void main(String[] args) {
		
		double base=5;
		
		double exponente=3;
		
		int resultado=(int)Math.pow(base,exponente);
		
		System.out.println(" El resultado de " + base + " elevado a " + exponente + " es " + resultado);

	}

}
