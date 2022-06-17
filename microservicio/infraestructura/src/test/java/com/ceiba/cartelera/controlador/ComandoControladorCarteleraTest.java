package com.ceiba.cartelera.controlador;

import com.ceiba.ApplicationMock;
import com.ceiba.cartelera.comando.ComandoCartelera;
import com.ceiba.cartelera.testdatabuilder.ComandoCarteleraTestDataBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = ApplicationMock.class)
@WebMvcTest(ComandoControladorCartelera.class)
class ComandoControladorCarteleraTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private MockMvc mocMvc;

    @Test
    void crear() throws Exception {
        // arrange
        ComandoCartelera cartelera = new ComandoCarteleraTestDataBuilder().build();

        // act - assert
        mocMvc.perform(post("/carteleras")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(cartelera)))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': 2}"));
    }


    @Test
    void eliminar() throws Exception {
        // arrange
        Long id = 1L;

        // act - assert
        mocMvc.perform(delete("/carteleras/{id}", id)
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}
