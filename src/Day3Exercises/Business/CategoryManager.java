package Day3Exercises.Business;

import Day3Exercises.Core.Logging.Logger;
import Day3Exercises.DataAccess.CategoryDao;
import Day3Exercises.Entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private CategoryDao categoryDao;
    private Logger[] loggers;

    private List<Category> categories = new ArrayList<>();


    public CategoryManager(CategoryDao categoryDao, Logger[] loggers){
        this.categoryDao=categoryDao;
        this.loggers=loggers;
    }
    public boolean checkCategories(Category category){
        for (int i = 0; i < categories.size(); i++) {
            if(categories.get(i).getName()==category.getName()){
                return true;
            }

        }
        return false;
    }
    public void add(Category category) throws Exception {

        if(checkCategories(category)){
            throw new Exception("Kategori ismi tekrar edemez!!!");
        }

        categoryDao.add(category);
        categories.add(category);
        for (Logger logger : loggers){
            logger.log(category.getName());
        }



    }


}
