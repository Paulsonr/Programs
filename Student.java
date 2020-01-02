import java.util.*;
class Student implements Comparable<Student>{
    int no;
    String name;
    int m1;
    int m2;
    int m3;
    int tot;
    int avg;
    public Student(int no,String na,int m1,int m2,int m3,int tot,int avg){
        this.no=no;
        name=na;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.tot=tot;
        this.avg=avg;
    }
    public int compareTo(Student o){
        return o.tot-this.tot;
    }
}
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        ArrayList<Student> arr1= new ArrayList<Student>();
        ArrayList<Student> arr2= new ArrayList<Student>();
        ArrayList<Student> arr3= new ArrayList<Student>();
        int n=sc.nextInt();
        int no,m1,m2,m3,tot,avg;
        String name;
        for(int i=1;i<=n;i++){
            no=sc.nextInt();
            
            name=sc.next();
            
            m1=sc.nextInt();
            
            m2=sc.nextInt();
            
            m3=sc.nextInt();
            
            tot=m1+m2+m3;
            
            avg=tot/3;
            arr1.add(new Student(no,name,m1,m2,m3,tot,avg));
        }
        for(int i=1;i<=n;i++){
            no=sc.nextInt();
            //arr2.add(no);
            name=sc.next();
            //arr2.add(name);
            m1=sc.nextInt();
            //arr2.add(m1);
            m2=sc.nextInt();
            //arr2.add(m2);
            m3=sc.nextInt();
            //arr2.add(m3);
            tot=m1+m2+m3;
            
            avg=tot/3;
            
            arr2.add(new Student(no,name,m1,m2,m3,tot,avg));
        }
        for(int i=1;i<=n;i++){
            no=sc.nextInt();
            //arr3.add(no);
            name=sc.next();
            //arr3.add(name);
            m1=sc.nextInt();
            //arr3.add(m1);
            m2=sc.nextInt();
            //arr3.add(m2);
            m3=sc.nextInt();
            //arr3.add(m3);
            tot=m1+m2+m3;
            //arr3.add(tot);
            avg=tot/3;
            //arr3.add(avg);
            arr3.add(new Student(no,name,m1,m2,m3,tot,avg));
        }
        
        Collections.sort(arr1);
        Iterator<Student> itr1=arr1.iterator();
        int i=0;
        while(itr1.hasNext()){
            if(i==0){
                Student temp=itr1.next();
                System.out.println("No:"+temp.no+" | Name:"+temp.name+" | M1:"+temp.m1+" | M1:"+temp.m2+" | M3:"+temp.m3+" | Total:"+temp.tot+" | Average:"+temp.avg);
            }
            i++;    
        }
        
        Collections.sort(arr2);
        Iterator<Student> itr2=arr2.iterator();
        i=0;
        while(itr2.hasNext()){
            if(i==0){
                Student temp=itr2.next();
                System.out.println("No:"+temp.no+" | Name:"+temp.name+" | M1:"+temp.m1+" | M1:"+temp.m2+" | M3:"+temp.m3+" | Total:"+temp.tot+" | Average:"+temp.avg);
            }
            i++;    
        }
        
        Collections.sort(arr3);
        Iterator<Student> itr3=arr3.iterator();
        i=0;
        while(itr3.hasNext()){
            if(i==0){
                Student temp=itr3.next();
                System.out.println("No:"+temp.no+" | Name:"+temp.name+" | M1:"+temp.m1+" | M1:"+temp.m2+" | M3:"+temp.m3+" | Total:"+temp.tot+" | Average:"+temp.avg);
            }
            i++;
                
        }
    }
}
