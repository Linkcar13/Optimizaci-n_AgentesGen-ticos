package optimizaciónag;

import static java.lang.Math.log;
import static java.lang.Math.pow;
import org.jgap.FitnessFunction;
import org.jgap.IChromosome;

/**
 *
 * @author Carlos Estrada
 * Función número 1
 */
public class FuncionAP8 extends FitnessFunction {

    @Override
    protected double evaluate(IChromosome ic) {
        
        Integer g1 = (Integer)ic.getGene(0).getAllele();    // signo x
        Integer g2 = (Integer)ic.getGene(1).getAllele();    // x
        Integer g3 = (Integer)ic.getGene(2).getAllele();    // x
        Integer g4 = (Integer)ic.getGene(3).getAllele();    // x
        Integer g5 = (Integer)ic.getGene(4).getAllele();    // x
        Integer g6 = (Integer)ic.getGene(5).getAllele();    // ,x
        Integer g7 = (Integer)ic.getGene(6).getAllele();    // ,x
        Integer g8 = (Integer)ic.getGene(7).getAllele();    //  ,x
        Integer g9 = (Integer)ic.getGene(8).getAllele();    // ,x 
       //Integer g10 = (Integer)ic.getGene(9).getAllele();   // y
        //Integer g11 = (Integer)ic.getGene(10).getAllele();   // y
        //Integer g12 = (Integer)ic.getGene(11).getAllele();   // y
        //Integer g13 = (Integer)ic.getGene(12).getAllele();   // y
        //Integer g14 = (Integer)ic.getGene(13).getAllele();   // ,y
        //Integer g15 = (Integer)ic.getGene(14).getAllele();    // ,y
        //Integer g16 = (Integer)ic.getGene(15).getAllele();   // ,y        
        
        String x_int = g2 + "" + g3 + "" + g4 + ""+ g5 +"";
        String x_real= g6 + "" + g7 + "" + g8 + "" +g9;
        double x_value = Integer.parseInt(x_int, 2)+(Integer.parseInt(x_real, 2)*0.01);
        //String y_int = g10 + "" + g11 + "" + g12 + ""+ g13 +"";
        //String y_real= g14 + "" + g15 + "" + g16;
        //double y_value = Integer.parseInt(y_int, 2)+(Integer.parseInt(y_int, 2)*0.001);
        int signox= g1;
        //int signoy= g9;
        
        if (signox == 0){
            x_value = -x_value;
        }
        //if (signoy == 0){
          //  y_value = -y_value;
        //}            
        
        //System.out.println(x_value + " ; " + y_value);
                double value =1/(5*log(x_value/2)+log(x_value/3)-(3*log(x_value))+log(32/9)); // simplificada por localidad se mantienen los puntos criticos 
                if (value < 0){
                return 0;
                }
                else{
                return value;
                } 
    }
    
}