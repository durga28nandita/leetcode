class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        int i=0;
        int write=0;
        while(i<chars.length)
        {
            char ch=chars[i];
            c=0;
            while(i<chars.length && ch==chars[i])
            {
                c++;
                i++;
            }
            chars[write]=ch;
            write++;
            if(c>1)
            {
                String s=String.valueOf(c);
                for(char k:s.toCharArray())
                {
                    chars[write]=k;
                    write++;
                }
            }
        }
        return write;
    }
}