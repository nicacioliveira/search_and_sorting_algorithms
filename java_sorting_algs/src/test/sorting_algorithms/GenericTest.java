package test.sorting_algorithms;

import main.sorting.AbstractSorting;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public abstract class GenericTest {

    private Integer[] arrayEven;
    private Integer[] arrayOdd;
    private Integer[] arrayEmpty;
    private Integer[] arrayRepeatedValues;
    private Integer[] arrayEqualValues;
    private Integer[] arrayNegativeNumbers;

    public AbstractSorting<Integer> implementation;

    @org.junit.Before
    public void setUp() throws Exception {
        arrayEven = new Integer[]{30, 28, 7, 29, 11, 26, 4, 22, 23, 31};
        arrayOdd = new Integer[]{6, 41, 32, 7, 26, 4, 37, 49, 11, 18, 36};
        arrayEmpty = new Integer[]{};
        arrayRepeatedValues = new Integer[]{4, 9, 3, 4, 0, 5, 1, 4};
        arrayEqualValues = new Integer[]{6, 6, 6, 6, 6, 6};
        arrayNegativeNumbers = new Integer[]{0,-1,4,-2,3,-3,5,-4};
        setImplementation();
        if (implementation == null)
            throw new Exception("implementation atribute not started!");
    }

    public abstract void setImplementation();

    public void genericTest(Integer[] array) {
        Integer[] copy1 = {};
        if(array.length > 0) copy1 = Arrays.copyOf(array, array.length);
        implementation.sort(array);
        Arrays.sort(copy1);
        Assert.assertArrayEquals(copy1, array);
    }

    @Test
    public void testSort01_ArrayEven() {
        genericTest(arrayEven);
    }

    @Test
    public void testSort02_ArrayOdd() {
        genericTest(arrayOdd);
    }

    @Test
    public void testSort03_ArrayEmpty() {
        genericTest(arrayEmpty);
    }

    @Test
    public void testSort04_RepeatedValues() {
        genericTest(arrayRepeatedValues);
    }

    @Test
    public void testSort05_ArrayEqualValues() {
        genericTest(arrayEqualValues);
    }

    @Test
    public void testSort06_ArrayNegativeNumbers() {
        genericTest(arrayNegativeNumbers);
    }

}
