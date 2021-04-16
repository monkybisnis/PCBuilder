package Components.Part;

import java.io.Serializable;

public abstract class Part implements Serializable {
   String serialNumber;
   String Type;
   double price;
   double wattage;
   String brand;
   String icon;

   public Part() {}

   public Part(String serialNumber, String Type, double price, double wattage, String brand, String icon) {
      this.serialNumber = serialNumber;
      this.Type = Type;
      this.price = price;
      this.wattage = wattage;
      this.brand = brand;
      this.icon = icon;
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

   public String getIcon() {
      return icon;
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
