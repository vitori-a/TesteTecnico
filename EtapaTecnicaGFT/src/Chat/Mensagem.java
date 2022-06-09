package Chat;

public class Mensagem {
    private String texto;
    private String reacao;


    public Mensagem() {
        this.texto = texto;
        this.reacao = reacao;
    }

    public String reagir(String curtir, String triste, String surpreso){
        if (reacao == curtir){
            System.out.println("Boa!! Gostei");
        } else if (reacao == triste){
            System.out.println("Poxa! Não gostei, fiquei chateado.");
        } else
            System.out.println("Uau! Não esperava. Que surpresa");
        return reacao;
    }

    @Override
    public String toString() {
        return "Mensagem{" +
                "texto='" + texto + '\'' +
                ", reacao='" + reacao + '\'' +
                '}';
    }
}
