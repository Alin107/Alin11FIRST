package awad.alin11first.data.SubjectTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;
@Dao
public interface MySubjectQUERY {


        @Query("SELECT*FROM mysubject")
        List<MySubject> getAllSubject();
        @Insert
        void insert(MySubject...s);
        @Delete
        void deleteTask(MySubject...s);
        @Query("DELETE FROM MySubject WHERE key_id=:keyid")
        void delete(long keyid);
        @Query("DELETE FROM MySubject WHERE title=:sub" )
        MySubject checkSubject(String sub);


}
