object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            (salario >= 0 && salario <= 1100) -> 0.05
            (salario >= 1100.01 && salario <= 2500.00) -> 0.10
            else -> 0.15 TODO("Criar as condições para as aliquotas de 10.00% e 15.00%.")
        }
        return aliquota * salario
    
    }
}

fun main () {
    val valorSalario = readLine()!!.toDouble();
    val valorBeneficios = readLine()!!.toDouble();

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario);
    val saida = valorSalario - valorImposto + valorBeneficios;

    println(String.format("%.2F", saida));

}