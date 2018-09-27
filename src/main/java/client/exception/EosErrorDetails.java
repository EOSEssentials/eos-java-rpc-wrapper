package client.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EosErrorDetails {

    private String message;

    private String file;

    private Integer lineNumber;

    private String method;

    private EosErrorDetails() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("line_number")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("message", message)
                .append("file", file)
                .append("lineNumber", lineNumber.toString())
                .toString();
    }
}
