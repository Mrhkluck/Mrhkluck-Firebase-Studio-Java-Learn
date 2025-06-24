package com.example.demo.Q10_DSA;

//abcdef
//fedcba

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int sarr[] = new int[26];
        int tarr[] = new int[26];
        for(int i =0; i <s.length(); i++){
            int sh = Character.toLowerCase(s.charAt(i)) - 'a';
            int th = Character.toLowerCase(t.charAt(i)) - 'a';
            sarr[sh]++;
            tarr[th]++;
        }
        for(int i = 0 ; i<= 25 ; i++){
            if (sarr[i] != tarr[i]) return false;
        }
        return true;
    }
    // public static void main(String[] args) {
    //     System.out.println(isAnagram("anagram", "nagaram"));
    // }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isAnagram("anagram", "nagaram"));
    }

}
