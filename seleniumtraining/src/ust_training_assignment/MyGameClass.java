package ust_training_assignment;

import java.util.Scanner;

public class MyGameClass {
	
	public static void main(String args[])


	{
	    Scanner sc=new Scanner(System.in);
	    String a;
	    
	    a=sc.nextLine();
	    String s1=sc.nextLine();
	    int inum = Integer.parseInt(a);
	    
	    if(inum==1)

	    {
	        int b=0;
	        
	        String[] s2 = s1.split(" ");
	        
	        int size=s2.length;

	        
	        System.out.println("Welcome to Queensland!");
	        System.out.println("Playing game " + s2[0] +" at Queensland" );
	        
	        for(int i=1;i<s2.length;i++)
	        {
	            for(int j=0;j<i;j++)
	            {
	                int p = Integer.parseInt(s2[i]);
	                int q = Integer.parseInt(s2[j]);
	                
	                if(p==q)
	                {
	                    b=1;
	                    break;
	                }
	            }
	            
	            if(b==0)
	            {
	                System.out.println("Playing game " + s2[i] +" at Queensland" );
	            }
	            
	            else
	            
	            {
	                System.out.println("You have already played game " +s2[i]);
	            }
	            
	            b=0;
	            
	            
	        }
	    }
	    
	    if(inum==2)

	    {
	        int b=0;
	        
	        String[] s2 = s1.split(" ");
	        
	        int size=s2.length;

	        
	        System.out.println("Welcome to Wonderla!");
	        System.out.println("Playing game " + s2[0] +" at Wonderla" );
	        
	        for(int i=1;i<s2.length;i++)
	        {
	            for(int j=0;j<i;j++)
	            {
	                int p = Integer.parseInt(s2[i]);
	                int q = Integer.parseInt(s2[j]);
	                
	                if(p==q)
	                {
	                    b=1;
	                    break;
	                }
	            }
	            
	            if(b==0)
	            {
	                System.out.println("Playing Game " + s2[i] +" at Wonderla" );
	            }
	            
	            else
	            
	            {
	                System.out.println("Playing Game " + s2[i]+ " again at Wonderla");
	            }
	            
	            b=0;
	            
	            
	        }
	    }
	    
	}
	}