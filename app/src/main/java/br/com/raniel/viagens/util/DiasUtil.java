package br.com.raniel.viagens.util;

import br.com.raniel.viagens.model.Pacote;

public class DiasUtil {

    public static final String PLURAL = " dias";
    public static final String SINGULAR = " dia";

    public static String formataEmTexto(int quantidadeDeDias) {
        if(quantidadeDeDias > 1)
            return quantidadeDeDias + PLURAL;

        return quantidadeDeDias + SINGULAR;
    }
}
