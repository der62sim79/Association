package at.ta.Association;

import java.util.ArrayList;
import java.util.List;

public class MotorcycleClub extends Club {
    private int chapters;
    private String whichAssociation;
    private List<ClubMember> clubMembers;

    public MotorcycleClub(int foundingYear, String founder, String associationName, String address, int chapters,
                          double cash, String whichAssociation) {
        super(foundingYear, founder, associationName, address, cash);
        this.chapters = chapters;
        this.whichAssociation = whichAssociation;
        this.clubMembers = new ArrayList<>();
    }

    public int getChapters() {
        return chapters;
    }

    public String getWhichAssociation() {
        return whichAssociation;
    }

    public void addClubMember(ClubMember clubMember) {
        this.clubMembers.add(clubMember);
    }

    public void printAllMember() {
        System.out.println("****All Member****");
        for (ClubMember clubMember : this.clubMembers) {
            System.out.println();
            clubMember.printPersonInfo();
        }
        System.out.println();
        System.out.println("****END****");
    }

    /*Mitgliedsbeiträge alle zusammen, sowie erlaubnis dass der Kassierer zugriff hat und die Beiträge
     * gleich überweist. Fehlt der Cashier in der Liste wird der Beittrag nicht automatisch in den Clubkasse eingezahlt.*/
    public void allMembershipFee() {
        double allMembershipFee = 0.0;
        //ist der Kassierer nicht aufgelistet nur zusammen zählen der Beiträge
        Cashier cashier = null;
        for (ClubMember clubMember : this.clubMembers) {
            allMembershipFee = allMembershipFee + clubMember.getMembershipFee();

            if (clubMember instanceof Cashier) {
                cashier = (Cashier) clubMember;
            }
        }
        // ist der Kassierer aufgelistet auch gleich die überweisung
        if (cashier != null) {
            addCash(cashier, allMembershipFee);
        }
        System.out.println();
        System.out.println("For this month the Club get: " + allMembershipFee + " €.");
    }

    public void printCash() {
        System.out.println();
        System.out.println("Actually in the Cash are €: " + this.cash);
        System.out.println();
    }

    @Override
    public void printClubInfo() {
        super.printClubInfo();
        System.out.println("Which art of Association: " + getWhichAssociation());
        System.out.println("Chapter amount: " + getChapters());
    }
}
