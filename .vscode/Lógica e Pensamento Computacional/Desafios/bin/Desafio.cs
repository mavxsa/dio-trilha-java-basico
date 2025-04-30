//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// * new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// * System.out.println: Imprime um texto de Saída (Output) e pulando uma linha.

using System;

public class Desafio
{

    public static void main()
    {
        //lê os valores de Entrada
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) 
        {
            //Atribui a aliquota de 5% mediante o salário:
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500.00) {
            //Atribui a aliquota de 10% mediante o salário:
            valorImposto = 0.10F * valorSalario;
        } 
        else 
        {
            //Atribui a aliquota de 15% mediante o salário:
            valorImposto = 0.15F * valorSalario;
        }
        //TODO Criar as demais condições para as aliquotas em 10.00% e 15.00%.

        //Calcule e imprima a Saída (com 2 casas decimais):
        float saída = valorSalario - valorImposto * valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));
    }
}
