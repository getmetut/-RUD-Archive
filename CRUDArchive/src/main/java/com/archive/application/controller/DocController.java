package com.archive.application.controller;

import com.archive.application.model.Doc;
import com.archive.application.service.DocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DocController {

    private final DocService docService;

    @Autowired
    public DocController(DocService docService) {
        this.docService = docService;
    }

    @GetMapping("/docs")
    public String findAll(Model model){
        List<Doc> docs = docService.findAll();
        model.addAttribute("docs", docs);
        return "doc-list";
    }

    @GetMapping("/doc-create")
    public String createDocForm(Doc doc){
        return "doc-create";
    }

    @PostMapping("/doc-create")
    public String createDoc(Doc doc){
        docService.saveDoc(doc);
        return "redirect:/docs";
    }

    @GetMapping("doc-delete/{id}")
    public String deleteDoc(@PathVariable("id") Long id){
        docService.deleteById(id);
        return "redirect:/docs";
    }

    @GetMapping("/doc-update/{id}")
    public String updateDocForm(@PathVariable("id") Long id, Model model){
        Doc doc = docService.findById(id);
        model.addAttribute("doc", doc);
        return "doc-update";
    }

    @PostMapping("/doc-update")
    public String updateDoc(Doc doc){
        docService.saveDoc(doc);
        return "redirect:/docs";
    }
}
