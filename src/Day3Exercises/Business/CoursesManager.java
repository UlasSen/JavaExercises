package Day3Exercises.Business;

import Day3Exercises.Core.Logging.Logger;
import Day3Exercises.DataAccess.CourseDao;
import Day3Exercises.Entities.Courses;

import java.util.ArrayList;
import java.util.List;

public class CoursesManager {
    private CourseDao courseDao;
    private Logger[] loggers;
    private List<Courses> courses2=new ArrayList<>();

    public CoursesManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public boolean checkCourses(Courses courses) throws Exception {
        for (int i = 0; i <courses2.size(); i++) {
            if(courses2.get(i).equals(courses)){
            return true;
            }

        }
        return false;
    }
    public void add(Courses courses) throws Exception {
        if(checkCourses(courses)){
            throw new Exception("Kurs ismi tekrar edemez");
        }
        if (courses.getUnitPrice()<0){
            throw new Exception("Bir kursun fiyatı 0 dan küçük olamaz!!!");
        }
        courseDao.add(courses);
        courses2.add(courses);
        for (Logger logger : loggers){
            logger.log(courses.getName());
        }
    }
}
