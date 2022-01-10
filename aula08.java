import java.util.Scanner; 

public class aula08 
{

public static void main(String[] args) 
{
Scanner leia = new Scanner(System.in);
String nome = "";
int idade, conta1 = 0, conta2 = 0; // A idade é atribuida só como int e não com valor 0 como conta1 e conta2
double salario = 0.0;
    for (int i = 1; i<=5; ++i)
    {
    System.out.println("Informe o "+i+"º nome");
    nome = leia.next();
    System.out.println("Informe o "+i+"º salário");
    salario = leia.nextDouble();
    System.out.println("Informe o "+i+"º idade");
    idade = leia.nextInt();
    if (idade>=40)
    { 
    ++conta1;
    }
    else
    { 
    ++conta2;
    }
}
System.out.println("Quantidade de pessoas com idade acima de 40 anos "+conta1);
System.out.println("Quantidade de pessoas com idade abaixo de 40 anos "+conta2);
}

}
