package test.sorting_algorithms.n2;


import main.sorting_algorithms.n2.InsertionSort;
import test.sorting_algorithms.GenericTest;

public class InsertionSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new InsertionSort<>();
    }
}