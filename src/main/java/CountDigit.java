import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CountDigit {

    public static void main(String[] args) {

        String str = "SadiqsRaza";

        String str1 = str.toLowerCase();

        char[] ch = str1.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<ch.length;i++){

            if(map.containsKey(ch[i])){

                map.put(ch[i], map.get(ch[i])+1);
                System.out.println(ch[i]+" "+map.get(ch[i]));
            }

            else{

                map.put(ch[i], 1);
                System.out.println(ch[i]+" "+map.get(ch[i]));
            }

        }

        System.out.println(map);




    }
}
