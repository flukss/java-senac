import java.util.Scanner; 
public class aula09 {
public static void main(String[] args) 
{
Scanner leia = new Scanner (System.in);
String nome = "";
int idade, conta1 = 0, conta2 = 0;
double salario = 0.0, acum1 = 0.0, acum2 = 0.0;
    for (int i = 1; i<=5; ++i)
    {
    System.out.println("Informe o "+i+"º nome: ");
    nome = leia.next();
    System.out.println("Informe o "+i+"º salário: ");
    salario = leia.nextDouble();
    System.out.println("Informe o "+i+"º idade: ");
    idade = leia.nextInt();
    if (idade >=40)
    {
    ++conta1;
    acum1 += salario;
    }
    else
    {
    ++conta2;
    acum2 += salario;
    }
}
System.out.println("quantidade de pessoas com idade >=40 anos " +conta1);
System.out.println(acum1);
System.out.println("quantidade de pessoas com idade >=40 anos " +conta2);
System.out.println(acum2);
}
}
