package br.com.projetosocial.newton;

public class TrabalhoVoluntario extends Projeto {
    private String tipoTrabalho;
    private int duracaoTrabalho;

    public TrabalhoVoluntario(String nomeProjeto, String descricao, String endereco, String dataInicio, String dataFim, String tipoTrabalho, int duracaoTrabalho) {
        super(nomeProjeto, descricao, endereco, dataInicio, dataFim);
        this.tipoTrabalho = tipoTrabalho;
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public String getTipoTrabalho() {
        return tipoTrabalho;
    }

    public void setTipoTrabalho(String tipoTrabalho) {
        this.tipoTrabalho = tipoTrabalho;
    }

    public int getDuracaoTrabalho() {
        return duracaoTrabalho;
    }

    public void setDuracaoTrabalho(int duracaoTrabalho) {
        this.duracaoTrabalho = duracaoTrabalho;
    }

    public boolean validaProjeto() {
        if (duracaoTrabalho > 2) {
            return true;
        }
        return false;
    }

    public String imprimeProjeto() {
        String projetoStr = "Nome do Projeto: " + getNomeProjeto() +
                "\nDescrição: " + getDescricao() +
                "\nData de Início: " + getDataInicio() +
                "\nData de Fim: " + getDataFim() +
                "\nTipo de Trabalho: " + tipoTrabalho +
                "\nDuração do Trabalho: " + duracaoTrabalho + " horas";
        return projetoStr;
    }
}
