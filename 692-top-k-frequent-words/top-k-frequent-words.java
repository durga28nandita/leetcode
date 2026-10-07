class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        for(String s:words)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<String> l=new ArrayList<>(map.keySet());
        l.sort((a,b)->
        {
            if(map.get(a).equals(map.get(b)))
            {
                return a.compareTo(b);
            }
            return map.get(b)-map.get(a);
        });
        List<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++)
        {
            ans.add(l.get(i));
        }
        return ans;
    }
}