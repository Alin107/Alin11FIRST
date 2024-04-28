package awad.alin11first.data.SubjectTable;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Entity;
import androidx.room.Insert;
import androidx.room.PrimaryKey;
import androidx.room.Query;

import java.util.List;

@Entity
public class MySubject {
    @PrimaryKey(autoGenerate = true)
    public long key_id;
    public String title;
}
