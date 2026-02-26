public class BMIRechner {
    public static void main(String[] args) {
            double Groesse = 1.75;
            int Gewicht = 65;
            double  BMI = Gewicht / (Groesse * Groesse);
            if(BMI <= 18.5){
                System.out.println("Untergewicht");
            }else if(BMI >= 18.5 && BMI <= 24.9){
                  System.out.println("Normalgewicht");
            }else if (BMI >= 25 && BMI <= 29.9){
                  System.out.println("Übergewicht");      
            }else if(BMI >= 30){
                  System.out.println("übergewichtig");
            }
    }
}