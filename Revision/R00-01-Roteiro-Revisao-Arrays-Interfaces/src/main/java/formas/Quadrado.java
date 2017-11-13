package formas;

public class Quadrado implements FormaGeometrica {

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularArea() {
		double area;
		area = lado * lado;
		return lado;
	}
	
	

}
