package com.micaela.kanban.controller;

import com.micaela.kanban.model.Tarefa;
import com.micaela.kanban.repository.TarefaRepository;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final TarefaRepository repo;

    public
    TarefaController(TarefaRepository repo){
        this.repo = repo;
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa){
       return repo.save(tarefa);

    }
    




}
