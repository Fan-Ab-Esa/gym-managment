package org.callback.gymmanagment;

public class SingleSport {
    private String name, shortDescription,imgUrl;

    public SingleSport(String name, String shortDescription, String imgUrl) {
        this.name = name;
        this.shortDescription = shortDescription;
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
