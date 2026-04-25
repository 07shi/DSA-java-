

class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Set<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            // Case 1: already mapped
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            } 
            // Case 2: new mapping
            else {
                if (used.contains(c2)) {
                    return false;
                }
                map.put(c1, c2);
                used.add(c2);
            }
        }

        return true;
    }
}