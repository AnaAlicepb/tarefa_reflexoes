package ExemploReflection;

import java.lang.reflect.Field;

public class ExemploReflection {
    @Tabela(nome = "ExemploTabela")
    private String exemploCampo;

    public static void main(String[] args) {
        Class<?> clazz = ExemploReflection.class; // 'class' é uma palavra reservada, por isso está sendo usada 'clazz'
        Field field = null;

        try {
            field = clazz.getDeclaredField("exemploCampo");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }

        if (field != null && field.isAnnotationPresent(Tabela.class)) {
            Tabela tabelaAnnotation = field.getAnnotation(Tabela.class);
            String nomeDaTabela = tabelaAnnotation.nome();
            System.out.println("Nome da tabela em tempo de execução: " + nomeDaTabela);
        } else {
            System.out.println("O campo 'exemploCampo' não está anotado com @Tabela.");
        }
    }
}
