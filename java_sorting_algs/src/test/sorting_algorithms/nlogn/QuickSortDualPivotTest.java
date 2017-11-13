package test.sorting_algorithms.nlogn;

import main.sorting_algorithms.nlogn.QuickSortDualPivot;
import test.sorting_algorithms.GenericTest;

public class QuickSortDualPivotTest extends GenericTest{

    @Override
    public void setImplementation() {
        super.implementation = new QuickSortDualPivot();
    }
}