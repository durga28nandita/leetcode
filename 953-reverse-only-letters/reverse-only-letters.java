class Solution {
    public String reverseOnlyLetters(String s) {
        int i=0;
        int j=s.length()-1;
        char  []arr=s.toCharArray();
        while(i<j)
        {
            if (Character.isLetter(arr[i]) && Character.isLetter(arr[j]))
            {
                char c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;
            }
            else if(!Character.isLetter(arr[i]))
            {
                i++;
            }
            else if(!Character.isLetter(arr[j]))
            {
                j--;
            }
        }
        return new String(arr);
    }
}