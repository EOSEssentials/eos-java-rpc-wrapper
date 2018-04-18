package client.exception;

public class EosApiException extends RuntimeException {
    public EosApiException(EosApiError apiError) {
    }

    public EosApiException(Throwable cause) {
    }
}
