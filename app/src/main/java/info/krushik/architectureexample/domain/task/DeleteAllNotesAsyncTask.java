package info.krushik.architectureexample.domain.task;

import android.os.AsyncTask;

import info.krushik.architectureexample.data.NoteDao;

public class DeleteAllNotesAsyncTask extends AsyncTask<Void, Void, Void> {
    private NoteDao noteDao;

    public DeleteAllNotesAsyncTask(NoteDao noteDao) {
        this.noteDao = noteDao;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        noteDao.deleteAllNotes();
        return null;
    }
}
