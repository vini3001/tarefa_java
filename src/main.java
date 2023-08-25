
public class main {
    static Pessoa_fisica PF = new Pessoa_fisica("Vinícius", "169945600",
            "donizete@gmail.com", "Rua Presidente Vargas, 546", 100,
            "335.556.223-67");

    static Pessoa_juridica PJ = new Pessoa_juridica("Vinícius", "169945600",
            "donizete@gmail.com", "Rua Presidente Vargas, 546", 100,
            "12.345.678/0001-00");
    static Pessoa P = new Pessoa("Vinícius", "169945600",
            "donizete@gmail.com", "Rua Presidente Vargas, 546", 100);

    public static void main(String[] args){
        P.calcular(50);
        P.imprime();
        PF.calcular(50);
        PF.imprime();
        PJ.calcular(50);
        PJ.imprime();
    }
}
