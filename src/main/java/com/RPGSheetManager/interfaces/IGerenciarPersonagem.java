package main.java.com.RPGSheetManager.interfaces;

public interface IGerenciarPersonagem {

    public void cadastrarPersonagem(Personagem personagem);

    public void excluirPersonagem(int id);

    public void editarPersonagem(int id, Personagem personagem);
}
