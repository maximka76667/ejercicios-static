package ej02;

public class Circulo {

	static double PI;
	double radio; 
	
	static {
		 PI = 3.14159;
	}

	public Circulo(double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return PI * Math.pow(this.radio, 2);
	}
	
	public double longitud() {
		return 2 * PI * this.radio;
	}
}
