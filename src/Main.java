import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
            if(set.contains(S.charAt(i))){
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String J,S;
        System.out.println("Enter Diamonds");
        J = sc.nextLine();
        System.out.println("Enter Stones");
        S = sc.nextLine();
        System.out.println(numJewelsInStones(J, S));
    }
}
