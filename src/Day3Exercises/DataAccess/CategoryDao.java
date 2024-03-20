package Day3Exercises.DataAccess;

import Day3Exercises.Entities.Category;

public interface CategoryDao {
    void add(Category category);
    void getCategory(Category category);
}
