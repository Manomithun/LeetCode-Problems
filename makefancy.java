class Solution {
    public String makeFancyString(String s) {
       StringBuilder v= new StringBuilder();
        char c='0';
        int count=1;
        for(int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if(c==cur && count<3){
                count++;
            }
            else {
                if(c!=cur){
                    count=1;
                }
            }
            if(count<3){
               v.append(cur);
                c=cur;
               
            }
           
        }
         return v.toString();
    }
}