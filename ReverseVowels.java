import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String to Reverse Vowels : ");
        String str = sc.nextLine();
        char[] sa = str.toCharArray();
        int l = 0;
        int r = str.length();
        while (l < r) {
            while(sa[l]=='a' || sa[l]=='e' ||sa[l]=='i' ||sa[l]=='o' || sa[l]=='u') {
                l++;
            }
            while(sa[r]=='a' || sa[r]=='e' ||sa[r]=='i' ||sa[r]=='o' || sa[r]=='u') {
                r--;
            }
            String 
        }
        
    }
}
