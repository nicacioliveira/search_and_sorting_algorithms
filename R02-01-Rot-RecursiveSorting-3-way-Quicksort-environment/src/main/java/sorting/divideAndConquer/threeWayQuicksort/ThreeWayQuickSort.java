package sorting.divideAndConquer.threeWayQuicksort;

import sorting.AbstractSorting;

import static util.Util.swap;

public class ThreeWayQuickSort<T extends Comparable<T>> extends
		AbstractSorting<T> {

	/**
	 * No algoritmo de quicksort, selecionamos um elemento como pivot,
	 * particionamos o array colocando os menores a esquerda do pivot 
	 * e os maiores a direita do pivot, e depois aplicamos a mesma estrategia 
	 * recursivamente na particao a esquerda do pivot e na particao a direita do pivot. 
	 * 
	 * Considerando um array com muitoe elementos repetidos, a estrategia do quicksort 
	 * pode ser otimizada para lidar de forma mais eficiente com isso. Essa melhoria 
	 * eh conhecida como quicksort tree way e consiste da seguinte ideia:
	 * - selecione o pivot e particione o array de forma que
	 *   * arr[l..i] contem elementos menores que o pivot
	 *   * arr[i+1..j-1] contem elementos iguais ao pivot.
	 *   * arr[j..r] contem elementos maiores do que o pivot. 
	 *   
	 * Obviamente, ao final do particionamento, existe necessidade apenas de ordenar
	 * as particoes contendo elementos menores e maiores do que o pivot. Isso eh feito
	 * recursivamente. 
	 **/
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (rightIndex - leftIndex < 1)
			return;

		int[] pivos = particiona(array, leftIndex, rightIndex);
		int pivo1 = pivos[0];
		int pivo2 = pivos[1];

		sort(array, leftIndex, pivo1 -1);
		sort(array, pivo2 + 1, rightIndex );

	}

	private int[] particiona(T[] array, int leftIndex, int rightIndex) {
		int pivo1 = leftIndex, pivo2 = rightIndex;
		T comparado = array[leftIndex];
		int i = leftIndex;

		while (true) {
			if (array[i].compareTo(comparado) < 0)
				swap(array, i++, pivo1++);
			else if (array[i].compareTo(comparado) > 0)
				swap(array, i, pivo2--);
			else
				i++;

			if(i > pivo2)
				break;
		}

		return new int[] { pivo1, pivo2 };

	}



}
