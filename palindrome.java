import java.util.*;
public class palindrome {
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;

        while(temp!=0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp= temp/10;
        }

        if(rev==n){
            System.out.println("Is a palindrome");
        }
        else{
            System.out.println("Is not a palindrome");
        }

        sc.close();
    }
}
