package client.domain.Request.chain;

import java.util.List;
import java.util.Map;

public class ActionRequestElement {

    private String code;

    private String type;

    private List<String> recipients;

    private Map<String, String> authorization;

    private String data;

    public ActionRequestElement(){

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

    public List<String> getRecipients() {
        return recipients;
    }

    public void setRecipients(List<String> recipients) {
        this.recipients = recipients;
    }

    public Map<String, String> getAuthorization() {
        return authorization;
    }

    public void setAuthorization(Map<String, String> authorization) {
        this.authorization = authorization;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
