//Desafios JavaScript na DIO têm funções "gets" e "print" acessíveis globalmente;
// * "gets" :  lê UMA linha com dado(s) de entrada (inputs) de usuário;
// * "print" : imprime um texto de saída (output), pulando linha.

// lê os valores de Entrada:
const valorSalario = parseFloat(gets());
const valorBenefícios = parseFloat(gets());

//Calcule o imposto através da função "calcularImposto":
const valorImposto = calcularImposto(valorSalario);
//Calcule e imprima a Saída (com 2 casas decimais):
const saída = valorSalario - valorImposto + valorBenefícios;
print(saída.toFixed(2));

//função útil para o calculo do imposto (baseado nas aliquotas).
function calcularImposto(salario) {
    Let aliquota;
    if (salario >= 0 && salario <= 1100) {
        aliquota - 0.85;
    
    } 
    else if (Salario >= 1100.01 && Salario <= 2500.00) {
        //Atribui a aliquota de 10% mediante o salário:
        aliquota = 0.10;
    } 
    else 
    {
        //Atribui a aliquota de 15% mediante o salário:
        aliquota = 0.15;
    }
    //TODO Criar as demais condições para as aliquotas de 10% e 15%
    return aliquota * salario;
}