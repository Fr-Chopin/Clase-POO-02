
public class inicio {

	public static void main(String[] args) {
		FiguraGeometrica figura = new FiguraGeometrica();
		
		Circulo circulo = new Circulo();
		Rectangulo rectangulo = new Rectangulo();
		Cuadrado cuadrado = new Cuadrado();
		
		double perimetro;
		
//		-- CIRCULO --
		circulo.diametro = 3;
		perimetro = figura.calcularPerimetro(circulo);
		
		System.out.println("El perimetro de la figura " + figura.tipo + " es: " + perimetro);
		
//		-- RECTANGULO --
		rectangulo.lado = 2;
		rectangulo.ladoDiferente = 5;
		perimetro = figura.calcularPerimetro(rectangulo);
		
		System.out.println("El perimetro de la figura " + figura.tipo + " es: " + perimetro);
		
//		-- CUADRADO --
		cuadrado.lado = 4;
		perimetro = figura.calcularPerimetro(cuadrado);
		
		System.out.println("El perimetro de la figura " + figura.tipo + " es: " + perimetro);
		
		
	}

}
