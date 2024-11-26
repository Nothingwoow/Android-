package com.example.android.notepad;

import android.database.Cursor;
import android.database.CursorWrapper;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimestampCursorWrapper extends CursorWrapper {

    public TimestampCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    @Override
    public String getString(int columnIndex) {
        String columnName = getColumnName(columnIndex);
        if (columnName.equals(NotePad.Notes.COLUMN_NAME_CREATE_DATE) ||
                columnName.equals(NotePad.Notes.COLUMN_NAME_MODIFICATION_DATE)) {
            long timestamp = super.getLong(columnIndex);
            // Convert timestamp to readable string format
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(timestamp));
        }
        return super.getString(columnIndex);
    }
}

