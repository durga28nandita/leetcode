class Solution {
    public int totalFruit(int[] fruits) {
        int r=0;
        int l=0;
        int m=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        while(r<fruits.length)
        {
            map.put(fruits[r],map.getOrDefault(fruits[r],0)+1);
            while(map.size()>2)
            {
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0)
                {
                    map.remove(fruits[l]);
                }
                l++;
            }
            m=Math.max(m,r-l+1);
            r++;
        }
        return m;
        
    }
}