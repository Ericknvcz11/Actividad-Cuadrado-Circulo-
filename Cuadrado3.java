public class Cuadrado3 {
	public int lado;  
	Cuadrado3(){
		this(176107); 
		
	}
	Cuadrado3(int lado){
		this.lado = lado; 
		
	}
	
	public double calcularArea() {
		return ID*2; 
	}
	
	public double calcularPerimetro() {
		return ID*4; 
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(ID, 2)+Math.pow(ID, 2));
	}
	
}
