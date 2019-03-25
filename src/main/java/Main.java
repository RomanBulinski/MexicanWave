import java.util.Locale;

public class Main {


//    wave("hello") => ["Hello", "hEllo", "heLlo", "helLo", "hellO"]

    public String[] wave(String word){

        int  index = 0;
        String[] words = new String[word.length()];
        char[] letters = word.toCharArray();

        while( index < word.length() ){
            String tempWord = "";

            for(int i =0; i<letters.length; i++ ){
                String tem = Character.toString(letters[i]);
                if ( index==i){
                    tempWord= tempWord + tem.toUpperCase();
                }  else{
                    tempWord= tempWord + letters[i];
                }
            }
            words[index] = tempWord;
            index++;
        }
        return words;
    }


}
