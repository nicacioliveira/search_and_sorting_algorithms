package test.sorting_algorithms.n2;

import main.sorting_algorithms.n2.BubbleSort;
import test.sorting_algorithms.GenericTest;

public class BubbleSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new BubbleSort<>();
    }
}