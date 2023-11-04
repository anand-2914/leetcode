class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character, Character > s1=new HashMap<>();
        HashMap<Character, Character> t1= new HashMap<>();
              for(int i=0;i<s.length();i++){
                  char s2=s.charAt(i);                  
                  char t2=t.charAt(i);

            if(s1.containsKey(s2)){
                if(s1.get(s2)!= t2){
                return false;
                }
            }
            else{
                s1.put(s2,t2);
            }
            if(t1.containsKey(t2)){
                if(t1.get(t2) != s2){
                return false;
                }
            }
            else{
                t1.put(t2,s2);
            }

        }
       
        return true;
    }
}