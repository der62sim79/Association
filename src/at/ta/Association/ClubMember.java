package at.ta.Association;


public class ClubMember extends Person {
    private String position;
    private int memberSince;
    private String address;
    private double membershipFee;
    private double discount;

    public ClubMember(String firstName, String lastName, int age, String position, int memberSince, String address, double membershipFee, double discount) {
        super(firstName, lastName, age);
        this.position = position;
        this.memberSince = memberSince;
        this.address = address;
        this.membershipFee = membershipFee;
        this.discount = discount;
    }

    public String getPosition() {
        return position;
    }

    public double getMemberSince() {
        return memberSince;
    }

    public String getAddress() {
        return address;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    public void calculateMemberShipFee() {
        this.membershipFee = this.membershipFee * (100 - this.discount) / 100;
        System.out.println(this.getPosition() + " membership fee: " + String.format("%.2f", this.membershipFee));
        System.out.println();
    }

    public void talkToClub(String text) {
        System.out.println(getPosition() + " say: ");
        System.out.println(text);
        System.out.println();
    }

    @Override
    public void printPersonInfo() {
        super.printPersonInfo();
        System.out.println("Position: " + getPosition());
        System.out.println("Member since: " + getMemberSince());
        System.out.println("Address: " + getAddress());
        System.out.println("Membership fee: " + getMembershipFee());
    }

}
