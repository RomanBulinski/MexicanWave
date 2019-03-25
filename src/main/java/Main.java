import java.util.Locale;

public class Main {

    public String[] wave(String word){

        int index = 0;
        int realLengths = 0;
        char[] letters = word.toCharArray();
        for(char letter : letters){
            if(letter != ' '){
                realLengths++;
            }
        }
        int counter = 0;
        String[] words = new String[realLengths];
        while( counter < letters.length ){
            String tempWord = "";

            if( letters[counter] == ' ' ){
                counter++;
                continue;
            }else{
                for(int i =0; i<letters.length; i++ ){
                    String tem = Character.toString(letters[i]);
                    if( counter==i){
                        tempWord= tempWord + tem.toUpperCase();
                    }else if( counter!=i) {
                        tempWord= tempWord + letters[i];
                    }
                }
                words[index] = tempWord;
                index++;
                counter++;
            }
        }
        return words;
    }

    public static void main(String[] args) {
        Main main = new Main();
        String[] words = main.wave("g ap" );
        for ( String word : words) {
            System.out.println( word );
        }
    }

}
