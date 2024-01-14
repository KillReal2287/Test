package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sol2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target){
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> currentPath = new ArrayList<Integer>();
        DFS(res, target, currentPath, candidates, 0 );
        return res;
    }

    private  void DFS(List<List<Integer>> res, int target, List<Integer> currentPath, int[] candidates, int pos){
        if (target == 0){
            res.add(new ArrayList<>(currentPath));
            return;
        }
        if (target < 0){
            return;
        }
        else{
            int prev = -1;
            for (int i=pos; i<candidates.length; i++){
                if (prev == candidates[i]){
                    continue;
                }
                currentPath.add(candidates[i]);
                prev = candidates[i];
                DFS(res, target-candidates[i], currentPath, candidates, i+1);
                currentPath.remove(currentPath.size()-1);
            }
        }
    }
}
