
import java.lang.Math; // headers MUST be above the first class
import java.util.*;
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
    String str = bf.readLine(); //String
    HashMap<String,String> map = new HashMap<>();//HashMap생성 
    for(int i = 0 ; i <=str.length() ; i++){
      for(int j = i ; j <= str.length(); j++){
        String temp = str.substring(i,j); //문자열 자르기
        map.put(temp,temp);
        }
      }
    }
    System.out.println(map.size()-1); //자꾸 공백 들어감
  }
}


