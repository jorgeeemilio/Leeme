package es.studium.Simetrica;

import java.util.Scanner;

public class Simetrica
{
	public static void main(String[] args)
	{
		int tabla[][] = new int[3][3];
		Scanner teclado = new Scanner(System.in);
		boolean simetrica = true;
		// Leemos los valores de la tabla
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j] = teclado.nextInt();
			}
		}
		// Recorremos la tabla para ver si es simétrica
		for(int i=0;(i<3)&&(simetrica);i++)
		{
			for(int j=0;(j<3)&&(simetrica);j++)
			{
				if(tabla[i][j]!=tabla[j][i])
				{
					simetrica = false;
				}
			}
		}
		if(simetrica)
		{
			System.out.println("Es simétrica");
		}
		else
		{
			System.out.println("NO es simétrica");
		}
		teclado.close();
	}
}