import java.util.*;
public class Main{
    public static boolean Balanced(String s){
        char str1[]=s.toCharArray();
        if(str1[0] == ')' || str1[0] == ']' || str1[0] == '}' ){
            return false;
        }
        Stack<Character> stk=new Stack<>();

        for(int i=0;i<str1.length;i++){
            if(str1[i] == '(' || str1[i] == '[' || str1[i] == '{' ){
                stk.push(str1[i]);
            }
            else if(str1[i] == ')' || str1[i] == ']' || str1[i] == '}' ) {
                char ch=getMatch(str1[i]);
                if(ch == stk.peek()){
                    stk.pop();
                }
                else{
                    return false;
                }
            }
            
             
        }
        if(stk.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static Character getMatch(char c){
        if(c == ')'){
            return '(';
        }
        else if(c == ']'){
            return '[';
        }
        else if(c == '}'){
            return '{';
        }
        return 0; 
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
            String str=sc.nextLine();
            if(Balanced(str)){
                System.out.println("Balanced");
            }
            else{
                System.out.println("Not balanced");
            }
            
            
    }
}
