
public class Socket {
	
	private String m_ip;
	private float m_port;
	
	public Socket(String ip, float port){
		this.m_ip = ip;
		this.m_port = port;
		
	}
	
	public void connectToServer(){
		
		
		
	}	
	
	public String getIp(){
		
		return this.m_ip;
		
	}
	
	public Float getPort(){
		
		return this.m_port;
		
	}
	
	public void setIp(String ip){
		
		this.m_ip = ip;
		
	}
	
	public void setPrt(Float port){
		
		this.m_port = port;
		
	}
	
}
