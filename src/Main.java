void main() {

    FormaDePagamento pix = new PagamentoPix();
    IO.println("\n----------Pagamento-------------\n");
    pix.processarPagamento();
    IO.println("\n----------Pagamento-------------\n");
    pix.processarPagamento();

    FormaDePagamento boleto = new Boleto();
    IO.println("\n----------Pagamento-------------\n");
    boleto.processarPagamento();
    IO.println("\n----------Pagamento-------------\n");
    boleto.processarPagamento();
}