import java.util.Scanner; 

public class aula13 {

public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
int num, i = 1;
System.out.print("Digite um número: ");
num = in.nextInt();
while (i <= 10)
{
System.out.println(num * i);
i++;
}

}

}