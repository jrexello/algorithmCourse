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

}
