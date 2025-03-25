package OrientacaoObjetos.Livraria.Controller;

import OrientacaoObjetos.Livraria.Model.Item;

import java.util.ArrayList;
import java.util.List;

public class Livraria {

    private List<Item> items;

    public Livraria() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void listItems() {
        if (items.isEmpty()) {
            System.out.println("Lista vazia");
        }else{
            for (Item item : items) {
                item.mostrarDetalhes();
                System.out.println("_".repeat(35));
            }
        }
    }
}
