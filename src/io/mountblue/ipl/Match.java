package io.mountblue.ipl;

public class Match {
    private String id;
    private String season;
    private String winner;

    private String venue = null;

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getId() {
        return id;
    }

    public String getWinner() {
        return winner;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }


}
