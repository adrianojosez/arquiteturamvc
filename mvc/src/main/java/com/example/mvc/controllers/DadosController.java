package com.example.mvc.controllers;


import com.example.mvc.models.Animais;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //retorna dados e não view html; view = front end
@RequestMapping("/api/animais")
    public class DadosController {
        private static final List<Animais>
                animais = new ArrayList<Animais>();

        public DadosController() {
            animais.add(new Animais("Gato","Felino"));
            animais.add(new Animais("Morcego","Mamífero"));
            animais.add(new Animais("Tilápia","Peixe"));
    }

    @GetMapping
    public List<Animais> getAnimais () {
            return animais;
    }
}
