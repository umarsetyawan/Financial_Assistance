package com.example.financialassistance;

public class Model {

    private String Title, Description;
    private int Importance;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImportance() {
        return Importance;
    }

    public void setImportance(int importance) {
        Importance = importance;
    }
}
