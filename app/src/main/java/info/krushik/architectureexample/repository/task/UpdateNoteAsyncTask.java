package info.krushik.architectureexample.repository.task;

import android.os.AsyncTask;

import info.krushik.architectureexample.data.Note;
import info.krushik.architectureexample.data.NoteDao;

public class UpdateNoteAsyncTask extends AsyncTask<Note, Void, Void> {
    private NoteDao noteDao;

    public UpdateNoteAsyncTask(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Note... notes) {
        noteDao.update(notes[0]);
        return null;
    }
}
