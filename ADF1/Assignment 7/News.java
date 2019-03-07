import java.util.ArrayList;

public class News implements INews {
    int id;
    String title;
    String publishDate;
    String author;
    String content;
    float averageRate = 0;
    int[] rateList = new int[3];

    public News(String title, String publishDate, String author, String content) {
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    public int[] getRateList() {
        return rateList;
    }

    @Override
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("PublishDate: " + publishDate);
        System.out.println("Author: " + author);
        System.out.println("Content: " + content);
        System.out.println("AverageRate: " + averageRate);
    }

    public void calculate() {
        averageRate = 0;
        for (int i = 0; i < rateList.length; i++) {
            averageRate += rateList[i];
        }
        averageRate = averageRate / 3;
    }
}
