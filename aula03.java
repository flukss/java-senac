import java.util.Scanner; 

public class aula03
{

public static void main(String[] args)
{
String nome = "";
double nota1 = 0;
double nota2 = 0;
double media = 0;
Scanner leia = new Scanner(System.in);
System.out.println("Digite o nome do aluno: ");
nome = leia.next();
System.out.println("Digite a primeira nota: ");
nota1 = leia.nextDouble();
System.out.println("Digite a segunda nota: ");
nota2 = leia.nextDouble();
media = (nota1 + nota2) / 2;
if (media>=7)
{
System.out.println("Aprovado");
}
else
{
System.out.println("Reprovado");
}
//System.out.println("Nome do aluno: "+nome);
//System.out.println("Média final: "+media);
}

}
