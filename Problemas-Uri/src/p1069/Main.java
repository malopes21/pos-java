/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        Stack<Character> pilha = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        for(int j=0; j<n; j++) {
            String colheita = br.readLine();
            pilha.clear();
            int count = 0;
            for(int i=0; i<colheita.length(); i++) {
                char c = colheita.charAt(i);
                if(colheita.charAt(i) == '<') {
                    pilha.push(c);
                } else if(c == '>') {
                    if(!pilha.isEmpty()) {
                        count++;
                        pilha.pop();
                    }
                }
            }
            out.println(count);
        }
        out.flush();
    }

}
