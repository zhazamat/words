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
        for(int i=0;i<word1.length();i++){
            if(w[i]!=' '&&w[i]!=','&&w[i]!='.'&&w[i]!='!'&&w[i]!=')'&&w[i]!='('&&w[i]!='?'&&w[i]!=';'&&w[i]!='-'&&w[i]!='’'){
                System.out.print(" "+w[i]);
                System.out.print( ""+putCharacters().get(w[i])); count++;}
            else {
                count_words++;
            }
        }
        System.out.println();
        System.out.println("   How many English characters have in this text : "+ count);
        System.out.println("   How many words have in this text : "+ count_words);
    }
    public static void main(String[] args) {
        String word="Dear Harry, Ron wrote to me and told me about his phone call to your Uncle Vernon." +
                " I do hope you’re all right. I’m on holiday in France at the moment and I didn’t know how " +
                "I was going to send this to you —what if they’d opened it at customs? —but then Hedwig turned up!" +
                " I think she wanted to make sure you got something for your birthday for a change." +
                " I bought your present by owl-order; there wasan advertisement in the Daily Prophet " +
                "(I’ve been getting it delivered; it’s so good to keep up with what’s going on in the wizarding world)." +
                " Did you see that picture of Ron and his family a week ago? I bet he’s learning loads." +
                " I’m really jealous —the ancient Egyptian wizards were fascinating. There’s some interesting " +
                "local history of witchcraft here, too. I’ve rewritten my whole History of Magic essay to include" +
                " some of the things I’ve found out, I hope it’s not too long —it’s two rolls of parchment more than " +
                "Professor Binns asked for. Ron says he’s going to be in London in the last week of the holidays. " +
                "Can you make it? Will your aunt and uncle let you come? I really hope you can. If not, I’ll see you " +
                "on the Hogwarts Express on September first! Love from Hermione P.S. Ron says Percy’s Head Boy." +
                " I’ll bet Percy’s really pleased. Ron doesn’t seem too happy about it";
          wordInitial(word);
    }
}
