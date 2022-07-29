package com.archive.application.service;

import com.archive.application.model.Doc;
import com.archive.application.repository.DocRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocService {

    private final DocRepository docRepository;

    @Autowired
    public DocService(DocRepository docRepository) {
        this.docRepository = docRepository;
    }

    public Doc findById(Long id){
        return docRepository.getOne(id);
    }

    public List<Doc> findAll(){
        return docRepository.findAll();
    }

    public Doc saveDoc(Doc doc){
        return docRepository.save(doc);
    }

    public void deleteById(Long id){
        docRepository.deleteById(id);
    }
}
