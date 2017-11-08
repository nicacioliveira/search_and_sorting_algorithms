package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The implementation of the algorithm must be in-place!
 */
public class GnomeSort<T extends Comparable<T>> extends AbstractSorting<T> {
	public void sort(T[] array, int leftIndex, int rightIndex) {
		if (!checkInput(array, leftIndex, rightIndex))
			return;
		gnomeSort(array, leftIndex, rightIndex);
	}

	private void gnomeSort(T[] array, int leftIndex, int rigthIndex) {
		int pivot = leftIndex;
		while (pivot < rigthIndex) {
			if (array[pivot].compareTo(array[pivot + 1]) > 0) {
				Util.swap(array, pivot, pivot + 1);
				if (pivot > 0)
					pivot-=2;
			}
			pivot++;
		}
	}

	private boolean checkInput(T[] array, int leftIndex, int rightIndex) {
		if (array == null)
			return false;
		if (array.length == 0)
			return false;
		if (rightIndex <= leftIndex)
			return false;
		return true;
	}
}
