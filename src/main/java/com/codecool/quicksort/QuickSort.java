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

    private void quicksort(List<Integer> toSort, int low, int high) {
        Integer pivot = toSort.get(random.nextInt(toSort.size()));
        int i = low;
        int j = high;

        while (i <= j) {
            while (toSort.get(i) < pivot) {
                i++;
            }
            while (toSort.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                exchange(toSort, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quicksort(toSort, low, j);
        } if (i < high) {
            quicksort(toSort, i, high);
        }
    }

}
