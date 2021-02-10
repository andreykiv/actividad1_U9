/*Crearemos una subclase llamada Television con las siguientes características:
• Sus atributos son resolución (en pulgadas) y sintonizador TDT (booleano),
ademas de los atributos heredados.
• Por defecto, la resolución sera de 20 pulgadas y el sintonizador sera false.
Los constructores que se implementaran serán:
✓ Un constructor por defecto.
✓ Un constructor con el precio y peso. El resto por defecto.
✓ Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get de resolución y sintonizador TDT.
• precioFinal(): si tiene una resolución mayor de 40 pulgadas, se
incrementara el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentara 50 €. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.*/


import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisor extends Electrodomestico{
	//atributos
	private int resolucion;
	private boolean sintonizadorTDT;
	
	//constructor por defecto
	public Televisor() {
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	//constructor con precio y peso
	public Televisor(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.resolucion = 20;
		this.sintonizadorTDT = false;
	}
	//constructor con resol y sintonizadors
	public Televisor(double precio, String color, char consumoEnergetico, double peso, int resolucion, boolean sintonizadorTDT) {
		super(precio, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		precioFinal(resolucion, sintonizadorTDT);
	}
	
	//completamos el metodo precioFinal
	public void precioFinal(int resolucion, boolean sintonizadorTDT) {
		//llamamos al metodo precioFinal del Electrodomestico y además añadimos el siguiente codigo:
		super.precioFinal();
		//si se cumple la condicion sumamos al precio final la cantidad del precio del televisor * 1.3
		if(resolucion > 40) {
			//importamos clase bigdecimal para devolver los ultimos dos digitos despues de coma.
			BigDecimal sumarPrecio = new BigDecimal(precio * 0.3);
			sumarPrecio = sumarPrecio.setScale(2, RoundingMode.HALF_UP);
			this.precioFinal+=sumarPrecio.doubleValue();
		}//si tiene incorporado sumamos 50 u.m. al precio final
		if(sintonizadorTDT) {
			this.precioFinal+=50;
		}
	}

	//generamos getters y setters
	public int getResolucion() {
		return resolucion;
	}
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}
	public void setSintonizadorTDT(boolean sintonizadorTDT) {
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	
	
}
