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

import java.util.ArrayList;

public class Soham {

    static void print_subeq(int arr[],ArrayList<Integer>ls,int ind)
    {
        if(ind==arr.length)
        {
            System.out.println(ls);
            return;
        }

        ls.add(arr[ind]);
        print_subeq(arr, ls, ind+1);
        ls.removeLast();
        print_subeq(arr, ls, ind+1);
    }
    public static void main(String[] args) {
        int arr[]=new int[3];
        arr[0]=3;
        arr[1]=1;
        arr[2]=2;

        print_subeq(arr,new ArrayList<>(),0);
    }
}