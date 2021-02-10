/*
 * @author: Myroslav Andreykiv
 */
public class MainApp {

	public static void main(String[] args) {
		
		Electrodomestico electrodomesticos[] = new Electrodomestico[10];
		electrodomesticos[0] = new Lavadora(111, "gris", 'A', 40, 31);
		electrodomesticos[1] = new Televisor(122, "blanco", 'A', 40, 31, true);
		electrodomesticos[2] = new Electrodomestico(45, "azul", 'B', 40);
		electrodomesticos[3] = new Televisor(45, "rojo", 'C', 40, 31, false);
		electrodomesticos[4] = new Electrodomestico(331, "gris", 'D', 402);
		electrodomesticos[5] = new Lavadora(99, "gris", 'E', 40, 31);
		electrodomesticos[6] = new Televisor(290, "negro", 'F', 55, 44, true);
		electrodomesticos[7] = new Lavadora(37, "gris", 'A', 40, 31);
		electrodomesticos[8] = new Electrodomestico(86, "azul", 'F', 55);
		electrodomesticos[9] = new Televisor(240, "rojo", 'A', 89, 50, true);
		
		double precioTotalLavadoras = 0;
		double precioTotalTelevisores = 0;
		double precioTotalElectrodomestico = 0;
		
		for(int i = 0; i < electrodomesticos.length; i++) {
			System.out.println("Precio producto " + i + " " + electrodomesticos[i].getPrecioFinal());
			
			if(electrodomesticos[i] instanceof Lavadora) {
				precioTotalLavadoras+= electrodomesticos[i].getPrecioFinal();
			} else if(electrodomesticos[i] instanceof Televisor) {
				precioTotalTelevisores+=electrodomesticos[i].getPrecioFinal();
			} else {
				precioTotalElectrodomestico+=electrodomesticos[i].getPrecioFinal();
			}
		}
		//mostramos por pantalla la suma
		System.out.println("El precio total de Lavadoras es de: " + precioTotalLavadoras + " €");
		System.out.println("El precio total de Televisores es de: " + precioTotalTelevisores + " €");
		System.out.println("El precio total de Electrodomesticos que no son Lavadoras ni Televisores es de: " + precioTotalElectrodomestico + " €");

	}

}
