package coder25.problemSolving1.mphasis;

public class MissingLettersInPangram {
    public static void main(String[] args) {
        String str="abcdrhys353535kvl";
        String missing=new MissingLettersInPangram().missingPangram(str);
        System.out.println(missing);

    }
    public String missingPangram(String sentence) {
        sentence = sentence.replaceAll("[^a-zA-Z]", "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        int[] carr = new int[26];
        for(char c : sentence.toCharArray()) {
            carr[c-'a']++;
        }
        for(int i = 0; i<26; ++i) {
            if(carr[i] == 0) {
                sb.append((char) (i + 'a'));
            }
        }
        return sb.toString();
    }
}
