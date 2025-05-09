'''
Para ler e escrever dados em Python, utilizamos as seguintes funções:
- input : lê UMA linha com dado(s) de Entrada de usuário;
- print : imprime um texto de Saída (Output), pulando linha.

#função útil para o calculo do imposto (baseado nas aliquotas).
def calcular_imposto(salario):
    aliquota = 0.00
    if (salario >= 0 and salario <= 1100):
        aliquota = 0.05

    elif (Salario >= 1100.01 and Salario <= 2500.00):
        //Atribui a aliquota de 10% mediante o salário:
        aliquota = 0.10
    else:
        //Atribui a aliquota de 15% mediante o salário:
        aliquota = 0.15
    #TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%
    return aliquota = salario

#Lê os valores de Entrada:
valor_salario = float(input())
valor_beneficios = float(input())

#Calcula o imposto através da função "calcular_imposto":
valor_imposto = calcular_imposto(valor_salario)
#Calcula e imprime a Saída (com 2 casas decimais):
saída = valor_salario - valor_imposto - valor_beneficios
print (f'(saida:.2f)')