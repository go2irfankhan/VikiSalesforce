package com.sfdc.fileupload;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import sun.misc.BASE64Decoder;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class FileUpload {

	
	Logger LOG = Logger.getLogger(FileUpload.class);

	
	public String uploadFile(String fileName, String stream){
		
		LOG.error("uploadFile called");
		
		try
		   {
		
			Properties prop = new Properties();
			InputStream input = null;
			
			//input = new FileInputStream("config/config.properties");
			input =  this.getClass().getResourceAsStream("/config/config.properties");
			prop.load(input);

			String remoteDirectory = prop.getProperty("sftpremoteDirectory");
			String localDirectory = prop.getProperty("sftplocalDirectory");

		    File f = writeByteArraysToFile(localDirectory + fileName, stream);

			String fileToFTP = fileName;
			String SFTPHOST = prop.getProperty("sftphost");
			int SFTPPORT = Integer.parseInt(prop.getProperty("sftpport"));
			String SFTPUSER = prop.getProperty("sftpuser");
			String SFTPPASS = prop.getProperty("sftppassword");
			
		    String local_filename = fileToFTP;
		    String local_pathname = localDirectory;
		    String remote_filename = fileToFTP;
		    
		    JSch jsch = null;
		    Session session = null;
		    ChannelSftp sftpChannel = null;
		   
		    System.out.println("Creating new Jsch Service.");
		      jsch = new JSch();
		      session = jsch.getSession(SFTPUSER, SFTPHOST);
		      session.setPassword(SFTPPASS);
		      session.setPort(SFTPPORT);
		      session.setConfig("StrictHostKeyChecking", "no");
		      session.connect();
		      System.out.println("Jsch session connected.");
		      
		      sftpChannel = (ChannelSftp)session.openChannel("sftp");
		      sftpChannel.connect();
		      
		      System.out.println(sftpChannel);
		      System.out.println(sftpChannel.getSession().isConnected());
		   
		     
		      FileInputStream fileBodyIns = new FileInputStream(f);
		      
		      System.out.println(local_pathname + local_filename);
		      System.out.println(remoteDirectory + remote_filename);
		      
		      sftpChannel.put(fileBodyIns, f.getName());
		      fileBodyIns.close();
		      
		      sftpChannel.exit();
		      session.disconnect();
		      
		      System.out.println("File uploaded successfully");
		      return "File uploaded successfully";
		    }
		    catch (Exception e)
		    {
		    	e.printStackTrace();
		    	return e.getMessage();
		    }
		
		}
	

	private File writeByteArraysToFile(String fileName, String content) throws IOException {
		 
		BASE64Decoder decoder = new BASE64Decoder();
		byte[] decodedBytes = decoder.decodeBuffer(content);

		File file = new File(fileName);
		FileOutputStream fop = new FileOutputStream(file);

		fop.write(decodedBytes);
		fop.flush();
		fop.close();
        
        return file;
 
    }

	
}
