import java.util.Scanner; 

public class atividade03 
{

public static void main(String[] args)
{
Scanner in = new Scanner (System.in);
float venda = 0, somaVenda = 0, somaOut = 0, somaNov = 0;
String comand = "";
int contVenda = 0, contVendOut = 0, contVendNov = 0;
while (!comand.equals("SAIR"))
{
System.out.println("Digite o mês de venda: ");
comand = in.next();
comand = comand.toUpperCase();
if (!comand.equals("SAIR"))
{
System.out.println("Digite o valor da venda: ");
venda = in.nextFloat();
contVenda = contVenda + 1;
somaVenda = somaVenda + venda;
}
if (comand.equals("OUTUBRO"))
{
contVendOut = contVendOut + 1;
somaOut = somaOut + venda;
}
if (comand.equals("NOVEMBRO"))
{
contVendNov = contVendNov + 1;
somaNov = somaNov + venda;
} 
}
System.out.println("Quantidade de vendas total: "+contVenda);
System.out.println("Valor total das vendas: " +somaVenda);
System.out.println("Quantidade de vendas em Outubro: "+contVendOut);
System.out.println("Valor total de Outubro: " +somaOut);
System.out.println("Quantidade de vendas em Novembro: "+contVendNov);
System.out.println("Valor total de vendas em Novembro: " +somaNov);
}
}
