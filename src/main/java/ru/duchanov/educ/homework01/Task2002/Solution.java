package ru.duchanov.educ.homework01.Task2002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static java.util.Arrays.asList;

public class Solution {
    public static void main(String[] args) throws IOException {
        Integer count = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        List<String> input = asList(new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s"));
        Integer result = 0;
        for (int i=0; i<count;i++) {
            result += Integer.parseInt(input.get(i));
        }
        System.out.println(result);
    }
}
