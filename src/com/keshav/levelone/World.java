package com.keshav.levelone;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;


public class World extends StructureObjet{


    public String id;
    public int height;
    public int width;
    public ArrayList<StructureObjet> ListObjets;

    public boolean isHasStructure() {
        return hasStructure;
    }

    public void setHasStructure(boolean hasStructure) {
        this.hasStructure = hasStructure;
    }


    public boolean hasStructure;





    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public ArrayList<StructureObjet> generateStructures(int i){
        boolean b = this.hasStructure;
        ArrayList<StructureObjet> consecutiveStruct = new ArrayList<StructureObjet>();
        if (b) {                                       //if hasStructure is true
            for (int j = 0; j < i; j++) {
                StructureObjet objetJ = new StructureObjet();
                objetJ.generateRandomStructure(objetJ);
                consecutiveStruct.add(objetJ);         //add structureObjet to ListObjets
            }

        }

        return consecutiveStruct;
    }

    public World(String id, int height, int width, boolean hasStructure, int i) {
        this.id = id;
        this.height = height;
        this.width = width;
        this.hasStructure = hasStructure;
        this.ListObjets = generateStructures(i);
    }
}

