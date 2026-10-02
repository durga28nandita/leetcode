class Solution {
    public int mostWordsFound(String[] sentences) {
        int m=0;
        for(int i=0;i<sentences.length;i++)
        {
            String [] words=sentences[i].split(" ");
            m=Math.max(words.length,m);
        }
        return m;
        
    }
}