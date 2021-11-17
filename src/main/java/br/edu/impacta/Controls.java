package br.edu.impacta;

public class Controls {
    public static final String NOMEFIXO = "name";
    public static final String SEGUNDA = "segunda-feira";
    public static final String TERCA = "terca-feira";
    public static final String QUARTA = "quarta-feira";

    public static void testar() {
        String nome = "name";

        // Gambiss (mas é legal)
        switch(1) {
            case 1:
            case 2:
                System.out.println("o que fazer pra 1 ou 2");
                break;
            case 3:
                System.out.println("o que fazer pra 3..");
        }

        switch (nome) {
            case "qualquercoisa":
                System.out.println("Sem break");
                break;
            case NOMEFIXO:
                System.out.println("Nome encontrado");
                break;
            default:
                System.out.println("Algo deu errado");
        }

        int num = switch ("segunda-feira") {
            case SEGUNDA, TERCA -> 1;
            case QUARTA -> 2;
            default -> 3;
        };
    }
}
