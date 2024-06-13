import java.util.Scanner;

class RemoveVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.nextLine();
        for(int i=0; i<s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                continue;
            }
            System.out.print(ch);
        }

    }
}