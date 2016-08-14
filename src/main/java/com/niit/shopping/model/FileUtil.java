package com.niit.shopping.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.web.multipart.MultipartFile;



public class FileUtil {

	/*public static String upload(MultipartFile file,HttpServletRequest request,boolean encrypt_file_name,String upload_folder){
		String filename=null;
		try{
			if(!file.isEmpty()){
				String applicationPath=request.getServletContext().getRealPath("");
				if(encrypt_file_name){
					String currentFileName = file.getOriginalFilename();
					String extension =currentFileName.substring(currentFileName.lastIndexOf("."), currentFileName.length());
					Long nameRadom = Calendar.getInstance().getTimeInMillis();
					String newfilename = nameRadom + extension;
					filename=newfilename;
				}else
					filename= file.getOriginalFilename();
				byte[] bytes=file.getBytes();
				String rootPath = applicationPath;
				File dir =new File(rootPath +File.separator+upload_folder);
				if(!dir.exists())
					dir.mkdirs();
				File serverFile= new File(dir.getAbsolutePath()) + File.separator +filename);
				BufferedOutputStream stream=new BufferedOutputStream(new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();
				return filename;
				} else {
					filename=null;
				}
		} catch (Exception e){
			filename=null;
		}
		return filename;
	}*/
	
	
	
	
	
	
	
	
	public static void upload(String path, MultipartFile file, String fileName) {
		if (!file.isEmpty()) {
			InputStream inputStream = null;
			OutputStream outputStream = null;
			if (file.getSize() > 0) {
				try {
					inputStream = file.getInputStream();
					outputStream = new FileOutputStream(path + fileName);
					int readBytes = 0;
					byte[] buffer = new byte[1024];
					while ((readBytes = inputStream.read(buffer, 0, 1024)) != -1) {
						outputStream.write(buffer, 0, readBytes);
					}
				} catch (IOException e) {
					e.printStackTrace();
				} finally {
					try {
						outputStream.close();
						inputStream.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

}
