package es.jrex.courses.algorithms;

import es.jrex.courses.algorithms.service.CountingInversions;
import es.jrex.courses.algorithms.service.MergeSort;
import es.jrex.courses.algorithms.service.Strassen;

import java.util.ArrayList;
import java.util.Arrays;

public class Boot {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort(new ArrayList<>(Arrays.asList(5,2,0,7,1,4,9,8,3,6)));
        CountingInversions countingInversions = new CountingInversions();
        System.out.println(countingInversions.countByMergeSort());
        System.out.println(mergeSort.sortArray());

        System.out.println("Stressland");
        Integer[][] matrixA = {{1,2}, {3,4}};
        Integer[][] matrixB = {{5,6}, {7,8}};
        Strassen strassen = new Strassen(matrixA, matrixB);
        if(strassen.areMultiplicative()){
            System.out.println("Result " + Arrays.deepToString(strassen.getMultiplication()));
        }
    }
}
