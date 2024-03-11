package org.noteapp.dao;

import org.noteapp.entitiy.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteBookDao extends JpaRepository<NoteBook, Long> {
}
