package MainCode;

public class Main {
	
	public static void main(String[] argv) {
		
		int errorValue = 0;
		
		System.out.println("Empezando ejecución del programa <Entregable01> ...");
		System.out.println("Programa <Entregable01> iniciado.");
		
		System.out.println("Soy un error hecho a proposito jejejeje.");
		errorValue = 1;
		

		System.out.println("Soy un amiguete que te ha solucionado el error.");
		
		int var1 = 1;
		int var2 = 100;
		int result = var1+var2;
		errorValue = 0;
		
		int var3 = 200;
		int var4 = 40;
		result = var3+var4-var2;

		System.out.println("Resultado final: " + result);
		System.out.println("Programa <Entregable01> finalizado con salida de error [" + errorValue + "].");
	}
}
