package test.sorting_algorithms.nlogn;

import main.sorting_algorithms.nlogn.QuickSortMedianOfThree;
import test.sorting_algorithms.GenericTest;

import static org.junit.Assert.*;

public class QuickSortMedianOfThreeTest extends GenericTest{

    @Override
    public void setImplementation() {
        super.implementation = new QuickSortMedianOfThree<>();
    }
}