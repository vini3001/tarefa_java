package src;

class ConversaoStringParaInteiroException extends Exception {
    public ConversaoStringParaInteiroException() {
        super("Erro ao Converter string para Inteiro");
    }
}

public class ExcecaoPersonalizada {
    public static void convertNumber(String numero) {
        try {
            int numeroConvertido = converterStringParaInteiro(numero);
            System.out.println("Número convertido: " + numeroConvertido);
        } catch (ConversaoStringParaInteiroException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public static int converterStringParaInteiro(String str) throws ConversaoStringParaInteiroException {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new ConversaoStringParaInteiroException();
        }
    }
}
