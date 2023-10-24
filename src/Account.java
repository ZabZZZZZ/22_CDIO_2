class Account{
    private int balance;

    public Account(int balance){
        this.balance = balance;
    }
    public int GetBalance(){
        return this.balance;
    }

    public void withdraw(int amount) {
        this.balance -= Math.abs(amount);

        if (this.balance < 0)
        this.balance = 0;
    }

    public void deposit(int amount) {
        this.balance += amount;
    }
}