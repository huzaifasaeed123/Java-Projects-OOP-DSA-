/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaccount;

/**
 *
 * @author fa21-bcs-020
 */
public class AtmCard {
    private String ATM_CARD_NO;
    private Date doi,doe;

    public AtmCard(String ATM_CARD_NO, Date doi, Date doe) {
        this.ATM_CARD_NO = ATM_CARD_NO;
        this.doi = doi;
        this.doe = doe;
    }

    
    public String getATM_CARD_NO() {
        return ATM_CARD_NO;
    }

    public void setATM_CARD_NO(String ATM_CARD_NO) {
        this.ATM_CARD_NO = ATM_CARD_NO;
    }

    public Date getDoi() {
        return doi;
    }

    public void setDoi(Date doi) {
        this.doi = doi;
    }

    public Date getDoe() {
        return doe;
    }

    public void setDoe(Date doe) {
        this.doe = doe;
    }
    @Override
    public String toString()
    {
        return String.format("ATM Card No:%s\nDate Of Issue:%s\nDate of Expiray:%s", this.ATM_CARD_NO,this.doi.toString(),this.doe.toString());
    }
    
}
