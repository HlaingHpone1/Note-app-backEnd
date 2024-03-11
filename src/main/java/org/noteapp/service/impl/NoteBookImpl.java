package org.noteapp.service.impl;

import lombok.AllArgsConstructor;
import org.noteapp.dao.NoteDao;
import org.noteapp.entitiy.Note;
import org.noteapp.service.NoteService;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NoteBookImpl implements NoteService {

    private final NoteDao noteDao;
}
