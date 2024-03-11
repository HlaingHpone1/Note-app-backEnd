package org.noteapp.dao;

import org.noteapp.entitiy.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends JpaRepository<Note, Long> {
}
