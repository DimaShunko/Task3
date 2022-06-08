import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> dictionary = new HashMap<>();

        try(FileReader reader = new FileReader("test.txt"))
        {
            int ch;
            String str = "";
            while((ch=reader.read())!=-1){
                if(Character.isLetter((char) ch)){
                    str += (char) ch;
                }else if(str != ""){
                    str = str.toUpperCase();
                    if(dictionary.containsKey(str)){
                        dictionary.put(str, dictionary.get(str)+1);
                    }else{
                        dictionary.put(str,1);
                    }
                    str = "";
                }
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        TreeMap<String, Integer> sortDictionary = new TreeMap<>(dictionary);


        for(String key: sortDictionary.keySet()){
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
}