class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> resultMap = new HashMap<>();


        for(int i=0;i<nums.length;i++){


            if(resultMap.containsKey(target-nums[i]))return new int[]{resultMap.get(target-nums[i]),i};
           resultMap.put(nums[i],i);


        }
       return new int[]{};
    }
}
