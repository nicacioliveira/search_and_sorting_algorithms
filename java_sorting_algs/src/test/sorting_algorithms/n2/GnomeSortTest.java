package test.sorting_algorithms.n2;

import main.sorting_algorithms.n2.GnomeSort;
import test.sorting_algorithms.GenericTest;

public class GnomeSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new GnomeSort<>();
    }
}