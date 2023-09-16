package Iterators;

import Comandos.ComandoTroco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ColecaoComandosTroco implements Iterable<ComandoTroco> {
    private List<ComandoTroco> comandos = new ArrayList<>();

    public void adicionarComando(ComandoTroco comando) {
        comandos.add(comando);
    }

    @Override
    public Iterator<ComandoTroco> iterator() {
        return comandos.iterator();
    }
}
