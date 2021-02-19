
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBufferedFileInputStream;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class PDFReader{
    public String getText(File file) throws IOException {
        PDFTextStripper pdfStripper = null;
        PDDocument pdDoc = null;

        PDDocument doc = PDDocument.load(file);
        return new PDFTextStripper().getText(doc);
    }

}

