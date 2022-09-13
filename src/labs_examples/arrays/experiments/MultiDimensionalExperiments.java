package labs_examples.arrays.experiments;

public class MultiDimensionalExperiments {
    public static void main(String[] args) {
        //System.out.println("This works in this file");
        int[][] twoD = new int[4][7];
        for (int i =0; i< twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                twoD[i][j] = i * j;
                System.out.print(twoD[i][j] + " - ");
            }
            System.out.println("");
        }

    }
}
