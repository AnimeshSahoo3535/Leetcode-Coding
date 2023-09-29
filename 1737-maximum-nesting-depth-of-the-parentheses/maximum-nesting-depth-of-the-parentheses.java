class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c==')')
            st.push(c);
        }
        int result=0;
        int count =0;
         while(!st.isEmpty()){
             char c=st.pop();
             if(c==')'){
              count++;
             result=Math.max(result,count);
             }
             else
             count--;
         }
         return result;
    }
}