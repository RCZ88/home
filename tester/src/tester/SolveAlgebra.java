package tester;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SolveAlgebra {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a polynomial expression: ");
        String expression = scanner.nextLine();

        ArrayList<Integer> coefficients = extractCoefficients(expression);

        System.out.println("Extracted coefficients and exponents:");
        for (int i = 0; i < coefficients.size(); i += 2) {
            System.out.println("Coefficient: " + coefficients.get(i) + ", Exponent: " + coefficients.get(i + 1));
        }
        int fc = coefficients.get(0);
        int fe = coefficients.get(1);
        int sc = coefficients.get(2);
        int se = coefficients.get(3);
        int tc = coefficients.get(4);
        int te = coefficients.get(5);
        
        double decimalPlaces = 0.1;
        double starting = -100.0;
        double ending = 100.0;
        double count = starting;
        HashMap<Double, Double>XaV = new HashMap<>();

        double lhs = 0;
        double dflhs = 0;
        double min = Integer.MAX_VALUE;
        double minX = 0;
        DecimalFormat df = new DecimalFormat("#.##");
        ArrayList<Double>ans = new ArrayList<>();
        while (count <= ending) {
            double result = fc * Math.pow(count, fe) + sc * Math.pow(count, se) + tc * Math.pow(count, te);
            double Raf = decimalPlaces(result, df); // result after format
            XaV.put(count, result);
            dflhs = Raf - lhs;
            double Daf = decimalPlaces(dflhs, df);
            Daf = Math.abs(Daf);
            System.out.println(Daf);
            if(Daf == 0.00) {
            	ans.add(count);
            }else {
            	if(Daf < min) {
                    min = Daf;
                    minX = count;
                }
            }
            
            String formattedCount = String.format("%." + (int) Math.log10(1 / decimalPlaces) + "f", count);
            String formattedResult = String.format("%." + (int) Math.log10(1 / decimalPlaces) + "f", result);
            System.out.println(formattedCount + ": " + formattedResult); // Print count and result for clarity
            System.out.println(min);
            count += decimalPlaces;
            count = decimalPlaces(count, df);    
        }
        if(ans.size()!= 0) {
        	for(Double d : ans) {
            	System.out.println(d);
            }
        }
        System.out.println(minX);
        
        
        
    }
    static double decimalPlaces(double decimal, DecimalFormat df) {
    	String formatter = df.format(decimal);
        double af = Double.parseDouble(formatter);
        return af;
    }
    
    static ArrayList<Integer> extractCoefficients(String expression) {
        ArrayList<Integer> coefficients = new ArrayList<>();
        
        // Split the expression into terms
        String[] terms = expression.split("(?=[-+])");

        for (String term : terms) {
            term = term.trim();
            if (term.isEmpty()) continue;

            int coefficient = 1;
            int exponent = 0;

            // Match coefficient and variable
            Matcher coeffMatcher = Pattern.compile("([-+]?\\d*)x?").matcher(term);
            if (coeffMatcher.find()) {
                String coeffStr = coeffMatcher.group(1);
                if (!coeffStr.isEmpty() && !coeffStr.equals("+") && !coeffStr.equals("-")) {
                    coefficient = Integer.parseInt(coeffStr);
                } else if (coeffStr.equals("-")) {
                    coefficient = -1;
                }
            }

            // Match exponent
            Matcher expMatcher = Pattern.compile("x(\\^(\\d+))?").matcher(term);
            if (expMatcher.find()) {
                String expStr = expMatcher.group(2);
                if (expStr != null) {
                    exponent = Integer.parseInt(expStr);
                } else {
                    exponent = 1;
                }
            }

            // If there's no x, it's a constant term
            if (!term.contains("x")) {
                // Remove leading '+' sign and trim spaces before parsing
                term = term.replaceFirst("^\\+", "").trim();
                coefficient = Integer.parseInt(term);
                exponent = 0;
            }

            coefficients.add(coefficient);
            coefficients.add(exponent);
        }

        return coefficients;
    }
}