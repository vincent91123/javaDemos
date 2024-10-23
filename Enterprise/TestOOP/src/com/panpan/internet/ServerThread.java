package com.panpan.internet;

import java.io.*;
import java.net.Socket;

/**
 * @author panpan
 * @create 2024-09-09-下午 03:55
 */
public class ServerThread extends Thread{

    InputStream input=null;
    ObjectInputStream dis=null;
    OutputStream out=null;
    DataOutputStream dos=null;
    Socket s=null;//new Socket("169.254.239.110",8181);

    public ServerThread(Socket s) throws IOException {
        this.s=s;
    }

    @Override
    public void run() {
        try {
//            s = new ServerSocket(8181);
//            s=ss.accept();
            input=s.getInputStream();
            dis=new ObjectInputStream(input);
            User user= (User) dis.readObject();
            boolean flag=false;
            if (user.getName().equals("panpand")&&user.getPwd().equals("123456")){
                flag=true;
            }

            out=s.getOutputStream();
            dos=new DataOutputStream(out);
            dos.writeBoolean(flag);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                if (dos!=null) {
                    dos.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (dos!=null) {
                    dos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (dis!=null) {
                    dis.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (input!=null) {
                    input.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (s!=null) {
                    s.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
