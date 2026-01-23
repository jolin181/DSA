class Solution {
    public int longestPalindrome(String s) {
      
        int tot=0;
        HashSet<Character>set=new HashSet<>();
        for(char ch:s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
                tot+=2;
            }else{
                set.add(ch);
            }
           
       }
       
       return (set.size()>0)?tot+1:tot;
        
    }
}
