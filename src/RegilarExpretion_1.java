// Matcher and Pattern is a class These are available in regex Pakage. It is a sub pakage of Util pakage
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Simple Example of Regular Expretion
public class RegilarExpretion_1 {
    public static void main(String[] args) {
        String str="AdirajRajawat@gmail.com";   //This is our Tqret String Wher ecompiler is search the String
        Pattern p=Pattern.compile("A");    //that string what i want to serch
        Matcher m=p.matcher(str);//
        boolean ma=m.find();
//        boolean matcher=matcher.find
        m.find();//find method retun's alway's the boolean Value
//        System.out.println((m.start()+" "+m.end()));
        if(ma){
        System.out.println("Match Found.\nUser Entered the valid Value");
    }else{
            System.out.println("Match not Find.\nUser Entered the invlaid Value");
        }
    }
}
