package client.domain.request.wallet.transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionMessage {

    private String code;

    private String type;

    private String data;

    private List<TransactionAuthorization> authorization;

    public TransactionMessage(){
        authorization = new ArrayList<>(0);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public List<TransactionAuthorization> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(List<TransactionAuthorization> authorization) {
        this.authorization = authorization;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
