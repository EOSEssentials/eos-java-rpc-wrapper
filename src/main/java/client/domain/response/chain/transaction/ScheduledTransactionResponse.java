package client.domain.response.chain.transaction;

import java.util.ArrayList;
import java.util.Objects;

public class ScheduledTransactionResponse {

    private ArrayList<ScheduledTransaction> transactions;

    private String more;


    public String getMore() {
        return more;
    }

    public void setMore(String more) {
        this.more = more;
    }

    public ArrayList<ScheduledTransaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<ScheduledTransaction> transactions) {
        this.transactions = transactions;
    }

}
