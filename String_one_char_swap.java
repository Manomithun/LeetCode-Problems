/**
1790. Check if One String Swap Can Make Strings Equal
**/

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        char c[]=s1.toCharArray();
        char cc[]=s2.toCharArray();
        int n=c.length;
        if(c.length!=cc.length)return false;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
           if(c[i]!=cc[i]){
            a.add(i);
           }
        }
        if(a.size()==0)return true;
        if(a.size()!=2)return false;
        System.out.println(a);
        if(cc[a.get(0)]==c[a.get(1)] && cc[a.get(1)]==c[a.get(0)])return true;
       return false;
    }
}