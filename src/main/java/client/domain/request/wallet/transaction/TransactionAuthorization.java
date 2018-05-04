package client.domain.request.wallet.transaction;

public class TransactionAuthorization {

    private String account;

    private String permission;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
