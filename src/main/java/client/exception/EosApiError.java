package client.exception;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EosApiError {

    private String message;

    private int code;

    private EosError error;

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
