class Solution {
    public String format(String email){
        String []arr=email.split("@");
        String local=arr[0];
        String domain=arr[1];

        String[] localname=local.split("\\+");
        local=localname[0];

        local=local.replace(".","");
        return local + "@" + domain;

       
    }
    public int numUniqueEmails(String[] emails) {
         Set<String>uni=new HashSet<>();

        for(String email:emails){
            String femail=format(email);
            uni.add(femail);
        }
        return uni.size();
    }
}