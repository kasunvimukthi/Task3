package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import util.MultiLinugualStringTable;

public class Demo {

	private static String playerName;
	public final static int ZERO = 0;
	private static InputStrategy strategy;
	private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {

    System.out.println("Welcome To Abominodo - The Best Dominoes Puzzle Game in the Universe");
    System.out.println("Version 1.0 (c), Kevan Buckley, 2010");
    System.out.println();
    System.out.println(MultiLinugualStringTable.getMessage(0));
    playerName = reader.readLine();

    System.out.printf("%s %s. %s", MultiLinugualStringTable.getMessage(1),
        playerName, MultiLinugualStringTable.getMessage(2));
    
    
    int _$_ = -9;
    while (_$_ != ZERO) {
      System.out.println();
      String h1 = "Main menu";
      String u1 = h1.replaceAll(".", "=");
      System.out.println(u1);
      System.out.println(h1);
      System.out.println(u1);
      System.out.println("1) Play");
      System.out.println("2) View high scores");
      System.out.println("3) View rules");
      System.out.println("0) Quit");
      _$_ = -9;
      while (_$_ == -9) {
        try {
          String s1 = reader.readLine();
          _$_ = Integer.parseInt(s1);
        } catch (Exception e) {
          _$_ = -9;
        }
      }
      switch (_$_) {
      case 0: {
    	  System.exit(0);
          break;
      }
      case 1: {
        System.out.println();
        String h4 = "Select difficulty";
        String u4 = h4.replaceAll(".", "=");
        System.out.println(u4);
        System.out.println(h4);
        System.out.println(u4);
        System.out.println("1) Simples");
        System.out.println("2) Not-so-simples");
        System.out.println("3) Super-duper-shuffled");
        int c2 = -7;
        
        while (!(c2 == 1 || c2 == 2 || c2 == 3)) {
            try {
              String s2 = reader.readLine();
              c2 = Integer.parseInt(s2);
            } catch (Exception e) {
              c2 = -7;
            }
          	
        switch (c2) {
        
        case 1:
        	strategy = new Simples();
          break;
        case 2:
        	strategy = new NotSoSimples();
          break;
        case 3:
        	strategy = new SuperDuperShuffled();
          break;
        }
        Input.processInput(strategy);
        }
        
      }
      }
//      System.exit(0);
    }
    
	}

}
