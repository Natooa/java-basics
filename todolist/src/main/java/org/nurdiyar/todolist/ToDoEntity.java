package org.nurdiyar.todolist;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column(name = "id")
    private Long Id;

    @Column(name = "title",length = 100)
    private String Title;

    @Column(name = "description")
    private String Description;

    @Column(name = "deadline")
    private String Deadline;

    @Column(name = "completed")
    private Boolean Completed;
}
