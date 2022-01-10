import java.util.Scanner; 

public class aula12 {

public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
String palavra = "";
while(!palavra.equals("FIM"))
{
System.out.print("Digite uma palavra");
palavra = in.next();
palavra = palavra.toUpperCase();
//string.toUpperCase() - transforma a palavra em maiscula
//string.toLowerCase()  - transforma a palavra em minuscula
System.out.print("Voce digitou para sair");
}

}

}

