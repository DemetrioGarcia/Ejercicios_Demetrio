package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class ProgramaMe_HBTest {

    @Test
    void cantFelic() {
        int[] Array = new int[]{1, 2, 3, 4, 5, 0};
        assertAll(
                () -> assertEquals(3 , ProgramaMe_HB.CantFelic(Array,2)),
                () -> assertEquals(1 , ProgramaMe_HB.CantFelic(Array,5)),
                () -> assertEquals(5 , ProgramaMe_HB.CantFelic(Array,1))
        );
    }

    @Test
    void tiempo() {

            //simulamos que el usuario ingresa caracteres
            String entradaSimulada = "aaa"; // 'a' es un carácter no válido
            System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

            //llamamos al metodo que procesa la entrada
            int resultado = ProgramaMe_HB.Tiempo();

            //verificamos que el valor que devuelve es el esperado (0)
            assertEquals(0, resultado);
    }

    @Test
    void validarTiempo() {
        assertAll(
                () -> assertFalse(ProgramaMe_HB.ValidarTiempo(0)),
                () -> assertFalse(ProgramaMe_HB.ValidarTiempo(100001)),
                () -> assertTrue(ProgramaMe_HB.ValidarTiempo(10))
        );
    }

}