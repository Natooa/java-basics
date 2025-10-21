package org.nurdiyar.todolist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todolist")
public class ControllerEntity {
    private final ServiceClass service;

    public ControllerEntity(ServiceClass service) {
        this.service = service;
    }

    @PostMapping("/create")
    public ResponseEntity<ToDoEntity> create(@RequestBody ToDoEntity toDoEntity) {
        return ResponseEntity.ok(service.create(toDoEntity));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ToDoEntity> getById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ToDoEntity>> getAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ToDoEntity> updateById(@PathVariable Long id,
                                                 @RequestBody ToDoEntity toDoEntity) {
        return ResponseEntity.ok(service.updateById(id, toDoEntity));
    }
}
