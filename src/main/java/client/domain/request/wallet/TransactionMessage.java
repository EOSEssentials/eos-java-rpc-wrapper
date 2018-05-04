package client.domain.request.wallet;

import java.util.List;

public class TransactionMessage {

    private String data;

    private List<TransactionAuthorization> authorization;

    private String code;

    private String type;

    public TransactionMessage(){

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
