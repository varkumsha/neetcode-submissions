class Solution {
    public int[] twoSum(int[] nums, int target) {
        
       Map<Integer,Integer> mapData = new LinkedHashMap<>();

       for(int i=0;i<=nums.length-1;i++){
          int subNum = target-nums[i];

          if(mapData.containsKey(subNum)){
            return new int[]{mapData.get(subNum),i};
        
          }
          mapData.put(nums[i],i);
       }
       return new int[]{};
    }
}
