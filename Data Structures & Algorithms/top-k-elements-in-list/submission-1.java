class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> resultMap = new HashMap<>();

        for(int num:nums){
            resultMap.put(num,resultMap.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> resultMap.get(a)-resultMap.get(b));

        for(int num:resultMap.keySet()){
            minHeap.add(num);
            if(minHeap.size()>k){
                minHeap.poll();
            }

        }
        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i]=minHeap.poll();
        }
        return result;
    }
}
