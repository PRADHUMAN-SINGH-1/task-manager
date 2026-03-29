package com.pradhuman.taskmanager.repository;

import com.pradhuman.taskmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}