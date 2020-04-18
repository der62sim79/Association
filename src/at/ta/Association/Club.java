package at.ta.Association;

public class Club {
    private int foundingYear;
    private String founder;
    private String associationName;
    private String address;
    double cash;

    public Club(int foundingYear, String founder, String associationName, String address, double cash) {
        this.foundingYear = foundingYear;
        this.founder = founder;
        this.associationName = associationName;
        this.address = address;
        this.cash = cash;
    }

    public int getFoundingYear() {
        return foundingYear;
    }

    public String getFounder() {
        return founder;
    }

    public String getAssociationName() {
        return associationName;
    }

    public String getAddress() {
        return address;
    }

    //methode geld rausnahme Kasse durch Kassierer
    public void getMoney(Cashier cashier, double money) {
        this.cash -= money;
        System.out.println("The Cashier get " + money + " € in the Cash");
    }

    //methode einzahlung Kassierer in Clubkassa
    public void addCash(Cashier cashier, double money) {
        this.cash += money;
        System.out.println("The Cashier add " + money + " € in the Cash.");
    }


    public void printClubInfo() {
        System.out.println("Association Name: " + getAssociationName());
        System.out.println("Association Founder: " + getFounder());
        System.out.println("Association Founding Year: " + getFoundingYear());
        System.out.println("Association Address: " + getAddress());
    }
}
