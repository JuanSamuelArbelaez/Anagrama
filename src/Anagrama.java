public class Anagrama {
    public static void createAnagrams(String word, String aux){
        if (word.length() == 0) {
            System.out.println(aux);
        } else {
            for (int i = 0; i < word.length(); i++) {
                createAnagrams(word.substring(0, i) + word.substring(i + 1),aux + word.charAt(i));
            }
        }
    }

}
