package client.domain.request.chain;

import java.util.Map;

public class AbiJsonToBinRequest<T> {

    private String code;

    private String action;

    private T args;

    public AbiJsonToBinRequest(String code, String action, T args) {
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

    public T getArgs() {
        return args;
    }

    public void setArgs(T args) {
        this.args = args;
    }
}
