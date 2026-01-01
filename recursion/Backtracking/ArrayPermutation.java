import java.util.*;
class Solution {
    public void healper(List<List<Integer>> resultList , List<Integer> tempList,int[] nums ){
        if(tempList.size()==nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for(int number:nums){
            if(tempList.contains(number)){
                continue;
            }
            //add new element 
            tempList.add(number);

            //BackTrack 
            healper(resultList,tempList,nums);

            //remove that element 
            tempList.remove(tempList.size()-1);
        }
    }

    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> resultList  = new ArrayList<>();
       List<Integer> templist = new ArrayList<>(); 
        healper(resultList,templist,nums);
     return resultList;
    }
}