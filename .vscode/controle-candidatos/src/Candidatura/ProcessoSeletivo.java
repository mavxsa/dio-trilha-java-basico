package Candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        
        int candidatosSelecionados = 0;
        int candidatosAtual=0;
        while(candidatosSelecionados < 5) {

        }
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        }
        else if (salarioBase==salarioPretendido)
        System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");        
    else {
        System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
    }
    }
}
