/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GraficadorAG;

/**
 *
 * @author carlos
 */
public class GraficadorFunciones {
    
    public double ParametrosGrafica (FunctionParser f, double inicio ,double fin, int i, double e){
        double r=Double.NaN;
        double paso=inicio;
        int k=0;
        while (Math.abs(f.FunctionEvaluator(paso))>e&&k<i){
            paso=inicio-f.FunctionEvaluator(inicio)*(fin-inicio)/(f.FunctionEvaluator(fin)-f.FunctionEvaluator(inicio));
        inicio=fin;
        fin=paso;
        k++;
        }
        
    if (k<i){
        r=paso;
    }
    return r;
    }
}
