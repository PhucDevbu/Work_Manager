package com.example.workmanager.listeners;

import com.example.workmanager.entities.Note;

public interface NotesListener  {
    void onNoteClicked(Note note, int position);
}
