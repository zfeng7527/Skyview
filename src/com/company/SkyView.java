package com.company;



public class SkyView {
    private double[][] view;

    //this method creates the 2D array.
    public SkyView(int numRows,int numCols,double[] scan) {
        view = new double[numRows][numCols];
        int row = 0, in = -1;
        while (in < scan.length-1) {
            //Adds the numbers to the array forwardly.
            if(row<numRows) {
                for (int i = 0; i <= numCols - 1; i++) {
                    in++;
                    view[row][i] = scan[in];
                }
                row++;
            }

            //Adds the numbers to the array in the opposite order.
            if(row<numRows) {
                for (int j = numCols - 1; j >= 0; j--) {
                    in++;
                    view[row][j] = scan[in];
                }
                row++;
            }
        }
        //Prints the array
        for(double[] smallview : view){
            for(double num : smallview){
           System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public double getAverage(int startRow,int endRow,int startCol,int endCol){
        double sum=0;
        for(int i = 0;i<(endRow-startRow);i++){
            for(int j=0;j<(endCol-startCol);j++){
                sum+=view[startRow+i][startCol+j];
            }
        }
        return sum/((startRow-endRow)*(startCol-endCol));
    }
}

