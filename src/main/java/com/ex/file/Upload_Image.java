package com.ex.file;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.codec.binary.Base64;

public class Upload_Image {

	// Decode String into an Image
	public static void convertStringtoImage(String encodedImageStr,	String fileName) {

		try {
			// Decode String using Base64 Class
			byte[] imageByteArray = Base64.decodeBase64(encodedImageStr); 

			// Write Image into File system - Make sure you update the path
			FileOutputStream imageOutFile = new FileOutputStream("F:/Studys/UploadedImages/" + fileName);
			imageOutFile.write(imageByteArray);

			imageOutFile.close();

			System.out.println("이미지 업로드 성공");
		} catch (FileNotFoundException fnfe) {
			System.out.println("이미지 업로드 실패 : 경로를 찾지 못하였습니다." + fnfe);
		} catch (IOException ioe) {
			System.out.println("이미지 업로드 실패 : 이미지가 올바르지 않거나 변환에 실패하였습니다. " + ioe);
		}

	}

}
