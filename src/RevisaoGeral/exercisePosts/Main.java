package RevisaoGeral.exercisePosts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
    public static void main(String[] args) {

        Potst post1 = new Potst("Traveling to new Zealand", "Im going to visit this wonderful country!", new Date(), 12);

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome");

        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);

    }
}
