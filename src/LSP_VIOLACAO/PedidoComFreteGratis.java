package LSP_VIOLACAO;

public class PedidoComFreteGratis extends Pedido {

    public PedidoComFreteGratis(double valorBruto) {
// Assume-se que o construtor da base é chamado
        super(valorBruto);
    }


// VIOLAÇÃO DO LSP: A subclasse enfraquece a PÓS-CONDIÇÃO do supertipo.
// Se o valorFrete passado for maior que 0, o método *deveria* aumentar o
// valor final, mas, em vez disso, zera o frete, quebrando a expectativa
// do código cliente de que a chamada a este método seja cumulativa/positiva.
    @Overridegit
    public void aplicarFrete(double valorFrete) {
// A regra de frete grátis sobrescreve a lógica da superclasse,
// garantindo que o valorFinal permaneça igual ao valorBruto.
        this.valorFrete = 0.0;
        this.valorFinal = this.valorBruto; // Quebra a expectativa de um aumento

        System.out.println("Frete grátis aplicado. Valor final mantido.");
    }
}
