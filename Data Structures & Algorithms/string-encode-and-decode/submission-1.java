class Solution {

    public String encode(List<String> strs) {
        StringBuilder code = new StringBuilder();
        for(String str :strs){
            code.append(str.length()).append('#').append(str);
        }

        return code.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while(i<str.length()){
            int slash = str.indexOf('#',i);
            int len = Integer.parseInt(str.substring(i,slash));
            i = slash + len+1;
            String decode = str.substring(slash+1,i);
            result.add(decode);
        }
        return result;
    }
}
