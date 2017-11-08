package formas;

public class Triangulo implements FormaGeometrica{

	private double base, altura;
	
	public Triangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	@Override
	public double calcularArea() {
		double area = 0;
		area = (this.base * this.altura) / 2.0;
		return area;
	}
	
	

}
