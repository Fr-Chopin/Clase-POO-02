
public class FiguraGeometrica {
	public String tipo;
	
	public double calcularPerimetro(Circulo circulo) {
		double perimetro;
		
		tipo = "circulo";
		perimetro = 3.14 * circulo.diametro;
		
		return perimetro;
	}
	
	public double calcularPerimetro(Rectangulo rectangulo) {
		double perimetro;
		
		tipo = "rectangulo";
		perimetro = rectangulo.lado * 2 + rectangulo.ladoDiferente * 2;
		
		return perimetro;
	}
	
	public double calcularPerimetro(Cuadrado cuadrado) {
		double perimetro;
		
		tipo = "cuadrado";
		perimetro = cuadrado.lado * 4;
		
		return perimetro;
	}
}
