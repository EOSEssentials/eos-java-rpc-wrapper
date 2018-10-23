package client.domain.response.chain.transaction;

import client.domain.common.transaction.PackedTransaction;


import java.util.List;
import java.util.Objects;

public class ScheduledTransaction {

    private String trx_id;

    private String sender;

    private String sender_id;

    private String payer;

    private String delay_until;

    private String expiration;

    private String published;

    private PackedTransaction transaction;

    public String getTrx_id() {
        return trx_id;
    }

    public void setTrx_id(String trx_id) {
        this.trx_id = trx_id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer;
    }

    public String getDelay_until() {
        return delay_until;
    }

    public void setDelay_until(String delay_until) {
        this.delay_until = delay_until;
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getPublished() {
        return published;
    }

    public void setPublished(String published) {
        this.published = published;
    }

    public PackedTransaction getTransaction() {
        return transaction;
    }

    public void setTransaction(PackedTransaction transaction) {
        this.transaction = transaction;
    }
}
