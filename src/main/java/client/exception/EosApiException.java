package client.exception;

public class EosApiException extends RuntimeException {

    private EosApiError error;

    public EosApiException(EosApiError apiError) {
        this.error = apiError;
    }


    public EosApiException(Throwable cause){
        super(cause);
    }

    @Override
    public String getMessage() {
        if (error != null) {
            return error.getDetailedMessage();
        }
        return super.getMessage();
    }
}
