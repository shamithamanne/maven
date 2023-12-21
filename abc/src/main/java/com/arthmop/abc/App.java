package com.arthmop.abc;
import java.io.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	Addition a1=new Addition();
        System.out.println( a1.add(a,b) );
        Subtraction s1=new Subtraction();
        System.out.println( s1.sub(a,b) );
    }
}
