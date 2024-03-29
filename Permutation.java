import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        int n=str.length();
        permute(str,0,n-1);
    }

    private static void permute(String str,int l,int r){
        if(l==r){
            System.out.println(str);
        }
        else{
            for(int i=l;i<=r;i++){
                str=swap(str,l,i);
                permute(str,l+1,r);
                str=swap(str,l,i);
            }
        }
    }
    public static String swap(String str,int i,int j){
        char temp;
        char ch[]=str.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return String.valueOf(ch).toString();
    }
}
