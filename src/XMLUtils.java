import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

public class XMLUtils {

    public static void createXML() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();
        Element  rootElement = document.createElement("notes");
        document.appendChild(rootElement);

        Element noteElement = document.createElement("note");
        rootElement.appendChild(noteElement);

        Element toElement = document.createElement("to");
        toElement.appendChild(document.createTextNode("Tove"));
        noteElement.appendChild(toElement);

        Element fromElement = document.createElement("from");
        fromElement.appendChild(document.createTextNode("Jani"));
        noteElement.appendChild(fromElement);

        Element headingElement = document.createElement("heading");
        headingElement.appendChild(document.createTextNode("Reminder"));
        noteElement.appendChild(headingElement);

        Element bodyElement = document.createElement("body");
        bodyElement.appendChild(document.createTextNode("Dont't forget me this weekend!"));
        noteElement.appendChild(bodyElement);



        Element noteElement2 = document.createElement("note");
        rootElement.appendChild(noteElement2);

        Element toElement2 = document.createElement("to");
        toElement2.appendChild(document.createTextNode("Nick"));
        noteElement2.appendChild(toElement2);

        Element fromElement2 = document.createElement("from");
        fromElement2.appendChild(document.createTextNode("Janion"));
        noteElement2.appendChild(fromElement2);

        Element headingElement2 = document.createElement("heading");
        headingElement2.appendChild(document.createTextNode("reminder"));
        noteElement2.appendChild(headingElement2);

        Element bodyElement2 = document.createElement("body");
        bodyElement2.appendChild(document.createTextNode("Don't forget to eat"));
        noteElement2.appendChild(bodyElement2);


        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        StreamResult streamResult = new StreamResult(new File("notes.xml"));
        DOMSource domSource = new DOMSource(document);
        transformer.transform(domSource, streamResult);






    }
}
