package example.org.test.week03day03sol;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import static example.org.test.week03day03sol.AnimalDatabaseContract.COLUMN_IMAGE;
import static example.org.test.week03day03sol.AnimalDatabaseContract.COLUMN_NAME;
import static example.org.test.week03day03sol.AnimalDatabaseContract.COLUMN_SOUND;
import static example.org.test.week03day03sol.AnimalDatabaseContract.COLUMN_TYPE;
import static example.org.test.week03day03sol.AnimalDatabaseContract.DATABASE_NAME;
import static example.org.test.week03day03sol.AnimalDatabaseContract.DATABASE_VERSION;
import static example.org.test.week03day03sol.AnimalDatabaseContract.TABLE_NAME;

public class AnimalDatabaseHelper extends SQLiteOpenHelper {

    public AnimalDatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(AnimalDatabaseContract.createQuery());

    }

    @Override
    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
    onCreate(database);
    }
    public long insertAnimalIntoDatabase(@NonNull Animal animal) {
        SQLiteDatabase writeableDatabase = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(COLUMN_TYPE, animal.getAnimalType());
        contentValues.put(COLUMN_NAME, animal.getAnimalName());
        contentValues.put(COLUMN_SOUND, animal.getAnimalSound());
        contentValues.put(COLUMN_IMAGE, animal.getAnimalImage());


        return writeableDatabase.insert(TABLE_NAME, null, contentValues);
    }
}
