/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package optimizaciónag;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.jgap.Chromosome;
import org.jgap.Configuration;
import org.jgap.Gene;
import org.jgap.Genotype;
import org.jgap.IChromosome;
import org.jgap.InvalidConfigurationException;
import org.jgap.impl.DefaultConfiguration;
import org.jgap.impl.IntegerGene;

/**
 *
 * @author carlos
 */
public class ConfiguracionAG {
    private int tamaniogen=9;
    private int tamaniopoblacion=10;
    private int numgeneraciones=10;
    private int numevoluciones=10;
    public void ConfiguracionAG(int funcion){
        Configuration.reset(); 
        switch (funcion){
            case 1:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP1());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }
        Configuration.reset(); 
        break;
        case 2:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP2());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 3:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP3());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 4:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP4());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break; 
        case 5:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP5());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 6:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP6());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 7:
//            tamaniogen=17;   
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP7());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;                
        case 8:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP8());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 9:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP9());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;
        case 10:
        try { 
            Configuration configuracion = new DefaultConfiguration ();
            configuracion.setFitnessFunction(new FuncionAP10());
            
            Gene [] ejemploGen= new Gene [tamaniogen];
            ejemploGen=GenerarGenEjemplo(ejemploGen, configuracion);
            Chromosome cromosoma = new Chromosome(configuracion,ejemploGen);
            configuracion.setPopulationSize(tamaniopoblacion);
            configuracion.setSampleChromosome(cromosoma);
            evolucionPoblacion(configuracion);
            
            
 
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }   
                Configuration.reset();
                break;                
    }
        
        
    
}
    
    private void evolucionPoblacion(Configuration configuracion){
        try {
            Genotype poblacionInicial = Genotype.randomInitialGenotype(configuracion);
            for (int i=0 ; i< numgeneraciones;i++){
            System.out.println("Poblacion " +i+" :");
            verAllIndividuos(poblacionInicial.getChromosomes());
               
                poblacionInicial.evolve(numevoluciones);
                IChromosome bestG = poblacionInicial.getFittestChromosome();
                System.out.println("Mejor Individuo");
                verIndividuo(bestG);
                
            System.out.println("****************************");                 
            } 
            IChromosome bestI = poblacionInicial.getFittestChromosome();
                System.out.println("Mejor de los mejores Individuos");
                verIndividuo(bestI);
            
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }
    
    private void evolucionPoblacion2(Configuration configuracion){
        try {
            Genotype poblacionInicial = Genotype.randomInitialGenotype(configuracion);
            for (int i=0 ; i< numgeneraciones;i++){
            System.out.println("Poblacion " +i+" :");
            verAllIndividuos2(poblacionInicial.getChromosomes());
               
                poblacionInicial.evolve(numevoluciones);
                IChromosome bestG = poblacionInicial.getFittestChromosome();
                System.out.println("Mejor Individuo");
                verIndividuo2(bestG);
                
            System.out.println("****************************");                 
            } 
            IChromosome bestI = poblacionInicial.getFittestChromosome();
                System.out.println("Mejor de los mejores Individuos");
                verIndividuo(bestI);
            
            
        } catch (InvalidConfigurationException ex) {
            Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    }    
    
    
    private Gene[] GenerarGenEjemplo(Gene[] genes,Configuration configuracion){
        for (int i=0; i<tamaniogen;i++){
            try {
                genes[i]=new IntegerGene(configuracion,0,1);
            } catch (InvalidConfigurationException ex) {
                Logger.getLogger(ConfiguracionAG.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return  genes;
    }
    
    private void verAllIndividuos(IChromosome[] ics){
        for (IChromosome ic: ics){
            verIndividuo(ic);
        }
    }
    private void verAllIndividuos2(IChromosome[] ics){
        for (IChromosome ic: ics){
            verIndividuo2(ic);
        }
    }    


    
    private void verIndividuo(IChromosome ic){
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
        double x_value = Integer.parseInt(x_int, 2)+(Integer.parseInt(x_real, 2)*0.1);
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
        System.out.println(x_value);  
    }
    
 
    
    private void verIndividuo2(IChromosome ic){
        Integer g1 = (Integer)ic.getGene(0).getAllele();    // signo x
        Integer g2 = (Integer)ic.getGene(1).getAllele();    // x
        Integer g3 = (Integer)ic.getGene(2).getAllele();    // x
        Integer g4 = (Integer)ic.getGene(3).getAllele();    // x
        Integer g5 = (Integer)ic.getGene(4).getAllele();    // x
        Integer g6 = (Integer)ic.getGene(5).getAllele();    // ,x
        Integer g7 = (Integer)ic.getGene(6).getAllele();    // ,x
        Integer g8 = (Integer)ic.getGene(7).getAllele();    //  ,x
        Integer g9 = (Integer)ic.getGene(8).getAllele();    // ,x
        Integer g10 = (Integer)ic.getGene(9).getAllele();   // signo y
        Integer g11 = (Integer)ic.getGene(10).getAllele();   // y
        Integer g12 = (Integer)ic.getGene(11).getAllele();   // y
        Integer g13 = (Integer)ic.getGene(12).getAllele();   // y
        Integer g14 = (Integer)ic.getGene(13).getAllele();   // y
        Integer g15 = (Integer)ic.getGene(14).getAllele();    // ,y
        Integer g16 = (Integer)ic.getGene(15).getAllele();    //,y
        Integer g17 = (Integer)ic.getGene(16).getAllele();// ,y 
        Integer g18 = (Integer)ic.getGene(17).getAllele();// ,y 
        
        String x_int = g2 + "" + g3 + "" + g4 + ""+ g5 +"";
        String x_real= g6 + "" + g7 + "" + g8 + "" +g9;
        double x_value = Integer.parseInt(x_int, 2)+(Integer.parseInt(x_real, 2)*0.1);
        String y_int = g11 + "" + g12 + "" + g13 + ""+ g14 +"";
        String y_real= g15 + "" + g16 + "" + g17 + "" + g18;
        double y_value = Integer.parseInt(y_int, 2)+(Integer.parseInt(y_int, 2)*0.001);
        int signox= g1;
        int signoy= g10;
        
        if (signox == 0){
            x_value = -x_value;
        }
        if (signoy == 0){
            y_value = -y_value;
        }        
        System.out.println (x_value);
        System.out.println(y_value);
        
        
    }    
}
