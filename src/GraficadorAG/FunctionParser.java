/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficadorAG;

import org.nfunk.jep.JEP;

/**
 *
 * @author carlos
 */
public class FunctionParser {
    JEP j = new JEP();
  
public FunctionParser(String Function){
    j.addVariable("x", 0);
    j.addStandardConstants();
    j.addStandardFunctions();
    j.setImplicitMul(true);
    
    j.parseExpression(Function);
    
    if(j.hasError()){
        System.out.println(j.getErrorInfo());
    } 
}
public double FunctionEvaluator (double x){
    double r;
    j.addVariable("x",x);
    r=j.getValue();
    
    if(j.hasError()){
        System.out.println(j.getErrorInfo());
    }     
    return r;
}
    
}
