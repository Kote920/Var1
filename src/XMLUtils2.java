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
import java.util.stream.Stream;

public class XMLUtils2 {

    public static void createXML() throws ParserConfigurationException, TransformerException {

        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

        Document document = documentBuilder.newDocument();
        Element rootElement = document.createElement("Library");
        document.appendChild(rootElement);

        Element bookElement = document.createElement("book");
        rootElement.appendChild(bookElement);

        Element titleElement = document.createElement("title");
        titleElement.appendChild(document.createTextNode("The Fire Next Time"));
        bookElement.appendChild(titleElement);

        Element authorElement = document.createElement("author");
        authorElement.appendChild(document.createTextNode("Baldwin, James"));
        bookElement.appendChild(authorElement);

        Element bookElement2 = document.createElement("book");
        rootElement.appendChild(bookElement2);

        Element titleElement2 = document.createElement("title");
        titleElement2.appendChild(document.createTextNode("Beloved"));
        bookElement2.appendChild(titleElement2);

        Element authorElement2 = document.createElement("author");
        authorElement2.appendChild(document.createTextNode("Morris, Toni"));
        bookElement2.appendChild(authorElement2);

        Element bookElement3 = document.createElement("book");
        rootElement.appendChild(bookElement3);

        Element titleElement3 = document.createElement("title");
        titleElement3.appendChild(document.createTextNode("The Messiah of Stockholm"));
        bookElement3.appendChild(titleElement3);

        Element authorElement3 = document.createElement("author");
        authorElement3.appendChild(document.createTextNode("Ozick, Cynthia"));
        bookElement3.appendChild(authorElement3);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(new File("Library.xml"));
        transformer.transform(domSource, streamResult);




    }
}
