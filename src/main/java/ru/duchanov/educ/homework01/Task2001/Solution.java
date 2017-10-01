package ru.duchanov.educ.homework01.Task2001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import static java.util.Arrays.asList;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> input = asList(new BufferedReader(new InputStreamReader(System.in)).readLine().split("\\s"));

        System.out.println(Integer.parseInt(input.get(0)) + Integer.parseInt(input.get(1)));

    }
}
