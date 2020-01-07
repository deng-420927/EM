package com.briup.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @ClassName:  Server   
 * @Description:服务器端网络模块
 * @author: DENG
 * @date:   2020年1月6日   
 *     
 * @Copyright: 2020 DENG All rights reserved.
 */
public class Server {
	private void receive() {
		Socket socket;
		Set<Socket> clients=new HashSet<Socket>();
		try {
			ServerSocket server =new ServerSocket(9999);
			ServerSocket serverSocket=new ServerSocket(10000);
			while(true) {
				socket=serverSocket.accept();
				//为客户端创建子线程
				Thread thread=new Thread(new ServerRunnable(clients,socket));
				thread.start();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
class ServerRunnable implements Runnable{
	private Set<Socket> clients;
	private Socket socket;
	public ServerRunnable(Set<Socket> clients,Socket socket) {
		this.socket=socket;
	}
	@Override
	public void run() {
		//接收和转发
		BufferedReader br=null;
		PrintWriter pw=null;
		
		try {
			//初始化
			br=new BufferedReader(
					new InputStreamReader(
							socket.getInputStream()));
			String str=null;
			//while true 一直读取对应客户端所发的信息，如果没有则为null;
			while(true) {
				if((str=br.readLine())!=null) {
						pw=new PrintWriter(socket.getOutputStream());
						pw.println(str);
						pw.flush();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}