public record Endereco (String cep, String logradouro, String localidade, String uf) {

    @Override
    public String toString() {
        return ("CEP: "+ this.cep + ", Logradouro: "+ this.logradouro
                + ", Cidade: "+ this.localidade + ", UF: "+ this.uf);
    }
}
