public class Aluno {
    String nome;
    int matricula;
    double nota1v;
    double nota2v;

    // Dados do aluno
    void dadosDoAluno () {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota 1v: " + nota1v);
        System.out.println("Nota 2v: " + nota2v);
        System.out.println("-------------------------");
        
    } 
    // Soma media
    double somaMedia() {
        return (nota1v + nota2v) / 2;

    }
    // Verificar aprovacao() (UNAMA: media >= 7)
    void verificarAprovacao() {
        double media = somaMedia();
        if(media >=7) {
            System.out.println("Aluno " + nome + " esta APROVADO com media " + media);
        } else {
            System.err.println("Aluno " + nome + " esta REPROVADO com media " + media);
        }
    }
    } 

