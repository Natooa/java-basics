package org.nurdiyar.todolist;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceClass {

    private final RepositoryEntity repository;

    public ServiceClass(RepositoryEntity repository) {
        this.repository = repository;
    }

    public ToDoEntity create(ToDoEntity toDoEntity) {
        return repository.save(toDoEntity);
    }

    public List<ToDoEntity> findAll() {
        return repository.findAll();
    }

    public ToDoEntity findById(Long id) {
        return repository.findById(id).get();
    }

    public void deleteById(Long id){
        if(!repository.findById(id).isPresent()){
            throw new EntityNotFoundException("Entity not found");
        }
        repository.deleteById(id);
    }

    public ToDoEntity updateById(Long id, ToDoEntity toDoEntity) {
        ToDoEntity updatedEntity = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        if(toDoEntity.getTitle() != null){
            updatedEntity.setTitle(toDoEntity.getTitle());
        }
        if(toDoEntity.getDescription() != null){
            updatedEntity.setDescription(toDoEntity.getDescription());
        }
        if(toDoEntity.getDeadline()!=null){
            updatedEntity.setDeadline(toDoEntity.getDeadline());
        }
        if(toDoEntity.getCompleted()!=null){
            updatedEntity.setCompleted(toDoEntity.getCompleted());
        }
        return repository.save(updatedEntity);
    }
}
