class Solution {
    public boolean checkRecord(String s) {
        int con=0;
        int ab=0;
        for(char ch:s.toCharArray()){
            if(ch=='L'){
                con++;
                if(con>=3){
                    return false;
                }
            }
            else if(ch=='A'){
                con=0;
                ab++;
                if(ab>1){
                    return false;
                }
            }
            else{
                con=0;
            }
        }
        return true;
        
    }
}
