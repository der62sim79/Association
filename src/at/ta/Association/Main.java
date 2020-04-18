package at.ta.Association;

public class Main {

    public static void main(String[] args) {


        President president = new President("Ali", "Ali", 40, "President",
                1997, "Rheinstraße", 200.0, 80);
        president.talkToClub("This weekend ist Meeting at 01:00pm.");
        //Mitgliedsbeitrag nach abzug der Positionsrabatt
        president.calculateMemberShipFee();

        //Vice ist eine Unterklasse als vertrettung
        VicePresident vicePresident = new VicePresident("Hans", "Lang", 30,
                "Vice President", 2010, "Seestrasse", 200.0, 70);
        vicePresident.talkToClub("We are the best Cycle Club.");
        vicePresident.calculateMemberShipFee();


        Cashier cashier = new Cashier("Franz", "Luk", 60, "Cashier", 1970,
                "Landweg", 200.0, 60);
        cashier.talkToClub("Dont forgot the membership fee for this month.");
        cashier.calculateMemberShipFee();

        Secretary secretary = new Secretary("Andi", "Blind", 40, "Secretary", 2000,
                "Inselweg", 200.0, 50);
        secretary.talkToClub("Our President is ill so this weekend will the Vice President hold a meeting");
        secretary.calculateMemberShipFee();

        Member member = new Member("Otto", "Sky", 20, "Member", 2020,
                "Uferweg", 200, 0.0);
        member.talkToClub("I am a idiot.");
        member.calculateMemberShipFee();


        //Motorrad Club
        MotorcycleClub motorcycleClub = new MotorcycleClub(1905, "Ali", "ABC", "Insel",
                10, 10000.0, "Motorcycle Club");

        //Mitglieder hinzufügen
        motorcycleClub.addClubMember(president);
        motorcycleClub.addClubMember(vicePresident);
        motorcycleClub.addClubMember(cashier);
        motorcycleClub.addClubMember(secretary);
        motorcycleClub.addClubMember(member);


        //Der Kassierer hat als einziger zugriff auf den Vereinskassa
        //Geld einzahlung durch Kassierer add-methode im Club-Class
        motorcycleClub.addCash(cashier, 480);
        motorcycleClub.printCash();

        //Geld abheben durch Kassierer get-methode im Club-Class
        motorcycleClub.getMoney(cashier, 100.0);
        motorcycleClub.printCash();

        //Ausdruck aller Mitglieder
        motorcycleClub.printAllMember();

        //Mitgliedbeiträge Gesamt und der Kassierer zahlt die Beiträge automatisch in die Clubkasse
        motorcycleClub.allMembershipFee();
        motorcycleClub.printCash();

    }
}
