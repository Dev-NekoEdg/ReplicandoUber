class Card extends Payment {
    
    String cardNumber;
    String cardHolder;
    String dateExp;
    String ccv;

    public Card(String cardNumber, String cardHolder, String dateExp, String ccv){
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.dateExp = dateExp;
        this.ccv = ccv;
    }
}