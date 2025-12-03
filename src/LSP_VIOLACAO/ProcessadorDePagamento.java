package LSP_VIOLACAO;

// Classe Cliente (Processador) que espera o comportamento da Superclasse
public class ProcessadorDePagamento {

    public void processar(Pedido pedido, double freteBase) {
        pedido.aplicarFrete(freteBase);


// EXPECTATIVA DO CLIENTE: O valor final DEVE refletir o frete aplicado.
                // O cliente assume que a pós-condição (valorFinal = valorBruto + freteBase) do tipo Pedido será mantida.
        if (pedido.getValorFinal() < pedido.valorBruto) {

// Este bloco será ativado se a subclasse quebrar a promessa do supertipo.
            throw new IllegalStateException("Erro de contrato: O valor final não pode ser menor que o valor bruto após a aplicação do frete.");
        }
    }
}
