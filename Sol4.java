package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Sol4 {
    private HashSet<Integer> columns = new HashSet<>();
    private HashSet<Integer> diag1 = new HashSet<>();
    private HashSet<Integer> diag2 = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        DFS(res, 0, new ArrayList<String>(), n);

        return res;
    }

    private void DFS(List<List<String>> res, int row, List<String> currentBoard, int n){
        if (row == n){
            res.add(new ArrayList<String>(currentBoard));
            return;
        }
        else{
            for (int col = 0; col<n; col++){
                if (columns.contains(col) || diag1.contains(row+col) || diag2.contains(row-col)){
                    continue;
                }
                char[] array = new char[n];
                for (int i=0; i<array.length; i++){
                    array[i] = '.';
                    if (i == col ){
                        array[i] = 'Q';
                    }
                }
                String currentRow = new String(array);
                columns.add(col);
                diag1.add(row+col);
                diag2.add(row-col);
                currentBoard.add(currentRow);
                DFS(res, row+1, currentBoard, n);
                columns.remove(col);
                diag1.remove(row+col);
                diag2.remove(row-col);
                currentBoard.remove(currentBoard.size()-1);

            }
        }
    }
}
