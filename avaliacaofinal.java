import java.util.Scanner; 

public class avaliacaofinal {

public static void main(String[] args) 
{
Scanner in = new Scanner(System.in);
float sal1 = 0, sal2 = 0, mediaM = 0, mediaF = 0, acmM = 0, acmF = 0;
String sex = "", comand = "";
int contM = 0, contF = 0;
//A ideia do projeto é fazer um comparativo entre salários masculinos e femininos dentro de uma empresa apresentando as médias entre eles e facilitando uma visualização nos valores para poder comparar
while (!comand.equals("SAIR")) //O laço passa até a pessoa digitar para sair
{
System.out.print("Digite o nome do funcionário: ");
comand = in.next();
comand = comand.toUpperCase();
if (!comand.equals("SAIR")) // Esse if encurta o loop pra que ele não passe pra próxima operação, fazendo com que não conte mais uma passada do loop solicitando o sexo e os salários antes de encerrar
{
  System.out.print("Informe o sexo do gestor: ");
  sex = in.next();
  sex = sex.toUpperCase();
  if (sex.equals("M"))  //If para separação entre masculino e feminino 
{
System.out.print("Informe o salário do mês anterior: ");
sal1 = in.nextFloat();
contM = contM + 1; // Contador de salários masculinos
acmM = acmM + sal1;
System.out.print("Informe o salário do mês atual:" );
sal2 = in.nextFloat();
contM = contM + 1;
acmM = acmM + sal2; // Acumulador para apresentar os valores totais
mediaM = acmM / contM; // A média entre os salários é feita aqui entre os valores acumulados com a quantidade de salários inseridos
}
  else //Esse else serve exatamente pra mesma coisa do if de cima, mesmas operações e acumuladores só que para o sexo feminino
  {
  System.out.print("Informe o salário do mês anterior: ");
sal1 = in.nextFloat();
contF = contF + 1;
acmF = acmF + sal1;
System.out.print("Informe o salário do mês atual:" );
sal2 = in.nextFloat();
contF = contF + 1;
acmF = acmF + sal2;
mediaF = acmF / contF; 
  }
  }
}
System.out.println("Media dos salários masculinos: "+mediaM);
System.out.println("Quantiade de salários masculinos inseridos: "+contM);
System.out.println("Valor total de todos os salários masculinos: "+acmM);
System.out.println("Media dos salários femininos: "+mediaF);
System.out.println("Quantiade de salários femininos inseridos: "+contF);
System.out.println("Valor total de todos os salários femininos: "+acmF);
}
}
