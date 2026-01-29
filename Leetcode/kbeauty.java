class Solution {
    public int divisorSubstrings(int num, int k) {
        int count=0;
        int sub=0,mul=1,saf=num;
        for(int i=0;i<k;i++){
            sub=((num%10)*mul)+sub;
            mul*=10;
            num/=10;        
        }
        mul/=10;
        if(sub!=0&&saf%sub==0){
                count++;
            }
        while(num>0){
            sub/=10;
            sub=((num%10)*mul)+sub;
            num/=10;
            if(sub!=0&&saf%sub==0){
                count++;
            }
        }
        return count;
    }
}
