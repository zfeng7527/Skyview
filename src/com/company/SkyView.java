package com.company;



public class SkyView {
    public SkyView(int numRows,int numCols,double[] scan) {
        double[][] arr = new double[numCols][numRows];
        int col = 0, in = 0;
        while (col > scan.length) {
            for (int i = 0; i < numRows-1; i++) {
                arr[col][i] = scan[in];
                in++;
            }
            col++;
            for (int j = numRows-1; j > 0; j--) {
                arr[col][j] = scan[in];
                in++;
            }
            col++;
        }
        for(double[] smallArr : arr){
            for(double num : smallArr){
           System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}

