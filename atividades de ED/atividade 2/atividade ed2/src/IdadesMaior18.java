public class IdadesMaior18 {
    public static void main(String[] args) {
        // Exemplo de idades definidas diretamente
        int[] idades = {15, 22, 18, 30, 17, 19, 25, 16, 21, 14}; // 10 idades

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }
    }
}