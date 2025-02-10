package com.api.automation.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLUtility {

	public static Document readRootElementXmlFile(String filePath) {

		Document document = null;
		try {
			File file = new File(filePath);
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();

			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			document = builder.parse(file);
			document.getDocumentElement().normalize();

			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());

		} catch (

		ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return document;

	}

	public static void readListOfNodes(String filePath) {
		Document document = readRootElementXmlFile(filePath);

		NodeList nodeList = document.getElementsByTagName("student");

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			System.out.println("Node Name :" + node.getNodeName());

			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) node;
				System.out.println("Id: " + eElement.getElementsByTagName("id").item(0).getTextContent());
				System.out
						.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Subject:  " + eElement.getElementsByTagName("subject").item(0).getTextContent());
				System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());

			}

		}

	}

	public static void readNodes(String filePath) {
		Document document = readRootElementXmlFile(filePath);

		NodeList nodeList = document.getElementsByTagName(document.getDocumentElement().getNodeName());
		System.out.println(nodeList.getLength());

		for (int i = 0; i < nodeList.getLength(); i++) {
			Node node = nodeList.item(i);
			System.out.println("Node Name :" + node.getNodeName());

			if (node.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) node;
				System.out.println("Id: " + eElement.getElementsByTagName("crs:SendingCompanyIN ").item(0).getTextContent());
				System.out
						.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Subject:  " + eElement.getElementsByTagName("subject").item(0).getTextContent());
				System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());

			}

		}

	}

	public static void main(String args[]) {
		readRootElementXmlFile(
				"C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\ExcelXML\\SampleXml.xml");
		readListOfNodes("C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\ExcelXML\\SampleXml.xml");
		readNodes("C:\\Automation\\ApiAutomation\\ApiAutomation\\src\\main\\resources\\ExcelXML\\SampleXml.xml");

	}

}
