class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        if(nums==null || nums.length==0)return new int[0];
      
       Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

      PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        
        for (int num : map.keySet()) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Removes the element with the lowest frequency
            }
        }

        // 3. Convert heap to the final result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }
        
        return result;

    }
}
