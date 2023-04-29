import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.print.Doc;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.stream.Stream;

public class XMLUtils3 {

    public static void createXML() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();
        Element rootElement = document.createElement("breakfast_menu");
        document.appendChild(rootElement);

        Element foodElement = document.createElement("food");
        rootElement.appendChild(foodElement);

        Element nameElement = document.createElement("name");
        nameElement.appendChild(document.createTextNode("Belgian Waffles"));
        foodElement.appendChild(nameElement);

        Element priceElement = document.createElement("price");
        priceElement.appendChild(document.createTextNode("$5.95"));
        foodElement.appendChild(priceElement);

        Element descriptionElement = document.createElement("description");
        descriptionElement.appendChild(document.createTextNode("Two of our famous Belgian Waffles with plenty of real maple syru"));
        foodElement.appendChild(descriptionElement);

        Element caloriesElement = document.createElement("calories");
        caloriesElement.appendChild(document.createTextNode("650"));
        foodElement.appendChild(caloriesElement);

        Element foodElement2 = document.createElement("food");
        rootElement.appendChild(foodElement2);

        Element nameElement2 = document.createElement("name");
        nameElement2.appendChild(document.createTextNode("Strawberry Belgian Waffles"));
        foodElement2.appendChild(nameElement2);

        Element priceElement2 = document.createElement("price");
        priceElement2.appendChild(document.createTextNode("$7.95"));
        foodElement2.appendChild(priceElement2);

        Element descriptionElement2 = document.createElement("description");
        descriptionElement2.appendChild(document.createTextNode("Light Belgian waffles covered with strawberries and whipped cream"));
        foodElement2.appendChild(descriptionElement2);

        Element caloriesElement2 = document.createElement("calories");
        caloriesElement2.appendChild(document.createTextNode("900"));
        foodElement2.appendChild(caloriesElement2);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("breakfast_menu.xml"));
        transformer.transform(domSource,streamResult);



    }
}
