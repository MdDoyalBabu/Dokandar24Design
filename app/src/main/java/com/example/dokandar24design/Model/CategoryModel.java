package com.example.dokandar24design.Model;

import java.util.List;

public class CategoryModel {
    String categoryName;
    List<SubCategoryModel> subCategorys;

    public CategoryModel(String categoryName, List<SubCategoryModel> subCategorys) {
        this.categoryName = categoryName;
        this.subCategorys = subCategorys;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<SubCategoryModel> getSubCategorys() {
        return subCategorys;
    }
}
