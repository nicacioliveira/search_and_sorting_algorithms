package sorting.divideAndConquer;

import sorting.AbstractSorting;

/**
 * Merge sort is based on the divide-and-conquer paradigm. The algorithm
 * consists of recursively dividing the unsorted list in the middle, sorting
 * each sublist, and then merging them into one single sorted list. Notice that
 * if the list has length == 1, it is already sorted.
 */
public class MergeSort<T extends Comparable<T>> extends AbstractSorting<T> {

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

		for (i = 0; i < temp.length; i++) {
			array[i + leftIndex] = (T) temp[i];
		}
	}
}
