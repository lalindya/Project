package com.test.inova.fashion.pojo;

/**
 * Created by INOVA on 8/14/2017.
 */

public class ListPojo {
    private String imageUrl;
    private String category_name;
    private String image;
    private String like;
    private String dislike;
    private  String price;

    public String getImage() {return image;}

    public void setImage(String image) {this.image = image;}

//        public ListPojo(String imageUrl, String caterory_name){
//        this.imageUrl = imageUrl;
//        this.category_name = caterory_name;
//
//    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getDislike() {
        return dislike;
    }

    public void setDislike(String dislike) {
        this.dislike = dislike;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCategory_name() {
        return category_name;
    }

    public void setCategory_name(String category_name) {
        this.category_name = category_name;
    }



}
