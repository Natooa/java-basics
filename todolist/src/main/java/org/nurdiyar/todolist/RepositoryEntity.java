package org.nurdiyar.todolist;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryEntity extends JpaRepository<ToDoEntity, Long> {

}
