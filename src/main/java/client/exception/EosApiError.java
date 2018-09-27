package client.exception;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EosApiError {

    private String message;

    private int code;

    private EosError error;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public EosError getError() {
        return error;
    }

    public void setError(EosError error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("message", message)
                .append("code", code)
                .toString();
    }

    public String getDetailedMessage() {
        return error == null ? message : message + ": " + error.getWhat();
    }

    public Integer getEosErrorCode() {
        return error == null ? null : error.getCode();
    }
}
