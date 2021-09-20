import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String copy = "copy";


        Scanner s = new Scanner(new File("src/input.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (s.hasNext()) {
            list.add(s.next());
        }
        s.close();


        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);

            if (str.charAt(str.length() - 1) == '1') {
                String one = list.get(i);
                String two = list.get(i - 1);
                String three = list.get(i - 2);

                StringBuilder sb1 = new StringBuilder(one);
                sb1.deleteCharAt(sb1.length() - 1);


                StringBuilder sb2 = new StringBuilder(two);
                sb2.deleteCharAt(sb2.length() - 1);

                StringBuilder sb3 = new StringBuilder(three);
                sb3.deleteCharAt(sb3.length() - 1);

                /*System.out.println(sb1 + "\n" + sb2 +"\n"+sb3);
                System.out.println();*/

                String final1 = copy + " " + one + "|" + two;
                String final2 = copy + " " + one + "|" + three;

                if (sb1.toString().equals(sb2.toString()) && sb1.toString().equals(sb3.toString())) {


                     System.out.println(final1);
                     System.out.println(final2);
                    System.out.println("correct");
                }else{
                    System.out.println(final1);
                    System.out.println(final2);
                    System.out.println("not correct");
                    throw new Exception("UPS there is not the same numbers");
                }
                }
            }
        }
    }

