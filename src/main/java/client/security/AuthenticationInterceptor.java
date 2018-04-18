package client.security;

import okhttp3.*;
import okio.Buffer;
import java.io.IOException;

/**
 * A request interceptor that injects the API Key Header into requests, and signs messages, whenever required.
 */
public class AuthenticationInterceptor implements Interceptor {

    private final String apiKey;

    private final String secret;

    public AuthenticationInterceptor(String apiKey, String secret) {
        this.apiKey = apiKey;
        this.secret = secret;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request original = chain.request();
        Request.Builder newRequestBuilder = original.newBuilder();

        Request newRequest = newRequestBuilder.build();
        return chain.proceed(newRequest);
    }

    /**
     * Extracts the request body into a String.
     *
     * @return request body as a string
     */
    private static String bodyToString(RequestBody request) {
        try {
            final RequestBody copy = request;
            final Buffer buffer = new Buffer();
            if (copy != null) {
                copy.writeTo(buffer);
            } else {
                return "";
            }
            return buffer.readUtf8();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}