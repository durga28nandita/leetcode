class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        ArrayList<Character> l=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        l.add('a');
        l.add('e');
        l.add('i');
        l.add('o');
        l.add('u');
        l.add('A');
        l.add('E');
        l.add('I');
        l.add('O');
        l.add('U');
        char  []arr=s.toCharArray();
        while(i<j)
        {
            if(l.contains(arr[i]) && l.contains(arr[j]))
            {
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(l.contains(arr[i]))
            {
                j--;
            }
            else if(l.contains(arr[j]))
            {
                i++;
            }
            else
            {
                i++;
                j--;
            }

        }
        return new String(arr);
    }
}