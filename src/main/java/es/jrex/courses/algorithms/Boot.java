package es.jrex.courses.algorithms;

import es.jrex.courses.algorithms.service.CountingInversions;

public class Boot {

    public static void main(String[] args) {
        CountingInversions countingInversions = new CountingInversions();
        System.out.println(countingInversions.getByBruteForce());
    }
}
