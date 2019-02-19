package info.krushik.architectureexample.repository.task;

import android.os.AsyncTask;

import info.krushik.architectureexample.data.Note;
import info.krushik.architectureexample.data.NoteDao;

public class DeleteNoteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao noteDao;

    public DeleteNoteAsyncTask(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        noteDao.delete(notes[0]);
        return null;
    }
}