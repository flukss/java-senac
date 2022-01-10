import java.util.Scanner; 

public class aula07 {

public static void main(String[] args)
{
Scanner leia = new Scanner(System.in);
String nome = "";
double salario, acumuladorsalario = 0;
    for (int i = 1; i <= 5; i++)
    {
    System.out.print("Infome o"+i+" º nome: ");
    nome = leia.next();
    System.out.print("Informe o "+i+" º salário: ");
    salario = leia.nextDouble();
    acumuladorsalario = acumuladorsalario + salario;
    }
System.out.print(" o acumulado dos salários foi de: "+acumuladorsalario);
}

}
