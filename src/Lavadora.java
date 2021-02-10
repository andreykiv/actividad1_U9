/*Crearemos una subclase llamada Lavadora con las siguientes características:
• Su atributo es carga, ademas de los atributos heredados.
• Por defecto, la carga es de 5 kg. Usa una constante para ello.
Los constructores que se implementaran serán:
✓ Un constructor por defecto.
✓ Un constructor con el precio y peso. El resto por defecto.
✓ Un constructor con la carga y el resto de atributos heredados. Recuerda
que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get de carga.
• precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50
€, sino es así no se incrementara el precio. Llama al método padre y
añade el código necesario. Recuerda que las condiciones que hemos visto
en la clase Electrodomestico también deben afectar al precio.*/


/*
 * @autor: Myroslav Andreykiv
 */
public class Lavadora extends Electrodomestico {
	//creamos constante para la carga
	final private int DEFAULT_CARGA = 5;
	
	
	//atributos de la subclase
	private int carga;
	
	//constructor por defecto
	public Lavadora() {
		this.carga = DEFAULT_CARGA;
	}
	
	//Un constructor con el precio y peso. El resto por defecto.
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = DEFAULT_CARGA;
	}
	
	//Un constructor con la carga y el resto de atributos heredados. 
	public Lavadora(double precio, String color, char consumoEnergetico, double peso, int carga) {
		super(precio, color, consumoEnergetico, peso);
		this.carga = carga;
		precioFinal(carga);
	}
	
	//precioFinal()
	public void precioFinal(int carga){
		super.precioFinal();
		if(carga > 30) {
			this.precioFinal+= 50;
		}
	}
	
	//generamos metodo get de carga
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
}
