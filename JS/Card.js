class Card extends Payment{

    constructor(cardNumber, cardHolder, dateExp, ccv){
        this.cardNumber = cardNumber;
        this.cardHolder= cardHolder;
        this.dateExp = dateExp;
        this.ccv = ccv;
    }
}