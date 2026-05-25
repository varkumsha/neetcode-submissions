class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs ==null || strs.length==0)return new ArrayList<>();
        
        Map<String,List<String>> finalMap = new HashMap<>();

        for(String s:strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key  = String.valueOf(c);

            if(!finalMap.containsKey(key)){
                finalMap.put(key,new ArrayList<>());
            }

            finalMap.get(key).add(s);
        }

        return new ArrayList<>(finalMap.values());

    }
}
