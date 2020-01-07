package com.briup.client;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Collection;

import com.briup.bean.Environment;

/**
 * 
 * @ClassName:  Client   
 * @Description:客户端网络模块
 * @author: DENG
 * @date:   2020年1月6日   
 *     
 * @Copyright: 2020 DENG All rights reserved.
 */
public class Client {
	
	private void send(Collection<Environment> c) {
		try {
			Socket socket=new Socket("127.0.0.1",10000);
			File file=new File("/src/main/resource/radwtmp");
			if(!file.exists()) {
				file.createNewFile();
			}
		DataOutputStream dataOutputStreamToserver=new DataOutputStream(socket.getOutputStream());
		dataOutputStreamToserver.writeFloat(System.currentTimeMillis());
		FileInputStream fileInputStreamFromFile=new FileInputStream(file);
		OutputStream outputStreamToServer=socket.getOutputStream();
		
		byte[] data=new byte[1024];
		int len=0;
		while ((len=fileInputStreamFromFile.read(data))!=-1) {
			outputStreamToServer.write(data,0,len);
			
		}
		socket.shutdownOutput();
		
		InputStream inputStreamFromServer=socket.getInputStream();
		byte[] dataFromServer=new byte[1024];
		
		int read=inputStreamFromServer.read(dataFromServer);
		
		System.out.println(new String(dataFromServer,0,read));
		
		fileInputStreamFromFile.close();
		
		socket.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
