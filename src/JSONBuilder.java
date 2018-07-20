import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

@JsonPropertyOrder({ "firstName", "lastName", "email", "address" })
public class JSONBuilder {
    public static void main(String []args) {
        JSONObject job          = new JSONObject();
        JSONObject address      = new JSONObject();
        JSONArray jar           = new JSONArray();

        job.put("firstname", "Rick");
        job.put("lastname", "Mattier El");
        job.put("email", "rick.mattier@ll.mit.edu");

        address.put("street","53 Tiffany Drive");
        address.put("city", "Randolph");
        address.put("state", "Massachusetts");
        address.put("zipcode", "02368");


        // jar.add(address);
        // job.put("address", jar);

        System.out.println(job.toJSONString());

    }
}