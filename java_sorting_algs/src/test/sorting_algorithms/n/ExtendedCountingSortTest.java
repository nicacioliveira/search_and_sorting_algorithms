package test.sorting_algorithms.n;

import main.sorting_algorithms.n.ExtendedCountingSort;
import test.sorting_algorithms.GenericTest;

public class ExtendedCountingSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new ExtendedCountingSort();
    }
}