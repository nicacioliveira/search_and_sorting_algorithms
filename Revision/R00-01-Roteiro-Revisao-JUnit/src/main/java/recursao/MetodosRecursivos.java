package recursao;

public class MetodosRecursivos {

	public static void main(String[] args) {
		MetodosRecursivos m = new MetodosRecursivos();
		
		 //int a[] = {1,2};
		//int resp = m.calcularSomaArray(a);
		//System.out.println(resp);
		
		//long fat = m.calcularFatorial(12);
		//System.out.println("Fat final: " + fat);
		
		//int fib = m.calcularFibonacci(20);
		//System.out.println(fib);
		
		//Integer[] it = {null, 1,2,3, null, 4, null};
		//int countnull = m.countNotNull(it);
		//System.out.println(countnull);
		
		//long pot = m.potenciaDe2(10);
		//System.out.println(pot);
		
		//double progarit = m.progressaoAritmetica(1, 10, 10);
		//System.out.println(progarit);
		
		
	}
	
	public int calcularSomaArray(int[] array){
		int result = calcularSomaArray(array, 0);
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR A SOMA
		// DOS EMENTOS DE UM ARRAY
		return result;
	}
	
	private int calcularSomaArray(int[] array, int i) {
		if (i < array.length) {
			return array[i] + calcularSomaArray(array, i + 1);
		} else {
			return 0;
		}
	}
	
	public long calcularFatorial(int n) {
		long result = 1;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O FATORIAL DO PARAMETRO
		// DE ACORDO COM O QUE FOI MOSTRADO NO EXERCCICIO. OBSERVE QUE SENDO O
		// METODO
		// RECURSIVO, O FATORIAL DOS NUMEROS ANTERIORES TAMBEM VAO SER IMPRESSOS
		if (n == 0) {
			return 1;
		} else {
			result = n * calcularFatorial(n - 1);
			System.out.println(result);
		}
		return result;
	}

	public int calcularFibonacci(int n) {
		int result = 1;
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O N-ESIMO TERMO
		// DA SEQUENCIA DE FIBONACCI, QUE TEM A SEGUINTE LEI DE FORMACAO: O
		// PRIMEIRO E SEGUNDO NUMEROS
		// DA SEQUENCIA SÃO 1. A PARTIR DO TERCEIRO TERMO, CADA TERMO DA
		// SEQUENCIA É DADO
		// PELA SOMA DOS OUTROS DOIS ANTERIORES. OBSERVE QUE SENDO O METODO
		// RECURSIVO, O FIBONACCI DOS NUMEROS ANTERIORES TAMBEM VAO SER
		// IMPRESSOS
		if (n == 1 || n == 2) {
			return 1;
		} else {
			result = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
			return result;
		}		
	}

	public int countNotNull(Object[] array) {
		int result = 0;
		// TODO IMPLEMENTE AQUI O CODIGO QUE CONTA (USANDO RECURSAO) A
		// QUANTIDADE DE ELEMENTOS NAO NULOS
		// DE UM ARRAY DE OBJETOS RECEBIDO COMO PARAMETRO
		result = countNotNull(array, 0);
		return result;
	}

	private int countNotNull(Object[] array, int i) {
		if (i < array.length) {
			if (array[i] == null) 
				return 1 + countNotNull(array, i + 1);
			else
				return 0 + countNotNull(array, i + 1);
			
		} else {
			return 0;
		}
		
	}

	public long potenciaDe2(int expoente) {
		long result = 1;
		// TODO IMPLEMENTE (USANDO RECURSAO) O CODIGO PARA PRODUZIR A N-ESIMA
		// POTENCIA
		// DE 2
		if (expoente != 0) {
			result = 2 * potenciaDe2(expoente - 1);
		}
		return result;
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO ARITMETICA, DADO O TERMO INICIAL E A RAZAO
		if (n != 1) {
			result = razao + progressaoAritmetica(termoInicial, razao, n - 1);
		}
		return result;
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		double result = termoInicial;
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO GEOMETRICA, DADO O TERMO INICIAL E A RAZAO
		
		if (n != 1) {
			result = razao * progressaoGeometrica(termoInicial, razao, n - 1);
		}
		return result;
	}
	
	
}
