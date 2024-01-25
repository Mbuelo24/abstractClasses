public abstract class Bank {
    int amount = 1000;
    final int rate = 100;
    static int loanrate = 50;
    public abstract void loan();
public void credit(){
    System.out.println("Bank---credit");
}

    public void debit(){
        System.out.println("Bank --- debit");
}
}

