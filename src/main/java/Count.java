public class Count {

    public static void main(String[] args) {

        String str = "Sadiq Raza";

        String [] str1 = str.split(" ");

        for (int i=0;i<str1.length;i++){

            char [] ch = str1[i].toCharArray();

            for (int j=ch.length-1;j>=0;j--){

                System.out.print(ch[j]);

            }
            System.out.print(" ");

        }


    }



}
