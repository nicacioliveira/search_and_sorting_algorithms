package formas;

public class Retangulo implements FormaGeometrica{

	private double base, altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area;
		area = this.base * this.altura;
		return area;
	}
}
