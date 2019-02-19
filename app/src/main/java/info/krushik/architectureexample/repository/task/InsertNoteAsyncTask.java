package info.krushik.architectureexample.repository.task;

import android.os.AsyncTask;

import info.krushik.architectureexample.data.Note;
import info.krushik.architectureexample.data.NoteDao;

public class InsertNoteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao noteDao;

    public InsertNoteAsyncTask(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        noteDao.insert(notes[0]);
        return null;
    }
}
