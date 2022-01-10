import java.util.Scanner; 

public class aula15 {

public static void main(String[] args) 
{
Scanner in = new Scanner (System.in);
float num1 = 0; 
float num2 = 0;
float soma = 0;
float mult = 0;
int comand = 0;
String saida = ""; 
while (!saida.equals("N"))
{
System.out.println("Informe o primeiro número ");
num1 = in.nextFloat();
System.out.println("Informe o segundo número ");
num2 = in.nextFloat();
System.out.println("Informe o número da operação (1) Para somar (2) Para multiplicar");
comand = in.nextInt();
if (comand == 1)
{ 
soma = num1+num2;
System.out.println("Resultado: "+soma);
}
else
{
mult = num1*num2;
System.out.println("Resultado: "+mult);
}
System.out.println("Deseja continuar? S/N");
saida = in.next();
saida = saida.toUpperCase();
}
}

}
