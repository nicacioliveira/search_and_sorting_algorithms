package test.sorting_algorithms.n2;

import main.sorting_algorithms.n2.OddEvenBubbleSort;
import test.sorting_algorithms.GenericTest;

public class OddEvenBubbleSortTest extends GenericTest{

    @Override
    public void setImplementation() {
        super.implementation = new OddEvenBubbleSort<>();
    }
}