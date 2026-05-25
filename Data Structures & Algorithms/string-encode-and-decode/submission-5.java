class Solution {

   private static final String EMPTY_LIST_MARKER = "___EMPTY_LIST___";

    public String encode(List<String> strs) {
        if (strs == null) return null;
        if (strs.isEmpty()) return EMPTY_LIST_MARKER;
        
        return strs.stream()
                .map(s -> s.replace("#", "##"))
                .collect(Collectors.joining(" # "));
    }

    public List<String> decode(String str) {
        if (str == null) return null;
        // Fix: Do NOT return an empty arraylist for str.isEmpty()
        if (str.equals(EMPTY_LIST_MARKER)) return new ArrayList<>();

        // "" split with -1 correctly produces [""]
        String[] parts = str.split(" # ", -1);
        List<String> decoded = new ArrayList<>();

        for (String part : parts) {
            decoded.add(part.replace("##", "#"));
        }

        return decoded;
    }
}
