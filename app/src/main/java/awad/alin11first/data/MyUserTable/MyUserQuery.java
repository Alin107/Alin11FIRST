package awad.alin11first.data.MyUserTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao

public interface MyUserQuery {

   @Query("SELECT*FROM MyUser" )
    List<MyUser>getAll();



    @Query("SELECT*FROM MyUser WHERE email = :myEmail AND passw = :mypassw =:mypassw LIMIT1")
MyUser checkEmail(String myEmail, String mypassw);

    @Query("SELECT*FROM MyUser WHERE email = :myEmail:LIMIT1")
    MyUser checkEmail(String myEmail);
    @Insert

    void inserAll(MyUser user);
    @Delete

    @Query("Delete From MyUser WHERE keyid=:id")
void delete (int id);

    @Insert
    Void insert(MyUser myuser);

    @Update
    void update(MyUser...values);
}
