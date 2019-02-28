package example.org.test.week03day03sol;

import android.util.Log;

public class AnimalDatabaseContract {
    public static final String DATABASE_NAME = "animal_db";
    public static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "Animals";

    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_SOUND = "sound";
    public static final String COLUMN_IMAGE = "image";
    public static final String COLUMN_ID = "id";

    public static String createQuery() {
        StringBuilder queryBuilder = new StringBuilder();
        queryBuilder.append("CREATE TABLE ");
        queryBuilder.append(TABLE_NAME);
        queryBuilder.append(" ( ");
        queryBuilder.append(COLUMN_ID);
        queryBuilder.append(" ");
        queryBuilder.append(" INTEGER PRIMARY KEY AUTOINCREMENT, ");
        queryBuilder.append(COLUMN_TYPE);
        queryBuilder.append(" TEXT, ");
        queryBuilder.append(COLUMN_NAME);
        queryBuilder.append(" TEXT, ");
        queryBuilder.append(COLUMN_SOUND);
        queryBuilder.append(" TEXT, ");
        queryBuilder.append(COLUMN_IMAGE);
        queryBuilder.append(" TEXT, ");


        Log.d("TAG", "createQuery: " + queryBuilder.toString());

        return queryBuilder.toString();
    }
    public static String getAllAnimalsQuery() {
        return "SELECT * FROM " + TABLE_NAME;
    }

}
