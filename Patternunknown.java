import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0){
                    if(i%2!=0 && j%2!=0)
                        {
                         System.out.print("*");   
                        }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    if(j%2!=0){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                
            }
            
            
            
            
            
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            
            for(int j=1;j<=i;j++)
            {
                if(i%2!=0){
                    if(i%2!=0 && j%2!=0)
                        {
                         System.out.print("*");   
                        }
                    else{
                        System.out.print("  ");
                    }
                }
                else{
                    if(j%2!=0){
                        System.out.print("  ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                
            }
            
            
            
            
            
            System.out.println();
        }
        
        
         
    }
}
