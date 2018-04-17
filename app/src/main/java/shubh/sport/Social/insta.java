package shubh.sport.Social;

public class insta {
   private String title,image,username,likebtn,value,likecount,branch,event;
   private int likeco;

    public insta(){

    }

    public insta(String title, String image, String username, String likebtn, String value, String likecount, String branch, String event, int likeco){
        this.title=title;
        this.image=image;
        this.username=username;
        this.likebtn=likebtn;
        this.value=value;
        this.likeco=likeco;
        this.likecount=likecount;
        this.branch=branch;
        this.event=event;

    }
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }
    public void setBranch(String branch){this.branch=branch;}

    public void setLikecount(String likecount) {
        this.likecount = likecount;
    }
    public String getBranch(){return branch;}

    public String getLikecount() {
        return likecount;
    }
   public int getLikeco(){return likeco;}
   public void setLikeco(int likeco){this.likeco=likeco;}


    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLikebtn(String likebtn) {
        this.likebtn = likebtn;
    }

    public String getLikebtn() {
        return likebtn;
    }
}
