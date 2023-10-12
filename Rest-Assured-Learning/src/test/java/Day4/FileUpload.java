package Day4;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.io.File;

public class FileUpload {
/*To upload a file using form data use multipart method in given and pass file object in it
 * To upload file using formdata the content type should be multipart/form-data */
	 
	
@Test
void uploadFile() {
	File f = new File("<Source path of file to be uploaded>");
	given().multiPart(f).contentType("multipart/form-data").when().post("<URL of upload API>");
}

@Test//Multiple file upload
void uploadFile1() {
	File f1 = new File("<Source path of file to be uploaded>");
	File f2 = new File("<Source path of file to be uploaded>");
	given().multiPart(f1).multiPart(f2). contentType("multipart/form-data").when().post("<URL of upload API>");
}
}
