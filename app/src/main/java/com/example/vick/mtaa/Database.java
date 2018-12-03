package com.example.vick.mtaa;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class Database extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Mtaa";
    private static final String TABLE_USERS = "users";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_EMAIL = "email";
    private static final String KEY_PHONE = "phone_number";
    //private static final String KEY_PASSWORD = "password";
    //private static final String KEY_CONFIRM_PASS = "confirm_pass";

    Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CONTACTS_QUERY = "CREATE TABLE  " + TABLE_USERS + "(" + KEY_ID + " VARCHAR PRIMARY KEY," + KEY_NAME + " TEXT," + KEY_EMAIL + " TEXT," + KEY_PHONE + " TEXT" + ")";

        db.execSQL(CREATE_CONTACTS_QUERY);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
        onCreate(db);
    }

    void addUser(Users user) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_ID, user.getId_number());
        values.put(KEY_NAME, user.getUsername());
        values.put(KEY_EMAIL, user.getEmail());
        values.put(KEY_PHONE, user.getPhone_number());
        // values.put(KEY_PASSWORD,user.getPassword());
        //values.put(KEY_CONFIRM_PASS,user.getConfirm_pass());

        db.insert(TABLE_USERS, null, values);
        db.close();
    }


}
