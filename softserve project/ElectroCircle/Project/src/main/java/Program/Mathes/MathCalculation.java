package Program.Mathes;

public class MathCalculation {
    private final double coefficient = 1.5;
    private double fullSystemResMax = 0;
    private double fullSystemResMin = 0;
    private double fullGridRes = 0;
    private double transformerResMin = 0;
    private double transformerResMax = 0;
    private double minResK1 = 0;
    private double maxResK1 = 0;


        public void calculateResistance (SystemParameters obj){
            double fullGridRes = obj.getPowerGridLength() * obj.getPowerGridResist();
            this.fullGridRes = fullGridRes;

            double fullSystemResMax = (obj.getSystemVoltage() * obj.getSystemVoltage()) / 2900;
            this.fullSystemResMax = fullSystemResMax;

            double fullSystemResMin = coefficient * this.fullSystemResMax;
            this.fullSystemResMin = fullSystemResMin;


            double transformerResMin = obj.getShortCircCurrentLow() * (96.6 * 96.6) / (obj.getTransformerPower() * 100.0);
            this.transformerResMin = transformerResMin;

            double transformerResMax = obj.getShortCircCurrentHight() * (126 * 126) / (obj.getTransformerPower() * 100.0);
            this.transformerResMax = transformerResMax;
        }
        public double shortCircleCurrentK1MaxCalc (SystemParameters obj){
            double minResK1 = this.fullSystemResMin + this.fullGridRes;
            this.minResK1 = minResK1;
            return (obj.getSystemVoltage() / (Math.sqrt(3.0) * minResK1)) * 1000;
        }
        public double shortCircleCurrentK1MinCalc (SystemParameters obj){
            double maxResK1 = this.fullSystemResMax + this.fullGridRes;
            this.maxResK1 = maxResK1;
            return (obj.getSystemVoltage() / (Math.sqrt(3.0) * maxResK1)) * 1000;
        }
        public double shortCircleCurrentK2MaxCalc (SystemParameters obj){
            double minResK2 = this.minResK1 + this.transformerResMin;
            return (obj.getSystemVoltage() / (Math.sqrt(3.0) * minResK2)) * 1000;
        }
        public double shortCircleCurrentK2MinCalc (SystemParameters obj){
            double maxResK2 = this.maxResK1 + this.transformerResMax;
            return (obj.getSystemVoltage() / (Math.sqrt(3.0) * maxResK2)) * 1000;
        }
    }