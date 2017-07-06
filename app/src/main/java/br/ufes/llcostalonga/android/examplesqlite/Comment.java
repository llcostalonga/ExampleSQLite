package br.ufes.llcostalonga.android.examplesqlite;

/**
 * Created by LeandroHD on 29/06/17.
 * This class is our model and contains the data we will save in
 * the database and show in the user interface.
 *
 */
public class Comment {
    private long id;
    private String comment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return comment;
    }
}