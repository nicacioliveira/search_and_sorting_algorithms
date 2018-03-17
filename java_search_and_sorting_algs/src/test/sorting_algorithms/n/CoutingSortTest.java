package test.sorting_algorithms.n;

import test.sorting_algorithms.GenericTest;
import main.sorting_algorithms.n.CountingSort;

public class CoutingSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new CountingSort();
    }
}