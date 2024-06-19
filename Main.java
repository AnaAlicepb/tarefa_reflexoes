package ExemploReflection;

public class Main {
    public static void main(String[] args) {
        // Verifica se a classe Usuario está anotada com @Tabela
        if (Usuario.class.isAnnotationPresent(Tabela.class)) {
            // Obtém a anotação @Tabela da classe Usuario
            Tabela tabela = Usuario.class.getAnnotation(Tabela.class);
            // Obtém o valor da anotação (nome da tabela)
            String nomeDaTabela = tabela.nome();
            // Imprime o nome da tabela associada à classe Usuario
            System.out.println("Classe Usuario está associada à tabela: " + nomeDaTabela);
        } else {
            System.out.println("Classe Usuario não está anotada com @Tabela.");
        }
    }
}
