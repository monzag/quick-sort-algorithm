package com.codecool.quicksort;

import java.util.List;
import java.util.Random;

public class QuickSort {

    private Random random = new Random();

    public void sort(List<Integer> toSort) throws IllegalArgumentException {
        if (toSort == null) {
            throw new IllegalArgumentException();
        }

        int low = 0;
        int high = toSort.size() - 1;
        quicksort(toSort, low, high);
    }

}
