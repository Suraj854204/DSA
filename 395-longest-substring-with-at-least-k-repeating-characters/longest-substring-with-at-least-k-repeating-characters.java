class Solution {
    public int longestSubstring(String s, int k) {
        int ans = 0;
        for (int targetuni = 1; targetuni <=26; targetuni++) {
            int freq[] = new int[26];

            int left = 0;
            int right = 0;

            int unique = 0;
            int atLastidx = 0;

            while (right < s.length()) {
                int idx = s.charAt(right) - 'a';
                if (freq[idx] == 0) {
                    unique++;
                }
                freq[idx]++;
                if (freq[idx] == k) {
                   atLastidx++;
                }
                right++;

                while (unique > targetuni) {
                    int freqidx = s.charAt(left) - 'a';
                    if (freq[freqidx] == k) {
                        atLastidx--;
                    }
                    freq[freqidx]--;

                    if (freq[freqidx] == 0) {
                        unique--;
                    }
                    left++;
                }

                if (unique == targetuni && atLastidx == targetuni) {
                    ans = Math.max(ans, right - left);
                }
            }
        }
        return ans;

    }
}