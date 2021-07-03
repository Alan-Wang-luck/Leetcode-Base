public class cnt {
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words  = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings(allowed, words));

    }
    public static int countConsistentStrings(String allowed, String[] words) {
        int result=words.length;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                String a=null;
                if(!allowed.contains(a.valueOf(words[i].charAt(j)))){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
