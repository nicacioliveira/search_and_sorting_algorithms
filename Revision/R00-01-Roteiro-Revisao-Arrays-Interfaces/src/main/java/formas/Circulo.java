package formas;

public class Circulo implements FormaGeometrica {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		double area;
		area = (Math.PI * Math.pow(this.raio, 2));
		return area;
	}
	
	
	

}
