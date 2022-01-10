import java.util.Scanner; 

public class atividade01 
{
public static void main(String[] args) 
{
Scanner in = new Scanner (System.in);
String comand = "", sex = "";
float salario = 0, somaM = 0, somaF= 0;
int contM = 0, contF = 0;

    while (!comand.equals("SAIR"))
    {
    System.out.print("Informe o nome do gestor: ");
    comand = in.next();
    comand = comand.toUpperCase();

        if(!comand.equals("SAIR"))
        {
        System.out.print("Informe o sexo do gestor: ");
        sex = in.next();
        sex = sex.toUpperCase();

            if(sex.equals("M"))
            {
            System.out.print("Informe o salário: ");
            salario = in.nextFloat();
            contM = contM + 1;
            somaM = somaM + salario;
            }
            else
            {
            System.out.print("Informe o salário: ");
            salario = in.nextFloat();
            somaF = somaF + salario;
            contF = contF + 1;
            }
        }
}
System.out.println("Quantidade de funcionários Homens: "+contM);
System.out.println("Soma dos salários masculinos: " +somaM);
System.out.println("Quantidade de funcionárias mulheres: "+contF);
System.out.println("Soma dos salários femininos: " +somaF);
}

}
