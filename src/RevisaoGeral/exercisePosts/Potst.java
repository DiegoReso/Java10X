package RevisaoGeral.exercisePosts;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Potst {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private String title;
    private String content;
    private Integer likes;
    private List<Comment> comments = new ArrayList<>();

    public Potst() {
    }

    public Potst(String title, String content, Date moment, Integer likes) {
        this.title = title;
        this.content = content;
        this.moment = moment;
        this.likes = likes;
    }

    void getComment(){
        for (Comment comment : comments){
            System.out.println(comment);
        }
    }

    void addComment(Comment comment){
        comments.add(comment);
    }

    public String getMoment() {
        return sdf.format(moment);
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title + "\n");
        sb.append(likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(moment) + "\n");
        sb.append(content + "\n");
        for (Comment comment : comments){
            sb.append(comment.getText() + "\n");
        }

        return sb.toString();
    }

}
