package com.example.saluto;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")

public class CiaoController {

    @GetMapping(path = "/ciao/Lombardia")
    public User ciao (
            @RequestParam String nome,
            @RequestParam(required = false) String saluto
    ) {
        return new User(nome, "Lombardia", saluto);
    }
}
