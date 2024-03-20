package Day3Exercises.DataAccess;

import Day3Exercises.Entities.Courses;

public interface CourseDao {
    void add(Courses courses);
    void getCourses(Courses courses);
}
