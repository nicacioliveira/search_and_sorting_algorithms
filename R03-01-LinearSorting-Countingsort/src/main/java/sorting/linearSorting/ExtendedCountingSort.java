package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa do Counting Sort vista em sala. Desta vez este
 * algoritmo deve satisfazer os seguitnes requisitos: - Alocar o tamanho minimo
 * possivel para o array de contadores (C) - Ser capaz de ordenar arrays
 * contendo numeros negativos
 */
public class ExtendedCountingSort extends AbstractSorting<Integer> {

    @Override
    public void sort(Integer[] array, int leftIndex, int rightIndex) {

        if (!isValidArray(array, leftIndex, rightIndex))
            return;

        Integer biggestElement = findBiggestElement(array, leftIndex, rightIndex);
        Integer smallestElement = findSmallestElement(array, leftIndex, rightIndex);

        Integer[] tempArray = new Integer[rightIndex - leftIndex + 1];
        Integer[] count = new Integer[(biggestElement - smallestElement) + 1];

        fillArrayWithValue(count, 0);
        int i = 0;

        // count occurrences
        for (i = leftIndex; i <= rightIndex; i++)
            count[array[i] - smallestElement]++;

        // sum array: [n] = [n] + [n-1]
        for (i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        // put in ordered positions
        for (i = leftIndex; i <= rightIndex; i++) {
            tempArray[--count[array[i] - smallestElement]] = array[i];
        }


        // copy result for original array
        copyArrayToArray(tempArray, array, leftIndex, rightIndex);

    }

    public boolean isValidArray(Integer[] array, int leftIndex, int rightIndex) {
        if (array == null)
            return false;
        if (rightIndex >= array.length || leftIndex >= array.length)
            return false;
        if (leftIndex < 0 || rightIndex < 0)
            return false;
        if (leftIndex >= rightIndex)
            return false;
        if (array.length < 2)
            return false;
        for (int i = 0; i < array.length; i++)
            if (array[i] == null)
                return false;

        return true;
    }

    private void fillArrayWithValue(Integer[] array, Integer value) {
        for (int i = 0; i < array.length; i++)
            array[i] = value;
    }

    private void copyArrayToArray(Integer[] arrayForCopy, Integer[] arrayForFill, Integer leftIndex, Integer rightIndex) {
        for (int i = leftIndex; i <= rightIndex; i++)
            arrayForFill[i] = arrayForCopy[i];
    }

    private Integer findBiggestElement(Integer[] array, int leftIndex, int rightIndex) {
        Integer max = array[0];
        for (int i = leftIndex; i <= rightIndex; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    private Integer findSmallestElement(Integer[] array, int leftIndex, int rightIndex) {
        Integer min = array[0];
        for (int i = leftIndex; i <= rightIndex; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

}
