package Utils;
import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UploadToServer {
	
	    public static void main(String[] args) {
	        String reportPath = System.getProperty("user.dir")+"/allure-report.zip"; 
	        try {
	            uploadAllureReport(reportPath);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	private static final String API_ENDPOINT = "https://api.netlify.com/api/v1/sites/{site_id}/deploys";
    private static final String ACCESS_TOKEN = "aFr8F_F5CHoq-x8e27FGhupsDU-tJE9eZ0IoiMszpSA";
    private static final String SITE_ID = "codeautomation008";

    public static String uploadAllureReport(String reportPath) throws Exception {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpPost httpPost = new HttpPost(API_ENDPOINT.replace("{site_id}", SITE_ID));
        httpPost.setHeader("Authorization", "Bearer " + ACCESS_TOKEN);

        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.addBinaryBody("files", new File(reportPath), ContentType.MULTIPART_FORM_DATA, "allure-report.zip");

        HttpEntity multipart = builder.build();
        httpPost.setEntity(multipart);

        HttpResponse response = httpClient.execute(httpPost);
        int statusCode = response.getStatusLine().getStatusCode();

        if (statusCode == 200) {
        	String responseBody = EntityUtils.toString(response.getEntity());
        	ObjectMapper objectMapper = new ObjectMapper();
        	JsonNode jsonResponse = objectMapper.readTree(responseBody);
        	String deployId = jsonResponse.get("id").asText();
            String reportLink = "https://" + SITE_ID + ".netlify.app/" + deployId + "/allure-report/index.html";
            System.out.println("Allure report uploaded successfully!");
            System.out.println("Report link: " + reportLink);
            return reportLink;
        } else {
            System.err.println("Failed to upload Allure report. Status code: " + statusCode);
            return null;
        } 
    }
}
