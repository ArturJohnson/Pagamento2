import java.time.LocalDate;

public class Boleto extends FormaDePagamento {

    private LocalDate dataVencimento;

    public LocalDate getDataVencimento(){
        return dataVencimento = getDataCriacao().plusDays(10);
    }

    @Override
    public void processarPagamento() {
        IO.println("Seu boleto foi gerado com sucesso!"
                + "\n o código da operação é:"
                + getCodigo() + "\nData de criação:"
                + getDataCriacao()
                + "\n data de vencimento é: "
                + getDataVencimento()
        );
    }
}
