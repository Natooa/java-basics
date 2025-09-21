package org.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exception7 {
    public static void main(String[] args) /*throws IOException, ParseException, FileNotFoundException, IllegalArgumentException*/{
        try{
            run();
        }catch (Exception e) {

        } catch (ParseException p) {

        }

//        catch (IOException | ParseException e) {
//            e.printStackTrace();
//        }
//        catch (ParseException e) {
//            e.printStackTrace();
//        }
    }

    public void run() throws IOException, ParseException, IllegalArgumentException {

    }
}
