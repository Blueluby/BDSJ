import java.io.*;
import java.util.*;

import org.apache.http.*;
import org.apache.http.client.*;
import org.apache.http.client.entity.*;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.*;
import org.apache.http.impl.client.*;
import org.apache.http.message.*;


public class Cralwer2 {

	private static CloseableHttpClient client;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		client =  HttpClientBuilder.create().build();
		
		String url = "http://cofs.tistory.com";
		Map<String, String> param = new HashMap<String, String>();
		param.put("userId", "id");
		param.put("password", "pw");
		
		Cralwer2 jm = new Cralwer2();
		String string = jm.get(url, param);
		System.out.println(string);
		
		String rul2 = "http://cofs.tistory.com/movePage";
		Map<String, String> param2 = new HashMap<String, String>();
		param2.put("no", "1");
		String string2 = jm.get(rul2, param2);
		System.out.println(string2);
		
		try {
			client.close();
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	
	public String post(String url, Map<String, String> params, String encoding) {
		try {
			HttpPost post = new HttpPost(url);
			System.out.println("=================");
			System.out.println("Post : "+post.getURI());
			System.out.println("=================");
			
			List<NameValuePair> paramList = convertParam(params);
			post.setEntity(new UrlEncodedFormEntity(paramList, encoding));
			
			ResponseHandler<String> rh = new BasicResponseHandler();
			
			String excute = client.execute(post, rh);
			
			return excute;
			
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		}
		return "error";
		
	}

	public String post(String url, Map<String, String> params) {
		return post(url, params, "UTF-8");
	}
	
	public String get(String url, Map<String, String> params, String encoding) {
		try {
			List<NameValuePair> paramList = convertParam(params);
			HttpGet get = new HttpGet(url + "?" + URLEncodedUtils.format(paramList, encoding));
			System.out.println("=================");
			System.out.println("Get : "+get.getURI());
			System.out.println("=================");
			ResponseHandler<String> rh = new BasicResponseHandler();
			 
            String execute = client.execute(get, rh);
 
            return execute;

		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		return "error";
	}
	
	   public String get(String url, Map<String, String> params) {
	        return get(url, params, "UTF-8");
	    }

	private List<NameValuePair> convertParam(Map<String, String> params) {
		// TODO Auto-generated method stub
		List<NameValuePair> paramList = new ArrayList<NameValuePair>();
		Iterator<String> keys = params.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			paramList.add(new BasicNameValuePair(key, params.get(key).toString()));
		}
					
		return paramList;
	}
}