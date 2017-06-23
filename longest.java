# public String longestCommonPrefix(String[] strs) {
    String s = "";
    if(strs.length>0){
        s = strs[0];
    }
    for(int i=1; i<strs.length; i++){
        String analyzing = strs[i];
        int j=0;
       for(; j<Math.min(s.length(), strs[i].length()); j++){
            if(s.charAt(j) != analyzing.charAt(j)){
                break;
            }
       }
        s = strs[i].substring(0, j);
    }
    return s;
}
