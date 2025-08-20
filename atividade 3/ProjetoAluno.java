public class ProjetoAluno {
    public static void main(String[] args) {
        // Dois alunos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Jose Henrique";
        aluno1.matricula = 122;
        aluno1.nota1v = 6.5;
        aluno1.nota2v = 8.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Maria Fernanda";
        aluno2.matricula = 112;
        aluno2.nota1v = 7.5;
        aluno2.nota2v = 9.0; 

        // Dados do aluno
        aluno1.dadosDoAluno();
        aluno2.dadosDoAluno();

        // Atualizar a nota de Maria
        aluno2.nota2v = 8.2;
        
        // Dados atualizados
        System.out.println("Apos atualizacao de nota:");
        aluno2.dadosDoAluno();

        // Verificar aprovacao
        aluno1.verificarAprovacao();
        aluno2.verificarAprovacao();
    }
}
