package client.exception;

public class EosApiException extends RuntimeException {

    private EosApiError error;

    public EosApiException(EosApiError apiError) {
        this.error = apiError;
    }


    public EosApiException(Throwable cause){
        super(cause);
    }

    public String getErrorCode() {
        return error != null ? error.getEosErrorCode() : null;
    }

    @Override
    public String getMessage() {
        return error == null ? super.getMessage() : error.getDetailedMessage();
    }
}
