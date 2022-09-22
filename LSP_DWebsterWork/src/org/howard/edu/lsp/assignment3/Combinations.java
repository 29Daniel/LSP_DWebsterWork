package org.howard.edu.lsp.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Combinations
{
    private List<Integer[]> res = new ArrayList<>();
    
    private Stack<Integer> curr_list = new Stack<>();
    
    private int curr_list_sum = 0;
    
    private int curr_index;
    
    public void find_comb_list(int i, int[] values, int target_sum){
        if(curr_list_sum == target_sum){
            res.add(curr_list.toArray(new Integer[curr_list.size()]));
            curr_list.clear();
            return;
        }
        
        if(i == curr_index)
            find_comb_list(i+1, values, target_sum);
        
        if(i >= values.length || curr_list_sum > target_sum){
            curr_list_sum-=curr_list.pop();
            return;
        }
        
        curr_list_sum += values[i];
        curr_list.push(i);

        if(curr_list_sum < target_sum){
            find_comb_list(i+1, values, target_sum);
            find_comb_list(i+2, values, target_sum);
        }
    }


    public List<Integer[]> calculate_combinations(int[] arr, int target_sum){
    	if(arr.length > 0) {
    		for(int x=0; x < (arr.length-1); x++){
                curr_list.push(x);
                curr_list_sum = arr[x];
                curr_index = x;
                find_comb_list(0, arr, target_sum);
            }
    	}
    	return res;
    }
    
    public void print_results(){
        for(Integer[] combos:res){
            System.out.print("[");
	        for(int num : combos)
	            System.out.print(num + " ");
	        System.out.println("]");
	    }
    }
    
}

