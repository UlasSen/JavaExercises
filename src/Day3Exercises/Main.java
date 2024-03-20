package Day3Exercises;

import Day3Exercises.Business.CategoryManager;
import Day3Exercises.Core.Logging.DatabaseLogger;
import Day3Exercises.Core.Logging.FileLogger;
import Day3Exercises.Core.Logging.Logger;
import Day3Exercises.Core.Logging.MailLogger;
import Day3Exercises.DataAccess.CategoryDao;
import Day3Exercises.DataAccess.HibernateDao;
import Day3Exercises.DataAccess.JdbcDao;
import Day3Exercises.Entities.Category;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category1=new Category("Yazılım",1);
        Category category2=new Category("Alışveriş",2);
        Logger[] loggers={new DatabaseLogger(),new FileLogger()};

        CategoryManager categoryManager=new CategoryManager(new HibernateDao(),loggers);

        categoryManager.add(category1);
        categoryManager.add(category2);

    }
}