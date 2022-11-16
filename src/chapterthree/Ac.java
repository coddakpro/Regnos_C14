package chapterthree;

public class Ac {

        private boolean isOn;
        private String productName;
        private int temperature;

        public void Ac(String productName, int temperature, boolean isOn) {
            this.productName = productName;
            this.temperature = temperature;
            this.isOn = isOn;
        }

        public void decreaseTemperature() {
        }

        public String productName() {
            return this.productName;
        }

        public int getTemperature() {
            return this.temperature;
        }

        public void increaseTemperature() {
        }

        public boolean isOn() {
            return this.isOn;
        }

        public void setOn(boolean isOn) {
        }

        public void setProductName(String productName) {
        }

        public void setTemperature(int temperature) {
        }

        public void increaseTemperatureByTwo() {
        }
    }


