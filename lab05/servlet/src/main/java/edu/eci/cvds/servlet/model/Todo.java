package edu.eci.cvds.servlet.model;;
public class Todo{
    private int userId;
    private int id;
    private String title;
    private boolean Completed;

    public Todo(){
    }
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    public int getId(){
        return id;
    }
    public void setId(int Id){
        this.id = Id;
    }
    public String getTitle(){
        return title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public boolean getCompleted(){
        return Completed;
    }
    public void setCompleted(boolean Completed){
        this.Completed = Completed;
    }
}