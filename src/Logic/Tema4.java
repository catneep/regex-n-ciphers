package Logic;

public class Tema4 {
    public static String TransposicionDoble(String s){
        return "";
    }
    
    public static String Grupos(String s, String key){
        return "";
    }
    
    public static String Caesar(String s, int key){
        s = s.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (char character : s.toCharArray()) {
            if (character != ' ') {
                int originalAlphabetPosition = character - 'a';
                int newAlphabetPosition = (originalAlphabetPosition + key) % 26;
                char newCharacter = (char) ('a' + newAlphabetPosition);
                result.append(newCharacter);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
