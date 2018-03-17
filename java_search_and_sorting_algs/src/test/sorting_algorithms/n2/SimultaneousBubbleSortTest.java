package test.sorting_algorithms.n2;


import main.sorting_algorithms.n2.SimultaneousBubbleSort;
import test.sorting_algorithms.GenericTest;

public class SimultaneousBubbleSortTest extends GenericTest {

    @Override
    public void setImplementation() {
        super.implementation = new SimultaneousBubbleSort();
    }
}