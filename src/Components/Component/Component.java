package Components.Component;

import Components.Part;

public abstract class Component {
   String serialNumber;
   String Type;
   double price;
   double wattage;
   String brand;

   public Component(String serialNumber, String Type, double price, double wattage, String brand) {
      this.serialNumber = serialNumber;
      this.Type = Type;
      this.price = price;
      this.wattage = wattage;
      this.brand = brand;
   }

   public String getSerialNumber()
   {
      return serialNumber;
   }

   public void setSerialNumber(String serialNumber)
   {
      this.serialNumber=serialNumber;
   }

   public String getType() {
      return Type;
   }

   public void setType(String type) {
      Type = type;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }

   public double getWattage() {
      return wattage;
   }

   public void setWattage(double wattage) {
      wattage = wattage;
   }

   public String getBrand() {
      return brand;
   }

   public void setBrand(String brand) {
      brand = brand;
   }
}
