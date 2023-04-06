package es.jrex.courses.algorithms.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingInversions {

    List<Integer> arrayValue;

    public CountingInversions() {
        this.arrayValue = Arrays.asList(0,2,4,1,3,5);
    }

    public List<List<Integer>> getByBruteForce() {

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<6; i++) {
            for(int j=0; j<6; j++) {
                Integer valI = arrayValue.get(i);
                Integer valJ = arrayValue.get(j);
                if(i<j && valI > valJ){
                    result.add(Arrays.asList(valI+1,valJ+1));
                }
            }
        }

        return result;
    }

    public int countByMergeSort() {
        List<Integer> orderedArray = new ArrayList<>();

        int mid = arrayValue.size()/2;

        List<Integer> subA = arrayValue.subList(0, mid);
        List<Integer> subB = arrayValue.subList(mid, arrayValue.size());

        MergeSort mergerA = new MergeSort(new ArrayList<>(subA));
        MergeSort mergerB = new MergeSort(new ArrayList<>(subB));

        subA = mergerA.sortArray();
        subB = mergerB.sortArray();

        int idxA = 0;
        int idxB = 0;
        int swaps = 0;

        for (int i=0; i<arrayValue.size(); i++) {
            if(idxA < subA.size() && subA.get(idxA) < subB.get(idxB)) {
                orderedArray.add(subA.get(idxA));
                idxA++;
            } else if(idxB < subB.size()) {
                orderedArray.add(subB.get(idxB));
                idxB++;
                swaps += (mid + 1) - i;
            }
        }

        return swaps;

    }

}
