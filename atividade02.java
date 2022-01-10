import java.util.Scanner; 

public class atividade02 {

public static void main(String[] args) 
{
Scanner in = new Scanner (System.in);
int frota = 0;
float sal = 0, soma = 0;
String nome = "";
System.out.println("Digite a quantidade de frotas: ");
frota = in.nextInt();
for (int i = 1; i <= frota; i++)
{
System.out.println("Digite o nome do motorista: ");
nome = in.next();
System.out.println("Digite o salário do motorista: ");
sal = in.nextFloat();
soma = soma + sal;
}
System.out.println("Valor de soma dos salários da frota: " +soma);
}
}
