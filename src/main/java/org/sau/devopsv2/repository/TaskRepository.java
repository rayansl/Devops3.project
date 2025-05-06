package org.sau.devopsv2.repository;

import org.sau.devopsv2.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByNameContaining(String name);
    Task findByName(String name);
}
