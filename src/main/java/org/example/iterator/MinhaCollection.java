package org.example.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * todo Transformar minha collection em uma collection do alfabeto
 *   metodos: randomAlphabet, orderedAlphabet
 */
public class MinhaCollection implements Iterable<String> {
    private List<String> lista = List.of("a", "b", "c", "d", "e");
    @Override
    public Iterator<String> iterator() {
        return lista.iterator();
    }
}
