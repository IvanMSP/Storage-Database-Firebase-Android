package com.example.bawbam.simpleblog;

/**
 * Created by Bawbam on 05/04/2017.
 */

public class Blog {

    private String title;
    private String desc;
    private String image;

    public Blog(){

    }


    public Blog(String title, String desc, String image) {
        this.title = title;
        this.desc = desc;
        this.image = image;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}
