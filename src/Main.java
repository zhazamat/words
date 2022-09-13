import java.util.HashMap;

public class Main {
    public  static   HashMap<Character,Integer>putCharacters(){
        HashMap<Character,Integer>characters=new HashMap<>();
        characters.put('A',1);characters.put('B',2);characters.put('C',3);characters.put('D',4);characters.put('E',5);
        characters.put('F',6);characters.put('G',7);characters.put('H',8);characters.put('I',9);characters.put('J',10);
        characters.put('K',11);characters.put('L',12);characters.put('M',13);characters.put('N',14);characters.put('O',15);
        characters.put('P',16);characters.put('Q',17);characters.put('R',18);characters.put('S',19);characters.put('T',20);
        characters.put('U',21);characters.put('V',22);characters.put('W',23);characters.put('X',24);characters.put('Y',25);
        characters.put('Z',26);
        return characters;
    }
    public static void wordInitial(String word){
        String word1=word.toUpperCase();

        int count=0;
        int count_words=0;
        char[] w=word1.toCharArray();
        System.out.println(putCharacters());
        for(int i=1;i<word1.length();i++){
            if(w[i]!=' '&&w[i]!=','&&w[i]!='.'&&w[i]!='!'&&w[i]!=')'&&w[i]!='('&&w[i]!='?'&&w[i]!=';'&&w[i]!='-'&&w[i]!='’'){
                System.out.print(" "+w[i]);
                System.out.print( ""+putCharacters().get(w[i]));
                if(putCharacters().get(w[i])==putCharacters().get('D')){
                    count++;
                }
                }
            else {
                count_words++;
            }
        }
        System.out.println();
        System.out.println("   How many English characters have in this text : "+ count);
        System.out.println("   How many words have in this text : "+ count_words);
    }
    public static void main(String[] args) {
        String word="Dear Harry, Ron wrote to me and told me about his phone call to your Uncle Vernon." ;
          wordInitial(word);
    }
}
