import org.testng.annotations.Test;
import static org.hamcrest.core.IsEqual.equalTo;

public class PingTest extends BaseTest{
    private static final String RESOURCE = "/status";
    @Test
    public void Status_Test(){
        request
                .get(String.format("%s", RESOURCE))
                .then()
                .statusCode(200)
                .header("Access-Control-Allow-Origin", equalTo("http://localhost"))
                .body(  "status", equalTo("Listos para el examen"));
    }


}
