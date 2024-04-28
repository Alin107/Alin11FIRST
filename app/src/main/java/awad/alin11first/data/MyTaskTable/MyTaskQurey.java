package awad.alin11first.data.MyTaskTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface MyTaskQurey {
    @Query("SELECT*FROM MyTask ORDER BY importance DESC")
    List<MyTask> getAllTasks();

    @Query("SELECT*FROM MyTask WHERE userld=: userid_p" + "ORDER BY time DESC")
    List<MyTask> getAllTaskOrderBy(long userid_p);

    @Query(" SELECT * FROM MyTask WHERE userld=:userid_p AND isCompleted=:isCompleted_p ORDER BY importance DESC")
    List<MyTask> getAllTaskOrederBy(long userid_p, boolean isCompleted_p);

    @Insert
    void insertTask(MyTask... t);

    @Delete
    void deleteTask(MyTask... tasks);

    @Query("DELETE FROM MyTask WHERE keyld=:kid")
    void deleteTask(long kid);

    @Query("SELECT *FROM MyTask WHERE subjld=:key_id ORDER BY importance DESC")
    List<MyTask> getTasksBySubjld(long key_id);

}