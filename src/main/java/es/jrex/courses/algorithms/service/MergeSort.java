package es.jrex.courses.algorithms.service;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    ArrayList<Integer> inputArray;

    public MergeSort(ArrayList<Integer> input) {
        this.inputArray = input;
    }

    public ArrayList<Integer> sortArray() {
        divide(0, inputArray.size()-1);
        return inputArray;
    }

    private void divide(int startIndex, int endIndex) {
        if(startIndex < endIndex && (endIndex-startIndex) > 0) {
            int mid = (startIndex + endIndex) /2;
            divide(startIndex, mid);
            divide(mid+1, endIndex);

            merge(startIndex, mid, endIndex);
        }
    }

    private void merge(int startIndex, int midIndex, int endIndex) {
        ArrayList<Integer> mergedArray = new ArrayList<>();

        int leftIndex = startIndex;
        int rightIndex = midIndex + 1;

        while(leftIndex <= midIndex && rightIndex <= endIndex) {
            if(inputArray.get(leftIndex) < inputArray.get(rightIndex)) {
                mergedArray.add(inputArray.get(leftIndex));
                leftIndex++;
            } else {
                mergedArray.add(inputArray.get(rightIndex));
                rightIndex++;
            }
        }

        while(leftIndex <= midIndex) {
            mergedArray.add(inputArray.get(leftIndex));
            leftIndex++;
        }

        while(rightIndex <= endIndex) {
            mergedArray.add(inputArray.get(rightIndex));
            rightIndex++;
        }

        int i = 0;
        int j = startIndex;
        while(i<mergedArray.size()){
            inputArray.set(j, mergedArray.get(i++));
            j++;
        }
    }

}
