package model;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private String name;
    private int tokens;
    private int badges;
    private int rank;

    public Game(String name, int tokens, int badges, int rank) {
        this.name = name;
        this.tokens=tokens;
        this.badges =badges;
        this.rank=rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void addTokensBadgesRank(int T, int B, int R){
        if(T!=0)
            this.tokens=this.tokens+T;
        if(B!=0)
            this.badges=this.badges+B;
        if(R!=0)
            this.rank=this.rank+R;
    }


}
