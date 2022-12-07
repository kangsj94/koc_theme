package com.koc.tema_back.tema.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TemaController {
    private final TemaService temaService;

    @PostMapping("/tema")
    public void save(@RequestBody TemaDto temaDto) {
        temaService.save(temaDto);
    }

    @GetMapping("/tema/{id}")
    public TemaDto findById(@PathVariable long id) {
        return temaService.findById(id);
    }
}
