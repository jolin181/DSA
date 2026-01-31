class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer>map=new HashMap<>();
        int index=0;
        for(char ch:order.toCharArray()){
            map.put(ch,index++);
        }
        for(int i=1;i<words.length;i++){
            if(!issorted(words[i-1],words[i],map)){
                return false;
            }
        }
        return true;
    }
    public boolean issorted(String s1,String s2,HashMap<Character,Integer> map){
        if(s1.equals(s2))return true;
        int i=0;
       
        while(i<s1.length()&&i<s2.length()){
            int  ch1=map.get(s1.charAt(i));
            int ch2=map.get(s2.charAt(i));
            if(ch1>ch2){
                return false;
            }
            if(ch1<ch2){
                return true;
            }
            i++;
        }
       if(s1.length()>s2.length())return false;

        return true;
    }
}
