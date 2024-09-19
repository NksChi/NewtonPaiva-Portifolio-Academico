package br.com.projetosocial.newton;

public class DistribuicaoAlimento extends Projeto {
    private String descAlimento;
    private float qtde;

    public DistribuicaoAlimento(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public boolean validaProjeto() {
        if (getDataFim().isEmpty()) {
            return false;
        }
        return true;
    }

    public String imprimeProjeto() {
        String projetoStr = "Nome do Projeto: " + getNomeProjeto() +
                "\nDescrição: " + getDescricao() +
                "\nEndereço: " + getEndereco() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nDescrição do Alimento: " + descAlimento +
                "\nQuantidade: " + qtde;
        return projetoStr;
    }
}
