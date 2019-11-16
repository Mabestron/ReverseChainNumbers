package com.invertir_numeros.app;
import java.util.Arrays;

public class invertir_numero 
{

	public static void main(String[] args) 
	{
		int numeros[]= {1,2,3,4,5,6};
		int invertido[] = new int[numeros.length];
		
		
		for(int i=0;i<numeros.length;i++)
		{
			invertido[i] = numeros[numeros.length-1-i];
			
		}
		
		System.out.println(Arrays.toString(numeros));
		System.out.println(Arrays.toString(invertido));

	}

}
