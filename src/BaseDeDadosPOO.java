import java.util.*;

public class BaseDeDadosPOO {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese el número de empleados: ");
		int num_empleados = entrada.nextInt();
		
		Empleados[] misEmpleados = new Empleados[num_empleados];
		String nom [] = new String[num_empleados];
		String cedu [] = new String[num_empleados];
		int horas [] = new int[num_empleados];
		double val_horas [] = new double[num_empleados];
		
		// INTRODUCCIÓN DE LOS DATOS
		for (int i = 0; i < num_empleados; i++) {
			// Nombre
			System.out.print("Ingrese el nombre del empleado " + (i+1) + ": ");
			nom[i] = entrada.next();
			
			// Cedula
			System.out.print("Ingrese cedula de " + nom[i] + ": ");
			cedu[i] = entrada.next();
			
			// Número de horas trabajadas por el empleado
			System.out.print("Ingrese el número de horas trabajadas por " + nom[i] + ": ");
			horas[i] = entrada.nextInt();
			
			// Valor de las horas trabajadas
			System.out.print("Ingrese el valor de las horas: ");
			val_horas[i] = entrada.nextFloat();
			System.out.println("");
			
			misEmpleados[i] = new Empleados(nom[i], cedu[i], horas[i]);
			misEmpleados[i].calcularPago(val_horas[i]);
			
			System.out.println(misEmpleados[i].dameNombre() + " recibió " + misEmpleados[i].damePago() 
					+ " de sueldo.");
			System.out.println("");
		}
		
		// BUSQUEDA DE INFORMACION SOBRE UM EMPLEADO
		
		System.out.print("Ingrese la cedula del empleado a busca: ");
		String buscar_cedula = entrada.next();
		
		
	}

}
