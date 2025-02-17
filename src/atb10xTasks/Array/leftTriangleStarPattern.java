package atb10xTasks.Array;

import java.util.Arrays;

public class leftTriangleStarPattern {

    public static void main(String[] args) {
        int n = 8;

        char[][] pattern = new char[n][n];

        for(int i=0 ; i < n; i++){
            for (int j = 0 ; j<n ; j++){
                pattern[i][j] = ' ' ;
            }
        }

        for(int i = 0 ; i<n ; i ++){
            for (int j = 0 ; j<n-i ; j++){
                pattern[i][j] = '*' ;
        }}



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(pattern[i][j]);
            }
            System.out.println();

    }}
}
