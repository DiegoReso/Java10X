package Objetos;

public enum Biju {

    SHUKAKU("Shukaku", "Gaara", 1),
    MATATABI("Matatabi", "Yugito Nii", 2),
    ISOBU("Isobu", "Yagura (Posteriormente Rin Nohara temporariamente)", 3),
    SON_GOKU("Son Gokū", "Roshi", 4),
    KOKUOH("Kokuo", "Han", 5),
    SAIKEN("Saiken", "Utakata", 6),
    CHOMEI("Chōmei", "Fu", 7),
    GYUKI("Gyuki", "Killer B", 8),
    KUROMA("Kurama", "Naruto Uzumaki", 9);

    String nameBiju;
    String jinchuriki;
    Integer numeroDeCaldas;

    Biju() {
    }

    Biju(String nameBiju, String jinchuriki, Integer numeroDeCaldas) {
        this.nameBiju = nameBiju;
        this.jinchuriki = jinchuriki;
        this.numeroDeCaldas = numeroDeCaldas;
    }



}
