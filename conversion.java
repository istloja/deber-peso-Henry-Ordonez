
package peso.deber;

import peso.deber.PesoDeber.Peso;


public class conversion {
    
}package Medida;

public class conversion extends Peso {

    public double gramosamiligramos(double gr, double mlgr){
        mlgr=gr*1000;
        return mlgr;
    }
    public double miligramosagramos(double mlgr, double gr){
        gr= mlgr/1000;
        return gr;
    }
    public double gramosakilogramos(double gr, double kg){
        kg = gr/1000;
        return  kg;
    }
    public double kilogramosagramos(double kg, double gr){
        gr= kg*1000;
        return gr;
    }
    public double kilogramosatoneladas(double kg, double tl){
        tl= kg/1000;
        return tl;
    }
    public double toneladasakilogramos(double tl, double kg){
        kg= tl*1000;
        return kg;
    }
    public double kilogramoalibra (double kg, double lb){
        lb= kg*2.20;
        return lb;
    }
    public double libraakilogramo(double lb, double kg){
        kg= lb/2.20;
        return kg;
    }
    
    
    



    
    
}

