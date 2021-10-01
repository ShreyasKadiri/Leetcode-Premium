class Solution {
    public String toHexspeak(String num) {
        String hexaDecimalEquivalent = Long.toHexString(Long.parseLong(num));
        StringBuilder result = new StringBuilder("");
        for(char c : hexaDecimalEquivalent.toCharArray()){
            if(c == '1'){
                result.append("I");
            }else if(c == '0'){
                result.append("O");
            }else if(Character.isLowerCase(c)){
                result.append(Character.toUpperCase(c));
            }else{
                result.append(c);
            }
        }
        
        HashSet<Character> set = new HashSet<Character>();
        for(char c : result.toString().toCharArray()){
            set.add(c);
        }
        for(char c='2'; c<='9'; c++){
            if(set.contains(c)){
                return "ERROR";
            }
        }
        
        return result.toString();
    }
}
