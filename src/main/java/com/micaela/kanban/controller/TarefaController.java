package com.micaela.kanban.controller;

import com.micaela.kanban.model.Tarefa;
import com.micaela.kanban.repository.TarefaRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import java.util.Optional;
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

    @GetMapping("/{id}")
    public ResponseEntity<Tarefa> buscarPorId(@PathVariable Long id) {
        Optional<Tarefa> tarefa = repo.findById(id);

    @PutMapping("/{id}/concluir")
     public ResponseEntity<Tarefa> concluirTarefa(@PathVariable Long id) {
     Optional<Tarefa> tarefaOptional = repo.findById(id);

     if (tarefaOptional.isPresent()) {
        Tarefa tarefa = tarefaOptional.get();
        tarefa.setStatus("Concluída");
        repo.save(tarefa);
        return ResponseEntity.ok(tarefa);
    } else {
        return ResponseEntity.notFound().build();

    
    }
}

    }

}
