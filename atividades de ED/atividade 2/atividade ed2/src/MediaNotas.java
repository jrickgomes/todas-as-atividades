public class MediaNotas {
    public static void main(String[] args) {
        // Exemplo de notas definidas diretamente
        double[] notas = {7.5, 8.0, 9.0, 6.5}; // 4 notas
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}