package com.example.recipe;

import org.junit.Test;

import java.io.IOException;

import utilities.JSONTool;
import utilities.NetworkUtils;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

//    @Test
//    public void json_isCorrect() {
//        assertEquals("", JSONTool.toJson());
//    }
//
//    @Test
//    public void obj_isCorrect() {
//        assertEquals("", JSONTool.fromJson());
//    }
//
//    @Test
//    public void url_isCorrect() {
//        String s = "";
//        try{
//            s =  NetworkUtils.getResponseFromHttpUrl();
//        }catch(IOException  e){
//            e.printStackTrace();
//        }
//
//        assertEquals("",s);
//    }
}