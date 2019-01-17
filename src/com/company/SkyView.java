package com.company;



public class SkyView {
    public SkyView(int numRows,int numCols,double[] scan) {
        double[][] arr = new double[numRows][numCols];
        int row = 0, in = -1;
        while (in < scan.length-1) {
            if(row<numRows) {
                for (int i = 0; i <= numCols - 1; i++) {
                    in++;
                    arr[row][i] = scan[in];
                }
                row++;
            }

            if(row<numRows) {
                for (int j = numCols - 1; j >= 0; j--) {
                    in++;
                    arr[row][j] = scan[in];
                }
                row++;
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

