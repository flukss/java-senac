import java.util.Scanner; 

public class aula04
{

public static void main(String[] args) 
{
int idade1 = 0;
int idade2 = 0;
Scanner leia = new Scanner (System.in);
System.out.println("Digite a primeira idade: ");
idade1 = leia.nextInt();
System.out.println("Digite a segunda idade: ");
idade2 = leia.nextInt();
    if(idade1 == idade2)
    { 
    System.out.println("Mesma idade");
    }
    if(idade2 > idade1)
    { 
    System.out.println(+idade2+" Maior que "+idade1);
    }
    else
    { 
    System.out.println(+idade1+" Maior que"+idade1);
    }
}

}