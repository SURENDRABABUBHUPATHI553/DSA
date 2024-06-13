import java.util.Scanner;

public class UpperToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence : ");
        String str = sc.nextLine();
        char[] sa = str.toCharArray();


        // for(int i=0; i<str.length(); i++) {
        //     int ascii = (int) sa[i];
        //     if(65 <= ascii && ascii <= 90) {
        //         ascii += 32;
        //         char c = (char) ascii;
        //         sa[i] = c;
        //     }
        // }


        for(int i=0; i<str.length(); i++) {
            char ch = sa[i];
            if(ch >= 'A' && ch <= 'Z') {
                char newCh = (char) (ch + 32);
                sa[i] = newCh;
            }
        }

        for(int i=0; i<str.length(); i++) {
            System.out.print(sa[i]);
        }
    }
}
