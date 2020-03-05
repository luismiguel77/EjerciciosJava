
public class Empleados { // CLASE PRINCIPAL DEL OBJETO EMPLEADOS
	
	private String nombre, cedula;
	private int num_horas;
	private double pago;
	
	public Empleados(String nom, String cedu, int horas) { // METODO CONSTRUCTOR
		nombre = nom;
		cedula = cedu;
		num_horas = horas;
		
	}
	
	public String dameNombre() { // METODO GETTER DEL NOMBRE
		return nombre;
		
	}
	
	public String dameCedula() { // METODO GETTER DE LA CEDULA
		return cedula;
	}
	
	public int dameHoras() { // METODO GETTER DEL NÚMERO DE HORAS TRABAJADAS
		return num_horas;
	}
	
	public void calcularPago(double valor_horas) { // METODO SETTER PARA CALCULAR EL PAGO TOTAL
		pago = num_horas * valor_horas;
	}
	
	public double damePago() { // METODO GETTER DEL PAGO
		return pago;
	}
	
}
