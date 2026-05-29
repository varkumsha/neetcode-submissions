class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> resultMap = new HashMap<>();

        for(String s: strs){

            char[] sc = s.toCharArray();
            Arrays.sort(sc);
            String key = String.valueOf(sc);
            if(!resultMap.containsKey(key))resultMap.put(key,new ArrayList<>());
            resultMap.get(key).add(s);
        }

        return new ArrayList<>(resultMap.values());
    }
}
