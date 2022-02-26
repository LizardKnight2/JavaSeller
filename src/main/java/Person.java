public abstract class Person {
    private long cash;

    public String getSeller1() {
        return Seller1;
    }

    public void setSeller1(String seller1) {
        Seller1 = seller1;
    }

    public String getSellers2() {
        return Sellers2;
    }

    public void setSellers2(String sellers2) {
        Sellers2 = sellers2;
    }

    String Seller1 = "Vitaliy";
    String Sellers2 = "Aleksey";


    public long getCash() {
        return cash;
    }

    public void setCash(long cash) {
        this.cash = cash;
    }

    public void searchPerson() {

    }
}
