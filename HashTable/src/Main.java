import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args){
        Map<String, Integer> dictionary = new HashMap<>();
        String str = "";
        if ( args.length == 0 ) {
            System.out.println( "Укажите название файла в командной строке" ) ;
            System.exit(0);
        }
        String fileName = args[0];

        try(FileReader reader = new FileReader(fileName))
        {
            int ch;
            while((ch=reader.read())!=-1){
                if(Character.isLetter((char) ch) || (char) ch == '-'){
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

        if(str != "") {
            str = str.toUpperCase();
            if (dictionary.containsKey(str)) {
                dictionary.put(str, dictionary.get(str) + 1);
            } else {
                dictionary.put(str, 1);
            }
        }

        TreeMap<String, Integer> sortDictionary = new TreeMap<>(dictionary);


        for(String key: sortDictionary.keySet()){
            System.out.println(key + ": " + dictionary.get(key));
        }
    }
}