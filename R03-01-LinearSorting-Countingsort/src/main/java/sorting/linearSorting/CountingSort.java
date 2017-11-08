package sorting.linearSorting;

import sorting.AbstractSorting;

/**
 * Classe que implementa a estratégia de Counting Sort vista em sala. Procure
 * evitar desperdicio de memoria alocando o array de contadores com o tamanho
 * sendo o máximo inteiro presente no array a ser ordenado.
 */
public class CountingSort extends AbstractSorting<Integer> {

   @Override
   public void sort(Integer[] array, int leftIndex, int rightIndex) {

      if (!isValidArray(array, leftIndex, rightIndex))
         return;

      Integer biggestElement = findBiggestElement(array, leftIndex, rightIndex);
      Integer[] tempArray = new Integer[rightIndex - leftIndex + 1];
      Integer[] count = new Integer[biggestElement + 1];

      fillArrayWithValue(count, 0);
      int i = 0;

      // count occurrences
      for (i = leftIndex; i <= rightIndex; i++)
         count[array[i]]++;

      // sum array: [n] = [n] + [n-1]
      for (i = 1; i < count.length; i++)
         count[i] += count[i - 1];

      // put in ordered positions
      for (i = leftIndex; i <= rightIndex; i++) {
         tempArray[--count[array[i]]] = array[i];
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

}
