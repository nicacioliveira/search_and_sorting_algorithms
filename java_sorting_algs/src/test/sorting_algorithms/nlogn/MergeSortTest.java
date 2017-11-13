package test.sorting_algorithms.nlogn;

import main.sorting_algorithms.nlogn.MergeSort;
import test.sorting_algorithms.GenericTest;


public class MergeSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new MergeSort();
    }
}