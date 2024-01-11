package org.chrisferdev.optional.ejemplo.repositorio;

import org.chrisferdev.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {

    Optional<Computador> filtrar(String nombre);
}
