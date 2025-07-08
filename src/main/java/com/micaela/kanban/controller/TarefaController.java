package com.micaela.kanban.controller;

import com.micaela.kanban.model.Tarefa;
import com.micaela.kanban.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final TarefaRepository repo;

    public TarefaController(TarefaRepository repo) {
        this.repo = repo;
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return repo.save(tarefa);
    }

    @GetMapping
    public List<Tarefa> listarTodas() {
        return repo.findAll();
    }
}
