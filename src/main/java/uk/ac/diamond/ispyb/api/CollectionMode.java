package uk.ac.diamond.ispyb.api;

public enum CollectionMode {
    AUTO("auto"),
    MANUAL("manual"),
    INVALID("INVALID");

    private final String collectionMode;

    CollectionMode(String collectionMode){
        this.collectionMode = collectionMode;
    }

    public String getCollectionMode(){
        return collectionMode;
    }

    public CollectionMode convert(String collectionMode){
        for (CollectionMode e : CollectionMode.values()){
            if (e.collectionMode.equals(collectionMode)){
                return e;
            }
        }
        return INVALID;
    }
}