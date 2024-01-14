package org.example;

public class Main {
    public static void main(String[] args) {
        Sol2 sol2 = new Sol2();
        System.out.println(sol2.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8));
        System.out.println("---------------------------------");
        Sol3 sol3 = new Sol3();
        System.out.println(sol3.getResult(180));
        System.out.println("---------------------------------");
        Sol4 sol4 = new Sol4();
        System.out.println(sol4.solveNQueens(4));
        System.out.println("---------------------------------");
        System.out.println(sol4.solveNQueens(1));
        Sol5 sol5 = new Sol5();
        System.out.println(sol5.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}