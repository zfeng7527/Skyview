package com.company;



public class SkyView {
    public SkyView(int numRows,int numCols,double[] scan) {
        double[][] arr = new double[numRows][numCols];
        int col = 0, in = -1;
        while (in < scan.length-1) {
            if(col<numCols) {
                for (int i = 0; i <= numCols - 1; i++) {
                    in++;
                    arr[col][i] = scan[in];
                }
                col++;
            }

            if(col<numCols) {
                for (int j = numCols - 1; j >= 0; j--) {
                    in++;
                    arr[col][j] = scan[in];
                }
                col++;
            }
        }

        for(double[] smallArr : arr){
            for(double num : smallArr){
           System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

