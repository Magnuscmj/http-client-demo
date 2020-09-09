package no.kristiania.httpclient;

import org.junit.jupiter.api.Test;

public class QueryStringTest {

    @Test
    void shouldRetrieveQueryParameter() {
        QueryString queryString = new QueryString("status-200");
    }
}
