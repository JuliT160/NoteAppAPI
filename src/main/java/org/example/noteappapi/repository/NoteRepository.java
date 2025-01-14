package org.example.noteappapi.repository;

import org.example.noteappapi.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NoteRepository extends JpaRepository<Note, Long> {

}
