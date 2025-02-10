package com.qa.pojo;

import org.apache.juneau.html.HtmlDocSerializer;
import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.marshaller.Html;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;


public class ProductTest {

	public static void main(String[] args) throws SerializeException {
		
		//POJO to JSON:
		JsonSerializer jsonSerializer=JsonSerializer.DEFAULT_READABLE;
		String sellerNames []= {"ABC Mobile", "XYZ Mobile","Samsung Telecom"};
		Product product=new Product("Samsung Galaxy S4", 20000 , "Black", sellerNames);
		String json=jsonSerializer.serialize(product);
		System.out.println(json);
		
		//POJO to XML:
		XmlSerializer xmlSerializer=XmlSerializer.DEFAULT_NS_SQ_READABLE;
		String xml=xmlSerializer.serialize(product);
		System.out.println(xml);
		
		//POJO to HTML
		HtmlSerializer htmlSerializer=HtmlSerializer.DEFAULT_SQ_READABLE;
		String html=htmlSerializer.serialize(product);
		System.out.println(html);
			
		
	}

}
