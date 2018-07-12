package client.exception;

public class EosApiException extends RuntimeException {

    private EosApiError error;

    private ErrorCode eosErrorCode;

    public EosApiException(ErrorCode eosErrorCode) {
        this.eosErrorCode = eosErrorCode;
    }

    public EosApiException(EosApiError apiError) {
        this.error = apiError;
    }

    public EosApiException(String message, ErrorCode eosErrorCode) {
        super(message);
        this.eosErrorCode = eosErrorCode;
    }

    public EosApiException(Throwable cause, ErrorCode eosErrorCode) {
        super(cause);
        this.eosErrorCode = eosErrorCode;
    }

    public EosApiException(Throwable cause) {
        super(cause);
    }

    public EosApiException(String message, Throwable cause, ErrorCode eosErrorCode) {
        super(message, cause);
        this.eosErrorCode = eosErrorCode;
    }

    public ErrorCode getEosErrorCode() {
        return eosErrorCode;
    }

    public void setEosErrorCode(ErrorCode eosErrorCode) {
        this.eosErrorCode = eosErrorCode;
    }

}
