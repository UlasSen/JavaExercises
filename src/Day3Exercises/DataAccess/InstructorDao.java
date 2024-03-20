package Day3Exercises.DataAccess;

import Day3Exercises.Entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);
    void getInstructors(Instructor instructor);
}
