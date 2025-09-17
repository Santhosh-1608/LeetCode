class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int n = s.length();
        int len = 0;
        int maxi = 0;
        HashMap<Character,Integer> mp = new HashMap<>();
        while(right < n){
            if(mp.containsKey(s.charAt(right)))
            left = Math.max(mp.get(s.charAt(right))+1,left);

            len = right - left +1;
            maxi = Math.max(maxi,len);
            mp.put(s.charAt(right),right);
            right++;
        }
        return maxi;
    }
}