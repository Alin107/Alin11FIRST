package awad.alin11first.data;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import awad.alin11first.data.MyTaskTable.MyTask;
import awad.alin11first.data.MyTaskTable.MyTaskQurey;
import awad.alin11first.data.MyUserTable.MyUser;
import awad.alin11first.data.MyUserTable.MyUserQuery;
import awad.alin11first.data.SubjectTable.MySubject;
import awad.alin11first.data.SubjectTable.MySubjectQUERY;

@Database(entities = {MyUser.class, MySubject.class, MyTask.class},version=1)


public abstract class  AppDatabase extends RoomDatabase{
    private static AppDatabase db;


    public abstract MyUserQuery getMyUserQuery();
    public abstract MySubjectQUERY getMySubjectQuery();
    public abstract MyTaskQurey getMyTaskQuery();

public static  AppDatabase getDB(Context context){
    if (db==null)
    {

        db= Room.databaseBuilder(context,AppDatabase.class,  "AlinDataBase")
                .fallbackToDestructiveMigration()
                .allowMainThreadQueries()
                .build();
     }
return db;

}

}

