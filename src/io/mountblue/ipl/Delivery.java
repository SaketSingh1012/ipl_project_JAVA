package io.mountblue.ipl;
public class Delivery {

    private String extraRuns;
    private String bowlingTeam;
    private String battingTeam;
    private String id;
    private String bowler;
    private String batsman;
    private String totalRuns;
    private String batsmanRuns;
    private String nonStriker;
    private String playerDismissed ;
    private String dismissalKind;
    private String over;

    public String getBattingTeam() {
        return battingTeam;
    }

    public void setBattingTeam(String battingTeam) {
        this.battingTeam = battingTeam;
    }

    public String getDismissalKind() {
        return dismissalKind;
    }

    public void setDismissalKind(String dismissalKind) {
        this.dismissalKind = dismissalKind;
    }

    public String getPlayerDismissed() {
        return playerDismissed;
    }

    public void setPlayerDismissed(String playerDismissed) {
        this.playerDismissed = playerDismissed;
    }

    public String getOver() {
        return over;
    }

    public void setOver(String over) {
        this.over = over;
    }

    public String getNonStriker() {
        return nonStriker;
    }

    public void setNonStriker(String nonStriker) {
        this.nonStriker = nonStriker;
    }

    public String getBatsman() {
        return batsman;
    }

    public void setBatsman(String batsman) {
        this.batsman = batsman;
    }

    public String getBatsmanRuns() {
        return batsmanRuns;
    }

    public void setBatsmanRuns(String batsmanRuns) {
        this.batsmanRuns = batsmanRuns;
    }

    public String getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(String totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getBowler() {
        return bowler;
    }

    public void setBowler(String bowler) {this.bowler = bowler;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExtraRuns() {
        return extraRuns;
    }

    public void setExtraRuns(String extraRuns) {
        this.extraRuns = extraRuns;
    }

    public String getBowlingTeam() {
        return bowlingTeam;
    }

    public void setBowlingTeam(String bowlingTeam) {
        this.bowlingTeam = bowlingTeam;
    }
}
