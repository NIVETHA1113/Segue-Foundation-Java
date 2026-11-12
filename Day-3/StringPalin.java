public class StringPalin {
    public static void main(String[] args) {
 
        String s = "MADAM";
 
        int L = 0;
        int R = s.length() - 1;
 
        boolean isPalindrome = true;
 
        while (L < R) {
 
            if (s.charAt(L) != s.charAt(R)) {
                isPalindrome = false;
                break;
            }
 
            L++;
            R--;
        }
 
        if (isPalindrome) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}