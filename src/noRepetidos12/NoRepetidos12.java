package noRepetidos12;

import java.util.Scanner;

public class NoRepetidos12
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[12];
		boolean repetido = false;
		int aux;
		for(int i = 0; i < numeros.length && !repetido; i++)
		{			
			System.out.print("Número: ");
			aux = sc.nextInt();
			for(int j = 0; j < i && !repetido; j++)
			{
				if(aux == numeros[j])
				{
					repetido = true;
				}
			}
			if(!repetido)
				numeros[i] = aux;
		}
		sc.close();
		System.out.println("Los números introducidos han sido: ");
		for(int i = 0; i < numeros.length; i++)
		{
			System.out.println(numeros[i]);		
		}
	}
}

