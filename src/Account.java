class Account{
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }
    public int GetBalance(){
        return this.balance;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}