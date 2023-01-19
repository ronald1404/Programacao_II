package Aula_04;

public abstract class AcessoBD {

    public abstract boolean connectBD(String usuario, 
                            String senha,
                            String URL,
                            String LocalDrive);
    // Qual é o banco?
    // já tenho acesso?
    public abstract boolean testaConexao();

}


abstract class AcessoBDLocal extends AcessoBD{
    
    public boolean testaConexao() {
        // Implementação
        // TODO Auto-generated method stub
        return false;
    }

}

class AcessaMYSQL extends AcessoBDLocal {
    
    /*A classe correta vai sempre saber implementar os detalhes*/

    public boolean connectBD(String usuario, 
                            String senha,
                            String URL,
                            String LocalDrive){
        return false;
    }

    @Override
    public boolean testaConexao() {
        // Sobreescrita
        return false;
    }
}