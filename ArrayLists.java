import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists {

    public static void main(String[] args) {

        System.out.println("enter no. of arrays");
        Scanner s= new Scanner(System.in);
        int i= s.nextInt();
        ArrayList<Integer>[] arrayList= new ArrayList[i];
        for(int j=0;j<i;j++)
        {
            System.out.println("enter no. of integers in this single array");
            int p= s.nextInt();
            ArrayList<Integer> numbers = new ArrayList<Integer>();
            for (int k=0;k<p;k++)
            {
                System.out.println("enter number");
                numbers.add(s.nextInt());

            }
            arrayList[j]=numbers;


        }

        System.out.println("enter row  u want");
        int m=s.nextInt();
        System.out.println("enter and column u want");
        int n=s.nextInt();

        System.out.println(arrayList[m].get(n));


    }


}
