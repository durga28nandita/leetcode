class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int []need=new int [26];
        int []window=new int[26];
        ArrayList<Integer>l=new ArrayList<>();
        int k=p.length();
        if(k>s.length())
        {
            return l;
        }
        for(char c:p.toCharArray())
        {
            need[c-'a']++;

        }
        for(int i=0;i<k;i++)
        {
            window[s.charAt(i)-'a']++;
            if(Arrays.equals(need,window))
            {
                l.add(0);
            }
        }
        for(int i=k;i<s.length();i++)
        {
            window[s.charAt(i-k)-'a']--;
            window[s.charAt(i)-'a']++;
            if(Arrays.equals(need,window))
            {
                l.add(i-k+1);
            }
        }
        //int []res=new int[l.size()];
        //for(int i=0;i<l.size();i++)
        //{
          //  res[i]=l.get(i);
        //}
        //return res;
        return l;
          
    }
}