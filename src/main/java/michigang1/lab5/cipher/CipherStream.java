package michigang1.lab5.cipher;

import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import java.io.*;

public class CipherStream {
    private char key;

    public CipherStream(char key) {
        this.key = key;
    }


/**
     * The encrypt method takes an InputStream and an OutputStream as parameters.
     * It reads each byte from the input stream, adds the ASCII value of the key character to it,
     * and writes the result to the output stream.
     * This effectively shifts the ASCII values of the characters in the input stream, encrypting the data.
     *
     * @param in  the input stream
     * @param out the output stream
     * @throws IOException if an I/O error occurs
**/
    public void encrypt(InputStream in, OutputStream out){
        try (in; out; FilterInputStream fis = new BufferedInputStream(in);
             FilterOutputStream fos = new BufferedOutputStream(out)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b + key);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

    }
/**
     * The decrypt method takes an InputStream and an OutputStream as parameters.
     * It reads each byte from the input stream, subtracts the ASCII value of the key character from it,
     * and writes the result to the output stream.
     * This effectively shifts the ASCII values of the characters in the input stream, decrypting the data.
     *
     * @param in  the input stream
     * @param out the output stream
     * @throws IOException if an I/O error occurs
**/
    public void decrypt(InputStream in, OutputStream out) {
        try (in; out; FilterInputStream fis = new BufferedInputStream(in);
             FilterOutputStream fos = new BufferedOutputStream(out)) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b - key);
            }
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}