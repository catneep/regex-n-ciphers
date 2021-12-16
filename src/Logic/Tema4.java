package Logic;

import java.util.Arrays;

public class Tema4 {
    public static String DoubleTrans(String text, String keyA, String keyB){
        String first = Groups(text, keyA);
        String last = Groups(first, keyB);
        return last;
    }
    
    public static String Groups(String Plain, String Key){
        String alphapetic = "abcdefghijklmnopqrstuvwxyz";
        
        Plain = Plain.toLowerCase();
        //Plain = Plain.trim();
        Plain = Plain.replace(" ", "");
        
        Key = Key.toLowerCase();
        Key = Key.replace(" ", "");
        
        String Cipher = "";
        char [] key_array = Key.toCharArray();
        int row = (Plain.length()/Key.length())+1;
        int column = Key.length();
        int empty_field = 0;
        int increment = 0;
        char [][] Matrix = new char [row][column];
        for(int i = 0 ; i < row ; i++){
            for(int j=0; j<column ; j++){
                if(increment < Plain.length()){
                    Matrix[i][j] = Plain.charAt(increment);
                    increment++;
                } else {
                    Matrix[i][j] = alphapetic.charAt(empty_field);
                    empty_field++;
                }
            }
        }
        
        int position = 0;
        char [] Sorted_key = new char [key_array.length];
        
        for(int i=0; i<key_array.length ;i++){
            Sorted_key [i] = key_array [i];
        }
        
        Arrays.sort(Sorted_key);
        
        for(int i=0 ; i<column ; i++){
            position = Key.indexOf(Sorted_key[i]);
            for(int j=0 ; j<row ; j++){
                Cipher += Matrix[j][position];
            }
        }
        
        return Cipher;
    }
    
    public static String Caesar(String s, int key){
        s = s.toLowerCase();
        s = s.replace(" ", "");
        StringBuilder result = new StringBuilder();
        
        for (char character : s.toCharArray()) {
            
            String charAsString = "" + character;
            
            if (charAsString.matches("[a-z]+")) {
                
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
    
    public static void main(String[] args) {
        String tester = "Cifrado de texto z";
        
        String cesar = Caesar(tester, 3);
        String grupos = Groups(tester, "llave1");
        String doble = DoubleTrans(tester, "llave1", "llave1");
                
        System.out.println("Caesar: " + cesar + "  " + cesar.length());
        System.out.println("Grupos: " + grupos + "  " + grupos.length());
        System.out.println("Doble: " + doble + "  " + doble.length());
    }
}
