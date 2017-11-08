package sorting.variationsOfBubblesort;

import sorting.AbstractSorting;
import util.Util;

/**
 * The combsort algoritm.
 */
public class CombSort<T extends Comparable<T>> extends AbstractSorting<T> {
	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {

		if (!checkInput(array, leftIndex, rightIndex))
			return;

		combSort(array, leftIndex, rightIndex);
	}

	private void combSort(T[] array, int leftIndex, int rigthIndex) {

		int gap = rigthIndex - leftIndex;
		boolean swap;
		int indexGap;

		for (int i = leftIndex; i < rigthIndex; i++) {
			swap = false;
			gap = calcGap(gap);

			for (int j = leftIndex; j < array.length - gap; j++) {
				indexGap = j + gap;
				if (array[j].compareTo(array[indexGap]) > 0) {
					Util.swap(array, j, indexGap);
					swap = true;
				}
			}

			if (gap == 1 && !swap) return;
		}
	}

	private int calcGap(int gap) {
		gap = (int) (gap / 1.25);
		if (gap == 9 || gap == 10)
			gap = 11;
		if (gap < 1)
			gap = 1;
		return gap;
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
