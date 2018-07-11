package client.domain.response.chain.code;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Code {

    private String account_name;

    private String code_hash;

    private String wast;

    private Abi abi;

    public Code() {

    }

    public String getAccount_name() {
        return account_name;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public String getCode_hash() {
        return code_hash;
    }

    public void setCode_hash(String code_hash) {
        this.code_hash = code_hash;
    }

    public String getWast() {
        return wast;
    }

    public void setWast(String wast) {
        this.wast = wast;
    }

    public Abi getAbi() {
        return abi;
    }

    public void setAbi(Abi abi) {
        this.abi = abi;
    }
}
