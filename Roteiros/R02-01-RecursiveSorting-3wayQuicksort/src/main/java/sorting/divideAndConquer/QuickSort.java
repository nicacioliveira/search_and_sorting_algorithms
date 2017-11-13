package sorting.divideAndConquer;

import sorting.AbstractSorting;

/**
 * Quicksort is based on the divide-and-conquer paradigm. The algorithm chooses
 * a pivot element and rearranges the elements of the interval in such a way
 * that all elements lesser than the pivot go to the left part of the array and
 * all elements greater than the pivot, go to the right part of the array. Then
 * it recursively sorts the left and the right parts. Notice that if the list
 * has length == 1, it is already sorted.
 */
public class QuickSort<T extends Comparable<T>> extends AbstractSorting<T> {

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (rightIndex - leftIndex < 1)
			return;

		int center = (rightIndex + leftIndex) / 2;

		sort(array, leftIndex, center);
		sort(array, center + 1, rightIndex);
		merge(array, leftIndex, center, rightIndex);
	}

	private void merge(T[] array, int leftIndex, int center, int rightIndex) {
		Object[] temp = new Object[rightIndex - leftIndex + 1];
		int i = 0;
		int v1 = leftIndex;
		int v2 = center + 1;

		while (v1 <= center && v2 <= rightIndex)
			if (array[v1].compareTo(array[v2]) <= 0)
				temp[i++] = array[v1++];
			else
				temp[i++] = array[v2++];

		if (v1 <= center && v2 > rightIndex)
			while (v1 <= center)
				temp[i++] = array[v1++];
		else
			while (v2 <= rightIndex)
				temp[i++] = array[v2++];

		for (i = 0; i < temp.length; i++)
			array[i + leftIndex] = (T) temp[i];

	}
}
