package Utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ReportUtils {

	public static String uploadReportToServer() {
		// TODO Auto-generated method stub
		 String responseBody = "Report Is Not Uploaded";
			OkHttpClient client = new OkHttpClient().newBuilder()
					  .build();
					MediaType mediaType = MediaType.parse("text/plain");
					RequestBody body = new MultipartBody.Builder().setType(MultipartBody.FORM)
					  .addFormDataPart("project_name","Test")
					  .addFormDataPart("file",ZipUtils.OUTPUT_ZIP_FILE,
					    RequestBody.create(MediaType.parse("application/octet-stream"),
					    new File(ZipUtils.OUTPUT_ZIP_FILE)))
					  .addFormDataPart("overwrite","False")
					  .addFormDataPart("is_generated","False")
					  .build();
					Request request = new Request.Builder()
					  .url("http://174.114.75.27:8081/product/reports/files")
					  .method("POST", body)
					  .build();
					try {
						Response response = client.newCall(request).execute();
						responseBody = response.body().string();
			            
			            if (response.isSuccessful()) {
			                // API call successful
			                
			                // Write the response body to a file
//			                String fileName = "response.html"; // Replace with desired file name
//			                PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(fileName, true)));
//			                writer.print(responseBody);
//			                writer.close();
			                
//			                System.out.println("HTML response appended to " + fileName);
			            } else {
			                // API call unsuccessful
			                System.out.println("API call failed with response code: " + response.code());
			            }
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					return responseBody.replace("{\"report-path\":\"", " ").replace("\"}", " ");
	 }

	public static void main(String[] args) {

	}

}
