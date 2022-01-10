import java.util.Scanner; 
public class aula01
{
public static void main(String[] args) 
{
int n1 = 0;
int n2 = 0;
int soma = 0;
Scanner leia = new Scanner(System.in);
System.out.println("Informe os valores: ");
n1 = leia.nextInt();
n2 = leia.nextInt();
soma = n1 + n2;
System.out.println("A soma dos valores é de: " + soma);
}
}
