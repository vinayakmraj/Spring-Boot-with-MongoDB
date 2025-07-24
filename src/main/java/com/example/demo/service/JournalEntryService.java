package com.example.demo.service;

import com.example.demo.entity.JournalEntry;
import com.example.demo.repository.Repository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class JournalEntryService {
    @Autowired
    private Repository repository;

    public void saveEntry(JournalEntry journalEntry){
        repository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return repository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return repository.findById(id);
    }

    public void deleteById(ObjectId id){
        repository.deleteById(id);
    }
}
