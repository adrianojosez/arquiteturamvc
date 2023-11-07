package com.example.mvc.controllers;

import com.example.mvc.models.Animais;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/animais")

public class ComidasController {
    private static final List<Animais>
            animais = new ArrayList<Animais>();

    public ComidasController() {
        animais.add(new Animais("Cachorro","Mamífero"));
        animais.add(new Animais("Tubarão","Peixe"));
        animais.add(new Animais("Papagaio","Ave"));
    }

    @GetMapping
    public String getAnimais(Model model){
        model.addAttribute("animais",animais);
        return "animais";
    }

}
