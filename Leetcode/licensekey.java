class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.toUpperCase().replace("-","");
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
            count++;
            if(i>0&&count==k){
                sb.append('-');
                count=0;
            }
        }
        return sb.reverse().toString();
    }
}
