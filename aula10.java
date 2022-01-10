import java.util.Scanner; 

public class aula10 {

public static void main(String[] args) 
{
Scanner leia = new Scanner(System.in);
int num = 0;
System.out.println("Escreva um número: ");
num = leia.nextInt();
for (int i = 1; i <= 10; ++i)
System.out.println(num*i); 
}

}
