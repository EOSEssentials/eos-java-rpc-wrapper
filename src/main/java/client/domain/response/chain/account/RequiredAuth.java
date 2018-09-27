package client.domain.response.chain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredAuth {

    private List<String> accounts;

    private List<Key> keys;

    private String threshold;

    private List<Wait> waits;

    public List<String> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<String> accounts) {
        this.accounts = accounts;
    }

    public List<Key> getKeys() {
        return keys;
    }

    public void setKeys(List<Key> keys) {
        this.keys = keys;
    }

    public String getThreshold() {
        return threshold;
    }

    public void setThreshold(String threshold) {
        this.threshold = threshold;
    }

    public List<Wait> getWaits() {
        return waits;
    }

    public void setWaits(List<Wait> waits) {
        this.waits = waits;
    }
}
