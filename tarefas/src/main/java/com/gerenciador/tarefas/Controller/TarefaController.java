package com.gerenciador.tarefas.controller;

import com.gerenciador.tarefas.model.Tarefa;
import com.gerenciador.tarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class TarefaController {

    @Autowired
    private TarefaRepository repository;

    // Listar tarefas na Home
    @GetMapping
    public String listar(Model model) {
        model.addAttribute("tarefas", repository.findAll());
        return "index";
    }

    // Abrir formulário de nova tarefa
    @GetMapping("/nova")
    public String formCadastro(Model model) {
        model.addAttribute("tarefa", new Tarefa());
        return "form";
    }

    // Salvar tarefa (nova ou edição)
    @PostMapping("/salvar")
    public String salvar(@ModelAttribute Tarefa tarefa) {
        repository.save(tarefa);
        return "redirect:/";
    }

    // Abrir formulário de edição
    @GetMapping("/editar/{id}")
    public String formEdicao(@PathVariable Long id, Model model) {
        model.addAttribute("tarefa", repository.findById(id).get());
        return "form";
    }

    // Deletar tarefa
    @GetMapping("/deletar/{id}")
    public String deletar(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:/";
    }
}