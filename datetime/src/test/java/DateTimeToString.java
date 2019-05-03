import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTimeToString {

    private Instant instant = Instant.parse("2019-05-03T20:38:11.545817Z");
    private Date date = Date.from(instant);
    private ObjectMapper mapper = new ObjectMapper();
    private ObjectMapper mapper_javaTimeModule = new ObjectMapper().configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    @Test
    void instantToString() {
        assertEquals("2019-05-03T20:38:11.545817Z", instant.toString());
    }

    @Test
    void instantAsJSONString() throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(instant);
        assertEquals("{\"nano\":545817000,\"epochSecond\":1556915891}", jsonString);
    }

    @Test
    void instantAsJSONString_JavaTimeModule() throws JsonProcessingException {
        String jsonString = mapper_javaTimeModule.writeValueAsString(instant);
        assertEquals("\"2019-05-03T20:38:11.545817Z\"", jsonString);
    }

    @Test
    void dateToString() {
        assertEquals("Fri May 03 22:38:11 CEST 2019", date.toString());
    }

    @Test
    void dateAsJSONString_JSR310() throws JsonProcessingException {
        String jsonString = mapper_javaTimeModule.writeValueAsString(date);
        assertEquals("\"2019-05-03T20:38:11.545+0000\"", jsonString);
    }

    @Test
    void dateAsJSONString() throws JsonProcessingException {
        String jsonString = mapper.writeValueAsString(date);
        assertEquals("1556915891545", jsonString);
    }
}
