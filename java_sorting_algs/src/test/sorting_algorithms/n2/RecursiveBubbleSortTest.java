package test.sorting_algorithms.n2;

import main.sorting_algorithms.n2.RecursiveBubbleSort;
import test.sorting_algorithms.GenericTest;

public class RecursiveBubbleSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new RecursiveBubbleSort<>();
    }
}