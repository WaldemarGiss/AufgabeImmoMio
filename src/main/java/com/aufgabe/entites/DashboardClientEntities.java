package com.aufgabe.entites;

public class DashboardClientEntities {
    private String id;
    private String secret;
    private String redirect_uri;

    public DashboardClientEntities(String id, String secret, String redirect_uri) {
        this.id = id;
        this.secret = secret;
        this.redirect_uri = redirect_uri;
    }

    @Override
    public String toString() {
        return "DashboardClientEntitites{" +
                "id='" + id + '\'' +
                ", secret='" + secret + '\'' +
                ", redirect_uri='" + redirect_uri + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }
}
