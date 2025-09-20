class Temp{

    int temperature;
    boolean Celsiuis;

     Temp(int temperature,boolean Celsiuis){
         this.temperature = temperature;
         this.Celsiuis = Celsiuis;
     }
     public int ConverTemperature(){
        if( Celsiuis==true){
            return (temperature * 9 / 5)+32;
        }else{
            return (temperature-32)*5/9;
        }
     }
}
public class Main {
    static void main() {
        Temp temp = new Temp(212,false);
        System.out.println(temp.ConverTemperature());

    }
}
