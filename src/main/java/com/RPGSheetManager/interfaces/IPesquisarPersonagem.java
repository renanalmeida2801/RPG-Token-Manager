package main.java.com.RPGSheetManager.interfaces;

public interface IPesquisarPersonagem {

    public Personagem pesquisarPersonagemPorNome(String nome);

    public Personagem pesquisarPersonagemPorId(int id);
}
