package com.company.assets;

//GameObject<T extends Element> or completely get rid of this?
public interface GameObject {
  default Picture getPicture(String path){
    return new Picture(path);
  }
}
