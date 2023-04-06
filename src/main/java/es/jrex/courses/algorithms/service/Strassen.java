package es.jrex.courses.algorithms.service;

public class Strassen {
    private final Integer[][] matrixA;
    private final Integer[][] matrixB;
    private Integer a, b, c, d, e, f, g, h;

    public Strassen(Integer[][] matrixA, Integer[][] matrixB) {
        this.matrixA = matrixA;
        this.matrixB = matrixB;
        a = matrixA[0][0];
        b = matrixA[0][1];
        c = matrixA[1][0];
        d = matrixA[1][1];

        e = matrixB[0][0];
        f = matrixB[0][1];
        g = matrixB[1][0];
        h = matrixB[1][1];
    }

    public boolean areMultiplicative() {
        int column1 = matrixA[0].length;
        int row2 = matrixB.length;

        return column1 == row2;
    }

    public Integer[][] getMultiplication() {
        Integer[][] result = new Integer[2][2];

        result[0][0] = p5() + p4() - p2() + p6();
        result[0][1] = p1() + p2();
        result[1][0] = p3() + p4();
        result[1][1] = p1() + p5() - p3() - p7();

        return result;
    }

    private Integer p1() {
        return a*(f-h);
    }

    private Integer p2() {
        return (a+b)*h;
    }

    private Integer p3() {
        return (c+d)*e;
    }

    private Integer p4() {
        return d*(g-e);
    }

    private Integer p5() {
        return (a+d)*(e+h);
    }

    private Integer p6() {
        return (b-d)*(g+h);
    }

    private Integer p7() {
        return (a-c)*(e+f);
    }
}
