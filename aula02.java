import java.util.Scanner; 

public class aula02 
{

public static void main(String[] args) 
{
Scanner leia = new Scanner(System.in);
String nomeMercadoria = "";
int qtMercadoria = 0;
double valorMercadoria = 0;
double total = 0;
System.out.println("Informe o nome da mercadoria: ");
nomeMercadoria = leia.next();
System.out.println("Informe a quantidade que você deseja comprar: ");
qtMercadoria = leia.nextInt();
System.out.println("Informe o valor unitário: ");
valorMercadoria = leia.nextDouble();
total = valorMercadoria * qtMercadoria;
System.out.println("Valor a pagar: "+total);
}
}
