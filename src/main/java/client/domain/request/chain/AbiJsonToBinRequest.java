package client.domain.request.chain;

import java.util.Map;

public class AbiJsonToBinRequest {

    private String code;

    private String action;

    private Map<String, String> args;

    public AbiJsonToBinRequest(String code, String action, Map<String, String> args) {
        this.code = code;
        this.action = action;
        this.args = args;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Map<String, String> getArgs() {
        return args;
    }

    public void setArgs(Map<String, String> args) {
        this.args = args;
    }
}
