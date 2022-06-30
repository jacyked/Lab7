/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dataaccess.UserDB;
import java.util.List;
import models.User;

/**
 *
 * @author Matt
 */
public class UserService {
    public User get(String email) throws Exception {
        UserDB userdb = new UserDB();
        User user = userdb.get(email);
        return user;
    }
    
    public List<User> getAll(String email) throws Exception {
        UserDB userdb = new UserDB();
        List<User> users = userdb.getAll();
        return users;
    }
    
    public void insert(String title, String contents, String owner) throws Exception {
        Note note = new Note(0, title, contents, owner);
        NoteDB noteDB = new NoteDB();
        noteDB.insert(note);
    }
    
    public void update(int noteId, String title, String contents, String owner) throws Exception {
        Note note = new Note(noteId, title, contents, owner);
        NoteDB noteDB = new NoteDB();
        noteDB.update(note);
    }
    
    public void delete(int noteId) throws Exception {
        Note note = new Note();
        note.setNoteId(noteId);
        NoteDB noteDB = new NoteDB();
        noteDB.delete(note);
    }
}
