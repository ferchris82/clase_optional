package org.chrisferdev.optional.ejemplo;

import org.chrisferdev.optional.ejemplo.models.Computador;
import org.chrisferdev.optional.ejemplo.repositorio.ComputadorRepositorio;
import org.chrisferdev.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador defecto = new Computador("HP Omen", "LA0001");

        Computador pc = repositorio.filtrar("rog").orElse(valorDefecto());
        System.out.println(pc);

        pc = repositorio.filtrar("macbook pro").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);
    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo el valor por defecto!!!");
        return new Computador("HP Omen", "LA0001");
    }
}
