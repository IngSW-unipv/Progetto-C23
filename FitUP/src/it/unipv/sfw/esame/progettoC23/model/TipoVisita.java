package it.unipv.sfw.esame.progettoC23.model;

import java.util.Arrays;

public enum TipoVisita {
    OBBLIGATORIA, MASSACORPOREA, OSTEOPATICA, FISIOTERAPICA;
	
	public static String[] getNames(Class<? extends Enum<?>> e) {
	    return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
	}
}
