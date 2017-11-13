package test.sorting_algorithms.n2;


import main.sorting_algorithms.n2.SelectionSort;
import test.sorting_algorithms.GenericTest;

public class SelectionSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new SelectionSort();
    }
}