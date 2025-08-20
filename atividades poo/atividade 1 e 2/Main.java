public class Main {
    public static void main(String[] args) {
        // Criando dois livros
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        // Preenchendo atributos do livro1
        livro1.titulo = "O Ladrão de Raios - Percy Jackson";
        livro1.paginas= 384;
        livro1.ano = 2005;
        livro1.preco = 45.99;

        // Preenchendo atributos do livro2
        livro2.titulo = "Percy Jackson e o Mar de Monstros";
        livro2.paginas = 279;
        livro2.ano = 2006;
        livro2.preco = 39.99;

        // Mostrando informações dos livros
        livro1.mostrarInfo();
        livro2.mostrarInfo();
    }
}