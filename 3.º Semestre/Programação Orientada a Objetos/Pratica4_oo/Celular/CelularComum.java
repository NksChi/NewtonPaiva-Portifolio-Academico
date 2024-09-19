package br.com.celular.newton;

public abstract class CelularComum implements Celular {
    protected boolean temEnviarMensagem;
    protected boolean temAcessarInternet;
    protected boolean temAcessarEmails;
    protected boolean temRadio;
    protected boolean temTV;
    protected boolean temVerificarSistemaArquivos;

    public CelularComum(boolean temEnviarMensagem, boolean temAcessarInternet, boolean temAcessarEmails,
                        boolean temRadio, boolean temTV, boolean temVerificarSistemaArquivos) {
        this.temEnviarMensagem = temEnviarMensagem;
        this.temAcessarInternet = temAcessarInternet;
        this.temAcessarEmails = temAcessarEmails;
        this.temRadio = temRadio;
        this.temTV = temTV;
        this.temVerificarSistemaArquivos = temVerificarSistemaArquivos;
    }

    public boolean temEnviarMensagem() {
        return temEnviarMensagem;
    }

    public boolean temAcessarInternet() {
        return temAcessarInternet;
    }

    public boolean temAcessarEmails() {
        return temAcessarEmails;
    }

    public boolean temRadio() {
        return temRadio;
    }

    public boolean temTV() {
        return temTV;
    }

    public boolean temVerificarSistemaArquivos() {
        return temVerificarSistemaArquivos;
    }
}

