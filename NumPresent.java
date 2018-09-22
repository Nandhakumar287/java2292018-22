import java.io.*;
import java.util.*;
  public class NumPresent{
     public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter N value");
      int n=sc.nextInt();
      int ans=0;
      System.out.println("Enter L value:");
      int l=sc.nextInt();
      System.out.println("Enter R Value:");
      int r=sc.nextInt();
      for(int i=l;i<=r;i++)
      {
      if(i==n)
      {
      ans=1;
      }
      }
      if(ans==1)
      {
      System.out.println("PResent");
      }
      else{
      System.out.println("Not Present");
      }
     }
   } 
      
