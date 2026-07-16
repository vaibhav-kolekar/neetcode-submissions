class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);

            map.putIfAbsent(key, new ArrayList<String>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
