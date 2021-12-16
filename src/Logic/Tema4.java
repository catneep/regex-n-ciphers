package Logic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Tema4 {
    public static String TransposicionDoble(String s){
        return "";
    }
    
    public static String Grupos(String s, int periodo, String perm){
        s = s.toLowerCase();
        s = s.replaceAll("\\s", "");
        char[] string = s.toCharArray();
        
        ArrayList<String> characters = null;
        
        //Agrupar
        //Asignar grupos a key respectivo
        //Reordenar según permutación
        
        return "";
    }
    
    public static String GroupEnc(String Plain, String Key){
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
    
    /**
     * Groups characters in a given string using a period as a reference
     * @param cadena
     * @param periodo
     * @return 
     */
    private static ArrayList<String> agrupar(String cadena, int periodo){
//        Map<Integer, ArrayList> results = new HashMap<>();
        ArrayList<String> grupos = new ArrayList<>();
        
        int indiceInicial = 0;
        while(true){
            int indiceFinal = indiceInicial + periodo;
            if (indiceFinal >= cadena.length())
                indiceFinal = cadena.length();
            
            String subc = cadena.substring(indiceInicial, indiceFinal);
            grupos.add(subc);
            
            indiceInicial = indiceFinal;
            
            if (indiceInicial >= cadena.length())
                break;
        }
        
        return grupos;
        
    }
    
    /**
     * Orders all charcaters with a shared index (base 0) in a dictionary using a base 1 index
     * @param grupos
     * @param periodo
     * @return 
     */
    private static Map<Integer, ArrayList> asignar(ArrayList<String> grupos, int periodo){
        Map<Integer, ArrayList> results = new HashMap<>();
        
        for (int i = 0; i < periodo; i++){
            Integer key = i + 1;
            ArrayList<String> current = new ArrayList<>();
            
            for (String grupo : grupos){
                char[] c = grupo.toCharArray();
                try{
                    current.add("" + c[i]);
                } catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("Skipped index in group with less characters.");
                }
            }
            results.put(key, current);
        }
        
        return results;
    }
    
    public static String Caesar(String s, int key){
        s = s.toLowerCase();
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
        String tester = "Cifrado de texto z1";
        
        System.out.println("Caesar: " + Caesar(tester, 3));
        System.out.println("Grupos: " + GroupEnc(tester, "llave"));
    }
}
