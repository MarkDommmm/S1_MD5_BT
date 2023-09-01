package ra.Model.DTO;

import java.util.Date;

public class FeedbackDto {
    private Long id;
    private int rate;
    private String author;
    private String content;
    private Date creationDate = new Date(System.currentTimeMillis());
    private  int like;

    public FeedbackDto() {
    }

    public FeedbackDto(Long id, int rate, String author, String content, Date creationDate, int like) {
        this.id = id;
        this.rate = rate;
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;
        this.like = like;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
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

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }
}

