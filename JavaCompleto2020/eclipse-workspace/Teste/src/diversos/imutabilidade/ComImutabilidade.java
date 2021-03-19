package diversos.imutabilidade;

public final class ComImutabilidade {

	private final String linha;

    public ComImutabilidade(String linha) {
        this.linha = linha;
    }
    
//    private ComImutabilidade(String linha) {
//        this.linha = linha;
//    }

    public String getLinha() {
        return linha;
    }
    
//    public static ComImutabilidade make() {
//        return new ComImutabilidade("");
//    }
}

/*
1 - A classe deve ser declarada como final (para que as classes filhas n�o possam ser criadas)
2 - Os membros de dados da classe devem ser declarados como privados (para que o acesso direto n�o seja permitido)
3 - Os membros de dados da classe devem ser declarados como finais (para que n�o possamos alterar seu valor ap�s a cria��o do objeto)
4 - Um construtor parametrizado deve inicializar todos os campos realizando uma c�pia profunda (para que os membros de dados n�o possam ser modificados com refer�ncia de objeto)
5 - Fornecer pelo menos um construtor(unico m�todo mut�vel que deve existir)
6 - A c�pia profunda de objetos deve ser realizada nos m�todos getter (para retornar uma c�pia em vez de retornar a refer�ncia do objeto real)
7 - Sem setters (para n�o ter a op��o de alterar o valor da vari�vel de inst�ncia)
8 - Caso haja composi��o devem ter acesso exclusivo pela sua classe com c�pias defensivas
 */