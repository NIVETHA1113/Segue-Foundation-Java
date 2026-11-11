import java.util.*;
public class reverseSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String[]words = word.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=0;i<words.length;i++){
            Stack<Character> sk = new Stack<>();
            String curr_word = words[i];
            for(int j=0;j<curr_word.length();j++){
                sk.push(curr_word.charAt(j));
            }
            while(sk.size()>0){
                res.append(sk.pop());
            }
            if(i!= words.length-1){
                res.append(" ");
            }
        }
        System.out.print(res);
    }
}

