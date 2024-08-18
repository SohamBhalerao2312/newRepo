// import java.util.Scanner;


// public class Soham {

//     public static int rev(int n,int res)
//     {
//         if(n<=0)
//             return res;
        
//         return rev(n/10,(res*10+n%10));

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();

//         System.out.println(rev(n,0));

//     }
// }


// public class Soham {

//     public static boolean check(int arr[],int ind,int length)
//     {
//         if(ind==length-1)
//         return true;

//         if(arr[ind]>arr[ind+1]) return false;

//         return check(arr, ind+1, length);
//     }
//     public static void main(String[] args) {
//         int arr[]=new int[10];
//         for(int i=0;i<10;i++)
//         {
//             arr[i]=i+1;
//         }

//         arr[3]=31;
//         for(int i:arr)
//         {
//             System.out.println(i);
//         }

//         System.out.println(check(arr,0,arr.length));
//     }
// }

// import java.util.ArrayList;
// import java.util.Scanner;

// /**
//  * Soham
//  */
// public class Soham {

//     static ArrayList<Integer>gettarget(int arr[],int ind,int key,ArrayList<Integer>ls)
//     {
//         if(ind==arr.length-1) return ls;

//         if(arr[ind]==key)
//         {
//             ls.add(ind);
//             return gettarget(arr, ind+1, key, ls);
//         }

//         return gettarget(arr, ind+1, key, ls);


        
//     }
//     public static void main(String[] args) {
//         int arr[]=new int[10];
//         for(int i=0;i<10;i++)
//         {
//             arr[i]=i+10;
//         }

//         arr[7]=14;


//         for(int i:arr)
//         {
//             System.out.println(i);
//         }
//         Scanner sc=new Scanner(System.in);
//         int key=sc.nextInt();
//         sc.close();
//         ArrayList<Integer>res=gettarget(arr,0,key,new ArrayList<>());
//         System.out.println(res);
//     }
// }

// import java.util.ArrayList;

// public class Soham {

//     static void print_subeq(int arr[],ArrayList<Integer>ls,int ind,int key,int sum)
//     {
//         if(ind==arr.length)
//         {
//             if(sum==key)
//             System.out.println(ls);

//             return;
//         }

//         ls.add(arr[ind]);
//         sum+=arr[ind];
//         print_subeq(arr, ls, ind+1,key,sum);
//         sum-=ls.getLast();
//         ls.removeLast(); 
//         print_subeq(arr, ls, ind+1,key,sum);
//     }
//     public static void main(String[] args) {
//         int arr[]=new int[3];
//         arr[0]=3;
//         arr[1]=1;
//         arr[2]=2;

//         print_subeq(arr,new ArrayList<>(),0,3,0);
//     }
// }

// import java.util.ArrayList;

// /**
//  * Soham
//  */
// public class Soham {

//     static void print_subeq(int arr[],ArrayList<Integer>ls,int ind)
//     {
//         if(ind==arr.length)
//         {
            
//             return; 
//         }

//         ls.add(arr[ind]);
//         // sum+=arr[ind];
//         print_subeq(arr, ls, ind+1);
//         // sum-=ls.getLast();
//         ls.removeLast();
//         print_subeq(arr, ls, ind+1);
//     }
//     public static void main(String[] args) {
//         int arr[]={10,1,2,7,6,7,5};
//         // int n=3;
//         // int sum=0;
//         print_subeq(arr,new ArrayList<>(),0);
//     }
// }


// class A{
//     int cnt=0;
//     synchronized void increase()
//     {
//         cnt++;
//     }
// }
// public class Soham {

//     public static void main(String[] args) throws InterruptedException {
//         A objA=new A();

//         Runnable obj1=()->{
//             for(int i=0;i<=1000;i++)
//             {
//                 objA.increase();
//             }
//         };

//         Runnable obj2=()->{
//                 for(int i=0;i<=1000;i++)
//                 {
//                     objA.increase();
//                 }
//         };

//         Thread t1=new Thread(obj1);
//         Thread t2=new Thread(obj2);

//         t1.start();
//         t2.start();

//         // Thread.sleep(20);
//         Thread.sleep(20);
//         System.out.println(objA.cnt);
//     }
// }

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo implements java.io.Serializable{
    public String name;
    public int age;

    Demo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
}
public class Soham {

    public static void main(String[] args) {
        Demo objDemo=new Demo("Soham Bhalerao", 20);
        String fileName="/Users/sohambhalerao/Desktop/newSohamuser/temp.txt";


        try{
            FileOutputStream file=new FileOutputStream(fileName);
            ObjectOutputStream out=new ObjectOutputStream(file);

            out.writeObject(objDemo);
            out.close();
            file.close();

            System.out.println("The object has been serialized");
        }

        catch(IOException e)
        {
            System.out.println("IOException occured Pls try again!!!");
        }

        Demo objDemo2=null;

        try{
            FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream inp=new ObjectInputStream(file);

            objDemo2=(Demo)inp.readObject();
            inp.close();
            file.close();

            System.out.println("the object has been deserialized!! Congratsssss you made it!");
            System.out.println("Name of the person: "+objDemo2.name+" the age of the person: "+objDemo2.age);
        }

        catch(IOException e)
        {
            System.out.println("IOException occured!! Strange");
        }

        catch(ClassNotFoundException e)
        {
            System.out.println("Sorry!! 😭Class Not found");
        }
    }
}