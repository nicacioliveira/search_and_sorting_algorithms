package test.sorting_algorithms.nlogn;


import main.sorting_algorithms.nlogn.QuickSort;
import test.sorting_algorithms.GenericTest;

public class QuickSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new QuickSort<>();
    }
}