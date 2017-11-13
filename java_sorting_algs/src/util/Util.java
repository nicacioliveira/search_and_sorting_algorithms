package util;

public abstract class Util {

    public static void swap(Object[] array, int i, int j) {
        if (array == null)
            throw new IllegalArgumentException();

        Object temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static boolean isPrime(long n) {
        boolean result = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0){
                result = false;
                break;
            }
        }
        return result;
    }

    public static Object getSmallerElement(Comparable[] array, int leftIndex, int rightIndex) {
        Object smaller = array[leftIndex];
        for (int i = leftIndex; i <= rightIndex; i++)
            if (array[i].compareTo(smaller) < 0)
                smaller = array[i];

        return smaller;
    }

    public static Object getBiggestElement(Comparable[] array, int leftIndex, int rightIndex) {
        Object biggest = array[leftIndex];
        for (int i = leftIndex; i <= rightIndex; i++)
            if (array[i].compareTo(biggest) > 0)
                biggest = array[i];

        return biggest;
    }
}
