package org.example.noteappapi.service;

import org.example.noteappapi.model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.noteappapi.repository.NoteRepository;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }

    public Note saveNote(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(Long id) {
        noteRepository.deleteById(id);
    }

    public Note updateNote(Long id, Note note) {
        Note existingNote = noteRepository.findById(id).orElse(null);
        if (existingNote != null) {
            existingNote.setTitle(note.getTitle());
            existingNote.setContent(note.getContent());
            return noteRepository.save(existingNote);
        }
        return null;
    }
}
