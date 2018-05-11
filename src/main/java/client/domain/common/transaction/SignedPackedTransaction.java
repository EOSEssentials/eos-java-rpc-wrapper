package client.domain.common.transaction;


import java.util.List;

public class SignedPackedTransaction extends PackedTransaction {

    private List<String> signatures;

    public SignedPackedTransaction(){

    }

    public List<String> getSignatures() {
        return signatures;
    }

    public void setSignatures(List<String> signatures) {
        this.signatures = signatures;
    }
}
