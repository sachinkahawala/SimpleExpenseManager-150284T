package lk.ac.mrt.cse.dbs.simpleexpensemanager.data.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by dilan on 14/11/17.
 */

public class accData extends SQLiteOpenHelper {

    public accData(Context context){
        super(context, "150138C.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //Create the tables and their entries
        sqLiteDatabase.execSQL("CREATE TABLE Accounts (" +
                "accountNo TEXT PRIMARY KEY, " +
                "bankName TEXT, " +
                "accountHolderName TEXT, " +
                "balance REAL)");

        sqLiteDatabase.execSQL("CREATE TABLE Transactions (" +
                "date TEXT, " +
                "accountNo TEXT, " +
                "expenceType TEXT, " +
                "amount REAL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        return;
    }
}
