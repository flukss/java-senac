import java.util.Scanner; 

public class aula06 
{

public static void main(String[] args)
{
Scanner leia = new Scanner(System.in);
String nome = "";
    for (int i = 1; i<= 5; i++)
    {
    System.out.print("Informe o "+i+" º nome ");
    nome = leia.next();
    }
}

}
