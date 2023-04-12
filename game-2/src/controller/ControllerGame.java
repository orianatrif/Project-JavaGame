package controller;

import model.Game;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerGame {

    private final Game game;
    private final MainView viewMain;
    private final ViewG1 view1;
    private final ViewG2 view2;


    public ControllerGame(Game game, MainView viewMain, ViewG1 view1, ViewG2 view2) {
        this.viewMain = viewMain;
        this.view1 = view1;
        this.view2 = view2;

        this.game = game;

        this.viewMain.addFromMainToG1(new FromMainToG1());
        this.view1.addG1toMain(new FromG1ToMain());
        this.viewMain.addFromMainToG2(new FromMainToG2());
        this.view2.addG2toMain(new FromG2ToMain());


        this.game.addTokensBadgesRank(0, 0, 1);
        this.viewMain.setTextTokens(this.game.getTokens());
        this.viewMain.setTextBadges(this.game.getBadges());
        this.viewMain.setTextRank(this.game.getRank());

        this.view1.addcheckG1(new CheckResults());
        this.view2.addcheckG2(new CheckResults2());

    }

    class FromMainToG1 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            viewMain.dispose();
            view1.setVisible(true);
        }
    }

    class FromG1ToMain implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           // game.addTokensBadgesRank(1, 2, 5);
            viewMain.setTextTokens(game.getTokens());
            viewMain.setTextBadges(game.getBadges());
            viewMain.setTextRank(game.getRank());

            view1.dispose();
            if(game.getTokens()>=3 && game.getRank()==1) {
                view1.showValidationMessage("Congrats\n You have rank 2\n Now check Game 2");
                game.addTokensBadgesRank(0, 0, 1);
                 viewMain.setTextRank(game.getRank());
            }
            viewMain.setVisible(true);

        }
    }

     class CheckResults implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int res1 = 0;
            int res2 = 0;
            int res3 = 0;
            if(view1.getTextR1()==10 && view1.getTextR2()==13)
            {
                res1=1;

            }

            if(view1.getTextR21().equals("I") && view1.getTextR22().equals("S") && view1.getTextR22().equals("S"))
            {
                res2=1;
            }
            if(view1.getTextR3()==162 )
            {
                res3=1;
            }
            int sum = res1+res2+res3;
            if(sum==3) {
                view1.showValidationMessage("Correct input!\n You recieved 3 tokens");
                game.addTokensBadgesRank(3,0,0);
            }
            else if(sum==2) {
                view1.showValidationMessage("Only 2 correct inputs!\n You recieved 2 tokens");
                game.addTokensBadgesRank(2,0,0);
            }
            else if(sum==1) {
                view1.showValidationMessage("Only 1 correct input!\n You recieved 1 token");
                game.addTokensBadgesRank(1,0,0);

            }
            else
                view1.showValidationMessage("Wrong answer");
        }
    }

     class CheckResults2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int res1 = 0;
            int res2 = 0;
            int res3 = 0;
            System.out.println("primul este " + view2.getTextR21());
            System.out.println("doi este " + view2.getTextR22());
            System.out.println("trei este " + view2.getTextR23());
            System.out.println("4 este " + view2.getTextR3());

            if(view2.getTextR1()==26 && view2.getTextR2()==24)
            {
                res1=1;
            }

            if(view2.getTextR21().equals("H") && view2.getTextR22().equals("G") && view2.getTextR23().equals("F"))
            {
                res2=1;

            }
            if(view2.getTextR3()==78 )
            {

                res3=1;
            }
            System.out.println("res 1 "+ res1);
            System.out.println("res 2 "+ res2);
            System.out.println("res 3 "+ res3);
            int sum = res1+res2+res3;
            if(sum==3) {
                view2.showValidationMessage("Correct input!\n You recieved 3 tokens");
                game.addTokensBadgesRank(3,0,0);
            }
            else if(sum==2) {
                view2.showValidationMessage("Only 2 correct inputs!\n You recieved 2 tokens");
                game.addTokensBadgesRank(2,0,0);
            }
            else if(sum==1) {
                view2.showValidationMessage("Only 1 correct input!\n You recieved 1 token");
                game.addTokensBadgesRank(1,0,0);

            }
            else
                view2.showValidationMessage("Wrong answer");
        }
    }

    class FromMainToG2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if(game.getRank()==2) {
                viewMain.dispose();
                view2.setVisible(true);
            }
            else
            {
                viewMain.showErrorRank("You should have rank 2 to enter this game");
            }
        }
    }

    class FromG2ToMain implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
           // game.addTokensBadgesRank(1, 2, 5);
            viewMain.setTextTokens(game.getTokens());
            viewMain.setTextBadges(game.getBadges());
            viewMain.setTextRank(game.getRank());

            view2.dispose();
            if(game.getTokens()>=6 && game.getRank()==2) {
                view1.showValidationMessage("Congrats\n You have rank 3\n and your first badge");
                game.addTokensBadgesRank(0, 0, 1);
                game.addTokensBadgesRank(0, 1, 0);
                 viewMain.setTextRank(game.getRank());
                 viewMain.setTextBadges(game.getBadges());
            }
            viewMain.setVisible(true);

        }
    }



}




