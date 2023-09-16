package Itens;

import java.util.ArrayList;
import java.util.List;

public class ItemFlyweightFactory {
    public static final List<Item> itens = new ArrayList<>();

    public static Item obterItem(String nome, double preco) {
        for (Item item : itens) {
            if (item.getNome().equals(nome) && item.getPreco() == preco) {
                return item;
            }
        }

        Item novoItem = new Item(nome, preco);
        itens.add(novoItem);
        return novoItem;
    }
}
