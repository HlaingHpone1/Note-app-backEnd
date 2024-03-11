package org.noteapp.service.impl;

import lombok.AllArgsConstructor;
import org.noteapp.dao.NoteBookDao;
import org.noteapp.service.NoteBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NoteBookServiceImpl implements NoteBookService {

    @Autowired
    private final NoteBookDao noteBookDao;

}
