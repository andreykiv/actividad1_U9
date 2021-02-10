/*
 * @autor: Myroslav Andreykiv
 */

/*Crearemos una supeclase llamada Electrodomestico con las siguientes
características:
• Sus atributos son precio base, color, consumo energético (letras entre A y
F) y peso. Indica que se podrán heredar.
• Por defecto, el color sera blanco, el consumo energético sera F, el
precioBase es de 100 € y el peso de 5 kg. Usa constantes para ello.
• Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el
nombre esta en mayúsculas o en minúsculas.
Los constructores que se implementaran serán
✓ Un constructor con el precio y peso. El resto por defecto.
✓ Un constructor con el precio y peso. El resto por defecto.
✓ Un constructor con todos los atributos.*/

public class Electrodomestico {
	//definimos los atributos
	protected double precio;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	protected double precioFinal;
	
	//definimos constantes
	final private double DEFAULT_PRECIO = 100;
	final private String DEFAULT_COLOR = "blanco";
	final private char DEFAULT_CONSUMO = 'F';
	final private double DEFAULT_PESO = 5;
	final private String[] DEFAULT_COLORS = {"negro", "blanco", "rojo", "azul", "gris"};
	
	//Un constructor con el precio y peso. El resto por defecto. Asignamos valores que se heredan al crear objeto asignandolos a las constantes creadas previamente
	public Electrodomestico() {
		this.precio = DEFAULT_PRECIO;
		this.color = DEFAULT_COLOR;
		this.consumoEnergetico = DEFAULT_CONSUMO;
		this.peso = DEFAULT_PESO;
	}

	//Un constructor con el precio y peso. El resto por defecto.
	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.color = DEFAULT_COLOR;
		this.consumoEnergetico = DEFAULT_CONSUMO;
	}
	
	//Un constructor con todos los atributos
	public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
		this.precio = precio;
		//nos devueve el valor del this.color
		comprobarColor(color);
		//nos devueve el valor del this.consumoEnergetico
		comprobarConsumoEnergetico(consumoEnergetico);
		this.peso = peso;
		precioFinal();
	}
	
	//metodo comprobarConsumoEnergetico(char letra)
	private void comprobarConsumoEnergetico(char letra) {
		if(letra < 'F') {
			this.consumoEnergetico = letra;
		} else {
			this.consumoEnergetico = DEFAULT_CONSUMO;
		}
	}
	
	//asignamos el color que nos pasa el user si existe entre los colores disponibles, sinó lo asignamos al DEFAULT
	private void comprobarColor(String color) {
		for(int i = 0; i<DEFAULT_COLORS.length; i++) {
			if(color.equals(DEFAULT_COLORS[i])) {
				this.color = color;
			}
		}
		//si el user indica un color que no existe se guarda como null, por eso lo comparamos con null
		if(this.color == null) {
			this.color = DEFAULT_COLOR;
		}
	}
	//precio final parte del precio del electrodomestico mas la suma de consumo energetico y peso
	protected void precioFinal() {
		double precioFinal = precio;
		//sumamos al precioFinal la cantidad obtenida del consumoEnergetico
		switch(consumoEnergetico) {
			case 'A':
				precioFinal+=100;
				break;
			case 'B':
				precioFinal+=80;
				break;
			case 'C':
				precioFinal+=60;
				break;
			case 'D':
				precioFinal+=50;
				break;
			case 'E':
				precioFinal+=30;
				break;
			case 'F':
				precioFinal+=10;
				break;
			default:
				precioFinal+=0;
		}
		//sumamos al precioFinal la cantidad obtenida del peso
		if(peso <= 19) {
			precioFinal+=10;
		} else if(peso <= 49) {
			precioFinal+= 50;
		} else if(peso <= 79) {
			precioFinal+= 80;
		} else if(peso > 80) {
			precioFinal+=100;
		}
		this.precioFinal = precioFinal;
	}
	
	//getters y setters
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(double precioFinal) {
		this.precioFinal = precioFinal;
	}

}
