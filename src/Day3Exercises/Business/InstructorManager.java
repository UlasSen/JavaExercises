package Day3Exercises.Business;

import Day3Exercises.Core.Logging.Logger;
import Day3Exercises.DataAccess.InstructorDao;
import Day3Exercises.Entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;
    private List<Instructor> instructors=new ArrayList<>();

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){
        instructorDao.add(instructor);
        instructors.add(instructor);

        for(Logger logger:loggers){

            logger.log(instructor.getName());
        }
    }


}
