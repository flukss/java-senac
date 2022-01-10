import java.util.Scanner; 

public class aula14 {

public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
String palavra = "";
int count = 0;
while(!palavra.equals("FIM"))
{
System.out.print("Digite uma FIM para sair: ");
palavra = in.next();
palavra = palavra.toUpperCase();
if (!palavra.equals("FIM"))
{
++count;
}
//string.toUpperCase() - transforma a palavra em maiscula
//string.toLowerCase()  - transforma a palavra em minuscula
}
System.out.println("Voce digitou para sair");
System.out.println("Quantidades e palavras digitadas até saída: "+count);
}

}
