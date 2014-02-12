import java.util.Scanner;


public class Operaciones 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Ingrese un numero: ");
		Scanner mi_scanner1 = new Scanner (System.in);
		double num1=mi_scanner1.nextDouble();
		System.out.println("Ingrese otro numero: ");
		Scanner mi_scanner2= new Scanner (System.in);
		double num2=mi_scanner2.nextDouble();
		System.out.println("1 para sumar, 2 para restar, 3 para multiplicar o 4 para dividir: ");
		Scanner mi_scanner3= new Scanner (System.in);
		int num3=mi_scanner3.nextInt();
		if(num3==1)
		{
			System.out.println("La suma de los numeros es: "+(num1+num2));
		}else if (num3==2)
			{
			System.out.println("La resta de los numeros es: "+(num1-num2));
			}else if (num3==3)
				{
				System.out.println("La multiplicacion de los numeros es: "+(num1*num2));
				}else if (num3==4)
					{
					System.out.println("La divicion de los numeros es: "+(num1/num2));
					}
						
	}

}
