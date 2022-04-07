
package lab7flyweight;

import java.util.HashMap;
import java.util.Map;

public class ImageElementsFactory {
    
  private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();
  
  public ImageElement getFlyweight(String n) {
    // return a flyweight if it already exists, otherwise, put it in the map.
    ImageElement imageElement = (ImageElement)flyweights.get(n);
    if(imageElement == null){
        imageElement = new ImageElement(n);
        flyweights.put(n, imageElement);
    }
    return imageElement;
  }

  public int numberOfFlyweights() {
    // return the size of the HashMap
    return flyweights.size();
  }

}
