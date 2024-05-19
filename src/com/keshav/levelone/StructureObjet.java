package com.keshav.levelone;

public class StructureObjet extends Structure{

    public boolean isDestructible;
    public boolean isCrossable;
    public int idDecor; // Identifiant du décor (mur, buisson)


    public int getIdDecor() {
        return idDecor;
    }

    public void setIdDecor(int idDecor) {
        this.idDecor = idDecor;
    }


    public void generateRandomStructure(Structure structure) {
        structure.setPosX(randomWithBounds(20, 480));
        structure.setPosY(randomWithBounds(20, 480));
        structure.setWidth(randomWithBounds(5, 10));
        structure.setHeight(randomWithBounds(5, 10));
        setIdDecor(randomWithBounds(1, 3));
    }



}
