package Logic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tema3 {
    
    /**
     * Reads the contents of a file in a given location.
     * @param location
     * @return
     * @throws IOException 
     */
    public static ArrayList<String> GetFileData(String location) throws IOException{
        ArrayList<String> lines = new ArrayList<String>();
        Scanner sc = new Scanner(new BufferedReader(new FileReader(location)));
        while (sc.hasNextLine()){
            //TODO: Add logic for separator characters
            //lines.add(sc.nextLine());
            String l = sc.nextLine();
            String[] splitL = l.split("\\s+");
            for (String line : splitL){
                lines.add(line);
            }
        }
        sc.close();
        return lines;
    }
    
    /**
     * Given 2 lists (one containing regular expressions and another containing strings of text),
     * determines which regular expressions are matched with a string.
     * @param regex
     * @param lines
     * @return 
     */
    public static Map<String, ArrayList> Evaluate(ArrayList<String> patterns, ArrayList<String> lines){
        
        Map<String, ArrayList> results = new HashMap<>();
        
        ArrayList<String> matchingRegex = null;
        
        for (String line : lines){
            matchingRegex = new ArrayList<>();
            for (String regex : patterns)
                if (line.matches(regex)) matchingRegex.add(regex);
            results.put(line, matchingRegex);
        }
        
        return results;
    }
    
    /**
     * Finds the matching indexes of a given list of
     * regular expressions within a larger set
     * @param patterns
     * @param allPatterns
     * @param offset
     * @return 
     */
    public static ArrayList<Integer> GetIndexes(ArrayList<String> patterns, ArrayList<String> allPatterns, int offset){
        ArrayList<Integer> indexes = new ArrayList<>();
        for (String pattern : patterns){
            int i = allPatterns.indexOf(pattern);
            if (i >= 0) indexes.add(i + offset);
        }
        return indexes;
    }
    
    //For testing
    public static void main(String[] args) {
        ArrayList<String> patterns = new ArrayList<>();
        
        patterns.add("a*b");
        patterns.add("b+a*b");
        patterns.add("ab");
        
        Map<String, ArrayList> results = null;
        
        try{
            results = Evaluate(patterns, GetFileData("E:\\havil\\Documents\\VS Code\\tics\\text.txt"));
            
            for (String key : results.keySet())  
            {
                ArrayList<String> values = results.get(key);
               System.out.println(key + ": " + values + GetIndexes(values, patterns, 1));
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
