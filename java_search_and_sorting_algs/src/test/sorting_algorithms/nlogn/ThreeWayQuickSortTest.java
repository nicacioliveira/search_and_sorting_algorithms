package test.sorting_algorithms.nlogn;

import main.sorting_algorithms.nlogn.ThreeWayQuickSort;
import test.sorting_algorithms.GenericTest;

public class ThreeWayQuickSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new ThreeWayQuickSort();
    }
}